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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.sns.SnsComponent;

/**
 * Send messages to an AWS Simple Notification Topic.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsSnsComponentBuilderFactory {

    /**
     * AWS Simple Notification System (SNS) (camel-aws-sns)
     * Send messages to an AWS Simple Notification Topic.
     * 
     * Category: cloud,mobile,messaging
     * Since: 2.8
     * Maven coordinates: org.apache.camel:camel-aws-sns
     */
    static AwsSnsComponentBuilder awsSns() {
        return new AwsSnsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Simple Notification System (SNS) component.
     */
    interface AwsSnsComponentBuilder extends ComponentBuilder<SnsComponent> {
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option is a: <code>com.amazonaws.services.sns.AmazonSNS</code>
         * type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder amazonSNSClient(
                com.amazonaws.services.sns.AmazonSNS amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * An SQS Client to use as bridge between SNS and SQS.
         * 
         * The option is a: <code>com.amazonaws.services.sqs.AmazonSQS</code>
         * type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder amazonSQSClient(
                com.amazonaws.services.sqs.AmazonSQS amazonSQSClient) {
            doSetProperty("amazonSQSClient", amazonSQSClient);
            return this;
        }
        /**
         * Setting the autocreation of the topic.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default AwsSnsComponentBuilder autoCreateTopic(boolean autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.sns.SnsConfiguration</code>
         * type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder configuration(
                org.apache.camel.component.aws.sns.SnsConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or
         * a custom CMK.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder kmsMasterKeyId(
                java.lang.String kmsMasterKeyId) {
            doSetProperty("kmsMasterKeyId", kmsMasterKeyId);
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
        default AwsSnsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The message structure to use such as json.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder messageStructure(
                java.lang.String messageStructure) {
            doSetProperty("messageStructure", messageStructure);
            return this;
        }
        /**
         * The policy for this queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder policy(java.lang.String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SNS client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default AwsSnsComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The queueUrl to subscribe to.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder queueUrl(java.lang.String queueUrl) {
            doSetProperty("queueUrl", queueUrl);
            return this;
        }
        /**
         * The region in which SNS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsSnsComponentBuilder serverSideEncryptionEnabled(
                boolean serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSnsSubject'
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsSnsComponentBuilder subject(java.lang.String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsSnsComponentBuilder subscribeSNStoSQS(
                boolean subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsSnsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsSnsComponentBuilder accessKey(java.lang.String accessKey) {
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
        default AwsSnsComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class AwsSnsComponentBuilderImpl
            extends
                AbstractComponentBuilder<SnsComponent>
            implements
                AwsSnsComponentBuilder {
        @Override
        protected SnsComponent buildConcreteComponent() {
            return new SnsComponent();
        }
        private org.apache.camel.component.aws.sns.SnsConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.sns.SnsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.sns.SnsConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonSNSClient": getOrCreateConfiguration((SnsComponent) component).setAmazonSNSClient((com.amazonaws.services.sns.AmazonSNS) value); return true;
            case "amazonSQSClient": getOrCreateConfiguration((SnsComponent) component).setAmazonSQSClient((com.amazonaws.services.sqs.AmazonSQS) value); return true;
            case "autoCreateTopic": getOrCreateConfiguration((SnsComponent) component).setAutoCreateTopic((boolean) value); return true;
            case "configuration": ((SnsComponent) component).setConfiguration((org.apache.camel.component.aws.sns.SnsConfiguration) value); return true;
            case "kmsMasterKeyId": getOrCreateConfiguration((SnsComponent) component).setKmsMasterKeyId((java.lang.String) value); return true;
            case "lazyStartProducer": ((SnsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "messageStructure": getOrCreateConfiguration((SnsComponent) component).setMessageStructure((java.lang.String) value); return true;
            case "policy": getOrCreateConfiguration((SnsComponent) component).setPolicy((java.lang.String) value); return true;
            case "proxyHost": getOrCreateConfiguration((SnsComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((SnsComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((SnsComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "queueUrl": getOrCreateConfiguration((SnsComponent) component).setQueueUrl((java.lang.String) value); return true;
            case "region": getOrCreateConfiguration((SnsComponent) component).setRegion((java.lang.String) value); return true;
            case "serverSideEncryptionEnabled": getOrCreateConfiguration((SnsComponent) component).setServerSideEncryptionEnabled((boolean) value); return true;
            case "subject": getOrCreateConfiguration((SnsComponent) component).setSubject((java.lang.String) value); return true;
            case "subscribeSNStoSQS": getOrCreateConfiguration((SnsComponent) component).setSubscribeSNStoSQS((boolean) value); return true;
            case "basicPropertyBinding": ((SnsComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((SnsComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((SnsComponent) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}