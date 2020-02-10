// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
 * ExpressRouteCircuitPeerings.
 */
public final class ExpressRouteCircuitPeeringsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ExpressRouteCircuitPeeringsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteCircuitPeeringsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteCircuitPeeringsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(ExpressRouteCircuitPeeringsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientExpressRouteCircuitPeerings to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientExpressRouteCircuitPeerings")
    private interface ExpressRouteCircuitPeeringsService {
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitPeeringInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitPeeringInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ExpressRouteCircuitPeeringInner peeringParameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitPeeringListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitPeeringInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("circuitName") String circuitName, @PathParam("peeringName") String peeringName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ExpressRouteCircuitPeeringInner peeringParameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteCircuitPeeringListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String circuitName, String peeringName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, circuitName, peeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String circuitName, String peeringName) {
        return deleteWithResponseAsync(resourceGroupName, circuitName, peeringName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String circuitName, String peeringName) {
        deleteAsync(resourceGroupName, circuitName, peeringName).block();
    }

    /**
     * Gets the specified peering for the express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCircuitPeeringInner>> getWithResponseAsync(String resourceGroupName, String circuitName, String peeringName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), resourceGroupName, circuitName, peeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets the specified peering for the express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitPeeringInner> getAsync(String resourceGroupName, String circuitName, String peeringName) {
        return getWithResponseAsync(resourceGroupName, circuitName, peeringName)
            .flatMap((SimpleResponse<ExpressRouteCircuitPeeringInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified peering for the express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeeringInner get(String resourceGroupName, String circuitName, String peeringName) {
        return getAsync(resourceGroupName, circuitName, peeringName).block();
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCircuitPeeringInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, circuitName, peeringName, this.client.getSubscriptionId(), peeringParameters, apiVersion);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitPeeringInner> createOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, circuitName, peeringName, peeringParameters)
            .flatMap((SimpleResponse<ExpressRouteCircuitPeeringInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeeringInner createOrUpdate(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        return createOrUpdateAsync(resourceGroupName, circuitName, peeringName, peeringParameters).block();
    }

    /**
     * Gets all peerings in a specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRouteCircuitPeeringInner>> listSinglePageAsync(String resourceGroupName, String circuitName) {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), resourceGroupName, circuitName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all peerings in a specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRouteCircuitPeeringInner> listAsync(String resourceGroupName, String circuitName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, circuitName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all peerings in a specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRouteCircuitPeeringInner> list(String resourceGroupName, String circuitName) {
        return new PagedIterable<>(listAsync(resourceGroupName, circuitName));
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String circuitName, String peeringName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, circuitName, peeringName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String circuitName, String peeringName) {
        return beginDeleteWithResponseAsync(resourceGroupName, circuitName, peeringName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String circuitName, String peeringName) {
        beginDeleteAsync(resourceGroupName, circuitName, peeringName).block();
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteCircuitPeeringInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, circuitName, peeringName, this.client.getSubscriptionId(), peeringParameters, apiVersion);
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteCircuitPeeringInner> beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, circuitName, peeringName, peeringParameters)
            .flatMap((SimpleResponse<ExpressRouteCircuitPeeringInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a peering in the specified express route circuits.
     * 
     * @param resourceGroupName 
     * @param circuitName 
     * @param peeringName 
     * @param peeringParameters Peering in an ExpressRouteCircuit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteCircuitPeeringInner beginCreateOrUpdate(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, circuitName, peeringName, peeringParameters).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRouteCircuitPeeringInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}