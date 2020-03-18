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
import org.apache.camel.component.undertow.UndertowComponent;

/**
 * The undertow component provides HTTP and WebSocket based endpoints for
 * consuming and producing HTTP/WebSocket requests.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface UndertowComponentBuilderFactory {

    /**
     * Undertow (camel-undertow)
     * The undertow component provides HTTP and WebSocket based endpoints for
     * consuming and producing HTTP/WebSocket requests.
     * 
     * Category: http,websocket
     * Since: 2.16
     * Maven coordinates: org.apache.camel:camel-undertow
     */
    static UndertowComponentBuilder undertow() {
        return new UndertowComponentBuilderImpl();
    }

    /**
     * Builder for the Undertow component.
     */
    interface UndertowComponentBuilder
            extends
                ComponentBuilder<UndertowComponent> {
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
        default UndertowComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side the
         * response's body won't contain the exception's stack trace.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default UndertowComponentBuilder muteException(boolean muteException) {
            doSetProperty("muteException", muteException);
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
        default UndertowComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default UndertowComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To configure common options, such as thread pools.
         * 
         * The option is a:
         * <code>org.apache.camel.component.undertow.UndertowHostOptions</code>
         * type.
         * 
         * Group: advanced
         */
        default UndertowComponentBuilder hostOptions(
                org.apache.camel.component.undertow.UndertowHostOptions hostOptions) {
            doSetProperty("hostOptions", hostOptions);
            return this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option is a:
         * <code>org.apache.camel.component.undertow.UndertowHttpBinding</code>
         * type.
         * 
         * Group: advanced
         */
        default UndertowComponentBuilder undertowHttpBinding(
                org.apache.camel.component.undertow.UndertowHttpBinding undertowHttpBinding) {
            doSetProperty("undertowHttpBinding", undertowHttpBinding);
            return this;
        }
        /**
         * Configuration used by UndertowSecurityProvider. Comma separated list
         * of allowed roles.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default UndertowComponentBuilder allowedRoles(
                java.lang.String allowedRoles) {
            doSetProperty("allowedRoles", allowedRoles);
            return this;
        }
        /**
         * Configuration used by UndertowSecurityProvider. Security
         * configuration object for use from UndertowSecurityProvider.
         * Configuration is UndertowSecurityProvider specific. Each provider
         * decides, whether it accepts configuration.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: security
         */
        default UndertowComponentBuilder securityConfiguration(
                java.lang.Object securityConfiguration) {
            doSetProperty("securityConfiguration", securityConfiguration);
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
        default UndertowComponentBuilder sslContextParameters(
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
        default UndertowComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class UndertowComponentBuilderImpl
            extends
                AbstractComponentBuilder<UndertowComponent>
            implements
                UndertowComponentBuilder {
        @Override
        protected UndertowComponent buildConcreteComponent() {
            return new UndertowComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((UndertowComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "muteException": ((UndertowComponent) component).setMuteException((boolean) value); return true;
            case "lazyStartProducer": ((UndertowComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((UndertowComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "hostOptions": ((UndertowComponent) component).setHostOptions((org.apache.camel.component.undertow.UndertowHostOptions) value); return true;
            case "undertowHttpBinding": ((UndertowComponent) component).setUndertowHttpBinding((org.apache.camel.component.undertow.UndertowHttpBinding) value); return true;
            case "allowedRoles": ((UndertowComponent) component).setAllowedRoles((java.lang.String) value); return true;
            case "securityConfiguration": ((UndertowComponent) component).setSecurityConfiguration((java.lang.Object) value); return true;
            case "sslContextParameters": ((UndertowComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((UndertowComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}