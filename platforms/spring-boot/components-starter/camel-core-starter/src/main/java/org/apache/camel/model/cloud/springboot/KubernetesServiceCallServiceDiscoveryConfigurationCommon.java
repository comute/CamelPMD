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
package org.apache.camel.model.cloud.springboot;

import java.util.Map;
import javax.annotation.Generated;

/**
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
public class KubernetesServiceCallServiceDiscoveryConfigurationCommon {

    /**
     * How to perform service lookup. Possible values: client dns environment.
     * When using client then the client queries the kubernetes master to obtain
     * a list of active pods that provides the service and then random (or round
     * robin) select a pod. When using dns the service name is resolved as
     * name.namespace.service.dnsDomain. When using environment then environment
     * variables are used to lookup the service. By default environment is used.
     */
    private String lookup = "environment";
    /**
     * Sets the DNS domain to use for DNS lookup.
     */
    private String dnsDomain;
    /**
     * Sets the namespace to use. Will by default use namespace from the ENV
     * variable KUBERNETES_MASTER.
     */
    private String namespace;
    /**
     * Sets the API version when using client lookup
     */
    private String apiVersion;
    /**
     * Sets the URL to the master when using client lookup
     */
    private String masterUrl;
    /**
     * Sets the username for authentication when using client lookup
     */
    private String username;
    /**
     * Sets the password for authentication when using client lookup
     */
    private String password;
    /**
     * Sets the OAUTH token for authentication (instead of username/password)
     * when using client lookup
     */
    private String oauthToken;
    /**
     * Sets the Certificate Authority data when using client lookup
     */
    private String caCertData;
    /**
     * Sets the Certificate Authority data that are loaded from the file when
     * using client lookup
     */
    private String caCertFile;
    /**
     * Sets the Client Certificate data when using client lookup
     */
    private String clientCertData;
    /**
     * Sets the Client Certificate data that are loaded from the file when using
     * client lookup
     */
    private String clientCertFile;
    /**
     * Sets the Client Keystore algorithm such as RSA when using client lookup
     */
    private String clientKeyAlgo;
    /**
     * Sets the Client Keystore data when using client lookup
     */
    private String clientKeyData;
    /**
     * Sets the Client Keystore data that are loaded from the file when using
     * client lookup
     */
    private String clientKeyFile;
    /**
     * Sets the Client Keystore passphrase when using client lookup
     */
    private String clientKeyPassphrase;
    /**
     * Sets whether to turn on trust certificate check when using client lookup
     */
    private Boolean trustCerts = false;
    /**
     * Set client properties to use. These properties are specific to what
     * service call implementation are in use. For example if using ribbon then
     * the client properties are define in
     * com.netflix.client.config.CommonClientConfigKey.
     */
    private Map<String, String> properties;

    public String getLookup() {
        return lookup;
    }

    public void setLookup(String lookup) {
        this.lookup = lookup;
    }

    public String getDnsDomain() {
        return dnsDomain;
    }

    public void setDnsDomain(String dnsDomain) {
        this.dnsDomain = dnsDomain;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getMasterUrl() {
        return masterUrl;
    }

    public void setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOauthToken() {
        return oauthToken;
    }

    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    public String getCaCertData() {
        return caCertData;
    }

    public void setCaCertData(String caCertData) {
        this.caCertData = caCertData;
    }

    public String getCaCertFile() {
        return caCertFile;
    }

    public void setCaCertFile(String caCertFile) {
        this.caCertFile = caCertFile;
    }

    public String getClientCertData() {
        return clientCertData;
    }

    public void setClientCertData(String clientCertData) {
        this.clientCertData = clientCertData;
    }

    public String getClientCertFile() {
        return clientCertFile;
    }

    public void setClientCertFile(String clientCertFile) {
        this.clientCertFile = clientCertFile;
    }

    public String getClientKeyAlgo() {
        return clientKeyAlgo;
    }

    public void setClientKeyAlgo(String clientKeyAlgo) {
        this.clientKeyAlgo = clientKeyAlgo;
    }

    public String getClientKeyData() {
        return clientKeyData;
    }

    public void setClientKeyData(String clientKeyData) {
        this.clientKeyData = clientKeyData;
    }

    public String getClientKeyFile() {
        return clientKeyFile;
    }

    public void setClientKeyFile(String clientKeyFile) {
        this.clientKeyFile = clientKeyFile;
    }

    public String getClientKeyPassphrase() {
        return clientKeyPassphrase;
    }

    public void setClientKeyPassphrase(String clientKeyPassphrase) {
        this.clientKeyPassphrase = clientKeyPassphrase;
    }

    public Boolean getTrustCerts() {
        return trustCerts;
    }

    public void setTrustCerts(Boolean trustCerts) {
        this.trustCerts = trustCerts;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}