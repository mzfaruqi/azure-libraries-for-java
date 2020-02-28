// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * FirewallRules.
 */
public final class FirewallRulesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private FirewallRulesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of FirewallRulesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public FirewallRulesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(FirewallRulesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientFirewallRules to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientFirewallRules")
    private interface FirewallRulesService {
        @Headers({"accept: application/json"})
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules/{firewallRuleName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FirewallRuleInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("firewallRuleName") String firewallRuleName, @BodyParam("application/json") FirewallRuleInner parameters, @QueryParam("api-version") String apiVersion);

        @Headers({"accept: application/json"})
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules/{firewallRuleName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("firewallRuleName") String firewallRuleName, @QueryParam("api-version") String apiVersion);

        @Headers({"accept: application/json"})
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules/{firewallRuleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FirewallRuleInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("firewallRuleName") String firewallRuleName, @QueryParam("api-version") String apiVersion);

        @Headers({"accept: application/json"})
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/firewallRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<FirewallRuleListResultInner>> listByServer(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Creates or updates a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @param parameters Represents a server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FirewallRuleInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters) {
        final String apiVersion = "2014-04-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, firewallRuleName, parameters, apiVersion);
    }

    /**
     * Creates or updates a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @param parameters Represents a server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallRuleInner> createOrUpdateAsync(String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, firewallRuleName, parameters)
            .flatMap((SimpleResponse<FirewallRuleInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @param parameters Represents a server firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallRuleInner createOrUpdate(String resourceGroupName, String serverName, String firewallRuleName, FirewallRuleInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, firewallRuleName, parameters).block();
    }

    /**
     * Deletes a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        final String apiVersion = "2014-04-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, firewallRuleName, apiVersion);
    }

    /**
     * Deletes a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        return deleteWithResponseAsync(resourceGroupName, serverName, firewallRuleName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String firewallRuleName) {
        deleteAsync(resourceGroupName, serverName, firewallRuleName).block();
    }

    /**
     * Gets a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FirewallRuleInner>> getWithResponseAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        final String apiVersion = "2014-04-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, firewallRuleName, apiVersion);
    }

    /**
     * Gets a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallRuleInner> getAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        return getWithResponseAsync(resourceGroupName, serverName, firewallRuleName)
            .flatMap((SimpleResponse<FirewallRuleInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a firewall rule.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param firewallRuleName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallRuleInner get(String resourceGroupName, String serverName, String firewallRuleName) {
        return getAsync(resourceGroupName, serverName, firewallRuleName).block();
    }

    /**
     * Returns a list of firewall rules.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FirewallRuleInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        final String apiVersion = "2014-04-01";
        return service.listByServer(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            null,
            null));
    }

    /**
     * Returns a list of firewall rules.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FirewallRuleInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(
            () -> listByServerSinglePageAsync(resourceGroupName, serverName));
    }

    /**
     * Returns a list of firewall rules.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FirewallRuleInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }
}