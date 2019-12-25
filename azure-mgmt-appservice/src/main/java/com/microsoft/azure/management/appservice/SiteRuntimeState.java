/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SiteRuntimeState.
 */
public enum SiteRuntimeState {
    /** Enum value READY. */
    READY("READY"),

    /** Enum value STOPPED. */
    STOPPED("STOPPED"),

    /** Enum value UNKNOWN. */
    UNKNOWN("UNKNOWN");

    /** The actual serialized value for a SiteRuntimeState instance. */
    private String value;

    SiteRuntimeState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SiteRuntimeState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SiteRuntimeState object, or null if unable to parse.
     */
    @JsonCreator
    public static SiteRuntimeState fromString(String value) {
        SiteRuntimeState[] items = SiteRuntimeState.values();
        for (SiteRuntimeState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
