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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.sql.SqlComponent;

/**
 * Perform SQL queries using Spring JDBC.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SqlComponentBuilderFactory {

    /**
     * SQL (camel-sql)
     * Perform SQL queries using Spring JDBC.
     * 
     * Category: database
     * Since: 1.4
     * Maven coordinates: org.apache.camel:camel-sql
     * 
     * @return the dsl builder
     */
    static SqlComponentBuilder sql() {
        return new SqlComponentBuilderImpl();
    }

    /**
     * Builder for the SQL component.
     */
    interface SqlComponentBuilder extends ComponentBuilder<SqlComponent> {
        /**
         * Sets the DataSource to use to communicate with the database.
         * 
         * The option is a: &lt;code&gt;javax.sql.DataSource&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param dataSource the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder dataSource(javax.sql.DataSource dataSource) {
            doSetProperty("dataSource", dataSource);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Factory for creating RowMapper.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.sql.RowMapperFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param rowMapperFactory the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder rowMapperFactory(
                org.apache.camel.component.sql.RowMapperFactory rowMapperFactory) {
            doSetProperty("rowMapperFactory", rowMapperFactory);
            return this;
        }
        /**
         * Sets whether to use placeholder and replace all placeholder
         * characters with sign in the SQL queries. This option is default true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param usePlaceholder the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder usePlaceholder(boolean usePlaceholder) {
            doSetProperty("usePlaceholder", usePlaceholder);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all health checks from this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckEnabled the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder healthCheckEnabled(
                boolean healthCheckEnabled) {
            doSetProperty("healthCheckEnabled", healthCheckEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default SqlComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    }

    class SqlComponentBuilderImpl
            extends
                AbstractComponentBuilder<SqlComponent>
            implements
                SqlComponentBuilder {
        @Override
        protected SqlComponent buildConcreteComponent() {
            return new SqlComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "dataSource": ((SqlComponent) component).setDataSource((javax.sql.DataSource) value); return true;
            case "bridgeErrorHandler": ((SqlComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((SqlComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((SqlComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "rowMapperFactory": ((SqlComponent) component).setRowMapperFactory((org.apache.camel.component.sql.RowMapperFactory) value); return true;
            case "usePlaceholder": ((SqlComponent) component).setUsePlaceholder((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((SqlComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckEnabled": ((SqlComponent) component).setHealthCheckEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((SqlComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}