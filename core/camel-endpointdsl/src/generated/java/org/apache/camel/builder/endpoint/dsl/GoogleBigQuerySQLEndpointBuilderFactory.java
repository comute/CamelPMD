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
 * Access Google Cloud BigQuery service using SQL queries.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GoogleBigQuerySQLEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Google BigQuery Standard SQL component.
     */
    public interface GoogleBigQuerySQLEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedGoogleBigQuerySQLEndpointBuilder advanced() {
            return (AdvancedGoogleBigQuerySQLEndpointBuilder) this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If non
         * provided the default one will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory</code> type.
         * 
         * Group: producer
         */
        default GoogleBigQuerySQLEndpointBuilder connectionFactory(
                Object connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * ConnectionFactory to obtain connection to Bigquery Service. If non
         * provided the default one will be used.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory</code> type.
         * 
         * Group: producer
         */
        default GoogleBigQuerySQLEndpointBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
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
        default GoogleBigQuerySQLEndpointBuilder lazyStartProducer(
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
        default GoogleBigQuerySQLEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Google BigQuery Standard SQL
     * component.
     */
    public interface AdvancedGoogleBigQuerySQLEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GoogleBigQuerySQLEndpointBuilder basic() {
            return (GoogleBigQuerySQLEndpointBuilder) this;
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
        default AdvancedGoogleBigQuerySQLEndpointBuilder basicPropertyBinding(
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
        default AdvancedGoogleBigQuerySQLEndpointBuilder basicPropertyBinding(
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
        default AdvancedGoogleBigQuerySQLEndpointBuilder synchronous(
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
        default AdvancedGoogleBigQuerySQLEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface GoogleBigQuerySQLBuilders {
        /**
         * Google BigQuery Standard SQL (camel-google-bigquery)
         * Access Google Cloud BigQuery service using SQL queries.
         * 
         * Category: cloud,messaging
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-google-bigquery
         * 
         * Syntax: <code>google-bigquery-sql:projectId:query</code>
         * 
         * Path parameter: query (required)
         * BigQuery standard SQL query
         * 
         * Path parameter: projectId (required)
         * Google Cloud Project Id
         * 
         * @param path projectId:query
         */
        default GoogleBigQuerySQLEndpointBuilder googleBigquerySql(String path) {
            return GoogleBigQuerySQLEndpointBuilderFactory.endpointBuilder("google-bigquery-sql", path);
        }
        /**
         * Google BigQuery Standard SQL (camel-google-bigquery)
         * Access Google Cloud BigQuery service using SQL queries.
         * 
         * Category: cloud,messaging
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-google-bigquery
         * 
         * Syntax: <code>google-bigquery-sql:projectId:query</code>
         * 
         * Path parameter: query (required)
         * BigQuery standard SQL query
         * 
         * Path parameter: projectId (required)
         * Google Cloud Project Id
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path projectId:query
         */
        default GoogleBigQuerySQLEndpointBuilder googleBigquerySql(
                String componentName,
                String path) {
            return GoogleBigQuerySQLEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static GoogleBigQuerySQLEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GoogleBigQuerySQLEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleBigQuerySQLEndpointBuilder, AdvancedGoogleBigQuerySQLEndpointBuilder {
            public GoogleBigQuerySQLEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GoogleBigQuerySQLEndpointBuilderImpl(path);
    }
}