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
import org.apache.camel.component.jpa.JpaComponent;

/**
 * The jpa component enables you to store and retrieve Java objects from
 * databases using JPA.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JpaComponentBuilderFactory {

    /**
     * JPA (camel-jpa)
     * The jpa component enables you to store and retrieve Java objects from
     * databases using JPA.
     * 
     * Category: database,sql
     * Since: 1.0
     * Maven coordinates: org.apache.camel:camel-jpa
     */
    static JpaComponentBuilder jpa() {
        return new JpaComponentBuilderImpl();
    }

    /**
     * Builder for the JPA component.
     */
    interface JpaComponentBuilder extends ComponentBuilder<JpaComponent> {
        /**
         * To use the EntityManagerFactory. This is strongly recommended to
         * configure.
         * 
         * The option is a: <code>javax.persistence.EntityManagerFactory</code>
         * type.
         * 
         * Group: common
         */
        default JpaComponentBuilder entityManagerFactory(
                javax.persistence.EntityManagerFactory entityManagerFactory) {
            doSetProperty("entityManagerFactory", entityManagerFactory);
            return this;
        }
        /**
         * To use the PlatformTransactionManager for managing transactions.
         * 
         * The option is a:
         * <code>org.springframework.transaction.PlatformTransactionManager</code> type.
         * 
         * Group: common
         */
        default JpaComponentBuilder transactionManager(
                org.springframework.transaction.PlatformTransactionManager transactionManager) {
            doSetProperty("transactionManager", transactionManager);
            return this;
        }
        /**
         * The camel-jpa component will join transaction by default. You can use
         * this option to turn this off, for example if you use LOCAL_RESOURCE
         * and join transaction doesn't work with your JPA provider. This option
         * can also be set globally on the JpaComponent, instead of having to
         * set it on all endpoints.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default JpaComponentBuilder joinTransaction(boolean joinTransaction) {
            doSetProperty("joinTransaction", joinTransaction);
            return this;
        }
        /**
         * Whether to use Spring's SharedEntityManager for the
         * consumer/producer. Note in most cases joinTransaction should be set
         * to false as this is not an EXTENDED EntityManager.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default JpaComponentBuilder sharedEntityManager(
                boolean sharedEntityManager) {
            doSetProperty("sharedEntityManager", sharedEntityManager);
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
        default JpaComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default JpaComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default JpaComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class JpaComponentBuilderImpl
            extends
                AbstractComponentBuilder<JpaComponent>
            implements
                JpaComponentBuilder {
        @Override
        protected JpaComponent buildConcreteComponent() {
            return new JpaComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "entityManagerFactory": ((JpaComponent) component).setEntityManagerFactory((javax.persistence.EntityManagerFactory) value); return true;
            case "transactionManager": ((JpaComponent) component).setTransactionManager((org.springframework.transaction.PlatformTransactionManager) value); return true;
            case "joinTransaction": ((JpaComponent) component).setJoinTransaction((boolean) value); return true;
            case "sharedEntityManager": ((JpaComponent) component).setSharedEntityManager((boolean) value); return true;
            case "basicPropertyBinding": ((JpaComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((JpaComponent) component).setLazyStartProducer((boolean) value); return true;
            case "bridgeErrorHandler": ((JpaComponent) component).setBridgeErrorHandler((boolean) value); return true;
            default: return false;
            }
        }
    }
}