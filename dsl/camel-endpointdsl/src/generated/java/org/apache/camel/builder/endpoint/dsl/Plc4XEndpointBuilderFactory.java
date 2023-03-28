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

import java.util.*;
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Read and write to PLC devices
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Plc4XEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the PLC4X component.
     */
    public interface Plc4XEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPlc4XEndpointConsumerBuilder advanced() {
            return (AdvancedPlc4XEndpointConsumerBuilder) this;
        }
        /**
         * Whether to reconnect when no connection is present upon doing a
         * request.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param autoReconnect the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointConsumerBuilder autoReconnect(boolean autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Whether to reconnect when no connection is present upon doing a
         * request.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param autoReconnect the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointConsumerBuilder autoReconnect(String autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Interval on which the Trigger should be checked.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param period the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointConsumerBuilder period(int period) {
            doSetProperty("period", period);
            return this;
        }
        /**
         * Interval on which the Trigger should be checked.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param period the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointConsumerBuilder period(String period) {
            doSetProperty("period", period);
            return this;
        }
        /**
         * Tags as key/values from the Map to use in query.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the tags(String, Object)
         * method to add a value (call the method multiple times to set more
         * values).
         * 
         * Group: consumer
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default Plc4XEndpointConsumerBuilder tags(String key, Object value) {
            doSetMultiValueProperty("tags", "tag." + key, value);
            return this;
        }
        /**
         * Tags as key/values from the Map to use in query.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the tags(String, Object)
         * method to add a value (call the method multiple times to set more
         * values).
         * 
         * Group: consumer
         * 
         * @param values the values
         * @return the dsl builder
         */
        default Plc4XEndpointConsumerBuilder tags(Map values) {
            doSetMultiValueProperties("tags", "tag.", values);
            return this;
        }
        /**
         * Query to a trigger. On a rising edge of the trigger, the tags will be
         * read once.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param trigger the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointConsumerBuilder trigger(String trigger) {
            doSetProperty("trigger", trigger);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the PLC4X component.
     */
    public interface AdvancedPlc4XEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default Plc4XEndpointConsumerBuilder basic() {
            return (Plc4XEndpointConsumerBuilder) this;
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
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedPlc4XEndpointConsumerBuilder bridgeErrorHandler(
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
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedPlc4XEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
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
        default AdvancedPlc4XEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
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
        default AdvancedPlc4XEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedPlc4XEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
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
        default AdvancedPlc4XEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the PLC4X component.
     */
    public interface Plc4XEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPlc4XEndpointProducerBuilder advanced() {
            return (AdvancedPlc4XEndpointProducerBuilder) this;
        }
        /**
         * Whether to reconnect when no connection is present upon doing a
         * request.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param autoReconnect the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointProducerBuilder autoReconnect(boolean autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Whether to reconnect when no connection is present upon doing a
         * request.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param autoReconnect the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointProducerBuilder autoReconnect(String autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the PLC4X component.
     */
    public interface AdvancedPlc4XEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default Plc4XEndpointProducerBuilder basic() {
            return (Plc4XEndpointProducerBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPlc4XEndpointProducerBuilder lazyStartProducer(
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedPlc4XEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the PLC4X component.
     */
    public interface Plc4XEndpointBuilder
            extends
                Plc4XEndpointConsumerBuilder,
                Plc4XEndpointProducerBuilder {
        default AdvancedPlc4XEndpointBuilder advanced() {
            return (AdvancedPlc4XEndpointBuilder) this;
        }
        /**
         * Whether to reconnect when no connection is present upon doing a
         * request.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param autoReconnect the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointBuilder autoReconnect(boolean autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Whether to reconnect when no connection is present upon doing a
         * request.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param autoReconnect the value to set
         * @return the dsl builder
         */
        default Plc4XEndpointBuilder autoReconnect(String autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the PLC4X component.
     */
    public interface AdvancedPlc4XEndpointBuilder
            extends
                AdvancedPlc4XEndpointConsumerBuilder,
                AdvancedPlc4XEndpointProducerBuilder {
        default Plc4XEndpointBuilder basic() {
            return (Plc4XEndpointBuilder) this;
        }
    }

    public interface Plc4XBuilders {
        /**
         * PLC4X (camel-plc4x)
         * Read and write to PLC devices
         * 
         * Category: iot
         * Since: 3.20
         * Maven coordinates: org.apache.camel:camel-plc4x
         * 
         * Syntax: <code>plc4x:driver</code>
         * 
         * Path parameter: driver (required)
         * PLC4X connection string for the connection to the target
         * 
         * @param path driver
         * @return the dsl builder
         */
        default Plc4XEndpointBuilder plc4x(String path) {
            return Plc4XEndpointBuilderFactory.endpointBuilder("plc4x", path);
        }
        /**
         * PLC4X (camel-plc4x)
         * Read and write to PLC devices
         * 
         * Category: iot
         * Since: 3.20
         * Maven coordinates: org.apache.camel:camel-plc4x
         * 
         * Syntax: <code>plc4x:driver</code>
         * 
         * Path parameter: driver (required)
         * PLC4X connection string for the connection to the target
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path driver
         * @return the dsl builder
         */
        default Plc4XEndpointBuilder plc4x(String componentName, String path) {
            return Plc4XEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static Plc4XEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class Plc4XEndpointBuilderImpl extends AbstractEndpointBuilder implements Plc4XEndpointBuilder, AdvancedPlc4XEndpointBuilder {
            public Plc4XEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Plc4XEndpointBuilderImpl(path);
    }
}