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
 * The rest-api component is used for providing Swagger API of the REST services
 * which has been defined using the rest-dsl in Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestApiEndpointBuilderFactory {


    /**
     * Builder for endpoint for the REST API component.
     */
    public static interface RestApiEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedRestApiEndpointBuilder advanced() {
            return (AdvancedRestApiEndpointBuilder) this;
        }
        /**
         * The base path.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default RestApiEndpointBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * Optional CamelContext id pattern to only allow Rest APIs from rest
         * services within CamelContext's which name matches the pattern.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default RestApiEndpointBuilder contextIdPattern(String contextIdPattern) {
            setProperty("contextIdPattern", contextIdPattern);
            return this;
        }
        /**
         * The Camel Rest API component to use for generating the API of the
         * REST services, such as swagger.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default RestApiEndpointBuilder apiComponentName(String apiComponentName) {
            setProperty("apiComponentName", apiComponentName);
            return this;
        }
        /**
         * The Camel Rest component to use for (consumer) the REST transport,
         * such as jetty, servlet, undertow. If no component has been explicit
         * configured, then Camel will lookup if there is a Camel component that
         * integrates with the Rest DSL, or if a
         * org.apache.camel.spi.RestConsumerFactory is registered in the
         * registry. If either one is found, then that is being used.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default RestApiEndpointBuilder consumerComponentName(
                String consumerComponentName) {
            setProperty("consumerComponentName", consumerComponentName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the REST API component.
     */
    public static interface AdvancedRestApiEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default RestApiEndpointBuilder basic() {
            return (RestApiEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedRestApiEndpointBuilder basicPropertyBinding(
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
        default AdvancedRestApiEndpointBuilder basicPropertyBinding(
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
        default AdvancedRestApiEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedRestApiEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The rest-api component is used for providing Swagger API of the REST
     * services which has been defined using the rest-dsl in Camel. Creates a
     * builder to build endpoints for the REST API component.
     */
    default RestApiEndpointBuilder restApi(String path) {
        class RestApiEndpointBuilderImpl extends AbstractEndpointBuilder implements RestApiEndpointBuilder, AdvancedRestApiEndpointBuilder {
            public RestApiEndpointBuilderImpl(String path) {
                super("rest-api", path);
            }
        }
        return new RestApiEndpointBuilderImpl(path);
    }
}