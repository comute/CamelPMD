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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The geocoder component is used for looking up geocodes (latitude and
 * longitude) for a given address, or reverse lookup.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GeoCoderEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Geocoder component.
     */
    public interface GeoCoderEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedGeoCoderEndpointBuilder advanced() {
            return (AdvancedGeoCoderEndpointBuilder) this;
        }
        /**
         * Whether to only enrich the Exchange with headers, and leave the body
         * as-is.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default GeoCoderEndpointBuilder headersOnly(boolean headersOnly) {
            doSetProperty("headersOnly", headersOnly);
            return this;
        }
        /**
         * Whether to only enrich the Exchange with headers, and leave the body
         * as-is.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default GeoCoderEndpointBuilder headersOnly(String headersOnly) {
            doSetProperty("headersOnly", headersOnly);
            return this;
        }
        /**
         * The language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default GeoCoderEndpointBuilder language(String language) {
            doSetProperty("language", language);
            return this;
        }
        /**
         * Domain for proxy NTML authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthDomain(String proxyAuthDomain) {
            doSetProperty("proxyAuthDomain", proxyAuthDomain);
            return this;
        }
        /**
         * Optional host for proxy NTML authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthHost(String proxyAuthHost) {
            doSetProperty("proxyAuthHost", proxyAuthHost);
            return this;
        }
        /**
         * Authentication method for proxy, either as Basic, Digest or NTLM.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthMethod(String proxyAuthMethod) {
            doSetProperty("proxyAuthMethod", proxyAuthMethod);
            return this;
        }
        /**
         * Password for proxy authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthPassword(
                String proxyAuthPassword) {
            doSetProperty("proxyAuthPassword", proxyAuthPassword);
            return this;
        }
        /**
         * Username for proxy authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyAuthUsername(
                String proxyAuthUsername) {
            doSetProperty("proxyAuthUsername", proxyAuthUsername);
            return this;
        }
        /**
         * The proxy host name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port number.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port number.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: proxy
         */
        default GeoCoderEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To use google apiKey.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GeoCoderEndpointBuilder apiKey(String apiKey) {
            doSetProperty("apiKey", apiKey);
            return this;
        }
        /**
         * To use google premium with this client id.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GeoCoderEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * To use google premium with this client key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default GeoCoderEndpointBuilder clientKey(String clientKey) {
            doSetProperty("clientKey", clientKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Geocoder component.
     */
    public interface AdvancedGeoCoderEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GeoCoderEndpointBuilder basic() {
            return (GeoCoderEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGeoCoderEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGeoCoderEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGeoCoderEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedGeoCoderEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Geocoder (camel-geocoder)
     * The geocoder component is used for looking up geocodes (latitude and
     * longitude) for a given address, or reverse lookup.
     * 
     * Category: api,location
     * Available as of version: 2.12
     * Maven coordinates: org.apache.camel:camel-geocoder
     * 
     * Syntax: <code>geocoder:address:latlng</code>
     * 
     * Path parameter: address
     * The geo address which should be prefixed with address:
     * 
     * Path parameter: latlng
     * The geo latitude and longitude which should be prefixed with latlng:
     */
    default GeoCoderEndpointBuilder geoCoder(String path) {
        class GeoCoderEndpointBuilderImpl extends AbstractEndpointBuilder implements GeoCoderEndpointBuilder, AdvancedGeoCoderEndpointBuilder {
            public GeoCoderEndpointBuilderImpl(String path) {
                super("geocoder", path);
            }
        }
        return new GeoCoderEndpointBuilderImpl(path);
    }
}