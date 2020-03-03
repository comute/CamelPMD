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
import org.apache.camel.component.fhir.FhirComponent;

/**
 * The fhir component is used for working with the FHIR protocol (health care).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface FhirComponentBuilderFactory {

    /**
     * FHIR (camel-fhir)
     * The fhir component is used for working with the FHIR protocol (health
     * care).
     * 
     * Category: hl7,api
     * Since: 2.23
     * Maven coordinates: org.apache.camel:camel-fhir
     */
    static FhirComponentBuilder fhir() {
        return new FhirComponentBuilderImpl();
    }

    /**
     * Builder for the FHIR component.
     */
    interface FhirComponentBuilder extends ComponentBuilder<FhirComponent> {
        /**
         * Encoding to use for all request.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default FhirComponentBuilder encoding(java.lang.String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * The FHIR Version to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: R4
         * Group: common
         */
        default FhirComponentBuilder fhirVersion(java.lang.String fhirVersion) {
            doSetProperty("fhirVersion", fhirVersion);
            return this;
        }
        /**
         * Will log every requests and responses.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default FhirComponentBuilder log(boolean log) {
            doSetProperty("log", log);
            return this;
        }
        /**
         * Pretty print all request.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default FhirComponentBuilder prettyPrint(boolean prettyPrint) {
            doSetProperty("prettyPrint", prettyPrint);
            return this;
        }
        /**
         * The FHIR server base URL.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default FhirComponentBuilder serverUrl(java.lang.String serverUrl) {
            doSetProperty("serverUrl", serverUrl);
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
        default FhirComponentBuilder bridgeErrorHandler(
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FhirComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default FhirComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use the custom client.
         * 
         * The option is a:
         * <code>ca.uhn.fhir.rest.client.api.IGenericClient</code> type.
         * 
         * Group: advanced
         */
        default FhirComponentBuilder client(
                ca.uhn.fhir.rest.client.api.IGenericClient client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use the custom client factory.
         * 
         * The option is a:
         * <code>ca.uhn.fhir.rest.client.api.IRestfulClientFactory</code> type.
         * 
         * Group: advanced
         */
        default FhirComponentBuilder clientFactory(
                ca.uhn.fhir.rest.client.api.IRestfulClientFactory clientFactory) {
            doSetProperty("clientFactory", clientFactory);
            return this;
        }
        /**
         * Compresses outgoing (POST/PUT) contents to the GZIP format.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default FhirComponentBuilder compress(boolean compress) {
            doSetProperty("compress", compress);
            return this;
        }
        /**
         * To use the shared configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.fhir.FhirConfiguration</code> type.
         * 
         * Group: advanced
         */
        default FhirComponentBuilder configuration(
                org.apache.camel.component.fhir.FhirConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * How long to try and establish the initial TCP connection (in ms).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 10000
         * Group: advanced
         */
        default FhirComponentBuilder connectionTimeout(
                java.lang.Integer connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * When this option is set, model classes will not be scanned for
         * children until the child list for the given type is actually
         * accessed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default FhirComponentBuilder deferModelScanning(
                boolean deferModelScanning) {
            doSetProperty("deferModelScanning", deferModelScanning);
            return this;
        }
        /**
         * FhirContext is an expensive object to create. To avoid creating
         * multiple instances, it can be set directly.
         * 
         * The option is a: <code>ca.uhn.fhir.context.FhirContext</code> type.
         * 
         * Group: advanced
         */
        default FhirComponentBuilder fhirContext(
                ca.uhn.fhir.context.FhirContext fhirContext) {
            doSetProperty("fhirContext", fhirContext);
            return this;
        }
        /**
         * Force conformance check.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default FhirComponentBuilder forceConformanceCheck(
                boolean forceConformanceCheck) {
            doSetProperty("forceConformanceCheck", forceConformanceCheck);
            return this;
        }
        /**
         * HTTP session cookie to add to every request.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default FhirComponentBuilder sessionCookie(
                java.lang.String sessionCookie) {
            doSetProperty("sessionCookie", sessionCookie);
            return this;
        }
        /**
         * How long to block for individual read/write operations (in ms).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 10000
         * Group: advanced
         */
        default FhirComponentBuilder socketTimeout(
                java.lang.Integer socketTimeout) {
            doSetProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * Request that the server modify the response using the _summary param.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default FhirComponentBuilder summary(java.lang.String summary) {
            doSetProperty("summary", summary);
            return this;
        }
        /**
         * When should Camel validate the FHIR Server's conformance statement.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: ONCE
         * Group: advanced
         */
        default FhirComponentBuilder validationMode(
                java.lang.String validationMode) {
            doSetProperty("validationMode", validationMode);
            return this;
        }
        /**
         * The proxy host.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default FhirComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default FhirComponentBuilder proxyPassword(
                java.lang.String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * The proxy port.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default FhirComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default FhirComponentBuilder proxyUser(java.lang.String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * OAuth access token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default FhirComponentBuilder accessToken(java.lang.String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Username to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default FhirComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default FhirComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class FhirComponentBuilderImpl
            extends
                AbstractComponentBuilder<FhirComponent>
            implements
                FhirComponentBuilder {
        @Override
        protected FhirComponent buildConcreteComponent() {
            return new FhirComponent();
        }
        private org.apache.camel.component.fhir.FhirConfiguration getOrCreateConfiguration(
                org.apache.camel.component.fhir.FhirComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.fhir.FhirConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "encoding": getOrCreateConfiguration((FhirComponent) component).setEncoding((java.lang.String) value); return true;
            case "fhirVersion": getOrCreateConfiguration((FhirComponent) component).setFhirVersion((java.lang.String) value); return true;
            case "log": getOrCreateConfiguration((FhirComponent) component).setLog((boolean) value); return true;
            case "prettyPrint": getOrCreateConfiguration((FhirComponent) component).setPrettyPrint((boolean) value); return true;
            case "serverUrl": getOrCreateConfiguration((FhirComponent) component).setServerUrl((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((FhirComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((FhirComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((FhirComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "client": getOrCreateConfiguration((FhirComponent) component).setClient((ca.uhn.fhir.rest.client.api.IGenericClient) value); return true;
            case "clientFactory": getOrCreateConfiguration((FhirComponent) component).setClientFactory((ca.uhn.fhir.rest.client.api.IRestfulClientFactory) value); return true;
            case "compress": getOrCreateConfiguration((FhirComponent) component).setCompress((boolean) value); return true;
            case "configuration": ((FhirComponent) component).setConfiguration((org.apache.camel.component.fhir.FhirConfiguration) value); return true;
            case "connectionTimeout": getOrCreateConfiguration((FhirComponent) component).setConnectionTimeout((java.lang.Integer) value); return true;
            case "deferModelScanning": getOrCreateConfiguration((FhirComponent) component).setDeferModelScanning((boolean) value); return true;
            case "fhirContext": getOrCreateConfiguration((FhirComponent) component).setFhirContext((ca.uhn.fhir.context.FhirContext) value); return true;
            case "forceConformanceCheck": getOrCreateConfiguration((FhirComponent) component).setForceConformanceCheck((boolean) value); return true;
            case "sessionCookie": getOrCreateConfiguration((FhirComponent) component).setSessionCookie((java.lang.String) value); return true;
            case "socketTimeout": getOrCreateConfiguration((FhirComponent) component).setSocketTimeout((java.lang.Integer) value); return true;
            case "summary": getOrCreateConfiguration((FhirComponent) component).setSummary((java.lang.String) value); return true;
            case "validationMode": getOrCreateConfiguration((FhirComponent) component).setValidationMode((java.lang.String) value); return true;
            case "proxyHost": getOrCreateConfiguration((FhirComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPassword": getOrCreateConfiguration((FhirComponent) component).setProxyPassword((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((FhirComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyUser": getOrCreateConfiguration((FhirComponent) component).setProxyUser((java.lang.String) value); return true;
            case "accessToken": getOrCreateConfiguration((FhirComponent) component).setAccessToken((java.lang.String) value); return true;
            case "password": getOrCreateConfiguration((FhirComponent) component).setPassword((java.lang.String) value); return true;
            case "username": getOrCreateConfiguration((FhirComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}