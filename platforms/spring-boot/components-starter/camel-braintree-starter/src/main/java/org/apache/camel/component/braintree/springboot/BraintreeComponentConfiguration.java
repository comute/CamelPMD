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
package org.apache.camel.component.braintree.springboot;

import java.util.logging.Level;
import javax.annotation.Generated;
import org.apache.camel.component.braintree.internal.BraintreeApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The braintree component is used for integrating with the Braintree Payment
 * System.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.braintree")
public class BraintreeComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * To use the shared configuration
     */
    private BraintreeConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public BraintreeConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            BraintreeConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class BraintreeConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.braintree.BraintreeConfiguration.class;
        /**
         * What kind of operation to perform
         */
        private BraintreeApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * The environment Either SANDBOX or PRODUCTION
         */
        private String environment;
        /**
         * The merchant id provided by Braintree.
         */
        private String merchantId;
        /**
         * The public key provided by Braintree.
         */
        private String publicKey;
        /**
         * The private key provided by Braintree.
         */
        private String privateKey;
        /**
         * The proxy host
         */
        private String proxyHost;
        /**
         * The proxy port
         */
        private Integer proxyPort;
        /**
         * Set logging level for http calls, @see java.util.logging.Level
         */
        private Level httpLogLevel;
        /**
         * Set log category to use to log http calls, default "Braintree"
         */
        private String httpLogName;
        /**
         * Set read timeout for http calls.
         */
        private Integer httpReadTimeout;

        public BraintreeApiName getApiName() {
            return apiName;
        }

        public void setApiName(BraintreeApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setEnvironment(String environment) {
            this.environment = environment;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }

        public String getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }

        public String getPrivateKey() {
            return privateKey;
        }

        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public Level getHttpLogLevel() {
            return httpLogLevel;
        }

        public void setHttpLogLevel(Level httpLogLevel) {
            this.httpLogLevel = httpLogLevel;
        }

        public String getHttpLogName() {
            return httpLogName;
        }

        public void setHttpLogName(String httpLogName) {
            this.httpLogName = httpLogName;
        }

        public Integer getHttpReadTimeout() {
            return httpReadTimeout;
        }

        public void setHttpReadTimeout(Integer httpReadTimeout) {
            this.httpReadTimeout = httpReadTimeout;
        }
    }
}