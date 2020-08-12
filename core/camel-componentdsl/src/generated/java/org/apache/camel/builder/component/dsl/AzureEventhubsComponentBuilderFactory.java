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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.azure.eventhubs.EventHubsComponent;

/**
 * The azure-eventhubs component that integrates Azure Event Hubs which is a
 * highly scalable publish-subscribe service that can ingest millions of events
 * per second and stream them to multiple consumers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureEventhubsComponentBuilderFactory {

    /**
     * Azure Event Hubs (camel-azure-eventhubs)
     * The azure-eventhubs component that integrates Azure Event Hubs which is a
     * highly scalable publish-subscribe service that can ingest millions of
     * events per second and stream them to multiple consumers.
     * 
     * Category: cloud,messaging
     * Since: 3.5
     * Maven coordinates: org.apache.camel:camel-azure-eventhubs
     */
    static AzureEventhubsComponentBuilder azureEventhubs() {
        return new AzureEventhubsComponentBuilderImpl();
    }

    /**
     * Builder for the Azure Event Hubs component.
     */
    interface AzureEventhubsComponentBuilder
            extends
                ComponentBuilder<EventHubsComponent> {
        /**
         * test.
         * 
         * The option is a: <code>com.azure.core.amqp.AmqpRetryOptions</code>
         * type.
         * 
         * Group: common
         */
        default AzureEventhubsComponentBuilder amqpRetryOptions(
                com.azure.core.amqp.AmqpRetryOptions amqpRetryOptions) {
            doSetProperty("amqpRetryOptions", amqpRetryOptions);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>com.azure.core.amqp.AmqpTransportType</code>
         * type.
         * 
         * Default: Amqp
         * Group: common
         */
        default AzureEventhubsComponentBuilder amqpTransportType(
                com.azure.core.amqp.AmqpTransportType amqpTransportType) {
            doSetProperty("amqpTransportType", amqpTransportType);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default AzureEventhubsComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * The component configurations.
         * 
         * The option is a:
         * <code>org.apache.camel.component.azure.eventhubs.EventHubsConfiguration</code> type.
         * 
         * Group: common
         */
        default AzureEventhubsComponentBuilder configuration(
                org.apache.camel.component.azure.eventhubs.EventHubsConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder blobAccessKey(
                java.lang.String blobAccessKey) {
            doSetProperty("blobAccessKey", blobAccessKey);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder blobAccountName(
                java.lang.String blobAccountName) {
            doSetProperty("blobAccountName", blobAccountName);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder blobContainerName(
                java.lang.String blobContainerName) {
            doSetProperty("blobContainerName", blobContainerName);
            return this;
        }
        /**
         * test.
         * 
         * The option is a:
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder blobStorageSharedKeyCredential(
                com.azure.storage.common.StorageSharedKeyCredential blobStorageSharedKeyCredential) {
            doSetProperty("blobStorageSharedKeyCredential", blobStorageSharedKeyCredential);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * test.
         * 
         * The option is a:
         * <code>com.azure.messaging.eventhubs.CheckpointStore</code> type.
         * 
         * Default: BlobCheckpointStore
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder checkpointStore(
                com.azure.messaging.eventhubs.CheckpointStore checkpointStore) {
            doSetProperty("checkpointStore", checkpointStore);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: $Default
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder consumerGroupName(
                java.lang.String consumerGroupName) {
            doSetProperty("consumerGroupName", consumerGroupName);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * com.azure.messaging.eventhubs.models.EventPosition></code> type.
         * 
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder eventPosition(
                java.util.Map<java.lang.String, com.azure.messaging.eventhubs.models.EventPosition> eventPosition) {
            doSetProperty("eventPosition", eventPosition);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 500
         * Group: consumer
         */
        default AzureEventhubsComponentBuilder prefetchCount(int prefetchCount) {
            doSetProperty("prefetchCount", prefetchCount);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AzureEventhubsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AzureEventhubsComponentBuilder partitionId(
                java.lang.String partitionId) {
            doSetProperty("partitionId", partitionId);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AzureEventhubsComponentBuilder partitionKey(
                java.lang.String partitionKey) {
            doSetProperty("partitionKey", partitionKey);
            return this;
        }
        /**
         * test.
         * 
         * The option is a:
         * <code>com.azure.messaging.eventhubs.EventHubProducerAsyncClient</code> type.
         * 
         * Group: producer
         */
        default AzureEventhubsComponentBuilder producerAsyncClient(
                com.azure.messaging.eventhubs.EventHubProducerAsyncClient producerAsyncClient) {
            doSetProperty("producerAsyncClient", producerAsyncClient);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AzureEventhubsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AzureEventhubsComponentBuilder connectionString(
                java.lang.String connectionString) {
            doSetProperty("connectionString", connectionString);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AzureEventhubsComponentBuilder sharedAccessKey(
                java.lang.String sharedAccessKey) {
            doSetProperty("sharedAccessKey", sharedAccessKey);
            return this;
        }
        /**
         * test.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AzureEventhubsComponentBuilder sharedAccessName(
                java.lang.String sharedAccessName) {
            doSetProperty("sharedAccessName", sharedAccessName);
            return this;
        }
    }

    class AzureEventhubsComponentBuilderImpl
            extends
                AbstractComponentBuilder<EventHubsComponent>
            implements
                AzureEventhubsComponentBuilder {
        @Override
        protected EventHubsComponent buildConcreteComponent() {
            return new EventHubsComponent();
        }
        private org.apache.camel.component.azure.eventhubs.EventHubsConfiguration getOrCreateConfiguration(
                org.apache.camel.component.azure.eventhubs.EventHubsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.eventhubs.EventHubsConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amqpRetryOptions": getOrCreateConfiguration((EventHubsComponent) component).setAmqpRetryOptions((com.azure.core.amqp.AmqpRetryOptions) value); return true;
            case "amqpTransportType": getOrCreateConfiguration((EventHubsComponent) component).setAmqpTransportType((com.azure.core.amqp.AmqpTransportType) value); return true;
            case "autoDiscoverClient": getOrCreateConfiguration((EventHubsComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "configuration": ((EventHubsComponent) component).setConfiguration((org.apache.camel.component.azure.eventhubs.EventHubsConfiguration) value); return true;
            case "blobAccessKey": getOrCreateConfiguration((EventHubsComponent) component).setBlobAccessKey((java.lang.String) value); return true;
            case "blobAccountName": getOrCreateConfiguration((EventHubsComponent) component).setBlobAccountName((java.lang.String) value); return true;
            case "blobContainerName": getOrCreateConfiguration((EventHubsComponent) component).setBlobContainerName((java.lang.String) value); return true;
            case "blobStorageSharedKeyCredential": getOrCreateConfiguration((EventHubsComponent) component).setBlobStorageSharedKeyCredential((com.azure.storage.common.StorageSharedKeyCredential) value); return true;
            case "bridgeErrorHandler": ((EventHubsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "checkpointStore": getOrCreateConfiguration((EventHubsComponent) component).setCheckpointStore((com.azure.messaging.eventhubs.CheckpointStore) value); return true;
            case "consumerGroupName": getOrCreateConfiguration((EventHubsComponent) component).setConsumerGroupName((java.lang.String) value); return true;
            case "eventPosition": getOrCreateConfiguration((EventHubsComponent) component).setEventPosition((java.util.Map) value); return true;
            case "prefetchCount": getOrCreateConfiguration((EventHubsComponent) component).setPrefetchCount((int) value); return true;
            case "lazyStartProducer": ((EventHubsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "partitionId": getOrCreateConfiguration((EventHubsComponent) component).setPartitionId((java.lang.String) value); return true;
            case "partitionKey": getOrCreateConfiguration((EventHubsComponent) component).setPartitionKey((java.lang.String) value); return true;
            case "producerAsyncClient": getOrCreateConfiguration((EventHubsComponent) component).setProducerAsyncClient((com.azure.messaging.eventhubs.EventHubProducerAsyncClient) value); return true;
            case "basicPropertyBinding": ((EventHubsComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "connectionString": getOrCreateConfiguration((EventHubsComponent) component).setConnectionString((java.lang.String) value); return true;
            case "sharedAccessKey": getOrCreateConfiguration((EventHubsComponent) component).setSharedAccessKey((java.lang.String) value); return true;
            case "sharedAccessName": getOrCreateConfiguration((EventHubsComponent) component).setSharedAccessName((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}