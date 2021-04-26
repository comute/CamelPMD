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
package org.apache.camel.component.azure.cosmosdb;

import com.azure.cosmos.CosmosAsyncClient;
import org.apache.camel.Category;
import org.apache.camel.Component;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.component.azure.cosmosdb.client.CosmosDbClientFactory;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.support.DefaultEndpoint;

/**
 * Azure Cosmos DB is Microsoft’s globally distributed, multi-model database service for operational and analytics
 * workloads. It offers multi-mastering feature by automatically scaling throughput, compute, and storage. This
 * component interacts with Azure CosmosDB through Azure SQL API
 */
@UriEndpoint(firstVersion = "3.10.0", scheme = "azure-cosmosdb", title = "Azure CosmosDB",
             syntax = "azure-cosmosdb:databaseName/containerName", category = {
                     Category.CLOUD, Category.DATABASE })
public class CosmosDbEndpoint extends DefaultEndpoint {

    @UriParam
    private CosmosAsyncClient cosmosAsyncClient;

    @UriParam
    private CosmosDbConfiguration configuration;

    public CosmosDbEndpoint(final String uri, final Component component, final CosmosDbConfiguration configuration) {
        super(uri, component);
        this.configuration = configuration;
    }

    @Override
    public Producer createProducer() throws Exception {
        return new CosmosDbProducer(this);
    }

    @Override
    public Consumer createConsumer(Processor processor) throws Exception {
        final Consumer cosmosDbConsumer = new CosmosDbConsumer(this, processor);
        configureConsumer(cosmosDbConsumer);

        return cosmosDbConsumer;
    }

    @Override
    public void doStart() throws Exception {
        super.doStart();

        cosmosAsyncClient = configuration.getCosmosAsyncClient() != null
                ? configuration.getCosmosAsyncClient() : CosmosDbClientFactory.createCosmosAsyncClient(configuration);
    }

    @Override
    public void doStop() throws Exception {
        if (cosmosAsyncClient != null) {
            cosmosAsyncClient.close();
        }

        super.doStop();
    }

    /**
     * The component configurations
     */
    public CosmosDbConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(CosmosDbConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * Inject an external {@link CosmosAsyncClient} into the component which provides a client-side logical
     * representation of the Azure Cosmos DB service. This asynchronous client is used to configure and execute requests
     * against the service.
     */
    public CosmosAsyncClient getCosmosAsyncClient() {
        return cosmosAsyncClient;
    }

    public void setCosmosAsyncClient(CosmosAsyncClient cosmosAsyncClient) {
        this.cosmosAsyncClient = cosmosAsyncClient;
    }
}
