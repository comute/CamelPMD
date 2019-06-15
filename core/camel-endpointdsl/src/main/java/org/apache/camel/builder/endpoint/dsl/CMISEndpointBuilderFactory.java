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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The cmis component uses the Apache Chemistry client API and allows you to
 * add/read nodes to/from a CMIS compliant content repositories.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CMISEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the CMIS component.
     */
    public interface CMISEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedCMISEndpointConsumerBuilder advanced() {
            return (AdvancedCMISEndpointConsumerBuilder) this;
        }
        /**
         * URL to the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder cmsUrl(String cmsUrl) {
            setProperty("cmsUrl", cmsUrl);
            return this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option is a <code>int</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder pageSize(int pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder pageSize(String pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder readContent(boolean readContent) {
            setProperty("readContent", readContent);
            return this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder readContent(String readContent) {
            setProperty("readContent", readContent);
            return this;
        }
        /**
         * Max number of nodes to read.
         * The option is a <code>int</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder readCount(int readCount) {
            setProperty("readCount", readCount);
            return this;
        }
        /**
         * Max number of nodes to read.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder readCount(String readCount) {
            setProperty("readCount", readCount);
            return this;
        }
        /**
         * The Id of the repository to use. If not specified the first available
         * repository is used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CMISEndpointConsumerBuilder repositoryId(String repositoryId) {
            setProperty("repositoryId", repositoryId);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default CMISEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default CMISEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The cmis query to execute against the repository. If not specified,
         * the consumer will retrieve every node from the content repository by
         * iterating the content tree recursively.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default CMISEndpointConsumerBuilder query(String query) {
            setProperty("query", query);
            return this;
        }
        /**
         * Password for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CMISEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Username for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CMISEndpointConsumerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the CMIS component.
     */
    public interface AdvancedCMISEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default CMISEndpointConsumerBuilder basic() {
            return (CMISEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedCMISEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedCMISEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedCMISEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedCMISEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCMISEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedCMISEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option is a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        default AdvancedCMISEndpointConsumerBuilder sessionFacadeFactory(
                Object sessionFacadeFactory) {
            setProperty("sessionFacadeFactory", sessionFacadeFactory);
            return this;
        }
        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option will be converted to a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        default AdvancedCMISEndpointConsumerBuilder sessionFacadeFactory(
                String sessionFacadeFactory) {
            setProperty("sessionFacadeFactory", sessionFacadeFactory);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCMISEndpointConsumerBuilder synchronous(
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
        default AdvancedCMISEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the CMIS component.
     */
    public static interface CMISEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCMISEndpointProducerBuilder advanced() {
            return (AdvancedCMISEndpointProducerBuilder) this;
        }
        /**
         * URL to the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder cmsUrl(String cmsUrl) {
            setProperty("cmsUrl", cmsUrl);
            return this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option is a <code>int</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder pageSize(int pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder pageSize(String pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder readContent(boolean readContent) {
            setProperty("readContent", readContent);
            return this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder readContent(String readContent) {
            setProperty("readContent", readContent);
            return this;
        }
        /**
         * Max number of nodes to read.
         * The option is a <code>int</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder readCount(int readCount) {
            setProperty("readCount", readCount);
            return this;
        }
        /**
         * Max number of nodes to read.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder readCount(String readCount) {
            setProperty("readCount", readCount);
            return this;
        }
        /**
         * The Id of the repository to use. If not specified the first available
         * repository is used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CMISEndpointProducerBuilder repositoryId(String repositoryId) {
            setProperty("repositoryId", repositoryId);
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
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default CMISEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default CMISEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * If true, will execute the cmis query from the message body and return
         * result, otherwise will create a node in the cmis repository.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default CMISEndpointProducerBuilder queryMode(boolean queryMode) {
            setProperty("queryMode", queryMode);
            return this;
        }
        /**
         * If true, will execute the cmis query from the message body and return
         * result, otherwise will create a node in the cmis repository.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default CMISEndpointProducerBuilder queryMode(String queryMode) {
            setProperty("queryMode", queryMode);
            return this;
        }
        /**
         * Password for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CMISEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Username for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CMISEndpointProducerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the CMIS component.
     */
    public interface AdvancedCMISEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default CMISEndpointProducerBuilder basic() {
            return (CMISEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCMISEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedCMISEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option is a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        default AdvancedCMISEndpointProducerBuilder sessionFacadeFactory(
                Object sessionFacadeFactory) {
            setProperty("sessionFacadeFactory", sessionFacadeFactory);
            return this;
        }
        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option will be converted to a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        default AdvancedCMISEndpointProducerBuilder sessionFacadeFactory(
                String sessionFacadeFactory) {
            setProperty("sessionFacadeFactory", sessionFacadeFactory);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCMISEndpointProducerBuilder synchronous(
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
        default AdvancedCMISEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the CMIS component.
     */
    public static interface CMISEndpointBuilder
            extends
                CMISEndpointConsumerBuilder, CMISEndpointProducerBuilder {
        default AdvancedCMISEndpointBuilder advanced() {
            return (AdvancedCMISEndpointBuilder) this;
        }
        /**
         * URL to the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CMISEndpointBuilder cmsUrl(String cmsUrl) {
            setProperty("cmsUrl", cmsUrl);
            return this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option is a <code>int</code> type.
         * @group common
         */
        default CMISEndpointBuilder pageSize(int pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Number of nodes to retrieve per page.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default CMISEndpointBuilder pageSize(String pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default CMISEndpointBuilder readContent(boolean readContent) {
            setProperty("readContent", readContent);
            return this;
        }
        /**
         * If set to true, the content of document node will be retrieved in
         * addition to the properties.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default CMISEndpointBuilder readContent(String readContent) {
            setProperty("readContent", readContent);
            return this;
        }
        /**
         * Max number of nodes to read.
         * The option is a <code>int</code> type.
         * @group common
         */
        default CMISEndpointBuilder readCount(int readCount) {
            setProperty("readCount", readCount);
            return this;
        }
        /**
         * Max number of nodes to read.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        default CMISEndpointBuilder readCount(String readCount) {
            setProperty("readCount", readCount);
            return this;
        }
        /**
         * The Id of the repository to use. If not specified the first available
         * repository is used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default CMISEndpointBuilder repositoryId(String repositoryId) {
            setProperty("repositoryId", repositoryId);
            return this;
        }
        /**
         * Password for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CMISEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Username for the cmis repository.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default CMISEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the CMIS component.
     */
    public static interface AdvancedCMISEndpointBuilder
            extends
                AdvancedCMISEndpointConsumerBuilder, AdvancedCMISEndpointProducerBuilder {
        default CMISEndpointBuilder basic() {
            return (CMISEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCMISEndpointBuilder basicPropertyBinding(
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
        default AdvancedCMISEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option is a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        default AdvancedCMISEndpointBuilder sessionFacadeFactory(
                Object sessionFacadeFactory) {
            setProperty("sessionFacadeFactory", sessionFacadeFactory);
            return this;
        }
        /**
         * To use a custom CMISSessionFacadeFactory to create the
         * CMISSessionFacade instances.
         * The option will be converted to a
         * <code>org.apache.camel.component.cmis.CMISSessionFacadeFactory</code>
         * type.
         * @group advanced
         */
        default AdvancedCMISEndpointBuilder sessionFacadeFactory(
                String sessionFacadeFactory) {
            setProperty("sessionFacadeFactory", sessionFacadeFactory);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCMISEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedCMISEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The cmis component uses the Apache Chemistry client API and allows you to
     * add/read nodes to/from a CMIS compliant content repositories. Creates a
     * builder to build endpoints for the CMIS component.
     */
    default CMISEndpointBuilder cMIS(String path) {
        class CMISEndpointBuilderImpl extends AbstractEndpointBuilder implements CMISEndpointBuilder, AdvancedCMISEndpointBuilder {
            public CMISEndpointBuilderImpl(String path) {
                super("cmis", path);
            }
        }
        return new CMISEndpointBuilderImpl(path);
    }
}