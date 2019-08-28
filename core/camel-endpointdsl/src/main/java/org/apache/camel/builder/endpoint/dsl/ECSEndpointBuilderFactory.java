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
 * The aws-kms is used for managing Amazon ECS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ECSEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS ECS component.
     */
    public interface ECSEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedECSEndpointBuilder advanced() {
            return (AdvancedECSEndpointBuilder) this;
        }
        /**
         * The region in which ECS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ECSEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS ECS component.
     */
    public interface AdvancedECSEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ECSEndpointBuilder basic() {
            return (ECSEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedECSEndpointBuilder basicPropertyBinding(
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
        default AdvancedECSEndpointBuilder basicPropertyBinding(
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
        default AdvancedECSEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedECSEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.ecs.ECSOperations</code> enum.
     */
    enum ECSOperations {
        listClusters,
        describeCluster,
        createCluster,
        deleteCluster;
    }
    /**
     * AWS ECS (camel-aws-ecs)
     * The aws-kms is used for managing Amazon ECS
     * 
     * Category: cloud,management
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-aws-ecs
     * 
     * Syntax: <code>aws-ecs:label</code>
     * 
     * Path parameter: label (required)
     * Logical name
     */
    default ECSEndpointBuilder eCS(String path) {
        class ECSEndpointBuilderImpl extends AbstractEndpointBuilder implements ECSEndpointBuilder, AdvancedECSEndpointBuilder {
            public ECSEndpointBuilderImpl(String path) {
                super("aws-ecs", path);
            }
        }
        return new ECSEndpointBuilderImpl(path);
    }
}