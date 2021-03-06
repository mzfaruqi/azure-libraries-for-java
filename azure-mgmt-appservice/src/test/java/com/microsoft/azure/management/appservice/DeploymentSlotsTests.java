/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.appservice;

import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.rest.RestClient;
import org.junit.Assert;
import org.junit.Test;

public class DeploymentSlotsTests extends AppServiceTest {
    private static String WEBAPP_NAME = "";
    private static String SLOT_NAME_1 = "";
    private static String SLOT_NAME_2 = "";
    private static String SLOT_NAME_3 = "";

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        WEBAPP_NAME = generateRandomResourceName("java-webapp-", 20);
        SLOT_NAME_1 = generateRandomResourceName("java-slot-", 20);
        SLOT_NAME_2 = generateRandomResourceName("java-slot-", 20);
        SLOT_NAME_3 = generateRandomResourceName("java-slot-", 20);

        super.initializeClients(restClient, defaultSubscription, domain);
    }

    @Test
    public void canCRUDSwapSlots() throws Exception {
        // Create web app
        WebApp webApp = appServiceManager.webApps().define(WEBAPP_NAME)
                .withRegion(Region.US_WEST)
                .withNewResourceGroup(RG_NAME)
                .withNewWindowsPlan(PricingTier.STANDARD_S2)
                .withJavaVersion(JavaVersion.JAVA_1_7_0_51)
                .withWebContainer(WebContainer.TOMCAT_7_0_50)
                .create();
        Assert.assertNotNull(webApp);
        Assert.assertEquals(Region.US_WEST, webApp.region());

        // Create a deployment slot with web app's config
        DeploymentSlot slot2 = webApp.deploymentSlots().define(SLOT_NAME_2)
                .withConfigurationFromParent()
                .create();
        Assert.assertNotNull(slot2);
        Assert.assertEquals(JavaVersion.JAVA_1_7_0_51, slot2.javaVersion());

        // Update deployment slot
        slot2.update()
                .withoutJava()
                .withPythonVersion(PythonVersion.PYTHON_34)
                .withAppSetting("slot2key", "slot2value")
                .withStickyAppSetting("sticky2key", "sticky2value")
                .apply();
        Assert.assertNotNull(slot2);
        Assert.assertEquals(JavaVersion.OFF, slot2.javaVersion());
        Assert.assertEquals(PythonVersion.PYTHON_34, slot2.pythonVersion());

        // Create 3rd deployment slot with configuration from slot 2
        DeploymentSlot slot3 = webApp.deploymentSlots().define(SLOT_NAME_3)
                .withConfigurationFromDeploymentSlot(slot2)
                .create();
        Assert.assertNotNull(slot3);
        Assert.assertEquals(JavaVersion.OFF, slot3.javaVersion());
        Assert.assertEquals(PythonVersion.PYTHON_34, slot3.pythonVersion());

        // Get
        DeploymentSlot deploymentSlot = webApp.deploymentSlots().getByName(SLOT_NAME_3);
        Assert.assertEquals(slot3.id(), deploymentSlot.id());

    }
}