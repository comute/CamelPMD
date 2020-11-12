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
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.corda.CordaComponent;

/**
 * Perform operations against Corda blockchain platform using corda-rpc library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface CordaComponentBuilderFactory {

    /**
     * Corda (camel-corda)
     * Perform operations against Corda blockchain platform using corda-rpc
     * library.
     * 
     * Category: blockchain,rpc
     * Since: 2.23
     * Maven coordinates: org.apache.camel:camel-corda
     */
    static CordaComponentBuilder corda() {
        return new CordaComponentBuilderImpl();
    }

    /**
     * Builder for the Corda component.
     */
    interface CordaComponentBuilder extends ComponentBuilder<CordaComponent> {
        /**
         * To use a shared configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.corda.CordaConfiguration</code>
         * type.
         * 
         * Group: common
         */
        default CordaComponentBuilder configuration(
                org.apache.camel.component.corda.CordaConfiguration configuration) {
            doSetProperty("configuration", configuration);
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
        default CordaComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * PageSpecification allows specification of a page number (starting
         * from 1) and page size (defaulting to 200 with a maximum page size of
         * (Integer.MAX_INT) Note: we default the page number to 200 to enable
         * queries without requiring a page specification but enabling detection
         * of large results sets that fall out of the 200 requirement. Max page
         * size should be used with extreme caution as results may exceed your
         * JVM memory footprint.
         * 
         * The option is a:
         * <code>net.corda.core.node.services.vault.PageSpecification</code>
         * type.
         * 
         * Default: 200
         * Group: consumer
         */
        default CordaComponentBuilder pageSpecification(
                net.corda.core.node.services.vault.PageSpecification pageSpecification) {
            doSetProperty("pageSpecification", pageSpecification);
            return this;
        }
        /**
         * Whether to process snapshots or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default CordaComponentBuilder processSnapshot(boolean processSnapshot) {
            doSetProperty("processSnapshot", processSnapshot);
            return this;
        }
        /**
         * Sort allows specification of a set of entity attribute names and
         * their associated directionality and null handling, to be applied upon
         * processing a query specification.
         * 
         * The option is a: <code>net.corda.core.node.services.vault.Sort</code>
         * type.
         * 
         * Group: consumer
         */
        default CordaComponentBuilder sort(
                net.corda.core.node.services.vault.Sort sort) {
            doSetProperty("sort", sort);
            return this;
        }
        /**
         * A contract state (or just state) contains opaque data used by a
         * contract program. It can be thought of as a disk file that the
         * program can use to persist data across transactions. States are
         * immutable: once created they are never updated, instead, any changes
         * must generate a new successor state. States can be updated (consumed)
         * only once: the notary is responsible for ensuring there is no double
         * spending by only signing a transaction if the input states are all
         * free.
         * 
         * The option is a:
         * <code>java.lang.Class<net.corda.core.contracts.ContractState></code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default CordaComponentBuilder contractStateClass(
                java.lang.Class<net.corda.core.contracts.ContractState> contractStateClass) {
            doSetProperty("contractStateClass", contractStateClass);
            return this;
        }
        /**
         * Start the given flow with the given arguments, returning an
         * Observable with a single observation of the result of running the
         * flow. The flowLogicClass must be annotated with
         * net.corda.core.flows.StartableByRPC.
         * 
         * The option is a: <code>java.lang.Object[]</code> type.
         * 
         * Group: consumer (advanced)
         */
        default CordaComponentBuilder flowLogicArguments(
                java.lang.Object[] flowLogicArguments) {
            doSetProperty("flowLogicArguments", flowLogicArguments);
            return this;
        }
        /**
         * Start the given flow with the given arguments, returning an
         * Observable with a single observation of the result of running the
         * flow. The flowLogicClass must be annotated with
         * net.corda.core.flows.StartableByRPC.
         * 
         * The option is a:
         * <code>java.lang.Class<net.corda.core.flows.FlowLogic<java.lang.Object>></code> type.
         * 
         * Group: consumer (advanced)
         */
        default CordaComponentBuilder flowLogicClass(
                java.lang.Class<net.corda.core.flows.FlowLogic<java.lang.Object>> flowLogicClass) {
            doSetProperty("flowLogicClass", flowLogicClass);
            return this;
        }
        /**
         * QueryCriteria assumes underlying schema tables are correctly indexed
         * for performance.
         * 
         * The option is a:
         * <code>net.corda.core.node.services.vault.QueryCriteria</code> type.
         * 
         * Group: consumer (advanced)
         */
        default CordaComponentBuilder queryCriteria(
                net.corda.core.node.services.vault.QueryCriteria queryCriteria) {
            doSetProperty("queryCriteria", queryCriteria);
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
        default CordaComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Operation to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default CordaComponentBuilder operation(java.lang.String operation) {
            doSetProperty("operation", operation);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default CordaComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Password for login.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default CordaComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username for login.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default CordaComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class CordaComponentBuilderImpl
            extends
                AbstractComponentBuilder<CordaComponent>
            implements
                CordaComponentBuilder {
        @Override
        protected CordaComponent buildConcreteComponent() {
            return new CordaComponent();
        }
        private org.apache.camel.component.corda.CordaConfiguration getOrCreateConfiguration(
                org.apache.camel.component.corda.CordaComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.corda.CordaConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((CordaComponent) component).setConfiguration((org.apache.camel.component.corda.CordaConfiguration) value); return true;
            case "bridgeErrorHandler": ((CordaComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "pageSpecification": getOrCreateConfiguration((CordaComponent) component).setPageSpecification((net.corda.core.node.services.vault.PageSpecification) value); return true;
            case "processSnapshot": getOrCreateConfiguration((CordaComponent) component).setProcessSnapshot((boolean) value); return true;
            case "sort": getOrCreateConfiguration((CordaComponent) component).setSort((net.corda.core.node.services.vault.Sort) value); return true;
            case "contractStateClass": getOrCreateConfiguration((CordaComponent) component).setContractStateClass((java.lang.Class) value); return true;
            case "flowLogicArguments": getOrCreateConfiguration((CordaComponent) component).setFlowLogicArguments((java.lang.Object[]) value); return true;
            case "flowLogicClass": getOrCreateConfiguration((CordaComponent) component).setFlowLogicClass((java.lang.Class) value); return true;
            case "queryCriteria": getOrCreateConfiguration((CordaComponent) component).setQueryCriteria((net.corda.core.node.services.vault.QueryCriteria) value); return true;
            case "lazyStartProducer": ((CordaComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((CordaComponent) component).setOperation((java.lang.String) value); return true;
            case "autowiredEnabled": ((CordaComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "password": getOrCreateConfiguration((CordaComponent) component).setPassword((java.lang.String) value); return true;
            case "username": getOrCreateConfiguration((CordaComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}