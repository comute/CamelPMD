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
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * HTTP service leveraging existing runtime platform HTTP server
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PlatformHttpEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Platform HTTP component.
     */
    public interface PlatformHttpEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPlatformHttpEndpointBuilder advanced() {
            return (AdvancedPlatformHttpEndpointBuilder) this;
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
        default PlatformHttpEndpointBuilder bridgeErrorHandler(
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
        default PlatformHttpEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The content type this endpoint accepts as an input, such as
         * application/xml or application/json. null or &#42;/&#42; mean no
         * restriction.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: consumer
         */
        default PlatformHttpEndpointBuilder consumes(String consumes) {
            doSetProperty("consumes", consumes);
            return this;
        }
        /**
         * A comma separated list of HTTP methods to serve, e.g. GET,POST . If
         * no methods are specified, all methods will be served.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: consumer
         */
        default PlatformHttpEndpointBuilder httpMethodRestrict(
                String httpMethodRestrict) {
            doSetProperty("httpMethodRestrict", httpMethodRestrict);
            return this;
        }
        /**
         * The content type this endpoint produces, such as application/xml or
         * application/json.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: consumer
         */
        default PlatformHttpEndpointBuilder produces(String produces) {
            doSetProperty("produces", produces);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Platform HTTP component.
     */
    public interface AdvancedPlatformHttpEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default PlatformHttpEndpointBuilder basic() {
            return (PlatformHttpEndpointBuilder) this;
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
        default AdvancedPlatformHttpEndpointBuilder exceptionHandler(
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
        default AdvancedPlatformHttpEndpointBuilder exceptionHandler(
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
        default AdvancedPlatformHttpEndpointBuilder exchangePattern(
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
        default AdvancedPlatformHttpEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A comma or whitespace separated list of file extensions. Uploads
         * having these extensions will be stored locally. Null value or
         * asterisk () will allow all files.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedPlatformHttpEndpointBuilder fileNameExtWhitelist(
                String fileNameExtWhitelist) {
            doSetProperty("fileNameExtWhitelist", fileNameExtWhitelist);
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
        default AdvancedPlatformHttpEndpointBuilder basicPropertyBinding(
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
        default AdvancedPlatformHttpEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter headers to and from
         * Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedPlatformHttpEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter headers to and from
         * Camel message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedPlatformHttpEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * An HTTP Server engine implementation to serve the requests of this
         * endpoint.
         * 
         * The option is a:
         * <code>org.apache.camel.component.platform.http.spi.PlatformHttpEngine</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedPlatformHttpEndpointBuilder platformHttpEngine(
                Object platformHttpEngine) {
            doSetProperty("platformHttpEngine", platformHttpEngine);
            return this;
        }
        /**
         * An HTTP Server engine implementation to serve the requests of this
         * endpoint.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.platform.http.spi.PlatformHttpEngine</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedPlatformHttpEndpointBuilder platformHttpEngine(
                String platformHttpEngine) {
            doSetProperty("platformHttpEngine", platformHttpEngine);
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
        default AdvancedPlatformHttpEndpointBuilder synchronous(
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
        default AdvancedPlatformHttpEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface PlatformHttpBuilders {
        /**
         * Platform HTTP (camel-platform-http)
         * HTTP service leveraging existing runtime platform HTTP server
         * 
         * Category: http
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-platform-http
         * 
         * Syntax: <code>platform-http:path</code>
         * 
         * Path parameter: path (required)
         * The path under which this endpoint serves the HTTP requests
         */
        default PlatformHttpEndpointBuilder platformHttp(String path) {
            return PlatformHttpEndpointBuilderFactory.platformHttp(path);
        }
    }
    /**
     * Platform HTTP (camel-platform-http)
     * HTTP service leveraging existing runtime platform HTTP server
     * 
     * Category: http
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-platform-http
     * 
     * Syntax: <code>platform-http:path</code>
     * 
     * Path parameter: path (required)
     * The path under which this endpoint serves the HTTP requests
     */
    static PlatformHttpEndpointBuilder platformHttp(String path) {
        class PlatformHttpEndpointBuilderImpl extends AbstractEndpointBuilder implements PlatformHttpEndpointBuilder, AdvancedPlatformHttpEndpointBuilder {
            public PlatformHttpEndpointBuilderImpl(String path) {
                super("platform-http", path);
            }
        }
        return new PlatformHttpEndpointBuilderImpl(path);
    }
}