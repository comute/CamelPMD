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
 * The caffeine-cache component is used for integration with Caffeine Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CaffeineCacheEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Caffeine Cache component.
     */
    public interface CaffeineCacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedCaffeineCacheEndpointConsumerBuilder advanced() {
            return (AdvancedCaffeineCacheEndpointConsumerBuilder) this;
        }
        /**
         * the cache name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CaffeineCacheEndpointConsumerBuilder cacheName(String cacheName) {
            setProperty("cacheName", cacheName);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default CaffeineCacheEndpointConsumerBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default CaffeineCacheEndpointConsumerBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
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
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default CaffeineCacheEndpointConsumerBuilder bridgeErrorHandler(
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
        default CaffeineCacheEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Caffeine Cache component.
     */
    public interface AdvancedCaffeineCacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default CaffeineCacheEndpointConsumerBuilder basic() {
            return (CaffeineCacheEndpointConsumerBuilder) this;
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
        default AdvancedCaffeineCacheEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedCaffeineCacheEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedCaffeineCacheEndpointConsumerBuilder exchangePattern(
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
        default AdvancedCaffeineCacheEndpointConsumerBuilder exchangePattern(
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
        default AdvancedCaffeineCacheEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedCaffeineCacheEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * The option is a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointConsumerBuilder keyType(
                Class<Object> keyType) {
            setProperty("keyType", keyType);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointConsumerBuilder keyType(
                String keyType) {
            setProperty("keyType", keyType);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointConsumerBuilder synchronous(
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
        default AdvancedCaffeineCacheEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * The option is a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointConsumerBuilder valueType(
                Class<Object> valueType) {
            setProperty("valueType", valueType);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointConsumerBuilder valueType(
                String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Caffeine Cache component.
     */
    public interface CaffeineCacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCaffeineCacheEndpointProducerBuilder advanced() {
            return (AdvancedCaffeineCacheEndpointProducerBuilder) this;
        }
        /**
         * the cache name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CaffeineCacheEndpointProducerBuilder cacheName(String cacheName) {
            setProperty("cacheName", cacheName);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default CaffeineCacheEndpointProducerBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default CaffeineCacheEndpointProducerBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder action(String action) {
            setProperty("action", action);
            return this;
        }
        /**
         * To configure an already instantiated cache to be used.
         * The option is a <code>com.github.benmanes.caffeine.cache.Cache</code>
         * type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder cache(Object cache) {
            setProperty("cache", cache);
            return this;
        }
        /**
         * To configure an already instantiated cache to be used.
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.Cache</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder cache(String cache) {
            setProperty("cache", cache);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * The option is a
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder cacheLoader(
                Object cacheLoader) {
            setProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder cacheLoader(
                String cacheLoader) {
            setProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * The option is a
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder evictionType(
                EvictionType evictionType) {
            setProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * The option will be converted to a
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder evictionType(
                String evictionType) {
            setProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds).
         * The option is a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder expireAfterAccessTime(
                int expireAfterAccessTime) {
            setProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds).
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder expireAfterAccessTime(
                String expireAfterAccessTime) {
            setProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds).
         * The option is a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder expireAfterWriteTime(
                int expireAfterWriteTime) {
            setProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds).
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder expireAfterWriteTime(
                String expireAfterWriteTime) {
            setProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Set the initial Capacity for the cache.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder initialCapacity(
                int initialCapacity) {
            setProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * Set the initial Capacity for the cache.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder initialCapacity(
                String initialCapacity) {
            setProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * The option is a <code>java.lang.Object</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder key(Object key) {
            setProperty("key", key);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * The option will be converted to a <code>java.lang.Object</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder key(String key) {
            setProperty("key", key);
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
        default CaffeineCacheEndpointProducerBuilder lazyStartProducer(
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
        default CaffeineCacheEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the maximum size for the cache.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder maximumSize(int maximumSize) {
            setProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Set the maximum size for the cache.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder maximumSize(
                String maximumSize) {
            setProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * The option is a
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder removalListener(
                Object removalListener) {
            setProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder removalListener(
                String removalListener) {
            setProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * The option is a
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder statsCounter(
                Object statsCounter) {
            setProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder statsCounter(
                String statsCounter) {
            setProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * To enable stats on the cache.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder statsEnabled(
                boolean statsEnabled) {
            setProperty("statsEnabled", statsEnabled);
            return this;
        }
        /**
         * To enable stats on the cache.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default CaffeineCacheEndpointProducerBuilder statsEnabled(
                String statsEnabled) {
            setProperty("statsEnabled", statsEnabled);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Caffeine Cache component.
     */
    public interface AdvancedCaffeineCacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default CaffeineCacheEndpointProducerBuilder basic() {
            return (CaffeineCacheEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedCaffeineCacheEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * The option is a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointProducerBuilder keyType(
                Class<Object> keyType) {
            setProperty("keyType", keyType);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointProducerBuilder keyType(
                String keyType) {
            setProperty("keyType", keyType);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointProducerBuilder synchronous(
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
        default AdvancedCaffeineCacheEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * The option is a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointProducerBuilder valueType(
                Class<Object> valueType) {
            setProperty("valueType", valueType);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointProducerBuilder valueType(
                String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Caffeine Cache component.
     */
    public interface CaffeineCacheEndpointBuilder
            extends
                CaffeineCacheEndpointConsumerBuilder, CaffeineCacheEndpointProducerBuilder {
        default AdvancedCaffeineCacheEndpointBuilder advanced() {
            return (AdvancedCaffeineCacheEndpointBuilder) this;
        }
        /**
         * the cache name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CaffeineCacheEndpointBuilder cacheName(String cacheName) {
            setProperty("cacheName", cacheName);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default CaffeineCacheEndpointBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default CaffeineCacheEndpointBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Caffeine Cache component.
     */
    public interface AdvancedCaffeineCacheEndpointBuilder
            extends
                AdvancedCaffeineCacheEndpointConsumerBuilder, AdvancedCaffeineCacheEndpointProducerBuilder {
        default CaffeineCacheEndpointBuilder basic() {
            return (CaffeineCacheEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointBuilder basicPropertyBinding(
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
        default AdvancedCaffeineCacheEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * The option is a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointBuilder keyType(
                Class<Object> keyType) {
            setProperty("keyType", keyType);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointBuilder keyType(String keyType) {
            setProperty("keyType", keyType);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointBuilder synchronous(
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
        default AdvancedCaffeineCacheEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * The option is a <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointBuilder valueType(
                Class<Object> valueType) {
            setProperty("valueType", valueType);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * @group advanced
         */
        default AdvancedCaffeineCacheEndpointBuilder valueType(String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.caffeine.EvictionType</code> enum.
     */
    enum EvictionType {
        size_based,
time_based;
    }
    /**
     * The caffeine-cache component is used for integration with Caffeine Cache.
     * Creates a builder to build endpoints for the Caffeine Cache component.
     */
    default CaffeineCacheEndpointBuilder caffeineCache(String path) {
        class CaffeineCacheEndpointBuilderImpl extends AbstractEndpointBuilder implements CaffeineCacheEndpointBuilder, AdvancedCaffeineCacheEndpointBuilder {
            public CaffeineCacheEndpointBuilderImpl(String path) {
                super("caffeine-cache", path);
            }
        }
        return new CaffeineCacheEndpointBuilderImpl(path);
    }
}