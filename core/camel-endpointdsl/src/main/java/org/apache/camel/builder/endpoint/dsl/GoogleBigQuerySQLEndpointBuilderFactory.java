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
 * Google BigQuery data warehouse for analytics (using SQL queries).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
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
         * provided the default will be used.
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
         * provided the default will be used.
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
         * Group: advanced
         */
        default AdvancedGoogleBigQuerySQLEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Google BigQuery Standard SQL (camel-google-bigquery)
     * Google BigQuery data warehouse for analytics (using SQL queries).
     * 
     * Category: cloud,messaging
     * Available as of version: 2.23
     * Maven coordinates: org.apache.camel:camel-google-bigquery
     * 
     * Syntax: <code>google-bigquery-sql:projectId:query</code>
     * 
     * Path parameter: query (required)
     * BigQuery standard SQL query
     * 
     * Path parameter: projectId (required)
     * Google Cloud Project Id
     */
    default GoogleBigQuerySQLEndpointBuilder googleBigQuerySQL(String path) {
        class GoogleBigQuerySQLEndpointBuilderImpl extends AbstractEndpointBuilder implements GoogleBigQuerySQLEndpointBuilder, AdvancedGoogleBigQuerySQLEndpointBuilder {
            public GoogleBigQuerySQLEndpointBuilderImpl(String path) {
                super("google-bigquery-sql", path);
            }
        }
        return new GoogleBigQuerySQLEndpointBuilderImpl(path);
    }
}