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
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Interact with Ignite Queue data structures.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteQueueEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite Queues component.
     */
    public interface IgniteQueueEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedIgniteQueueEndpointBuilder advanced() {
            return (AdvancedIgniteQueueEndpointBuilder) this;
        }
        /**
         * The queue capacity. Default: non-bounded.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder capacity(int capacity) {
            doSetProperty("capacity", capacity);
            return this;
        }
        /**
         * The queue capacity. Default: non-bounded.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder capacity(String capacity) {
            doSetProperty("capacity", capacity);
            return this;
        }
        /**
         * The collection configuration. Default: empty configuration. You can
         * also conveniently set inner properties by using configuration.xyz=123
         * options.
         * 
         * The option is a:
         * <code>org.apache.ignite.configuration.CollectionConfiguration</code>
         * type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder configuration(Object configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The collection configuration. Default: empty configuration. You can
         * also conveniently set inner properties by using configuration.xyz=123
         * options.
         * 
         * The option will be converted to a
         * <code>org.apache.ignite.configuration.CollectionConfiguration</code>
         * type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder configuration(String configuration) {
            doSetProperty("configuration", configuration);
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
        default IgniteQueueEndpointBuilder lazyStartProducer(
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteQueueEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to invoke on the Ignite Queue. Superseded by the
         * IgniteConstants.IGNITE_QUEUE_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY, DRAIN, ELEMENT, PEEK, OFFER, POLL, TAKE, PUT.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ignite.queue.IgniteQueueOperation</code> type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder operation(
                IgniteQueueOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to invoke on the Ignite Queue. Superseded by the
         * IgniteConstants.IGNITE_QUEUE_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY, DRAIN, ELEMENT, PEEK, OFFER, POLL, TAKE, PUT.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.ignite.queue.IgniteQueueOperation</code> type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default IgniteQueueEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default IgniteQueueEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * The queue timeout in milliseconds. Default: no timeout.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder timeoutMillis(Long timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * The queue timeout in milliseconds. Default: no timeout.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default IgniteQueueEndpointBuilder timeoutMillis(String timeoutMillis) {
            doSetProperty("timeoutMillis", timeoutMillis);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteQueueEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IgniteQueueEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite Queues component.
     */
    public interface AdvancedIgniteQueueEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IgniteQueueEndpointBuilder basic() {
            return (IgniteQueueEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteQueueEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteQueueEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteQueueEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIgniteQueueEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.ignite.queue.IgniteQueueOperation</code>
     * enum.
     */
    enum IgniteQueueOperation {
        CONTAINS,
        ADD,
        SIZE,
        REMOVE,
        ITERATOR,
        CLEAR,
        RETAIN_ALL,
        ARRAY,
        DRAIN,
        ELEMENT,
        PEEK,
        OFFER,
        POLL,
        TAKE,
        PUT;
    }

    public interface IgniteQueueBuilders {
        /**
         * Ignite Queues (camel-ignite)
         * Interact with Ignite Queue data structures.
         * 
         * Category: nosql,cache
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-queue:name</code>
         * 
         * Path parameter: name (required)
         * The queue name.
         * 
         * @param path name
         */
        default IgniteQueueEndpointBuilder igniteQueue(String path) {
            return IgniteQueueEndpointBuilderFactory.endpointBuilder("ignite-queue", path);
        }
        /**
         * Ignite Queues (camel-ignite)
         * Interact with Ignite Queue data structures.
         * 
         * Category: nosql,cache
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-ignite
         * 
         * Syntax: <code>ignite-queue:name</code>
         * 
         * Path parameter: name (required)
         * The queue name.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         */
        default IgniteQueueEndpointBuilder igniteQueue(
                String componentName,
                String path) {
            return IgniteQueueEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static IgniteQueueEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class IgniteQueueEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteQueueEndpointBuilder, AdvancedIgniteQueueEndpointBuilder {
            public IgniteQueueEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new IgniteQueueEndpointBuilderImpl(path);
    }
}