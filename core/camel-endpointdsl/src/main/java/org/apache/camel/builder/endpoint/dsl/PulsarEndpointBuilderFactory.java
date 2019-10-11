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
         * Group the consumer acknowledgments for the specified time in
         * milliseconds - defaults to 100.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder ackGroupTimeMillis(
                long ackGroupTimeMillis) {
            doSetProperty("ackGroupTimeMillis", ackGroupTimeMillis);
            return this;
        }
        /**
         * Group the consumer acknowledgments for the specified time in
         * milliseconds - defaults to 100.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder ackGroupTimeMillis(
                String ackGroupTimeMillis) {
            doSetProperty("ackGroupTimeMillis", ackGroupTimeMillis);
            return this;
        }
        /**
         * Timeout for unacknowledged messages in milliseconds - defaults to
         * 10000.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder ackTimeoutMillis(
                long ackTimeoutMillis) {
            doSetProperty("ackTimeoutMillis", ackTimeoutMillis);
            return this;
        }
        /**
         * Timeout for unacknowledged messages in milliseconds - defaults to
         * 10000.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder ackTimeoutMillis(
                String ackTimeoutMillis) {
            doSetProperty("ackTimeoutMillis", ackTimeoutMillis);
            return this;
        }
        /**
         * Whether to allow manual message acknowledgements. If this option is
         * enabled, then messages are not immediately acknowledged after being
         * consumed. Instead, an instance of PulsarMessageReceipt is stored as a
         * header on the org.apache.camel.Exchange. Messages can then be
         * acknowledged using PulsarMessageReceipt at any time before the
         * ackTimeout occurs.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder allowManualAcknowledgement(
                boolean allowManualAcknowledgement) {
            doSetProperty("allowManualAcknowledgement", allowManualAcknowledgement);
            return this;
        }
        /**
         * Whether to allow manual message acknowledgements. If this option is
         * enabled, then messages are not immediately acknowledged after being
         * consumed. Instead, an instance of PulsarMessageReceipt is stored as a
         * header on the org.apache.camel.Exchange. Messages can then be
         * acknowledged using PulsarMessageReceipt at any time before the
         * ackTimeout occurs.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder allowManualAcknowledgement(
                String allowManualAcknowledgement) {
            doSetProperty("allowManualAcknowledgement", allowManualAcknowledgement);
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
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder bridgeErrorHandler(
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
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Name of the consumer when subscription is EXCLUSIVE.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder consumerName(String consumerName) {
            doSetProperty("consumerName", consumerName);
            return this;
        }
        /**
         * Prefix to add to consumer names when a SHARED or FAILOVER
         * subscription is used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder consumerNamePrefix(
                String consumerNamePrefix) {
            doSetProperty("consumerNamePrefix", consumerNamePrefix);
            return this;
        }
        /**
         * Size of the consumer queue - defaults to 10.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder consumerQueueSize(
                int consumerQueueSize) {
            doSetProperty("consumerQueueSize", consumerQueueSize);
            return this;
        }
        /**
         * Size of the consumer queue - defaults to 10.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder consumerQueueSize(
                String consumerQueueSize) {
            doSetProperty("consumerQueueSize", consumerQueueSize);
            return this;
        }
        /**
         * Number of consumers - defaults to 1.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder numberOfConsumers(
                int numberOfConsumers) {
            doSetProperty("numberOfConsumers", numberOfConsumers);
            return this;
        }
        /**
         * Number of consumers - defaults to 1.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder numberOfConsumers(
                String numberOfConsumers) {
            doSetProperty("numberOfConsumers", numberOfConsumers);
            return this;
        }
        /**
         * Name of the subscription to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder subscriptionName(
                String subscriptionName) {
            doSetProperty("subscriptionName", subscriptionName);
            return this;
        }
        /**
         * Type of the subscription EXCLUSIVESHAREDFAILOVER, defaults to
         * EXCLUSIVE.
         * 
         * The option is a:
         * <code>org.apache.camel.component.pulsar.utils.consumers.SubscriptionType</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder subscriptionType(
                SubscriptionType subscriptionType) {
            doSetProperty("subscriptionType", subscriptionType);
            return this;
        }
        /**
         * Type of the subscription EXCLUSIVESHAREDFAILOVER, defaults to
         * EXCLUSIVE.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.pulsar.utils.consumers.SubscriptionType</code> type.
         * 
         * Group: consumer
         */
        default PulsarEndpointConsumerBuilder subscriptionType(
                String subscriptionType) {
            doSetProperty("subscriptionType", subscriptionType);
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
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exceptionHandler(
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
         * Group: consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exchangePattern(
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
         * Group: consumer (advanced)
         */
        default AdvancedPulsarEndpointConsumerBuilder exchangePattern(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder synchronous(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Apache Pulsar component.
     */
    public interface PulsarEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPulsarEndpointProducerBuilder advanced() {
            return (AdvancedPulsarEndpointProducerBuilder) this;
        }
        /**
         * Control whether automatic batching of messages is enabled for the
         * producer. Default is true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder batchingEnabled(
                boolean batchingEnabled) {
            doSetProperty("batchingEnabled", batchingEnabled);
            return this;
        }
        /**
         * Control whether automatic batching of messages is enabled for the
         * producer. Default is true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder batchingEnabled(
                String batchingEnabled) {
            doSetProperty("batchingEnabled", batchingEnabled);
            return this;
        }
        /**
         * Set the maximum number of messages permitted in a batch. Default
         * 1,000.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder batchingMaxMessages(
                int batchingMaxMessages) {
            doSetProperty("batchingMaxMessages", batchingMaxMessages);
            return this;
        }
        /**
         * Set the maximum number of messages permitted in a batch. Default
         * 1,000.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder batchingMaxMessages(
                String batchingMaxMessages) {
            doSetProperty("batchingMaxMessages", batchingMaxMessages);
            return this;
        }
        /**
         * Set the time period within which the messages sent will be batched if
         * batch messages are enabled. If set to a non zero value, messages will
         * be queued until either: this time interval expires the max number of
         * messages in a batch is reached Default is 1ms.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder batchingMaxPublishDelayMicros(
                long batchingMaxPublishDelayMicros) {
            doSetProperty("batchingMaxPublishDelayMicros", batchingMaxPublishDelayMicros);
            return this;
        }
        /**
         * Set the time period within which the messages sent will be batched if
         * batch messages are enabled. If set to a non zero value, messages will
         * be queued until either: this time interval expires the max number of
         * messages in a batch is reached Default is 1ms.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder batchingMaxPublishDelayMicros(
                String batchingMaxPublishDelayMicros) {
            doSetProperty("batchingMaxPublishDelayMicros", batchingMaxPublishDelayMicros);
            return this;
        }
        /**
         * Set whether the send and asyncSend operations should block when the
         * outgoing message queue is full. If set to false, send operations will
         * immediately fail with ProducerQueueIsFullError when there is no space
         * left in the pending queue. Default is false.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder blockIfQueueFull(
                boolean blockIfQueueFull) {
            doSetProperty("blockIfQueueFull", blockIfQueueFull);
            return this;
        }
        /**
         * Set whether the send and asyncSend operations should block when the
         * outgoing message queue is full. If set to false, send operations will
         * immediately fail with ProducerQueueIsFullError when there is no space
         * left in the pending queue. Default is false.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder blockIfQueueFull(
                String blockIfQueueFull) {
            doSetProperty("blockIfQueueFull", blockIfQueueFull);
            return this;
        }
        /**
         * Set the compression type for the producer.
         * 
         * The option is a:
         * <code>org.apache.pulsar.client.api.CompressionType</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder compressionType(
                CompressionType compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Set the compression type for the producer.
         * 
         * The option will be converted to a
         * <code>org.apache.pulsar.client.api.CompressionType</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder compressionType(
                String compressionType) {
            doSetProperty("compressionType", compressionType);
            return this;
        }
        /**
         * Set the baseline for the sequence ids for messages published by the
         * producer. First message will be using (initialSequenceId 1) as its
         * sequence id and subsequent messages will be assigned incremental
         * sequence ids, if not otherwise specified.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder initialSequenceId(
                long initialSequenceId) {
            doSetProperty("initialSequenceId", initialSequenceId);
            return this;
        }
        /**
         * Set the baseline for the sequence ids for messages published by the
         * producer. First message will be using (initialSequenceId 1) as its
         * sequence id and subsequent messages will be assigned incremental
         * sequence ids, if not otherwise specified.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder initialSequenceId(
                String initialSequenceId) {
            doSetProperty("initialSequenceId", initialSequenceId);
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
         * Group: producer
         */
        default PulsarEndpointProducerBuilder lazyStartProducer(
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
         * Group: producer
         */
        default PulsarEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the max size of the queue holding the messages pending to receive
         * an acknowledgment from the broker. Default is 1000.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder maxPendingMessages(
                int maxPendingMessages) {
            doSetProperty("maxPendingMessages", maxPendingMessages);
            return this;
        }
        /**
         * Set the max size of the queue holding the messages pending to receive
         * an acknowledgment from the broker. Default is 1000.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder maxPendingMessages(
                String maxPendingMessages) {
            doSetProperty("maxPendingMessages", maxPendingMessages);
            return this;
        }
        /**
         * Set the number of max pending messages across all the partitions.
         * Default is 50000.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder maxPendingMessagesAcrossPartitions(
                int maxPendingMessagesAcrossPartitions) {
            doSetProperty("maxPendingMessagesAcrossPartitions", maxPendingMessagesAcrossPartitions);
            return this;
        }
        /**
         * Set the number of max pending messages across all the partitions.
         * Default is 50000.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder maxPendingMessagesAcrossPartitions(
                String maxPendingMessagesAcrossPartitions) {
            doSetProperty("maxPendingMessagesAcrossPartitions", maxPendingMessagesAcrossPartitions);
            return this;
        }
        /**
         * Set a custom Message Router.
         * 
         * The option is a:
         * <code>org.apache.pulsar.client.api.MessageRouter</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder messageRouter(Object messageRouter) {
            doSetProperty("messageRouter", messageRouter);
            return this;
        }
        /**
         * Set a custom Message Router.
         * 
         * The option will be converted to a
         * <code>org.apache.pulsar.client.api.MessageRouter</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder messageRouter(String messageRouter) {
            doSetProperty("messageRouter", messageRouter);
            return this;
        }
        /**
         * Set the message routing mode for the producer.
         * 
         * The option is a:
         * <code>org.apache.pulsar.client.api.MessageRoutingMode</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder messageRoutingMode(
                MessageRoutingMode messageRoutingMode) {
            doSetProperty("messageRoutingMode", messageRoutingMode);
            return this;
        }
        /**
         * Set the message routing mode for the producer.
         * 
         * The option will be converted to a
         * <code>org.apache.pulsar.client.api.MessageRoutingMode</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder messageRoutingMode(
                String messageRoutingMode) {
            doSetProperty("messageRoutingMode", messageRoutingMode);
            return this;
        }
        /**
         * Name of the producer. If unset, lets Pulsar select a unique
         * identifier.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder producerName(String producerName) {
            doSetProperty("producerName", producerName);
            return this;
        }
        /**
         * Send timeout in milliseconds. Defaults to 30,000ms (30 seconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder sendTimeoutMs(int sendTimeoutMs) {
            doSetProperty("sendTimeoutMs", sendTimeoutMs);
            return this;
        }
        /**
         * Send timeout in milliseconds. Defaults to 30,000ms (30 seconds).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default PulsarEndpointProducerBuilder sendTimeoutMs(String sendTimeoutMs) {
            doSetProperty("sendTimeoutMs", sendTimeoutMs);
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
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPulsarEndpointProducerBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointProducerBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointProducerBuilder synchronous(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Apache Pulsar component.
     */
    public interface PulsarEndpointBuilder
            extends
                PulsarEndpointConsumerBuilder, PulsarEndpointProducerBuilder {
        default AdvancedPulsarEndpointBuilder advanced() {
            return (AdvancedPulsarEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Apache Pulsar component.
     */
    public interface AdvancedPulsarEndpointBuilder
            extends
                AdvancedPulsarEndpointConsumerBuilder, AdvancedPulsarEndpointProducerBuilder {
        default PulsarEndpointBuilder basic() {
            return (PulsarEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPulsarEndpointBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointBuilder basicPropertyBinding(
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
         * Group: advanced
         */
        default AdvancedPulsarEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPulsarEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.pulsar.utils.consumers.SubscriptionType</code> enum.
     */
    enum SubscriptionType {
        EXCLUSIVE,
        SHARED,
        FAILOVER;
    }

    /**
     * Proxy enum for <code>org.apache.pulsar.client.api.CompressionType</code>
     * enum.
     */
    enum CompressionType {
        NONE,
        LZ4,
        ZLIB,
        ZSTD,
        SNAPPY;
    }

    /**
     * Proxy enum for
     * <code>org.apache.pulsar.client.api.MessageRoutingMode</code> enum.
     */
    enum MessageRoutingMode {
        SinglePartition,
        RoundRobinPartition,
        CustomPartition;
    }
    /**
     * Apache Pulsar (camel-pulsar)
     * Camel Apache Pulsar Component
     * 
     * Category: messaging
     * Available as of version: 2.24
     * Maven coordinates: org.apache.camel:camel-pulsar
     * 
     * Syntax: <code>pulsar:persistence://tenant/namespace/topic</code>
     * 
     * Path parameter: persistence (required)
     * Whether the topic is persistent or non-persistent
     * The value can be one of: persistent, non-persistent
     * 
     * Path parameter: tenant (required)
     * The tenant
     * 
     * Path parameter: namespace (required)
     * The namespace
     * 
     * Path parameter: topic (required)
     * The topic
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