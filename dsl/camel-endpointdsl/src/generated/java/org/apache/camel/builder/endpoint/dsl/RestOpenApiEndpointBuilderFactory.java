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
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * To call REST services using OpenAPI specification as contract.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestOpenApiEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the REST OpenApi component.
     */
    public interface RestOpenApiEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedRestOpenApiEndpointConsumerBuilder advanced() {
            return (AdvancedRestOpenApiEndpointConsumerBuilder) this;
        }
        /**
         * Enable validation of requests against the configured OpenAPI
         * specification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param requestValidationEnabled the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointConsumerBuilder requestValidationEnabled(
                boolean requestValidationEnabled) {
            doSetProperty("requestValidationEnabled", requestValidationEnabled);
            return this;
        }
        /**
         * Enable validation of requests against the configured OpenAPI
         * specification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param requestValidationEnabled the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointConsumerBuilder requestValidationEnabled(
                String requestValidationEnabled) {
            doSetProperty("requestValidationEnabled", requestValidationEnabled);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the REST OpenApi component.
     */
    public interface AdvancedRestOpenApiEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default RestOpenApiEndpointConsumerBuilder basic() {
            return (RestOpenApiEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
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
        default AdvancedRestOpenApiEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Name of the Camel component that will service the requests. The
         * component must be present in Camel registry and it must implement
         * RestOpenApiConsumerFactory service provider interface. If not set
         * CLASSPATH is searched for single component that implements
         * RestOpenApiConsumerFactory SPI. Overrides component configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param consumerComponentName the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder consumerComponentName(
                String consumerComponentName) {
            doSetProperty("consumerComponentName", consumerComponentName);
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
        default AdvancedRestOpenApiEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedRestOpenApiEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedRestOpenApiEndpointConsumerBuilder exchangePattern(
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
        default AdvancedRestOpenApiEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * To use a custom strategy for how to process Rest DSL requests.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.rest.openapi.RestOpenapiProcessorStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param restOpenapiProcessorStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder restOpenapiProcessorStrategy(
                org.apache.camel.component.rest.openapi.RestOpenapiProcessorStrategy restOpenapiProcessorStrategy) {
            doSetProperty("restOpenapiProcessorStrategy", restOpenapiProcessorStrategy);
            return this;
        }
        /**
         * To use a custom strategy for how to process Rest DSL requests.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.rest.openapi.RestOpenapiProcessorStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param restOpenapiProcessorStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder restOpenapiProcessorStrategy(
                String restOpenapiProcessorStrategy) {
            doSetProperty("restOpenapiProcessorStrategy", restOpenapiProcessorStrategy);
            return this;
        }
        /**
         * If request validation is enabled, this option provides the capability
         * to customize the creation of OpenApiInteractionValidator used to
         * validate requests.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param requestValidationCustomizer the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder requestValidationCustomizer(
                org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer requestValidationCustomizer) {
            doSetProperty("requestValidationCustomizer", requestValidationCustomizer);
            return this;
        }
        /**
         * If request validation is enabled, this option provides the capability
         * to customize the creation of OpenApiInteractionValidator used to
         * validate requests.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param requestValidationCustomizer the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder requestValidationCustomizer(
                String requestValidationCustomizer) {
            doSetProperty("requestValidationCustomizer", requestValidationCustomizer);
            return this;
        }
        /**
         * Levels for specific OpenAPI request validation options. Multiple
         * options can be specified as URI options prefixed by 'validation.'.
         * For example,
         * validation.request.body=ERROR&amp;amp;validation.request.body.unexpected=IGNORED. Supported values are INFO, ERROR, WARN &amp;amp; IGNORE.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * requestValidationLevels(String, Object) method to add a value (call
         * the method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder requestValidationLevels(
                String key,
                Object value) {
            doSetMultiValueProperty("requestValidationLevels", "validation." + key, value);
            return this;
        }
        /**
         * Levels for specific OpenAPI request validation options. Multiple
         * options can be specified as URI options prefixed by 'validation.'.
         * For example,
         * validation.request.body=ERROR&amp;amp;validation.request.body.unexpected=IGNORED. Supported values are INFO, ERROR, WARN &amp;amp; IGNORE.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * requestValidationLevels(String, Object) method to add a value (call
         * the method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param values the values
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointConsumerBuilder requestValidationLevels(
                Map values) {
            doSetMultiValueProperties("requestValidationLevels", "validation.", values);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the REST OpenApi component.
     */
    public interface RestOpenApiEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedRestOpenApiEndpointProducerBuilder advanced() {
            return (AdvancedRestOpenApiEndpointProducerBuilder) this;
        }
        /**
         * Enable validation of requests against the configured OpenAPI
         * specification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param requestValidationEnabled the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointProducerBuilder requestValidationEnabled(
                boolean requestValidationEnabled) {
            doSetProperty("requestValidationEnabled", requestValidationEnabled);
            return this;
        }
        /**
         * Enable validation of requests against the configured OpenAPI
         * specification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param requestValidationEnabled the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointProducerBuilder requestValidationEnabled(
                String requestValidationEnabled) {
            doSetProperty("requestValidationEnabled", requestValidationEnabled);
            return this;
        }
        /**
         * API basePath, for example /v3. Default is unset, if set overrides the
         * value present in OpenApi specification and in the component
         * configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param basePath the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointProducerBuilder basePath(String basePath) {
            doSetProperty("basePath", basePath);
            return this;
        }
        /**
         * What payload type this component capable of consuming. Could be one
         * type, like application/json or multiple types as application/json,
         * application/xml; q=0.5 according to the RFC7231. This equates to the
         * value of Accept HTTP header. If set overrides any value found in the
         * OpenApi specification and. in the component configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param consumes the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointProducerBuilder consumes(String consumes) {
            doSetProperty("consumes", consumes);
            return this;
        }
        /**
         * Scheme hostname and port to direct the HTTP requests to in the form
         * of https://hostname:port. Can be configured at the endpoint,
         * component or in the corresponding REST configuration in the Camel
         * Context. If you give this component a name (e.g. petstore) that REST
         * configuration is consulted first, rest-openapi next, and global
         * configuration last. If set overrides any value found in the OpenApi
         * specification, RestConfiguration. Overrides all other configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointProducerBuilder host(String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * What payload type this component is producing. For example
         * application/json according to the RFC7231. This equates to the value
         * of Content-Type HTTP header. If set overrides any value present in
         * the OpenApi specification. Overrides all other configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param produces the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointProducerBuilder produces(String produces) {
            doSetProperty("produces", produces);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the REST OpenApi component.
     */
    public interface AdvancedRestOpenApiEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default RestOpenApiEndpointProducerBuilder basic() {
            return (RestOpenApiEndpointProducerBuilder) this;
        }
        /**
         * Name of the Camel component that will perform the requests. The
         * component must be present in Camel registry and it must implement
         * RestProducerFactory service provider interface. If not set CLASSPATH
         * is searched for single component that implements RestProducerFactory
         * SPI. Overrides component configuration.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param componentName the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointProducerBuilder componentName(
                String componentName) {
            doSetProperty("componentName", componentName);
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedRestOpenApiEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * If request validation is enabled, this option provides the capability
         * to customize the creation of OpenApiInteractionValidator used to
         * validate requests.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param requestValidationCustomizer the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointProducerBuilder requestValidationCustomizer(
                org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer requestValidationCustomizer) {
            doSetProperty("requestValidationCustomizer", requestValidationCustomizer);
            return this;
        }
        /**
         * If request validation is enabled, this option provides the capability
         * to customize the creation of OpenApiInteractionValidator used to
         * validate requests.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param requestValidationCustomizer the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointProducerBuilder requestValidationCustomizer(
                String requestValidationCustomizer) {
            doSetProperty("requestValidationCustomizer", requestValidationCustomizer);
            return this;
        }
        /**
         * Levels for specific OpenAPI request validation options. Multiple
         * options can be specified as URI options prefixed by 'validation.'.
         * For example,
         * validation.request.body=ERROR&amp;amp;validation.request.body.unexpected=IGNORED. Supported values are INFO, ERROR, WARN &amp;amp; IGNORE.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * requestValidationLevels(String, Object) method to add a value (call
         * the method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointProducerBuilder requestValidationLevels(
                String key,
                Object value) {
            doSetMultiValueProperty("requestValidationLevels", "validation." + key, value);
            return this;
        }
        /**
         * Levels for specific OpenAPI request validation options. Multiple
         * options can be specified as URI options prefixed by 'validation.'.
         * For example,
         * validation.request.body=ERROR&amp;amp;validation.request.body.unexpected=IGNORED. Supported values are INFO, ERROR, WARN &amp;amp; IGNORE.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * requestValidationLevels(String, Object) method to add a value (call
         * the method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param values the values
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointProducerBuilder requestValidationLevels(
                Map values) {
            doSetMultiValueProperties("requestValidationLevels", "validation.", values);
            return this;
        }
    }

    /**
     * Builder for endpoint for the REST OpenApi component.
     */
    public interface RestOpenApiEndpointBuilder
            extends
                RestOpenApiEndpointConsumerBuilder,
                RestOpenApiEndpointProducerBuilder {
        default AdvancedRestOpenApiEndpointBuilder advanced() {
            return (AdvancedRestOpenApiEndpointBuilder) this;
        }
        /**
         * Enable validation of requests against the configured OpenAPI
         * specification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param requestValidationEnabled the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder requestValidationEnabled(
                boolean requestValidationEnabled) {
            doSetProperty("requestValidationEnabled", requestValidationEnabled);
            return this;
        }
        /**
         * Enable validation of requests against the configured OpenAPI
         * specification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param requestValidationEnabled the value to set
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder requestValidationEnabled(
                String requestValidationEnabled) {
            doSetProperty("requestValidationEnabled", requestValidationEnabled);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the REST OpenApi component.
     */
    public interface AdvancedRestOpenApiEndpointBuilder
            extends
                AdvancedRestOpenApiEndpointConsumerBuilder,
                AdvancedRestOpenApiEndpointProducerBuilder {
        default RestOpenApiEndpointBuilder basic() {
            return (RestOpenApiEndpointBuilder) this;
        }
        /**
         * If request validation is enabled, this option provides the capability
         * to customize the creation of OpenApiInteractionValidator used to
         * validate requests.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param requestValidationCustomizer the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointBuilder requestValidationCustomizer(
                org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer requestValidationCustomizer) {
            doSetProperty("requestValidationCustomizer", requestValidationCustomizer);
            return this;
        }
        /**
         * If request validation is enabled, this option provides the capability
         * to customize the creation of OpenApiInteractionValidator used to
         * validate requests.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.rest.openapi.validator.RequestValidationCustomizer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param requestValidationCustomizer the value to set
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointBuilder requestValidationCustomizer(
                String requestValidationCustomizer) {
            doSetProperty("requestValidationCustomizer", requestValidationCustomizer);
            return this;
        }
        /**
         * Levels for specific OpenAPI request validation options. Multiple
         * options can be specified as URI options prefixed by 'validation.'.
         * For example,
         * validation.request.body=ERROR&amp;amp;validation.request.body.unexpected=IGNORED. Supported values are INFO, ERROR, WARN &amp;amp; IGNORE.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * requestValidationLevels(String, Object) method to add a value (call
         * the method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointBuilder requestValidationLevels(
                String key,
                Object value) {
            doSetMultiValueProperty("requestValidationLevels", "validation." + key, value);
            return this;
        }
        /**
         * Levels for specific OpenAPI request validation options. Multiple
         * options can be specified as URI options prefixed by 'validation.'.
         * For example,
         * validation.request.body=ERROR&amp;amp;validation.request.body.unexpected=IGNORED. Supported values are INFO, ERROR, WARN &amp;amp; IGNORE.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * requestValidationLevels(String, Object) method to add a value (call
         * the method multiple times to set more values).
         * 
         * Group: advanced
         * 
         * @param values the values
         * @return the dsl builder
         */
        default AdvancedRestOpenApiEndpointBuilder requestValidationLevels(
                Map values) {
            doSetMultiValueProperties("requestValidationLevels", "validation.", values);
            return this;
        }
    }

    public interface RestOpenApiBuilders {
        /**
         * REST OpenApi (camel-rest-openapi)
         * To call REST services using OpenAPI specification as contract.
         * 
         * Category: rest,api
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-rest-openapi
         * 
         * Syntax: <code>rest-openapi:specificationUri#operationId</code>
         * 
         * Path parameter: specificationUri
         * Path to the OpenApi specification file. The scheme, host base path
         * are taken from this specification, but these can be overridden with
         * properties on the component or endpoint level. If not given the
         * component tries to load openapi.json resource from the classpath.
         * Note that the host defined on the component and endpoint of this
         * Component should contain the scheme, hostname and optionally the port
         * in the URI syntax (i.e. http://api.example.com:8080). Overrides
         * component configuration. The OpenApi specification can be loaded from
         * different sources by prefixing with file: classpath: http: https:.
         * Support for https is limited to using the JDK installed UrlHandler,
         * and as such it can be cumbersome to setup TLS/SSL certificates for
         * https (such as setting a number of javax.net.ssl JVM system
         * properties). How to do that consult the JDK documentation for
         * UrlHandler. Default value notice: By default loads openapi.json file
         * Default value: openapi.json
         * 
         * Path parameter: operationId
         * ID of the operation from the OpenApi specification. This is required
         * when using producer
         * 
         * @param path specificationUri#operationId
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder restOpenapi(String path) {
            return RestOpenApiEndpointBuilderFactory.endpointBuilder("rest-openapi", path);
        }
        /**
         * REST OpenApi (camel-rest-openapi)
         * To call REST services using OpenAPI specification as contract.
         * 
         * Category: rest,api
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-rest-openapi
         * 
         * Syntax: <code>rest-openapi:specificationUri#operationId</code>
         * 
         * Path parameter: specificationUri
         * Path to the OpenApi specification file. The scheme, host base path
         * are taken from this specification, but these can be overridden with
         * properties on the component or endpoint level. If not given the
         * component tries to load openapi.json resource from the classpath.
         * Note that the host defined on the component and endpoint of this
         * Component should contain the scheme, hostname and optionally the port
         * in the URI syntax (i.e. http://api.example.com:8080). Overrides
         * component configuration. The OpenApi specification can be loaded from
         * different sources by prefixing with file: classpath: http: https:.
         * Support for https is limited to using the JDK installed UrlHandler,
         * and as such it can be cumbersome to setup TLS/SSL certificates for
         * https (such as setting a number of javax.net.ssl JVM system
         * properties). How to do that consult the JDK documentation for
         * UrlHandler. Default value notice: By default loads openapi.json file
         * Default value: openapi.json
         * 
         * Path parameter: operationId
         * ID of the operation from the OpenApi specification. This is required
         * when using producer
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path specificationUri#operationId
         * @return the dsl builder
         */
        default RestOpenApiEndpointBuilder restOpenapi(
                String componentName,
                String path) {
            return RestOpenApiEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static RestOpenApiEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class RestOpenApiEndpointBuilderImpl extends AbstractEndpointBuilder implements RestOpenApiEndpointBuilder, AdvancedRestOpenApiEndpointBuilder {
            public RestOpenApiEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new RestOpenApiEndpointBuilderImpl(path);
    }
}