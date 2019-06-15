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
 * Camel Apache Pulsar Component
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PulsarEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Apache Pulsar component.
     */
    public interface PulsarEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPulsarEndpointConsumerBuilder advanced() {
            return (AdvancedPulsarEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Name of the consumer when subscription is EXCLUSIVE.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder consumerName(String consumerName) {
            setProperty("consumerName", consumerName);
            return this;
        }
        /**
         * Prefix to add to consumer names when a SHARED or FAILOVER
         * subscription is used.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder consumerNamePrefix(
                String consumerNamePrefix) {
            setProperty("consumerNamePrefix", consumerNamePrefix);
            return this;
        }
        /**
         * Size of the consumer queue - defaults to 10.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder consumerQueueSize(
                int consumerQueueSize) {
            setProperty("consumerQueueSize", consumerQueueSize);
            return this;
        }
        /**
         * Size of the consumer queue - defaults to 10.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder consumerQueueSize(
                String consumerQueueSize) {
            setProperty("consumerQueueSize", consumerQueueSize);
            return this;
        }
        /**
         * Number of consumers - defaults to 1.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder numberOfConsumers(
                int numberOfConsumers) {
            setProperty("numberOfConsumers", numberOfConsumers);
            return this;
        }
        /**
         * Number of consumers - defaults to 1.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder numberOfConsumers(
                String numberOfConsumers) {
            setProperty("numberOfConsumers", numberOfConsumers);
            return this;
        }
        /**
         * Name of the subscription to use.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder subscriptionName(
                String subscriptionName) {
            setProperty("subscriptionName", subscriptionName);
            return this;
        }
        /**
         * Type of the subscription EXCLUSIVESHAREDFAILOVER, defaults to
         * EXCLUSIVE.
         * The option is a
         * <code>org.apache.camel.component.pulsar.utils.consumers.SubscriptionType</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder subscriptionType(
                SubscriptionType subscriptionType) {
            setProperty("subscriptionType", subscriptionType);
            return this;
        }
        /**
         * Type of the subscription EXCLUSIVESHAREDFAILOVER, defaults to
         * EXCLUSIVE.
         * The option will be converted to a
         * <code>org.apache.camel.component.pulsar.utils.consumers.SubscriptionType</code> type.
         * @group consumer
         */
        default PulsarEndpointConsumerBuilder subscriptionType(
                String subscriptionType) {
            setProperty("subscriptionType", subscriptionType);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Apache Pulsar component.
     */
    public interface AdvancedPulsarEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default PulsarEndpointConsumerBuilder basic() {
            return (PulsarEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Apache Pulsar component.
     */
    public static interface PulsarEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPulsarEndpointProducerBuilder advanced() {
            return (AdvancedPulsarEndpointProducerBuilder) this;
        }
        /**
         * The Topic's full URI path including type, tenant and namespace.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default PulsarEndpointProducerBuilder topic(String topic) {
            setProperty("topic", topic);
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
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default PulsarEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default PulsarEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Name of the producer.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default PulsarEndpointProducerBuilder producerName(String producerName) {
            setProperty("producerName", producerName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Apache Pulsar component.
     */
    public interface AdvancedPulsarEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default PulsarEndpointProducerBuilder basic() {
            return (PulsarEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Apache Pulsar component.
     */
    public static interface PulsarEndpointBuilder
            extends
                PulsarEndpointConsumerBuilder, PulsarEndpointProducerBuilder {
        default AdvancedPulsarEndpointBuilder advanced() {
            return (AdvancedPulsarEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Apache Pulsar component.
     */
    public static interface AdvancedPulsarEndpointBuilder
            extends
                AdvancedPulsarEndpointConsumerBuilder, AdvancedPulsarEndpointProducerBuilder {
        default PulsarEndpointBuilder basic() {
            return (PulsarEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPulsarEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.pulsar.utils.consumers.SubscriptionType</code> enum.
     */
    public static enum SubscriptionType {
        EXCLUSIVE, SHARED, FAILOVER;
    }
    /**
     * Camel Apache Pulsar Component Creates a builder to build endpoints for
     * the Apache Pulsar component.
     */
    default PulsarEndpointBuilder pulsar(String path) {
        class PulsarEndpointBuilderImpl extends AbstractEndpointBuilder implements PulsarEndpointBuilder, AdvancedPulsarEndpointBuilder {
            public PulsarEndpointBuilderImpl(String path) {
                super("pulsar", path);
            }
        }
        return new PulsarEndpointBuilderImpl(path);
    }
}