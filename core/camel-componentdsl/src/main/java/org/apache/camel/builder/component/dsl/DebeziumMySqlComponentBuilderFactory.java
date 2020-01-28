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

import javax.annotation.Generated;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.debezium.DebeziumMySqlComponent;

/**
 * Represents a Debezium MySQL endpoint which is used to capture changes in
 * MySQL database so that that applications can see those changes and respond to
 * them.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface DebeziumMySqlComponentBuilderFactory {

    /**
     * Debezium MySQL Connector (camel-debezium-mysql)
     * Represents a Debezium MySQL endpoint which is used to capture changes in
     * MySQL database so that that applications can see those changes and
     * respond to them.
     * 
     * Category: database,sql,mysql
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-debezium-mysql
     */
    static DebeziumMySqlComponentBuilder debeziumMysql() {
        return new DebeziumMySqlComponentBuilderImpl();
    }

    /**
     * Builder for the Debezium MySQL Connector component.
     */
    interface DebeziumMySqlComponentBuilder
            extends
                ComponentBuilder<DebeziumMySqlComponent> {
        /**
         * Allow pre-configured Configurations to be set.
         * 
         * The option is a:
         * <code>org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration</code> type.
         * 
         * Default:
         * Group: consumer
         */
        default DebeziumMySqlComponentBuilder setConfiguration(
                org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default DebeziumMySqlComponentBuilder setBasicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default DebeziumMySqlComponentBuilder setBridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class DebeziumMySqlComponentBuilderImpl
            extends
                AbstractComponentBuilder<DebeziumMySqlComponent>
            implements
                DebeziumMySqlComponentBuilder {
        @Override
        protected DebeziumMySqlComponent buildConcreteComponent() {
            return new DebeziumMySqlComponent();
        }
    }
}