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
package org.apache.camel.component.elasticsearch.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The elasticsearch component is used for interfacing with ElasticSearch server
 * using REST API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.elasticsearch-rest")
public class ElasticsearchComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the elasticsearch-rest component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * To use an existing configured Elasticsearch client, instead of creating a
     * client per endpoint. This allow to customize the client with specific
     * settings. The option is a org.elasticsearch.client.RestClient type.
     */
    private String client;
    /**
     * Comma separated list with ip:port formatted remote transport addresses to
     * use. The ip and port options must be left blank for hostAddresses to be
     * considered instead.
     */
    private String hostAddresses;
    /**
     * The timeout in ms to wait before the socket will timeout.
     */
    private Integer socketTimeout = 30000;
    /**
     * The time in ms to wait before connection will timeout.
     */
    private Integer connectionTimeout = 30000;
    /**
     * Basic authenticate user
     */
    private String user;
    /**
     * Password for authenticate
     */
    private String password;
    /**
     * Enable SSL
     */
    private Boolean enableSSL = false;
    /**
     * The time in ms before retry
     */
    private Integer maxRetryTimeout = 30000;
    /**
     * Enable automatically discover nodes from a running Elasticsearch cluster
     */
    private Boolean enableSniffer = false;
    /**
     * The interval between consecutive ordinary sniff executions in
     * milliseconds. Will be honoured when sniffOnFailure is disabled or when
     * there are no failures between consecutive sniff executions
     */
    private Integer snifferInterval = 300000;
    /**
     * The delay of a sniff execution scheduled after a failure (in
     * milliseconds)
     */
    private Integer sniffAfterFailureDelay = 60000;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getHostAddresses() {
        return hostAddresses;
    }

    public void setHostAddresses(String hostAddresses) {
        this.hostAddresses = hostAddresses;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnableSSL() {
        return enableSSL;
    }

    public void setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
    }

    public Integer getMaxRetryTimeout() {
        return maxRetryTimeout;
    }

    public void setMaxRetryTimeout(Integer maxRetryTimeout) {
        this.maxRetryTimeout = maxRetryTimeout;
    }

    public Boolean getEnableSniffer() {
        return enableSniffer;
    }

    public void setEnableSniffer(Boolean enableSniffer) {
        this.enableSniffer = enableSniffer;
    }

    public Integer getSnifferInterval() {
        return snifferInterval;
    }

    public void setSnifferInterval(Integer snifferInterval) {
        this.snifferInterval = snifferInterval;
    }

    public Integer getSniffAfterFailureDelay() {
        return sniffAfterFailureDelay;
    }

    public void setSniffAfterFailureDelay(Integer sniffAfterFailureDelay) {
        this.sniffAfterFailureDelay = sniffAfterFailureDelay;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}