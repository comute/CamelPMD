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
import org.apache.camel.component.elasticsearch.ElasticsearchComponent;

/**
 * The elasticsearch component is used for interfacing with ElasticSearch server
 * using REST API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ElasticsearchComponentBuilderFactory {

    /**
     * Elastichsearch Rest (camel-elasticsearch-rest)
     * The elasticsearch component is used for interfacing with ElasticSearch
     * server using REST API.
     * 
     * Category: monitoring,search
     * Since: 2.21
     * Maven coordinates: org.apache.camel:camel-elasticsearch-rest
     */
    static ElasticsearchComponentBuilder elasticsearchRest() {
        return new ElasticsearchComponentBuilderImpl();
    }

    /**
     * Builder for the Elastichsearch Rest component.
     */
    interface ElasticsearchComponentBuilder
            extends
                ComponentBuilder<ElasticsearchComponent> {
        /**
         * To use an existing configured Elasticsearch client, instead of
         * creating a client per endpoint. This allow to customize the client
         * with specific settings.
         * 
         * The option is a: <code>org.elasticsearch.client.RestClient</code>
         * type.
         * 
         * Group: advanced
         */
        default ElasticsearchComponentBuilder client(
                org.elasticsearch.client.RestClient client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * Comma separated list with ip:port formatted remote transport
         * addresses to use. The ip and port options must be left blank for
         * hostAddresses to be considered instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default ElasticsearchComponentBuilder hostAddresses(
                java.lang.String hostAddresses) {
            doSetProperty("hostAddresses", hostAddresses);
            return this;
        }
        /**
         * The timeout in ms to wait before the socket will timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: advanced
         */
        default ElasticsearchComponentBuilder socketTimeout(int socketTimeout) {
            doSetProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * The time in ms to wait before connection will timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: advanced
         */
        default ElasticsearchComponentBuilder connectionTimeout(
                int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Basic authenticate user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ElasticsearchComponentBuilder user(java.lang.String user) {
            doSetProperty("user", user);
            return this;
        }
        /**
         * Password for authenticate.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ElasticsearchComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Enable SSL.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default ElasticsearchComponentBuilder enableSSL(
                java.lang.Boolean enableSSL) {
            doSetProperty("enableSSL", enableSSL);
            return this;
        }
        /**
         * The time in ms before retry.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 30000
         * Group: advanced
         */
        default ElasticsearchComponentBuilder maxRetryTimeout(
                int maxRetryTimeout) {
            doSetProperty("maxRetryTimeout", maxRetryTimeout);
            return this;
        }
        /**
         * Enable automatically discover nodes from a running Elasticsearch
         * cluster.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ElasticsearchComponentBuilder enableSniffer(
                java.lang.Boolean enableSniffer) {
            doSetProperty("enableSniffer", enableSniffer);
            return this;
        }
        /**
         * The interval between consecutive ordinary sniff executions in
         * milliseconds. Will be honoured when sniffOnFailure is disabled or
         * when there are no failures between consecutive sniff executions.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300000
         * Group: advanced
         */
        default ElasticsearchComponentBuilder snifferInterval(
                int snifferInterval) {
            doSetProperty("snifferInterval", snifferInterval);
            return this;
        }
        /**
         * The delay of a sniff execution scheduled after a failure (in
         * milliseconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60000
         * Group: advanced
         */
        default ElasticsearchComponentBuilder sniffAfterFailureDelay(
                int sniffAfterFailureDelay) {
            doSetProperty("sniffAfterFailureDelay", sniffAfterFailureDelay);
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
        default ElasticsearchComponentBuilder basicPropertyBinding(
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
        default ElasticsearchComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class ElasticsearchComponentBuilderImpl
            extends
                AbstractComponentBuilder<ElasticsearchComponent>
            implements
                ElasticsearchComponentBuilder {
        @Override
        protected ElasticsearchComponent buildConcreteComponent() {
            return new ElasticsearchComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "client": ((ElasticsearchComponent) component).setClient((org.elasticsearch.client.RestClient) value); return true;
            case "hostAddresses": ((ElasticsearchComponent) component).setHostAddresses((java.lang.String) value); return true;
            case "socketTimeout": ((ElasticsearchComponent) component).setSocketTimeout((int) value); return true;
            case "connectionTimeout": ((ElasticsearchComponent) component).setConnectionTimeout((int) value); return true;
            case "user": ((ElasticsearchComponent) component).setUser((java.lang.String) value); return true;
            case "password": ((ElasticsearchComponent) component).setPassword((java.lang.String) value); return true;
            case "enableSSL": ((ElasticsearchComponent) component).setEnableSSL((java.lang.Boolean) value); return true;
            case "maxRetryTimeout": ((ElasticsearchComponent) component).setMaxRetryTimeout((int) value); return true;
            case "enableSniffer": ((ElasticsearchComponent) component).setEnableSniffer((java.lang.Boolean) value); return true;
            case "snifferInterval": ((ElasticsearchComponent) component).setSnifferInterval((int) value); return true;
            case "sniffAfterFailureDelay": ((ElasticsearchComponent) component).setSniffAfterFailureDelay((int) value); return true;
            case "basicPropertyBinding": ((ElasticsearchComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((ElasticsearchComponent) component).setLazyStartProducer((boolean) value); return true;
            default: return false;
            }
        }
    }
}