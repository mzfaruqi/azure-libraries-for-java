/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual IP mapping.
 */
public class VirtualIPMapping {
    /**
     * Virtual IP address.
     */
    @JsonProperty(value = "virtualIP")
    private String virtualIP;

    /**
     * Internal HTTP port.
     */
    @JsonProperty(value = "internalHttpPort")
    private Integer internalHttpPort;

    /**
     * Internal HTTPS port.
     */
    @JsonProperty(value = "internalHttpsPort")
    private Integer internalHttpsPort;

    /**
     * Is virtual IP mapping in use.
     */
    @JsonProperty(value = "inUse")
    private Boolean inUse;

    /**
     * name of the service that virtual IP is assigned to.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /**
     * Get virtual IP address.
     *
     * @return the virtualIP value
     */
    public String virtualIP() {
        return this.virtualIP;
    }

    /**
     * Set virtual IP address.
     *
     * @param virtualIP the virtualIP value to set
     * @return the VirtualIPMapping object itself.
     */
    public VirtualIPMapping withVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
        return this;
    }

    /**
     * Get internal HTTP port.
     *
     * @return the internalHttpPort value
     */
    public Integer internalHttpPort() {
        return this.internalHttpPort;
    }

    /**
     * Set internal HTTP port.
     *
     * @param internalHttpPort the internalHttpPort value to set
     * @return the VirtualIPMapping object itself.
     */
    public VirtualIPMapping withInternalHttpPort(Integer internalHttpPort) {
        this.internalHttpPort = internalHttpPort;
        return this;
    }

    /**
     * Get internal HTTPS port.
     *
     * @return the internalHttpsPort value
     */
    public Integer internalHttpsPort() {
        return this.internalHttpsPort;
    }

    /**
     * Set internal HTTPS port.
     *
     * @param internalHttpsPort the internalHttpsPort value to set
     * @return the VirtualIPMapping object itself.
     */
    public VirtualIPMapping withInternalHttpsPort(Integer internalHttpsPort) {
        this.internalHttpsPort = internalHttpsPort;
        return this;
    }

    /**
     * Get is virtual IP mapping in use.
     *
     * @return the inUse value
     */
    public Boolean inUse() {
        return this.inUse;
    }

    /**
     * Set is virtual IP mapping in use.
     *
     * @param inUse the inUse value to set
     * @return the VirtualIPMapping object itself.
     */
    public VirtualIPMapping withInUse(Boolean inUse) {
        this.inUse = inUse;
        return this;
    }

    /**
     * Get name of the service that virtual IP is assigned to.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set name of the service that virtual IP is assigned to.
     *
     * @param serviceName the serviceName value to set
     * @return the VirtualIPMapping object itself.
     */
    public VirtualIPMapping withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

}
