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
 * The aws-sdb component is for storing and retrieving data from/to Amazon's SDB
 * service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SdbEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS SimpleDB component.
     */
    public interface SdbEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSdbEndpointBuilder advanced() {
            return (AdvancedSdbEndpointBuilder) this;
        }
        /**
         * The name of the domain currently worked with.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SdbEndpointBuilder domainName(String domainName) {
            setProperty("domainName", domainName);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SdbEndpointBuilder accessKey(String accessKey) {
            setProperty("accessKey", accessKey);
            return this;
        }
        /**
         * To use the AmazonSimpleDB as the client.
         * The option is a
         * <code>com.amazonaws.services.simpledb.AmazonSimpleDB</code> type.
         * @group producer
         */
        default SdbEndpointBuilder amazonSDBClient(Object amazonSDBClient) {
            setProperty("amazonSDBClient", amazonSDBClient);
            return this;
        }
        /**
         * To use the AmazonSimpleDB as the client.
         * The option will be converted to a
         * <code>com.amazonaws.services.simpledb.AmazonSimpleDB</code> type.
         * @group producer
         */
        default SdbEndpointBuilder amazonSDBClient(String amazonSDBClient) {
            setProperty("amazonSDBClient", amazonSDBClient);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default SdbEndpointBuilder consistentRead(boolean consistentRead) {
            setProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default SdbEndpointBuilder consistentRead(String consistentRead) {
            setProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * The maximum number of domain names you want returned. The range is 1
         * to 100.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        default SdbEndpointBuilder maxNumberOfDomains(Integer maxNumberOfDomains) {
            setProperty("maxNumberOfDomains", maxNumberOfDomains);
            return this;
        }
        /**
         * The maximum number of domain names you want returned. The range is 1
         * to 100.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        default SdbEndpointBuilder maxNumberOfDomains(String maxNumberOfDomains) {
            setProperty("maxNumberOfDomains", maxNumberOfDomains);
            return this;
        }
        /**
         * Operation to perform.
         * The option is a
         * <code>org.apache.camel.component.aws.sdb.SdbOperations</code> type.
         * @group producer
         */
        default SdbEndpointBuilder operation(SdbOperations operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.aws.sdb.SdbOperations</code> type.
         * @group producer
         */
        default SdbEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SDB client.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SdbEndpointBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SDB client.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        default SdbEndpointBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SDB client.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        default SdbEndpointBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The region in which SDB client needs to work.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SdbEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SdbEndpointBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS SimpleDB component.
     */
    public interface AdvancedSdbEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SdbEndpointBuilder basic() {
            return (SdbEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSdbEndpointBuilder basicPropertyBinding(
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
        default AdvancedSdbEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSdbEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSdbEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.sdb.SdbOperations</code> enum.
     */
    enum SdbOperations {
        BatchDeleteAttributes, BatchPutAttributes, DeleteAttributes, DeleteDomain, DomainMetadata, GetAttributes, ListDomains, PutAttributes, Select;
    }
    /**
     * The aws-sdb component is for storing and retrieving data from/to Amazon's
     * SDB service. Creates a builder to build endpoints for the AWS SimpleDB
     * component.
     */
    default SdbEndpointBuilder sdb(String path) {
        class SdbEndpointBuilderImpl extends AbstractEndpointBuilder implements SdbEndpointBuilder, AdvancedSdbEndpointBuilder {
            public SdbEndpointBuilderImpl(String path) {
                super("aws-sdb", path);
            }
        }
        return new SdbEndpointBuilderImpl(path);
    }
}