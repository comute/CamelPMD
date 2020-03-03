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
import org.apache.camel.component.box.BoxComponent;

/**
 * For uploading downloading and managing files folders groups collaborations
 * etc on box DOT com.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface BoxComponentBuilderFactory {

    /**
     * Box (camel-box)
     * For uploading downloading and managing files folders groups
     * collaborations etc on box DOT com.
     * 
     * Category: api,file,cloud
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-box
     */
    static BoxComponentBuilder box() {
        return new BoxComponentBuilderImpl();
    }

    /**
     * Builder for the Box component.
     */
    interface BoxComponentBuilder extends ComponentBuilder<BoxComponent> {
        /**
         * Box application client ID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default BoxComponentBuilder clientId(java.lang.String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * To use the shared configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.box.BoxConfiguration</code> type.
         * 
         * Group: common
         */
        default BoxComponentBuilder configuration(
                org.apache.camel.component.box.BoxConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The enterprise ID to use for an App Enterprise.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default BoxComponentBuilder enterpriseId(java.lang.String enterpriseId) {
            doSetProperty("enterpriseId", enterpriseId);
            return this;
        }
        /**
         * The user ID to use for an App User.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default BoxComponentBuilder userId(java.lang.String userId) {
            doSetProperty("userId", userId);
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
        default BoxComponentBuilder bridgeErrorHandler(
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
        default BoxComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default BoxComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Custom HTTP params for settings like proxy host.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: advanced
         */
        default BoxComponentBuilder httpParams(
                java.util.Map<java.lang.String, java.lang.Object> httpParams) {
            doSetProperty("httpParams", httpParams);
            return this;
        }
        /**
         * The type of authentication for connection. Types of Authentication:
         * STANDARD_AUTHENTICATION - OAuth 2.0 (3-legged) SERVER_AUTHENTICATION
         * - OAuth 2.0 with JSON Web Tokens.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: APP_USER_AUTHENTICATION
         * Group: authentication
         */
        default BoxComponentBuilder authenticationType(
                java.lang.String authenticationType) {
            doSetProperty("authenticationType", authenticationType);
            return this;
        }
        /**
         * Custom Access Token Cache for storing and retrieving access tokens.
         * 
         * The option is a: <code>com.box.sdk.IAccessTokenCache</code> type.
         * 
         * Group: security
         */
        default BoxComponentBuilder accessTokenCache(
                com.box.sdk.IAccessTokenCache accessTokenCache) {
            doSetProperty("accessTokenCache", accessTokenCache);
            return this;
        }
        /**
         * Box application client secret.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BoxComponentBuilder clientSecret(java.lang.String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * The type of encryption algorithm for JWT. Supported Algorithms:
         * RSA_SHA_256 RSA_SHA_384 RSA_SHA_512.
         * 
         * The option is a: <code>com.box.sdk.EncryptionAlgorithm</code> type.
         * 
         * Default: RSA_SHA_256
         * Group: security
         */
        default BoxComponentBuilder encryptionAlgorithm(
                com.box.sdk.EncryptionAlgorithm encryptionAlgorithm) {
            doSetProperty("encryptionAlgorithm", encryptionAlgorithm);
            return this;
        }
        /**
         * The maximum number of access tokens in cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 100
         * Group: security
         */
        default BoxComponentBuilder maxCacheEntries(int maxCacheEntries) {
            doSetProperty("maxCacheEntries", maxCacheEntries);
            return this;
        }
        /**
         * The private key for generating the JWT signature.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BoxComponentBuilder privateKeyFile(
                java.lang.String privateKeyFile) {
            doSetProperty("privateKeyFile", privateKeyFile);
            return this;
        }
        /**
         * The password for the private key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BoxComponentBuilder privateKeyPassword(
                java.lang.String privateKeyPassword) {
            doSetProperty("privateKeyPassword", privateKeyPassword);
            return this;
        }
        /**
         * The ID for public key for validating the JWT signature.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BoxComponentBuilder publicKeyId(java.lang.String publicKeyId) {
            doSetProperty("publicKeyId", publicKeyId);
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
        default BoxComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Box user name, MUST be provided.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BoxComponentBuilder userName(java.lang.String userName) {
            doSetProperty("userName", userName);
            return this;
        }
        /**
         * Box user password, MUST be provided if authSecureStorage is not set,
         * or returns null on first call.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default BoxComponentBuilder userPassword(java.lang.String userPassword) {
            doSetProperty("userPassword", userPassword);
            return this;
        }
    }

    class BoxComponentBuilderImpl
            extends
                AbstractComponentBuilder<BoxComponent>
            implements
                BoxComponentBuilder {
        @Override
        protected BoxComponent buildConcreteComponent() {
            return new BoxComponent();
        }
        private org.apache.camel.component.box.BoxConfiguration getOrCreateConfiguration(
                org.apache.camel.component.box.BoxComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.box.BoxConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "clientId": getOrCreateConfiguration((BoxComponent) component).setClientId((java.lang.String) value); return true;
            case "configuration": ((BoxComponent) component).setConfiguration((org.apache.camel.component.box.BoxConfiguration) value); return true;
            case "enterpriseId": getOrCreateConfiguration((BoxComponent) component).setEnterpriseId((java.lang.String) value); return true;
            case "userId": getOrCreateConfiguration((BoxComponent) component).setUserId((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((BoxComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((BoxComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((BoxComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "httpParams": getOrCreateConfiguration((BoxComponent) component).setHttpParams((java.util.Map) value); return true;
            case "authenticationType": getOrCreateConfiguration((BoxComponent) component).setAuthenticationType((java.lang.String) value); return true;
            case "accessTokenCache": getOrCreateConfiguration((BoxComponent) component).setAccessTokenCache((com.box.sdk.IAccessTokenCache) value); return true;
            case "clientSecret": getOrCreateConfiguration((BoxComponent) component).setClientSecret((java.lang.String) value); return true;
            case "encryptionAlgorithm": getOrCreateConfiguration((BoxComponent) component).setEncryptionAlgorithm((com.box.sdk.EncryptionAlgorithm) value); return true;
            case "maxCacheEntries": getOrCreateConfiguration((BoxComponent) component).setMaxCacheEntries((int) value); return true;
            case "privateKeyFile": getOrCreateConfiguration((BoxComponent) component).setPrivateKeyFile((java.lang.String) value); return true;
            case "privateKeyPassword": getOrCreateConfiguration((BoxComponent) component).setPrivateKeyPassword((java.lang.String) value); return true;
            case "publicKeyId": getOrCreateConfiguration((BoxComponent) component).setPublicKeyId((java.lang.String) value); return true;
            case "sslContextParameters": getOrCreateConfiguration((BoxComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "userName": getOrCreateConfiguration((BoxComponent) component).setUserName((java.lang.String) value); return true;
            case "userPassword": getOrCreateConfiguration((BoxComponent) component).setUserPassword((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}