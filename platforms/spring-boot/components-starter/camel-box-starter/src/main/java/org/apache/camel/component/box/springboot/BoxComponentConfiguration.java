/**
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
package org.apache.camel.component.box.springboot;

import java.util.Map;
import javax.annotation.Generated;
import com.box.sdk.IAccessTokenCache;
import org.apache.camel.component.box.internal.BoxApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * For uploading downloading and managing files folders groups collaborations
 * etc on box DOT com.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.box")
public class BoxComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the box component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private BoxConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public BoxConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            BoxConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class BoxConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.box.BoxConfiguration.class;
        /**
         * What kind of operation to perform
         */
        private BoxApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * The enterprise ID to use for an App Enterprise.
         */
        private String enterpriseId;
        /**
         * The user ID to use for an App User.
         */
        private String userId;
        /**
         * The ID for public key for validating the JWT signature.
         */
        private String publicKeyId;
        /**
         * The private key for generating the JWT signature.
         */
        private String privateKeyFile;
        /**
         * The password for the private key.
         */
        private String privateKeyPassword;
        /**
         * The type of authentication for connection. Types of Authentication:
         * STANDARD_AUTHENTICATION - OAuth 2.0 (3-legged) SERVER_AUTHENTICATION
         * - OAuth 2.0 with JSON Web Tokens
         */
        private String authenticationType = "APP_USER_AUTHENTICATION";
        /**
         * Box application client ID
         */
        private String clientId;
        /**
         * Box application client secret
         */
        private String clientSecret;
        /**
         * Box user name, MUST be provided
         */
        private String userName;
        /**
         * Box user password, MUST be provided if authSecureStorage is not set,
         * or returns null on first call
         */
        private String userPassword;
        /**
         * Custom HTTP params for settings like proxy host
         */
        private Map httpParams;
        /**
         * To configure security using SSLContextParameters.
         */
        private SSLContextParameters sslContextParameters;
        /**
         * Custom Access Token Cache for storing and retrieving access tokens.
         */
        private IAccessTokenCache accessTokenCache;

        public BoxApiName getApiName() {
            return apiName;
        }

        public void setApiName(BoxApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getEnterpriseId() {
            return enterpriseId;
        }

        public void setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPublicKeyId() {
            return publicKeyId;
        }

        public void setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
        }

        public String getPrivateKeyFile() {
            return privateKeyFile;
        }

        public void setPrivateKeyFile(String privateKeyFile) {
            this.privateKeyFile = privateKeyFile;
        }

        public String getPrivateKeyPassword() {
            return privateKeyPassword;
        }

        public void setPrivateKeyPassword(String privateKeyPassword) {
            this.privateKeyPassword = privateKeyPassword;
        }

        public String getAuthenticationType() {
            return authenticationType;
        }

        public void setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }

        public Map getHttpParams() {
            return httpParams;
        }

        public void setHttpParams(Map httpParams) {
            this.httpParams = httpParams;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public IAccessTokenCache getAccessTokenCache() {
            return accessTokenCache;
        }

        public void setAccessTokenCache(IAccessTokenCache accessTokenCache) {
            this.accessTokenCache = accessTokenCache;
        }
    }
}