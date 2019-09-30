/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Criterion to filter metrics.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "criterionType")
@JsonTypeName("StaticThresholdCriterion")
public class MetricCriteria extends MultiMetricCriteria {
    /**
     * the criteria operator.
     */
    @JsonProperty(value = "operator", required = true)
    private Object operator;

    /**
     * the criteria threshold value that activates the alert.
     */
    @JsonProperty(value = "threshold", required = true)
    private double threshold;

    /**
     * Get the criteria operator.
     *
     * @return the operator value
     */
    public Object operator() {
        return this.operator;
    }

    /**
     * Set the criteria operator.
     *
     * @param operator the operator value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withOperator(Object operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the criteria threshold value that activates the alert.
     *
     * @return the threshold value
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the criteria threshold value that activates the alert.
     *
     * @param threshold the threshold value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

}
