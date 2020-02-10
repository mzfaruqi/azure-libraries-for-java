/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.management.network;

import com.azure.core.http.rest.PagedIterable;
import com.azure.management.resources.core.TestUtilities;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.utils.SdkContext;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationSecurityGroupTests extends NetworkManagementTest {

    @Test
    public void canCRUDApplicationSecurityGroup() throws Exception {
        String asgName = SdkContext.randomResourceName("asg", 15);

        ApplicationSecurityGroup applicationSecurityGroup = networkManager.applicationSecurityGroups().define(asgName)
                .withRegion(Region.US_SOUTH_CENTRAL)
                .withNewResourceGroup(RG_NAME)
                .withTag("tag1", "value1")
                .create();
        Assert.assertEquals("value1", applicationSecurityGroup.tags().get("tag1"));

        PagedIterable<ApplicationSecurityGroup> asgList = networkManager.applicationSecurityGroups().list();
        Assert.assertTrue(TestUtilities.getPagedIterableSize(asgList) > 0);

        asgList = networkManager.applicationSecurityGroups().listByResourceGroup(RG_NAME);
        Assert.assertTrue(TestUtilities.getPagedIterableSize(asgList) > 0);

        networkManager.applicationSecurityGroups().deleteById(applicationSecurityGroup.id());
        asgList = networkManager.applicationSecurityGroups().listByResourceGroup(RG_NAME);
        Assert.assertTrue(TestUtilities.isEmpty(asgList));
    }
}
