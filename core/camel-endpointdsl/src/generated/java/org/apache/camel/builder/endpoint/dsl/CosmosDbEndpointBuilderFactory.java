/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Azure Cosmos DB is Microsofts globally distributed, multi-model database
 * service for operational and analytics workloads. It offers multi-mastering
 * feature by automatically scaling throughput, compute, and storage. This
 * component interacts with Azure CosmosDB through Azure SQL API
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CosmosDbEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Azure CosmosDB component.
     */
    public interface CosmosDbEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedCosmosDbEndpointConsumerBuilder advanced() {
            return (AdvancedCosmosDbEndpointConsumerBuilder) this;
        }
        /**
         * Inject an external CosmosAsyncClient into the component.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.CosmosAsyncClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cosmosAsyncClient the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointConsumerBuilder cosmosAsyncClient(
                Object cosmosAsyncClient) {
            doSetProperty("cosmosAsyncClient", cosmosAsyncClient);
            return this;
        }
        /**
         * Inject an external CosmosAsyncClient into the component.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.azure.cosmos.CosmosAsyncClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cosmosAsyncClient the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointConsumerBuilder cosmosAsyncClient(
                String cosmosAsyncClient) {
            doSetProperty("cosmosAsyncClient", cosmosAsyncClient);
            return this;
        }
        /**
         * Sets the Azure Cosmos database endpoint the component will connect
         * to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param databaseEndpoint the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointConsumerBuilder databaseEndpoint(
                String databaseEndpoint) {
            doSetProperty("databaseEndpoint", databaseEndpoint);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Sets either a master or readonly key used to perform authentication
         * for accessing resource.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: security
         * 
         * @param accountKey the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointConsumerBuilder accountKey(String accountKey) {
            doSetProperty("accountKey", accountKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Azure CosmosDB component.
     */
    public interface AdvancedCosmosDbEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default CosmosDbEndpointConsumerBuilder basic() {
            return (CosmosDbEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedCosmosDbEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedCosmosDbEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedCosmosDbEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedCosmosDbEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Azure CosmosDB component.
     */
    public interface CosmosDbEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCosmosDbEndpointProducerBuilder advanced() {
            return (AdvancedCosmosDbEndpointProducerBuilder) this;
        }
        /**
         * Inject an external CosmosAsyncClient into the component.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.CosmosAsyncClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cosmosAsyncClient the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder cosmosAsyncClient(
                Object cosmosAsyncClient) {
            doSetProperty("cosmosAsyncClient", cosmosAsyncClient);
            return this;
        }
        /**
         * Inject an external CosmosAsyncClient into the component.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.azure.cosmos.CosmosAsyncClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cosmosAsyncClient the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder cosmosAsyncClient(
                String cosmosAsyncClient) {
            doSetProperty("cosmosAsyncClient", cosmosAsyncClient);
            return this;
        }
        /**
         * Sets the Azure Cosmos database endpoint the component will connect
         * to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param databaseEndpoint the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder databaseEndpoint(
                String databaseEndpoint) {
            doSetProperty("databaseEndpoint", databaseEndpoint);
            return this;
        }
        /**
         * Sets if the component should create Cosmos container automatically in
         * case it doesn't exist in Cosmos database.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param createContainerIfNotExists the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder createContainerIfNotExists(
                boolean createContainerIfNotExists) {
            doSetProperty("createContainerIfNotExists", createContainerIfNotExists);
            return this;
        }
        /**
         * Sets if the component should create Cosmos container automatically in
         * case it doesn't exist in Cosmos database.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param createContainerIfNotExists the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder createContainerIfNotExists(
                String createContainerIfNotExists) {
            doSetProperty("createContainerIfNotExists", createContainerIfNotExists);
            return this;
        }
        /**
         * Sets if the component should create Cosmos database automatically in
         * case it doesn't exist in Cosmos account.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param createDatabaseIfNotExists the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder createDatabaseIfNotExists(
                boolean createDatabaseIfNotExists) {
            doSetProperty("createDatabaseIfNotExists", createDatabaseIfNotExists);
            return this;
        }
        /**
         * Sets if the component should create Cosmos database automatically in
         * case it doesn't exist in Cosmos account.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param createDatabaseIfNotExists the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder createDatabaseIfNotExists(
                String createDatabaseIfNotExists) {
            doSetProperty("createDatabaseIfNotExists", createDatabaseIfNotExists);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sets either a master or readonly key used to perform authentication
         * for accessing resource.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: security
         * 
         * @param accountKey the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointProducerBuilder accountKey(String accountKey) {
            doSetProperty("accountKey", accountKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Azure CosmosDB component.
     */
    public interface AdvancedCosmosDbEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default CosmosDbEndpointProducerBuilder basic() {
            return (CosmosDbEndpointProducerBuilder) this;
        }
    }

    /**
     * Builder for endpoint for the Azure CosmosDB component.
     */
    public interface CosmosDbEndpointBuilder
            extends
                CosmosDbEndpointConsumerBuilder,
                CosmosDbEndpointProducerBuilder {
        default AdvancedCosmosDbEndpointBuilder advanced() {
            return (AdvancedCosmosDbEndpointBuilder) this;
        }
        /**
         * Inject an external CosmosAsyncClient into the component.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.cosmos.CosmosAsyncClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cosmosAsyncClient the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointBuilder cosmosAsyncClient(
                Object cosmosAsyncClient) {
            doSetProperty("cosmosAsyncClient", cosmosAsyncClient);
            return this;
        }
        /**
         * Inject an external CosmosAsyncClient into the component.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.azure.cosmos.CosmosAsyncClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param cosmosAsyncClient the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointBuilder cosmosAsyncClient(
                String cosmosAsyncClient) {
            doSetProperty("cosmosAsyncClient", cosmosAsyncClient);
            return this;
        }
        /**
         * Sets the Azure Cosmos database endpoint the component will connect
         * to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param databaseEndpoint the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointBuilder databaseEndpoint(String databaseEndpoint) {
            doSetProperty("databaseEndpoint", databaseEndpoint);
            return this;
        }
        /**
         * Sets either a master or readonly key used to perform authentication
         * for accessing resource.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: security
         * 
         * @param accountKey the value to set
         * @return the dsl builder
         */
        default CosmosDbEndpointBuilder accountKey(String accountKey) {
            doSetProperty("accountKey", accountKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Azure CosmosDB component.
     */
    public interface AdvancedCosmosDbEndpointBuilder
            extends
                AdvancedCosmosDbEndpointConsumerBuilder,
                AdvancedCosmosDbEndpointProducerBuilder {
        default CosmosDbEndpointBuilder basic() {
            return (CosmosDbEndpointBuilder) this;
        }
    }

    public interface CosmosDbBuilders {
        /**
         * Azure CosmosDB (camel-azure-cosmosdb)
         * Azure Cosmos DB is Microsofts globally distributed, multi-model
         * database service for operational and analytics workloads. It offers
         * multi-mastering feature by automatically scaling throughput, compute,
         * and storage. This component interacts with Azure CosmosDB through
         * Azure SQL API
         * 
         * Category: cloud,database
         * Since: 3.10
         * Maven coordinates: org.apache.camel:camel-azure-cosmosdb
         * 
         * Syntax: <code>azure-cosmosdb:namespace/eventHubName</code>
         * 
         * Path parameter: database (required)
         * The name of the Cosmos database that component should connect to. In
         * case you are producing data and have createDatabaseIfNotExists=true,
         * the component will automatically auto create a Cosmos database.
         * 
         * Path parameter: container
         * The name of the Cosmos container that component should connect to. In
         * case you are producing data and have createContainerIfNotExists=true,
         * the component will automatically auto create a Cosmos container.
         * 
         * @param path namespace/eventHubName
         * @return the dsl builder
         */
        default CosmosDbEndpointBuilder azureCosmosdb(String path) {
            return CosmosDbEndpointBuilderFactory.endpointBuilder("azure-cosmosdb", path);
        }
        /**
         * Azure CosmosDB (camel-azure-cosmosdb)
         * Azure Cosmos DB is Microsofts globally distributed, multi-model
         * database service for operational and analytics workloads. It offers
         * multi-mastering feature by automatically scaling throughput, compute,
         * and storage. This component interacts with Azure CosmosDB through
         * Azure SQL API
         * 
         * Category: cloud,database
         * Since: 3.10
         * Maven coordinates: org.apache.camel:camel-azure-cosmosdb
         * 
         * Syntax: <code>azure-cosmosdb:namespace/eventHubName</code>
         * 
         * Path parameter: database (required)
         * The name of the Cosmos database that component should connect to. In
         * case you are producing data and have createDatabaseIfNotExists=true,
         * the component will automatically auto create a Cosmos database.
         * 
         * Path parameter: container
         * The name of the Cosmos container that component should connect to. In
         * case you are producing data and have createContainerIfNotExists=true,
         * the component will automatically auto create a Cosmos container.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path namespace/eventHubName
         * @return the dsl builder
         */
        default CosmosDbEndpointBuilder azureCosmosdb(
                String componentName,
                String path) {
            return CosmosDbEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static CosmosDbEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class CosmosDbEndpointBuilderImpl extends AbstractEndpointBuilder implements CosmosDbEndpointBuilder, AdvancedCosmosDbEndpointBuilder {
            public CosmosDbEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new CosmosDbEndpointBuilderImpl(path);
    }
}