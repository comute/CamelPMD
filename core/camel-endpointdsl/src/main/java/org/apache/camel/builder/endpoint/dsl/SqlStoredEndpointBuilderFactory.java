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
 * The sql component allows you to work with databases using JDBC Stored
 * Procedure queries.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SqlStoredEndpointBuilderFactory {


    /**
     * Builder for endpoint for the SQL Stored Procedure component.
     */
    public interface SqlStoredEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSqlStoredEndpointBuilder advanced() {
            return (AdvancedSqlStoredEndpointBuilder) this;
        }
        /**
         * Enables or disables batch mode.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder batch(boolean batch) {
            doSetProperty("batch", batch);
            return this;
        }
        /**
         * Enables or disables batch mode.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder batch(String batch) {
            doSetProperty("batch", batch);
            return this;
        }
        /**
         * Sets the DataSource to use to communicate with the database.
         * 
         * The option is a: <code>javax.sql.DataSource</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder dataSource(Object dataSource) {
            doSetProperty("dataSource", dataSource);
            return this;
        }
        /**
         * Sets the DataSource to use to communicate with the database.
         * 
         * The option will be converted to a <code>javax.sql.DataSource</code>
         * type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder dataSource(String dataSource) {
            doSetProperty("dataSource", dataSource);
            return this;
        }
        /**
         * Whether this call is for a function.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder function(boolean function) {
            doSetProperty("function", function);
            return this;
        }
        /**
         * Whether this call is for a function.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder function(String function) {
            doSetProperty("function", function);
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
        default SqlStoredEndpointBuilder lazyStartProducer(
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
        default SqlStoredEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * If set, will ignore the results of the template and use the existing
         * IN message as the OUT message for the continuation of processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder noop(boolean noop) {
            doSetProperty("noop", noop);
            return this;
        }
        /**
         * If set, will ignore the results of the template and use the existing
         * IN message as the OUT message for the continuation of processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder noop(String noop) {
            doSetProperty("noop", noop);
            return this;
        }
        /**
         * Store the template result in a header instead of the message body. By
         * default, outputHeader == null and the template result is stored in
         * the message body, any existing content in the message body is
         * discarded. If outputHeader is set, the value is used as the name of
         * the header to store the template result and the original message body
         * is preserved.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder outputHeader(String outputHeader) {
            doSetProperty("outputHeader", outputHeader);
            return this;
        }
        /**
         * Whether to use the message body as the template and then headers for
         * parameters. If this option is enabled then the template in the uri is
         * not used.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder useMessageBodyForTemplate(
                boolean useMessageBodyForTemplate) {
            doSetProperty("useMessageBodyForTemplate", useMessageBodyForTemplate);
            return this;
        }
        /**
         * Whether to use the message body as the template and then headers for
         * parameters. If this option is enabled then the template in the uri is
         * not used.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SqlStoredEndpointBuilder useMessageBodyForTemplate(
                String useMessageBodyForTemplate) {
            doSetProperty("useMessageBodyForTemplate", useMessageBodyForTemplate);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the SQL Stored Procedure component.
     */
    public interface AdvancedSqlStoredEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SqlStoredEndpointBuilder basic() {
            return (SqlStoredEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSqlStoredEndpointBuilder basicPropertyBinding(
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
        default AdvancedSqlStoredEndpointBuilder basicPropertyBinding(
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
        default AdvancedSqlStoredEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedSqlStoredEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * SQL Stored Procedure (camel-sql)
     * The sql component allows you to work with databases using JDBC Stored
     * Procedure queries.
     * 
     * Category: database,sql
     * Available as of version: 2.17
     * Maven coordinates: org.apache.camel:camel-sql
     * 
     * Syntax: <code>sql-stored:template</code>
     * 
     * Path parameter: template (required)
     * Sets the StoredProcedure template to perform
     */
    default SqlStoredEndpointBuilder sqlStored(String path) {
        class SqlStoredEndpointBuilderImpl extends AbstractEndpointBuilder implements SqlStoredEndpointBuilder, AdvancedSqlStoredEndpointBuilder {
            public SqlStoredEndpointBuilderImpl(String path) {
                super("sql-stored", path);
            }
        }
        return new SqlStoredEndpointBuilderImpl(path);
    }
}