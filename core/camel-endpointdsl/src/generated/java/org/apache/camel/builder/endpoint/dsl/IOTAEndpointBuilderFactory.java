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
 * Manage financial transactions using IOTA distributed ledger.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IOTAEndpointBuilderFactory {


    /**
     * Builder for endpoint for the IOTA component.
     */
    public interface IOTAEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedIOTAEndpointBuilder advanced() {
            return (AdvancedIOTAEndpointBuilder) this;
        }
        /**
         * The depth determines how deep the tangle is analysed for getting
         * Tips.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 9
         * Group: producer
         */
        default IOTAEndpointBuilder depth(Integer depth) {
            doSetProperty("depth", depth);
            return this;
        }
        /**
         * The depth determines how deep the tangle is analysed for getting
         * Tips.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 9
         * Group: producer
         */
        default IOTAEndpointBuilder depth(String depth) {
            doSetProperty("depth", depth);
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
        default IOTAEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default IOTAEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The minWeightMagnitude is the minimum number of zeroes that a
         * proof-of-work output/transaction hash must end with to be considered
         * valid by full nodes.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 14
         * Group: producer
         */
        default IOTAEndpointBuilder minWeightMagnitude(
                Integer minWeightMagnitude) {
            doSetProperty("minWeightMagnitude", minWeightMagnitude);
            return this;
        }
        /**
         * The minWeightMagnitude is the minimum number of zeroes that a
         * proof-of-work output/transaction hash must end with to be considered
         * valid by full nodes.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 14
         * Group: producer
         */
        default IOTAEndpointBuilder minWeightMagnitude(String minWeightMagnitude) {
            doSetProperty("minWeightMagnitude", minWeightMagnitude);
            return this;
        }
        /**
         * Which operation to perform, one of: sendTransfer, getNewAddress,
         * getTransfers.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default IOTAEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * TAG.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default IOTAEndpointBuilder tag(String tag) {
            doSetProperty("tag", tag);
            return this;
        }
        /**
         * Node url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default IOTAEndpointBuilder url(String url) {
            doSetProperty("url", url);
            return this;
        }
        /**
         * Address security level.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: security
         */
        default IOTAEndpointBuilder securityLevel(Integer securityLevel) {
            doSetProperty("securityLevel", securityLevel);
            return this;
        }
        /**
         * Address security level.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 1
         * Group: security
         */
        default IOTAEndpointBuilder securityLevel(String securityLevel) {
            doSetProperty("securityLevel", securityLevel);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the IOTA component.
     */
    public interface AdvancedIOTAEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IOTAEndpointBuilder basic() {
            return (IOTAEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIOTAEndpointBuilder basicPropertyBinding(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedIOTAEndpointBuilder basicPropertyBinding(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedIOTAEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedIOTAEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface IOTABuilders {
        /**
         * IOTA (camel-iota)
         * Manage financial transactions using IOTA distributed ledger.
         * 
         * Category: ledger
         * Since: 2.23
         * Maven coordinates: org.apache.camel:camel-iota
         * 
         * Syntax: <code>iota:name</code>
         * 
         * Path parameter: name (required)
         * Component name
         */
        default IOTAEndpointBuilder iota(String path) {
            return IOTAEndpointBuilderFactory.iota(path);
        }
    }
    /**
     * IOTA (camel-iota)
     * Manage financial transactions using IOTA distributed ledger.
     * 
     * Category: ledger
     * Since: 2.23
     * Maven coordinates: org.apache.camel:camel-iota
     * 
     * Syntax: <code>iota:name</code>
     * 
     * Path parameter: name (required)
     * Component name
     */
    static IOTAEndpointBuilder iota(String path) {
        class IOTAEndpointBuilderImpl extends AbstractEndpointBuilder implements IOTAEndpointBuilder, AdvancedIOTAEndpointBuilder {
            public IOTAEndpointBuilderImpl(String path) {
                super("iota", path);
            }
        }
        return new IOTAEndpointBuilderImpl(path);
    }
}