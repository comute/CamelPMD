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
import org.apache.camel.component.etcd.EtcdWatchComponent;

/**
 * Watch specific etcd keys or directories for changes.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface EtcdWatchComponentBuilderFactory {

    /**
     * Etcd Watch (camel-etcd)
     * Watch specific etcd keys or directories for changes.
     * 
     * Category: clustering,database
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-etcd
     */
    static EtcdWatchComponentBuilder etcdWatch() {
        return new EtcdWatchComponentBuilderImpl();
    }

    /**
     * Builder for the Etcd Watch component.
     */
    interface EtcdWatchComponentBuilder
            extends
                ComponentBuilder<EtcdWatchComponent> {
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
        default EtcdWatchComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.etcd.EtcdConfiguration</code> type.
         * 
         * Group: consumer
         */
        default EtcdWatchComponentBuilder configuration(
                org.apache.camel.component.etcd.EtcdConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To apply an action recursively.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default EtcdWatchComponentBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * The path to look for for service discovery.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: /services/
         * Group: consumer
         */
        default EtcdWatchComponentBuilder servicePath(
                java.lang.String servicePath) {
            doSetProperty("servicePath", servicePath);
            return this;
        }
        /**
         * To set the maximum time an action could take to complete.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: consumer
         */
        default EtcdWatchComponentBuilder timeout(java.lang.Long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * To set the URIs the client connects.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: http://localhost:2379,http://localhost:4001
         * Group: common
         */
        default EtcdWatchComponentBuilder uris(java.lang.String uris) {
            doSetProperty("uris", uris);
            return this;
        }
        /**
         * To send an empty message in case of timeout watching for a key.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default EtcdWatchComponentBuilder sendEmptyExchangeOnTimeout(
                boolean sendEmptyExchangeOnTimeout) {
            doSetProperty("sendEmptyExchangeOnTimeout", sendEmptyExchangeOnTimeout);
            return this;
        }
        /**
         * The index to watch from.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: consumer (advanced)
         */
        default EtcdWatchComponentBuilder fromIndex(long fromIndex) {
            doSetProperty("fromIndex", fromIndex);
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
        default EtcdWatchComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The password to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default EtcdWatchComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default EtcdWatchComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default EtcdWatchComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
        /**
         * The user name to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default EtcdWatchComponentBuilder userName(java.lang.String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    class EtcdWatchComponentBuilderImpl
            extends
                AbstractComponentBuilder<EtcdWatchComponent>
            implements
                EtcdWatchComponentBuilder {
        @Override
        protected EtcdWatchComponent buildConcreteComponent() {
            return new EtcdWatchComponent();
        }
        private org.apache.camel.component.etcd.EtcdConfiguration getOrCreateConfiguration(
                org.apache.camel.component.etcd.EtcdWatchComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.etcd.EtcdConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((EtcdWatchComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "configuration": ((EtcdWatchComponent) component).setConfiguration((org.apache.camel.component.etcd.EtcdConfiguration) value); return true;
            case "recursive": getOrCreateConfiguration((EtcdWatchComponent) component).setRecursive((boolean) value); return true;
            case "servicePath": getOrCreateConfiguration((EtcdWatchComponent) component).setServicePath((java.lang.String) value); return true;
            case "timeout": getOrCreateConfiguration((EtcdWatchComponent) component).setTimeout((java.lang.Long) value); return true;
            case "uris": getOrCreateConfiguration((EtcdWatchComponent) component).setUris((java.lang.String) value); return true;
            case "sendEmptyExchangeOnTimeout": getOrCreateConfiguration((EtcdWatchComponent) component).setSendEmptyExchangeOnTimeout((boolean) value); return true;
            case "fromIndex": getOrCreateConfiguration((EtcdWatchComponent) component).setFromIndex((long) value); return true;
            case "basicPropertyBinding": ((EtcdWatchComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "password": getOrCreateConfiguration((EtcdWatchComponent) component).setPassword((java.lang.String) value); return true;
            case "sslContextParameters": getOrCreateConfiguration((EtcdWatchComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((EtcdWatchComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "userName": getOrCreateConfiguration((EtcdWatchComponent) component).setUserName((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}