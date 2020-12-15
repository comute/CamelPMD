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
 * Transform messages using FreeMarker templates.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FreemarkerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Freemarker component.
     */
    public interface FreemarkerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedFreemarkerEndpointBuilder advanced() {
            return (AdvancedFreemarkerEndpointBuilder) this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FreemarkerEndpointBuilder allowContextMapAll(
                boolean allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FreemarkerEndpointBuilder allowContextMapAll(
                String allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FreemarkerEndpointBuilder allowTemplateFromHeader(
                boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FreemarkerEndpointBuilder allowTemplateFromHeader(
                String allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Sets the Freemarker configuration to use.
         * 
         * The option is a: <code>freemarker.template.Configuration</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder configuration(Object configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Sets the Freemarker configuration to use.
         * 
         * The option will be converted to a
         * <code>freemarker.template.Configuration</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder configuration(String configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FreemarkerEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FreemarkerEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets the encoding to be used for loading the template file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
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
        default FreemarkerEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
        default FreemarkerEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Number of seconds the loaded template resource will remain in the
         * cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder templateUpdateDelay(
                int templateUpdateDelay) {
            doSetProperty("templateUpdateDelay", templateUpdateDelay);
            return this;
        }
        /**
         * Number of seconds the loaded template resource will remain in the
         * cache.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default FreemarkerEndpointBuilder templateUpdateDelay(
                String templateUpdateDelay) {
            doSetProperty("templateUpdateDelay", templateUpdateDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Freemarker component.
     */
    public interface AdvancedFreemarkerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default FreemarkerEndpointBuilder basic() {
            return (FreemarkerEndpointBuilder) this;
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
        default AdvancedFreemarkerEndpointBuilder synchronous(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedFreemarkerEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface FreemarkerBuilders {
        /**
         * Freemarker (camel-freemarker)
         * Transform messages using FreeMarker templates.
         * 
         * Category: transformation
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-freemarker
         * 
         * Syntax: <code>freemarker:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        default FreemarkerEndpointBuilder freemarker(String path) {
            return FreemarkerEndpointBuilderFactory.endpointBuilder("freemarker", path);
        }
        /**
         * Freemarker (camel-freemarker)
         * Transform messages using FreeMarker templates.
         * 
         * Category: transformation
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-freemarker
         * 
         * Syntax: <code>freemarker:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        default FreemarkerEndpointBuilder freemarker(
                String componentName,
                String path) {
            return FreemarkerEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static FreemarkerEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class FreemarkerEndpointBuilderImpl extends AbstractEndpointBuilder implements FreemarkerEndpointBuilder, AdvancedFreemarkerEndpointBuilder {
            public FreemarkerEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new FreemarkerEndpointBuilderImpl(path);
    }
}