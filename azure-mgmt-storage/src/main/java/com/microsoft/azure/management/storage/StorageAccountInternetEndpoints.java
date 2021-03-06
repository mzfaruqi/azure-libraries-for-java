/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The URIs that are used to perform a retrieval of a public blob, file, web or
 * dfs object via a internet routing endpoint.
 */
public class StorageAccountInternetEndpoints {
    /**
     * Gets the blob endpoint.
     */
    @JsonProperty(value = "blob", access = JsonProperty.Access.WRITE_ONLY)
    private String blob;

    /**
     * Gets the file endpoint.
     */
    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)
    private String file;

    /**
     * Gets the web endpoint.
     */
    @JsonProperty(value = "web", access = JsonProperty.Access.WRITE_ONLY)
    private String web;

    /**
     * Gets the dfs endpoint.
     */
    @JsonProperty(value = "dfs", access = JsonProperty.Access.WRITE_ONLY)
    private String dfs;

    /**
     * Get gets the blob endpoint.
     *
     * @return the blob value
     */
    public String blob() {
        return this.blob;
    }

    /**
     * Get gets the file endpoint.
     *
     * @return the file value
     */
    public String file() {
        return this.file;
    }

    /**
     * Get gets the web endpoint.
     *
     * @return the web value
     */
    public String web() {
        return this.web;
    }

    /**
     * Get gets the dfs endpoint.
     *
     * @return the dfs value
     */
    public String dfs() {
        return this.dfs;
    }

}
