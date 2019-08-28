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
 * Represents an endpoint which only becomes active when it obtains the master
 * lock
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ZooKeeperMasterEndpointBuilderFactory {


    /**
     * Builder for endpoint for the ZooKeeper Master component.
     */
    public interface ZooKeeperMasterEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedZooKeeperMasterEndpointBuilder advanced() {
            return (AdvancedZooKeeperMasterEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the ZooKeeper Master component.
     */
    public interface AdvancedZooKeeperMasterEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default ZooKeeperMasterEndpointBuilder basic() {
            return (ZooKeeperMasterEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedZooKeeperMasterEndpointBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperMasterEndpointBuilder basicPropertyBinding(
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
        default AdvancedZooKeeperMasterEndpointBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedZooKeeperMasterEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * ZooKeeper Master (camel-zookeeper-master)
     * Represents an endpoint which only becomes active when it obtains the
     * master lock
     * 
     * Category: clustering
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-zookeeper-master
     * 
     * Syntax: <code>zookeeper-master:groupName:consumerEndpointUri</code>
     * 
     * Path parameter: groupName (required)
     * The name of the cluster group to use
     * 
     * Path parameter: consumerEndpointUri (required)
     * The consumer endpoint to use in master/slave mode
     */
    default ZooKeeperMasterEndpointBuilder zooKeeperMaster(String path) {
        class ZooKeeperMasterEndpointBuilderImpl extends AbstractEndpointBuilder implements ZooKeeperMasterEndpointBuilder, AdvancedZooKeeperMasterEndpointBuilder {
            public ZooKeeperMasterEndpointBuilderImpl(String path) {
                super("zookeeper-master", path);
            }
        }
        return new ZooKeeperMasterEndpointBuilderImpl(path);
    }
}