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
 * To lookup domain information and run DNS queries using DNSJava.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DnsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the DNS component.
     */
    public interface DnsEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDnsEndpointBuilder advanced() {
            return (AdvancedDnsEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the DNS component.
     */
    public interface AdvancedDnsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DnsEndpointBuilder basic() {
            return (DnsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDnsEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedDnsEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedDnsEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
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
        default AdvancedDnsEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * DNS (camel-dns)
     * To lookup domain information and run DNS queries using DNSJava.
     * 
     * Category: networking
     * Available as of version: 2.7
     * Maven coordinates: org.apache.camel:camel-dns
     * 
     * Syntax: <code>dns:dnsType</code>
     * 
     * Path parameter: dnsType (required)
     * The type of the lookup.
     * The value can be one of: dig,ip,lookup,wikipedia
     */
    default DnsEndpointBuilder dns(String path) {
        class DnsEndpointBuilderImpl extends AbstractEndpointBuilder implements DnsEndpointBuilder, AdvancedDnsEndpointBuilder {
            public DnsEndpointBuilderImpl(String path) {
                super("dns", path);
            }
        }
        return new DnsEndpointBuilderImpl(path);
    }
}