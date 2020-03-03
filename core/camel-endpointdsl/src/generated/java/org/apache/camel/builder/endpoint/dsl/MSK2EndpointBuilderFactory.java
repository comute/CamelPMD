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
 * The aws2-msk is used for managing Amazon MSK
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MSK2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS 2 MSK component.
     */
    public interface MSK2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMSK2EndpointBuilder advanced() {
            return (AdvancedMSK2EndpointBuilder) this;
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
        default MSK2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default MSK2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a existing configured AWS MSK as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.kafka.KafkaClient</code> type.
         * 
         * Group: producer
         */
        default MSK2EndpointBuilder mskClient(Object mskClient) {
            doSetProperty("mskClient", mskClient);
            return this;
        }
        /**
         * To use a existing configured AWS MSK as client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.kafka.KafkaClient</code> type.
         * 
         * Group: producer
         */
        default MSK2EndpointBuilder mskClient(String mskClient) {
            doSetProperty("mskClient", mskClient);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.msk.MSK2Operations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default MSK2EndpointBuilder operation(MSK2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws2.msk.MSK2Operations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default MSK2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the MSK client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MSK2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the MSK client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default MSK2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the MSK client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default MSK2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the MSK client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default MSK2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the MSK client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.core.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default MSK2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which MSK client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MSK2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default MSK2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default MSK2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS 2 MSK component.
     */
    public interface AdvancedMSK2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default MSK2EndpointBuilder basic() {
            return (MSK2EndpointBuilder) this;
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
        default AdvancedMSK2EndpointBuilder basicPropertyBinding(
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
        default AdvancedMSK2EndpointBuilder basicPropertyBinding(
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
        default AdvancedMSK2EndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedMSK2EndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws2.msk.MSK2Operations</code> enum.
     */
    enum MSK2Operations {
        listClusters,
        createCluster,
        deleteCluster,
        describeCluster;
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface MSK2Builders {
        /**
         * AWS 2 MSK (camel-aws2-msk)
         * The aws2-msk is used for managing Amazon MSK
         * 
         * Category: cloud,management
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-msk
         * 
         * Syntax: <code>aws2-msk:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         */
        default MSK2EndpointBuilder aws2Msk(String path) {
            return MSK2EndpointBuilderFactory.aws2Msk(path);
        }
    }
    /**
     * AWS 2 MSK (camel-aws2-msk)
     * The aws2-msk is used for managing Amazon MSK
     * 
     * Category: cloud,management
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-msk
     * 
     * Syntax: <code>aws2-msk:label</code>
     * 
     * Path parameter: label (required)
     * Logical name
     */
    static MSK2EndpointBuilder aws2Msk(String path) {
        class MSK2EndpointBuilderImpl extends AbstractEndpointBuilder implements MSK2EndpointBuilder, AdvancedMSK2EndpointBuilder {
            public MSK2EndpointBuilderImpl(String path) {
                super("aws2-msk", path);
            }
        }
        return new MSK2EndpointBuilderImpl(path);
    }
}