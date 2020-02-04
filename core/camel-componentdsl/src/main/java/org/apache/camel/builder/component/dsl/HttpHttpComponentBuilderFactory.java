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
import org.apache.camel.component.http.HttpComponent;

/**
 * For calling out to external HTTP servers using Apache HTTP Client 4.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface HttpHttpComponentBuilderFactory {

    /**
     * HTTP (camel-http)
     * For calling out to external HTTP servers using Apache HTTP Client 4.x.
     * 
     * Category: http
     * Since: 2.3
     * Maven coordinates: org.apache.camel:camel-http
     */
    static HttpHttpComponentBuilder http() {
        return new HttpHttpComponentBuilderImpl();
    }

    /**
     * Builder for the HTTP component.
     */
    interface HttpHttpComponentBuilder
            extends
                ComponentBuilder<HttpComponent> {
        /**
         * To use the custom HttpClientConfigurer to perform configuration of
         * the HttpClient that will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.http.HttpClientConfigurer</code>
         * type.
         * 
         * Group: advanced
         */
        default HttpHttpComponentBuilder httpClientConfigurer(
                org.apache.camel.component.http.HttpClientConfigurer httpClientConfigurer) {
            doSetProperty("httpClientConfigurer", httpClientConfigurer);
            return this;
        }
        /**
         * To use a custom and shared HttpClientConnectionManager to manage
         * connections. If this has been configured then this is always used for
         * all endpoints created by this component.
         * 
         * The option is a:
         * <code>org.apache.http.conn.HttpClientConnectionManager</code> type.
         * 
         * Group: advanced
         */
        default HttpHttpComponentBuilder clientConnectionManager(
                org.apache.http.conn.HttpClientConnectionManager clientConnectionManager) {
            doSetProperty("clientConnectionManager", clientConnectionManager);
            return this;
        }
        /**
         * To use a custom org.apache.http.protocol.HttpContext when executing
         * requests.
         * 
         * The option is a: <code>org.apache.http.protocol.HttpContext</code>
         * type.
         * 
         * Group: advanced
         */
        default HttpHttpComponentBuilder httpContext(
                org.apache.http.protocol.HttpContext httpContext) {
            doSetProperty("httpContext", httpContext);
            return this;
        }
        /**
         * To configure security using SSLContextParameters. Important: Only one
         * instance of org.apache.camel.support.jsse.SSLContextParameters is
         * supported per HttpComponent. If you need to use 2 or more different
         * instances, you need to define a new HttpComponent per instance you
         * need.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default HttpHttpComponentBuilder sslContextParameters(
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
        default HttpHttpComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
        /**
         * To use a custom X509HostnameVerifier such as DefaultHostnameVerifier
         * or NoopHostnameVerifier.
         * 
         * The option is a: <code>javax.net.ssl.HostnameVerifier</code> type.
         * 
         * Group: security
         */
        default HttpHttpComponentBuilder x509HostnameVerifier(
                javax.net.ssl.HostnameVerifier x509HostnameVerifier) {
            doSetProperty("x509HostnameVerifier", x509HostnameVerifier);
            return this;
        }
        /**
         * The maximum number of connections.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 200
         * Group: advanced
         */
        default HttpHttpComponentBuilder maxTotalConnections(
                int maxTotalConnections) {
            doSetProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * The maximum number of connections per route.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 20
         * Group: advanced
         */
        default HttpHttpComponentBuilder connectionsPerRoute(
                int connectionsPerRoute) {
            doSetProperty("connectionsPerRoute", connectionsPerRoute);
            return this;
        }
        /**
         * The time for connection to live, the time unit is millisecond, the
         * default value is always keep alive.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: advanced
         */
        default HttpHttpComponentBuilder connectionTimeToLive(
                long connectionTimeToLive) {
            doSetProperty("connectionTimeToLive", connectionTimeToLive);
            return this;
        }
        /**
         * To use a custom org.apache.http.client.CookieStore. By default the
         * org.apache.http.impl.client.BasicCookieStore is used which is an
         * in-memory only cookie store. Notice if bridgeEndpoint=true then the
         * cookie store is forced to be a noop cookie store as cookie shouldn't
         * be stored as we are just bridging (eg acting as a proxy).
         * 
         * The option is a: <code>org.apache.http.client.CookieStore</code>
         * type.
         * 
         * Group: producer
         */
        default HttpHttpComponentBuilder cookieStore(
                org.apache.http.client.CookieStore cookieStore) {
            doSetProperty("cookieStore", cookieStore);
            return this;
        }
        /**
         * The timeout in milliseconds used when requesting a connection from
         * the connection manager. A timeout value of zero is interpreted as an
         * infinite timeout. A timeout value of zero is interpreted as an
         * infinite timeout. A negative value is interpreted as undefined
         * (system default). Default: -1.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: timeout
         */
        default HttpHttpComponentBuilder connectionRequestTimeout(
                int connectionRequestTimeout) {
            doSetProperty("connectionRequestTimeout", connectionRequestTimeout);
            return this;
        }
        /**
         * Determines the timeout in milliseconds until a connection is
         * established. A timeout value of zero is interpreted as an infinite
         * timeout. A timeout value of zero is interpreted as an infinite
         * timeout. A negative value is interpreted as undefined (system
         * default). Default: -1.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: timeout
         */
        default HttpHttpComponentBuilder connectTimeout(int connectTimeout) {
            doSetProperty("connectTimeout", connectTimeout);
            return this;
        }
        /**
         * Defines the socket timeout (SO_TIMEOUT) in milliseconds, which is the
         * timeout for waiting for data or, put differently, a maximum period
         * inactivity between two consecutive data packets). A timeout value of
         * zero is interpreted as an infinite timeout. A negative value is
         * interpreted as undefined (system default). Default: -1.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: timeout
         */
        default HttpHttpComponentBuilder socketTimeout(int socketTimeout) {
            doSetProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option is a:
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         * 
         * Group: advanced
         */
        default HttpHttpComponentBuilder httpBinding(
                org.apache.camel.http.common.HttpBinding httpBinding) {
            doSetProperty("httpBinding", httpBinding);
            return this;
        }
        /**
         * To use the shared HttpConfiguration as base configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.http.common.HttpConfiguration</code> type.
         * 
         * Group: advanced
         */
        default HttpHttpComponentBuilder httpConfiguration(
                org.apache.camel.http.common.HttpConfiguration httpConfiguration) {
            doSetProperty("httpConfiguration", httpConfiguration);
            return this;
        }
        /**
         * Whether to allow java serialization when a request uses
         * context-type=application/x-java-serialized-object. This is by default
         * turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default HttpHttpComponentBuilder allowJavaSerializedObject(
                boolean allowJavaSerializedObject) {
            doSetProperty("allowJavaSerializedObject", allowJavaSerializedObject);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: filter
         */
        default HttpHttpComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
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
        default HttpHttpComponentBuilder basicPropertyBinding(
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
        default HttpHttpComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class HttpHttpComponentBuilderImpl
            extends
                AbstractComponentBuilder<HttpComponent>
            implements
                HttpHttpComponentBuilder {
        @Override
        protected HttpComponent buildConcreteComponent() {
            return new HttpComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "httpClientConfigurer": ((HttpComponent) component).setHttpClientConfigurer((org.apache.camel.component.http.HttpClientConfigurer) value); return true;
            case "clientConnectionManager": ((HttpComponent) component).setClientConnectionManager((org.apache.http.conn.HttpClientConnectionManager) value); return true;
            case "httpContext": ((HttpComponent) component).setHttpContext((org.apache.http.protocol.HttpContext) value); return true;
            case "sslContextParameters": ((HttpComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((HttpComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "x509HostnameVerifier": ((HttpComponent) component).setX509HostnameVerifier((javax.net.ssl.HostnameVerifier) value); return true;
            case "maxTotalConnections": ((HttpComponent) component).setMaxTotalConnections((int) value); return true;
            case "connectionsPerRoute": ((HttpComponent) component).setConnectionsPerRoute((int) value); return true;
            case "connectionTimeToLive": ((HttpComponent) component).setConnectionTimeToLive((long) value); return true;
            case "cookieStore": ((HttpComponent) component).setCookieStore((org.apache.http.client.CookieStore) value); return true;
            case "connectionRequestTimeout": ((HttpComponent) component).setConnectionRequestTimeout((int) value); return true;
            case "connectTimeout": ((HttpComponent) component).setConnectTimeout((int) value); return true;
            case "socketTimeout": ((HttpComponent) component).setSocketTimeout((int) value); return true;
            case "httpBinding": ((HttpComponent) component).setHttpBinding((org.apache.camel.http.common.HttpBinding) value); return true;
            case "httpConfiguration": ((HttpComponent) component).setHttpConfiguration((org.apache.camel.http.common.HttpConfiguration) value); return true;
            case "allowJavaSerializedObject": ((HttpComponent) component).setAllowJavaSerializedObject((boolean) value); return true;
            case "headerFilterStrategy": ((HttpComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "basicPropertyBinding": ((HttpComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((HttpComponent) component).setLazyStartProducer((boolean) value); return true;
            default: return false;
            }
        }
    }
}