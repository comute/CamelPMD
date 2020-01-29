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
 * The zookeeper component allows interaction with a ZooKeeper cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ZooKeeperEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the ZooKeeper component.
     */
    public interface ZooKeeperEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedZooKeeperEndpointConsumerBuilder advanced() {
            return (AdvancedZooKeeperEndpointConsumerBuilder) this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ZooKeeperEndpointConsumerBuilder listChildren(
                boolean listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ZooKeeperEndpointConsumerBuilder listChildren(
                String listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: common
         */
        default ZooKeeperEndpointConsumerBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 5000
         * Group: common
         */
        default ZooKeeperEndpointConsumerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to backoff for after an error before retrying.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 5000
         * Group: consumer
         */
        default ZooKeeperEndpointConsumerBuilder backoff(long backoff) {
            doSetProperty("backoff", backoff);
            return this;
        }
        /**
         * The time interval to backoff for after an error before retrying.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 5000
         * Group: consumer
         */
        default ZooKeeperEndpointConsumerBuilder backoff(String backoff) {
            doSetProperty("backoff", backoff);
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
        default ZooKeeperEndpointConsumerBuilder bridgeErrorHandler(
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ZooKeeperEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Should changes to the znode be 'watched' and repeatedly processed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ZooKeeperEndpointConsumerBuilder repeat(boolean repeat) {
            doSetProperty("repeat", repeat);
            return this;
        }
        /**
         * Should changes to the znode be 'watched' and repeatedly processed.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ZooKeeperEndpointConsumerBuilder repeat(String repeat) {
            doSetProperty("repeat", repeat);
            return this;
        }
        /**
         * Upon the delete of a znode, should an empty message be send to the
         * consumer.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default ZooKeeperEndpointConsumerBuilder sendEmptyMessageOnDelete(
                boolean sendEmptyMessageOnDelete) {
            doSetProperty("sendEmptyMessageOnDelete", sendEmptyMessageOnDelete);
            return this;
        }
        /**
         * Upon the delete of a znode, should an empty message be send to the
         * consumer.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default ZooKeeperEndpointConsumerBuilder sendEmptyMessageOnDelete(
                String sendEmptyMessageOnDelete) {
            doSetProperty("sendEmptyMessageOnDelete", sendEmptyMessageOnDelete);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the ZooKeeper component.
     */
    public interface AdvancedZooKeeperEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default ZooKeeperEndpointConsumerBuilder basic() {
            return (ZooKeeperEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exceptionHandler(
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
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedZooKeeperEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
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
        default AdvancedZooKeeperEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperEndpointConsumerBuilder synchronous(
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
        default AdvancedZooKeeperEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the ZooKeeper component.
     */
    public interface ZooKeeperEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedZooKeeperEndpointProducerBuilder advanced() {
            return (AdvancedZooKeeperEndpointProducerBuilder) this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ZooKeeperEndpointProducerBuilder listChildren(
                boolean listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ZooKeeperEndpointProducerBuilder listChildren(
                String listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: common
         */
        default ZooKeeperEndpointProducerBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 5000
         * Group: common
         */
        default ZooKeeperEndpointProducerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Should the endpoint create the node if it does not currently exist.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ZooKeeperEndpointProducerBuilder create(boolean create) {
            doSetProperty("create", create);
            return this;
        }
        /**
         * Should the endpoint create the node if it does not currently exist.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ZooKeeperEndpointProducerBuilder create(String create) {
            doSetProperty("create", create);
            return this;
        }
        /**
         * The create mode that should be used for the newly created node.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: EPHEMERAL
         * Group: producer
         */
        default ZooKeeperEndpointProducerBuilder createMode(String createMode) {
            doSetProperty("createMode", createMode);
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
        default ZooKeeperEndpointProducerBuilder lazyStartProducer(
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
        default ZooKeeperEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the ZooKeeper component.
     */
    public interface AdvancedZooKeeperEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default ZooKeeperEndpointProducerBuilder basic() {
            return (ZooKeeperEndpointProducerBuilder) this;
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
        default AdvancedZooKeeperEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperEndpointProducerBuilder synchronous(
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
        default AdvancedZooKeeperEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the ZooKeeper component.
     */
    public interface ZooKeeperEndpointBuilder
            extends
                ZooKeeperEndpointConsumerBuilder,
                ZooKeeperEndpointProducerBuilder {
        default AdvancedZooKeeperEndpointBuilder advanced() {
            return (AdvancedZooKeeperEndpointBuilder) this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ZooKeeperEndpointBuilder listChildren(boolean listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * Whether the children of the node should be listed.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default ZooKeeperEndpointBuilder listChildren(String listChildren) {
            doSetProperty("listChildren", listChildren);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: common
         */
        default ZooKeeperEndpointBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The time interval to wait on connection before timing out.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 5000
         * Group: common
         */
        default ZooKeeperEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the ZooKeeper component.
     */
    public interface AdvancedZooKeeperEndpointBuilder
            extends
                AdvancedZooKeeperEndpointConsumerBuilder,
                AdvancedZooKeeperEndpointProducerBuilder {
        default ZooKeeperEndpointBuilder basic() {
            return (ZooKeeperEndpointBuilder) this;
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
        default AdvancedZooKeeperEndpointBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperEndpointBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedZooKeeperEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface ZooKeeperBuilders {
        /**
         * ZooKeeper (camel-zookeeper)
         * The zookeeper component allows interaction with a ZooKeeper cluster.
         * 
         * Category: clustering
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-zookeeper
         * 
         * Syntax: <code>zookeeper:serverUrls/path</code>
         * 
         * Path parameter: serverUrls (required)
         * The zookeeper server hosts (multiple servers can be separated by
         * comma)
         * 
         * Path parameter: path (required)
         * The node in the ZooKeeper server (aka znode)
         */
        default ZooKeeperEndpointBuilder zookeeper(String path) {
            return ZooKeeperEndpointBuilderFactory.zookeeper(path);
        }
    }
    /**
     * ZooKeeper (camel-zookeeper)
     * The zookeeper component allows interaction with a ZooKeeper cluster.
     * 
     * Category: clustering
     * Since: 2.9
     * Maven coordinates: org.apache.camel:camel-zookeeper
     * 
     * Syntax: <code>zookeeper:serverUrls/path</code>
     * 
     * Path parameter: serverUrls (required)
     * The zookeeper server hosts (multiple servers can be separated by comma)
     * 
     * Path parameter: path (required)
     * The node in the ZooKeeper server (aka znode)
     */
    static ZooKeeperEndpointBuilder zookeeper(String path) {
        class ZooKeeperEndpointBuilderImpl extends AbstractEndpointBuilder implements ZooKeeperEndpointBuilder, AdvancedZooKeeperEndpointBuilder {
            public ZooKeeperEndpointBuilderImpl(String path) {
                super("zookeeper", path);
            }
        }
        return new ZooKeeperEndpointBuilderImpl(path);
    }
}