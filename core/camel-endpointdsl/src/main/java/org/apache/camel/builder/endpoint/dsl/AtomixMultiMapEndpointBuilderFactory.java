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

import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The atomix-multimap component is used to access Atomix's distributed multi
 * map.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtomixMultiMapEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Atomix MultiMap component.
     */
    public static interface AtomixMultiMapEndpointBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedAtomixMultiMapEndpointBuilder advanced() {
            return (AdvancedAtomixMultiMapEndpointBuilder) this;
        }
        /**
         * The distributed resource name.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder resourceName(
                String resourceName) {
            setProperty("resourceName", resourceName);
            return this;
        }
        /**
         * The Atomix instance to use.
         * The option is a <code>io.atomix.AtomixClient</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder atomix(Object atomix) {
            setProperty("atomix", atomix);
            return this;
        }
        /**
         * The Atomix instance to use.
         * The option will be converted to a <code>io.atomix.AtomixClient</code>
         * type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder atomix(String atomix) {
            setProperty("atomix", atomix);
            return this;
        }
        /**
         * The Atomix configuration uri.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder configurationUri(
                String configurationUri) {
            setProperty("configurationUri", configurationUri);
            return this;
        }
        /**
         * The default action.
         * The option is a
         * <code>org.apache.camel.component.atomix.client.multimap.AtomixMultiMap$Action</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder defaultAction(
                Action defaultAction) {
            setProperty("defaultAction", defaultAction);
            return this;
        }
        /**
         * The default action.
         * The option will be converted to a
         * <code>org.apache.camel.component.atomix.client.multimap.AtomixMultiMap$Action</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder defaultAction(
                String defaultAction) {
            setProperty("defaultAction", defaultAction);
            return this;
        }
        /**
         * The key to use if none is set in the header or to listen for events
         * for a specific key.
         * The option is a <code>java.lang.Object</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder key(Object key) {
            setProperty("key", key);
            return this;
        }
        /**
         * The key to use if none is set in the header or to listen for events
         * for a specific key.
         * The option will be converted to a <code>java.lang.Object</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder key(String key) {
            setProperty("key", key);
            return this;
        }
        /**
         * The address of the nodes composing the cluster.
         * The option is a
         * <code>java.util.List&lt;io.atomix.catalyst.transport.Address&gt;</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder nodes(List<Object> nodes) {
            setProperty("nodes", nodes);
            return this;
        }
        /**
         * The address of the nodes composing the cluster.
         * The option will be converted to a
         * <code>java.util.List&lt;io.atomix.catalyst.transport.Address&gt;</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder nodes(String nodes) {
            setProperty("nodes", nodes);
            return this;
        }
        /**
         * The header that wil carry the result.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder resultHeader(
                String resultHeader) {
            setProperty("resultHeader", resultHeader);
            return this;
        }
        /**
         * Sets the Atomix transport.
         * The option is a
         * <code>java.lang.Class&lt;io.atomix.catalyst.transport.Transport&gt;</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder transport(
                Class<Object> transport) {
            setProperty("transport", transport);
            return this;
        }
        /**
         * Sets the Atomix transport.
         * The option will be converted to a
         * <code>java.lang.Class&lt;io.atomix.catalyst.transport.Transport&gt;</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder transport(String transport) {
            setProperty("transport", transport);
            return this;
        }
        /**
         * The resource ttl.
         * The option is a <code>long</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder ttl(long ttl) {
            setProperty("ttl", ttl);
            return this;
        }
        /**
         * The resource ttl.
         * The option will be converted to a <code>long</code> type.
         * @group consumer
         */
        public default AtomixMultiMapEndpointBuilder ttl(String ttl) {
            setProperty("ttl", ttl);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Atomix MultiMap component.
     */
    public static interface AdvancedAtomixMultiMapEndpointBuilder
            extends
                EndpointConsumerBuilder {
        public default AtomixMultiMapEndpointBuilder basic() {
            return (AtomixMultiMapEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cluster wide default resource configuration.
         * The option is a <code>java.util.Properties</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder defaultResourceConfig(
                Properties defaultResourceConfig) {
            setProperty("defaultResourceConfig", defaultResourceConfig);
            return this;
        }
        /**
         * The cluster wide default resource configuration.
         * The option will be converted to a <code>java.util.Properties</code>
         * type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder defaultResourceConfig(
                String defaultResourceConfig) {
            setProperty("defaultResourceConfig", defaultResourceConfig);
            return this;
        }
        /**
         * The local default resource options.
         * The option is a <code>java.util.Properties</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder defaultResourceOptions(
                Properties defaultResourceOptions) {
            setProperty("defaultResourceOptions", defaultResourceOptions);
            return this;
        }
        /**
         * The local default resource options.
         * The option will be converted to a <code>java.util.Properties</code>
         * type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder defaultResourceOptions(
                String defaultResourceOptions) {
            setProperty("defaultResourceOptions", defaultResourceOptions);
            return this;
        }
        /**
         * Sets if the local member should join groups as PersistentMember or
         * not. If set to ephemeral the local member will receive an auto
         * generated ID thus the local one is ignored.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder ephemeral(
                boolean ephemeral) {
            setProperty("ephemeral", ephemeral);
            return this;
        }
        /**
         * Sets if the local member should join groups as PersistentMember or
         * not. If set to ephemeral the local member will receive an auto
         * generated ID thus the local one is ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder ephemeral(
                String ephemeral) {
            setProperty("ephemeral", ephemeral);
            return this;
        }
        /**
         * The read consistency level.
         * The option is a <code>io.atomix.resource.ReadConsistency</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder readConsistency(
                ReadConsistency readConsistency) {
            setProperty("readConsistency", readConsistency);
            return this;
        }
        /**
         * The read consistency level.
         * The option will be converted to a
         * <code>io.atomix.resource.ReadConsistency</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder readConsistency(
                String readConsistency) {
            setProperty("readConsistency", readConsistency);
            return this;
        }
        /**
         * Cluster wide resources configuration.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.util.Properties&gt;</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder resourceConfigs(
                Map<String, Properties> resourceConfigs) {
            setProperty("resourceConfigs", resourceConfigs);
            return this;
        }
        /**
         * Cluster wide resources configuration.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.util.Properties&gt;</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder resourceConfigs(
                String resourceConfigs) {
            setProperty("resourceConfigs", resourceConfigs);
            return this;
        }
        /**
         * Local resources configurations.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.util.Properties&gt;</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder resourceOptions(
                Map<String, Properties> resourceOptions) {
            setProperty("resourceOptions", resourceOptions);
            return this;
        }
        /**
         * Local resources configurations.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.util.Properties&gt;</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder resourceOptions(
                String resourceOptions) {
            setProperty("resourceOptions", resourceOptions);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedAtomixMultiMapEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.atomix.client.multimap.AtomixMultiMap$Action</code> enum.
     */
    public static enum Action {
        PUT, GET, CLEAR, SIZE, CONTAINS_KEY, IS_EMPTY, REMOVE, REMOVE_VALUE;
    }

    /**
     * Proxy enum for <code>io.atomix.resource.ReadConsistency</code> enum.
     */
    public static enum ReadConsistency {
        ATOMIC, ATOMIC_LEASE, SEQUENTIAL, LOCAL;
    }
    /**
     * The atomix-multimap component is used to access Atomix's distributed
     * multi map. Creates a builder to build endpoints for the Atomix MultiMap
     * component.
     */
    public default AtomixMultiMapEndpointBuilder atomixMultiMap(String path) {
        class AtomixMultiMapEndpointBuilderImpl extends AbstractEndpointBuilder implements AtomixMultiMapEndpointBuilder, AdvancedAtomixMultiMapEndpointBuilder {
            public AtomixMultiMapEndpointBuilderImpl(String path) {
                super("atomix-multimap", path);
            }
        }
        return new AtomixMultiMapEndpointBuilderImpl(path);
    }
}