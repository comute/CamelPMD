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
 * Detect and parse documents using Workday.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface WorkdayEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Workday component.
     */
    public interface WorkdayEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedWorkdayEndpointBuilder advanced() {
            return (AdvancedWorkdayEndpointBuilder) this;
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
        default WorkdayEndpointBuilder lazyStartProducer(
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
        default WorkdayEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Workday Report as a service output format.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: json
         * Group: format
         */
        default WorkdayEndpointBuilder reportFormat(String reportFormat) {
            doSetProperty("reportFormat", reportFormat);
            return this;
        }
        /**
         * Workday Host name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: host
         */
        default WorkdayEndpointBuilder host(String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Workday client Id generated by API client for integrations.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         */
        default WorkdayEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Workday client Secret generated by API client for integrations.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         */
        default WorkdayEndpointBuilder clientSecret(String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * Workday token Refresh generated for integrations system user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         */
        default WorkdayEndpointBuilder tokenRefresh(String tokenRefresh) {
            doSetProperty("tokenRefresh", tokenRefresh);
            return this;
        }
        /**
         * Workday Tenant name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: tenant
         */
        default WorkdayEndpointBuilder tenant(String tenant) {
            doSetProperty("tenant", tenant);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Workday component.
     */
    public interface AdvancedWorkdayEndpointBuilder
            extends
                EndpointProducerBuilder {
        default WorkdayEndpointBuilder basic() {
            return (WorkdayEndpointBuilder) this;
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
        default AdvancedWorkdayEndpointBuilder basicPropertyBinding(
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
        default AdvancedWorkdayEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Pool connection manager for advanced configuration.
         * 
         * The option is a:
         * <code>org.apache.http.impl.conn.PoolingHttpClientConnectionManager</code> type.
         * 
         * Group: advanced
         */
        default AdvancedWorkdayEndpointBuilder httpConnectionManager(
                Object httpConnectionManager) {
            doSetProperty("httpConnectionManager", httpConnectionManager);
            return this;
        }
        /**
         * Pool connection manager for advanced configuration.
         * 
         * The option will be converted to a
         * <code>org.apache.http.impl.conn.PoolingHttpClientConnectionManager</code> type.
         * 
         * Group: advanced
         */
        default AdvancedWorkdayEndpointBuilder httpConnectionManager(
                String httpConnectionManager) {
            doSetProperty("httpConnectionManager", httpConnectionManager);
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
        default AdvancedWorkdayEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedWorkdayEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface WorkdayBuilders {
        /**
         * Workday (camel-workday)
         * Detect and parse documents using Workday.
         * 
         * Category: cloud,api,hcm
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-workday
         * 
         * Syntax: <code>workday:entity:path</code>
         * 
         * Path parameter: entity (required)
         * The entity to be requested or subscribed via API.
         * There are 2 enums and the value can be one of: report, commonAPI
         * 
         * Path parameter: path (required)
         * The API path to access an entity structure.
         * 
         * @param path entity:path
         */
        default WorkdayEndpointBuilder workday(String path) {
            return WorkdayEndpointBuilderFactory.endpointBuilder("workday", path);
        }
        /**
         * Workday (camel-workday)
         * Detect and parse documents using Workday.
         * 
         * Category: cloud,api,hcm
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-workday
         * 
         * Syntax: <code>workday:entity:path</code>
         * 
         * Path parameter: entity (required)
         * The entity to be requested or subscribed via API.
         * There are 2 enums and the value can be one of: report, commonAPI
         * 
         * Path parameter: path (required)
         * The API path to access an entity structure.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path entity:path
         */
        default WorkdayEndpointBuilder workday(String componentName, String path) {
            return WorkdayEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static WorkdayEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class WorkdayEndpointBuilderImpl extends AbstractEndpointBuilder implements WorkdayEndpointBuilder, AdvancedWorkdayEndpointBuilder {
            public WorkdayEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new WorkdayEndpointBuilderImpl(path);
    }
}