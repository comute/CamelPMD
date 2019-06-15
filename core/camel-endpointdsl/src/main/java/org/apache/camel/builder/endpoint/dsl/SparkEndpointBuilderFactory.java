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
 * The spark-rest component is used for hosting REST services which has been
 * defined using Camel rest-dsl.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SparkEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spark Rest component.
     */
    public static interface SparkEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedSparkEndpointBuilder advanced() {
            return (AdvancedSparkEndpointBuilder) this;
        }
        /**
         * get, post, put, patch, delete, head, trace, connect, or options.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder verb(String verb) {
            setProperty("verb", verb);
            return this;
        }
        /**
         * The content path which support Spark syntax.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * Accept type such as: 'text/xml', or 'application/json'. By default we
         * accept all kinds of types.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder accept(String accept) {
            setProperty("accept", accept);
            return this;
        }
        /**
         * Determines whether or not the raw input stream from Spark
         * HttpRequest#getContent() is cached or not (Camel will read the stream
         * into a in light-weight memory based Stream caching) cache. By default
         * Camel will cache the Netty input stream to support reading it
         * multiple times to ensure Camel can retrieve all data from the stream.
         * However you can set this option to true when you for example need to
         * access the raw stream, such as streaming it directly to a file or
         * other persistent store. Mind that if you enable this option, then you
         * cannot read the Netty stream multiple times out of the box, and you
         * would need manually to reset the reader index on the Spark raw
         * stream.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder disableStreamCache(
                boolean disableStreamCache) {
            setProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * Determines whether or not the raw input stream from Spark
         * HttpRequest#getContent() is cached or not (Camel will read the stream
         * into a in light-weight memory based Stream caching) cache. By default
         * Camel will cache the Netty input stream to support reading it
         * multiple times to ensure Camel can retrieve all data from the stream.
         * However you can set this option to true when you for example need to
         * access the raw stream, such as streaming it directly to a file or
         * other persistent store. Mind that if you enable this option, then you
         * cannot read the Netty stream multiple times out of the box, and you
         * would need manually to reset the reader index on the Spark raw
         * stream.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder disableStreamCache(
                String disableStreamCache) {
            setProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the headers will be mapped as well (eg added as header
         * to the Camel Message as well). You can turn off this option to
         * disable this. The headers can still be accessed from the
         * org.apache.camel.component.sparkrest.SparkMessage message with the
         * method getRequest() that returns the Spark HTTP request instance.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder mapHeaders(boolean mapHeaders) {
            setProperty("mapHeaders", mapHeaders);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the headers will be mapped as well (eg added as header
         * to the Camel Message as well). You can turn off this option to
         * disable this. The headers can still be accessed from the
         * org.apache.camel.component.sparkrest.SparkMessage message with the
         * method getRequest() that returns the Spark HTTP request instance.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder mapHeaders(String mapHeaders) {
            setProperty("mapHeaders", mapHeaders);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. This is by
         * default turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder transferException(boolean transferException) {
            setProperty("transferException", transferException);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. This is by
         * default turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder transferException(String transferException) {
            setProperty("transferException", transferException);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the header values will be URL decoded (eg %20 will be a
         * space character.).
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder urlDecodeHeaders(boolean urlDecodeHeaders) {
            setProperty("urlDecodeHeaders", urlDecodeHeaders);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the header values will be URL decoded (eg %20 will be a
         * space character.).
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default SparkEndpointBuilder urlDecodeHeaders(String urlDecodeHeaders) {
            setProperty("urlDecodeHeaders", urlDecodeHeaders);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spark Rest component.
     */
    public static interface AdvancedSparkEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default SparkEndpointBuilder basic() {
            return (SparkEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSparkEndpointBuilder basicPropertyBinding(
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
        default AdvancedSparkEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSparkEndpointBuilder matchOnUriPrefix(
                boolean matchOnUriPrefix) {
            setProperty("matchOnUriPrefix", matchOnUriPrefix);
            return this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSparkEndpointBuilder matchOnUriPrefix(
                String matchOnUriPrefix) {
            setProperty("matchOnUriPrefix", matchOnUriPrefix);
            return this;
        }
        /**
         * To use a custom SparkBinding to map to/from Camel message.
         * The option is a
         * <code>org.apache.camel.component.sparkrest.SparkBinding</code> type.
         * @group advanced
         */
        default AdvancedSparkEndpointBuilder sparkBinding(Object sparkBinding) {
            setProperty("sparkBinding", sparkBinding);
            return this;
        }
        /**
         * To use a custom SparkBinding to map to/from Camel message.
         * The option will be converted to a
         * <code>org.apache.camel.component.sparkrest.SparkBinding</code> type.
         * @group advanced
         */
        default AdvancedSparkEndpointBuilder sparkBinding(String sparkBinding) {
            setProperty("sparkBinding", sparkBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSparkEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSparkEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The spark-rest component is used for hosting REST services which has been
     * defined using Camel rest-dsl. Creates a builder to build endpoints for
     * the Spark Rest component.
     */
    default SparkEndpointBuilder spark(String path) {
        class SparkEndpointBuilderImpl extends AbstractEndpointBuilder implements SparkEndpointBuilder, AdvancedSparkEndpointBuilder {
            public SparkEndpointBuilderImpl(String path) {
                super("spark-rest", path);
            }
        }
        return new SparkEndpointBuilderImpl(path);
    }
}