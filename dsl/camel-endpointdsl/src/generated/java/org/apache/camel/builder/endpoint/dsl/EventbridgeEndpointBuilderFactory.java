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

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send events to AWS Eventbridge cluster instances.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EventbridgeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Eventbridge component.
     */
    public interface EventbridgeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedEventbridgeEndpointBuilder advanced() {
            return (AdvancedEventbridgeEndpointBuilder) this;
        }
        /**
         * EventPattern File.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param eventPatternFile the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder eventPatternFile(
                String eventPatternFile) {
            doSetProperty("eventPatternFile", eventPatternFile);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.eventbridge.EventbridgeOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Default: putRule
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder operation(
                org.apache.camel.component.aws2.eventbridge.EventbridgeOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.eventbridge.EventbridgeOperations&lt;/code&gt; type.
         * 
         * Required: true
         * Default: putRule
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder overrideEndpoint(
                String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * The region in which Eventbridge client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Eventbridge client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Eventbridge client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Eventbridge client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Eventbridge client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Eventbridge client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder profileCredentialsName(
                String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set whether the Eventbridge client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Eventbridge client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Eventbridge client should expect to load credentials
         * through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Eventbridge client should expect to load credentials
         * through a profile credentials provider.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder useProfileCredentialsProvider(
                String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Eventbridge component.
     */
    public interface AdvancedEventbridgeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default EventbridgeEndpointBuilder basic() {
            return (EventbridgeEndpointBuilder) this;
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedEventbridgeEndpointBuilder lazyStartProducer(
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedEventbridgeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a existing configured AWS Eventbridge as client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.eventbridge.EventBridgeClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param eventbridgeClient the value to set
         * @return the dsl builder
         */
        default AdvancedEventbridgeEndpointBuilder eventbridgeClient(
                software.amazon.awssdk.services.eventbridge.EventBridgeClient eventbridgeClient) {
            doSetProperty("eventbridgeClient", eventbridgeClient);
            return this;
        }
        /**
         * To use a existing configured AWS Eventbridge as client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.eventbridge.EventBridgeClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param eventbridgeClient the value to set
         * @return the dsl builder
         */
        default AdvancedEventbridgeEndpointBuilder eventbridgeClient(
                String eventbridgeClient) {
            doSetProperty("eventbridgeClient", eventbridgeClient);
            return this;
        }
    }

    public interface EventbridgeBuilders {
        /**
         * AWS Eventbridge (camel-aws2-eventbridge)
         * Send events to AWS Eventbridge cluster instances.
         * 
         * Category: cloud,management
         * Since: 3.6
         * Maven coordinates: org.apache.camel:camel-aws2-eventbridge
         * 
         * @return the dsl builder for the headers' name.
         */
        default EventbridgeHeaderNameBuilder aws2Eventbridge() {
            return EventbridgeHeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS Eventbridge (camel-aws2-eventbridge)
         * Send events to AWS Eventbridge cluster instances.
         * 
         * Category: cloud,management
         * Since: 3.6
         * Maven coordinates: org.apache.camel:camel-aws2-eventbridge
         * 
         * Syntax: <code>aws2-eventbridge://eventbusNameOrArn</code>
         * 
         * Path parameter: eventbusNameOrArn (required)
         * Event bus name or ARN
         * 
         * @param path eventbusNameOrArn
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder aws2Eventbridge(String path) {
            return EventbridgeEndpointBuilderFactory.endpointBuilder("aws2-eventbridge", path);
        }
        /**
         * AWS Eventbridge (camel-aws2-eventbridge)
         * Send events to AWS Eventbridge cluster instances.
         * 
         * Category: cloud,management
         * Since: 3.6
         * Maven coordinates: org.apache.camel:camel-aws2-eventbridge
         * 
         * Syntax: <code>aws2-eventbridge://eventbusNameOrArn</code>
         * 
         * Path parameter: eventbusNameOrArn (required)
         * Event bus name or ARN
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path eventbusNameOrArn
         * @return the dsl builder
         */
        default EventbridgeEndpointBuilder aws2Eventbridge(
                String componentName,
                String path) {
            return EventbridgeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the AWS Eventbridge component.
     */
    public static class EventbridgeHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final EventbridgeHeaderNameBuilder INSTANCE = new EventbridgeHeaderNameBuilder();

        /**
         * The operation we want to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeOperation}.
         */
        public String awsEventbridgeOperation() {
            return "CamelAwsEventbridgeOperation";
        }

        /**
         * The name of the rule.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeRuleName}.
         */
        public String awsEventbridgeRuleName() {
            return "CamelAwsEventbridgeRuleName";
        }

        /**
         * The prefix matching the rule name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeRuleNamePrefix}.
         */
        public String awsEventbridgeRuleNamePrefix() {
            return "CamelAwsEventbridgeRuleNamePrefix";
        }

        /**
         * The event pattern.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeEventPattern}.
         */
        public String awsEventbridgeEventPattern() {
            return "CamelAwsEventbridgeEventPattern";
        }

        /**
         * The targets to update or add to the rule.
         * 
         * The option is a: {@code Collection<Target>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeTargets}.
         */
        public String awsEventbridgeTargets() {
            return "CamelAwsEventbridgeTargets";
        }

        /**
         * The IDs of the targets to remove from the rule.
         * 
         * The option is a: {@code Collection<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeTargetsIds}.
         */
        public String awsEventbridgeTargetsIds() {
            return "CamelAwsEventbridgeTargetsIds";
        }

        /**
         * The Amazon Resource Name (ARN) of the target resource.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeTargetArn}.
         */
        public String awsEventbridgeTargetArn() {
            return "CamelAwsEventbridgeTargetArn";
        }

        /**
         * Comma separated list of Amazon Resource Names (ARN) of the resources
         * related to Event.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeResourcesArn}.
         */
        public String awsEventbridgeResourcesArn() {
            return "CamelAwsEventbridgeResourcesArn";
        }

        /**
         * The source related to Event.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeSource}.
         */
        public String awsEventbridgeSource() {
            return "CamelAwsEventbridgeSource";
        }

        /**
         * The detail type related to Event.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsEventbridgeDetailType}.
         */
        public String awsEventbridgeDetailType() {
            return "CamelAwsEventbridgeDetailType";
        }
    }
    static EventbridgeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class EventbridgeEndpointBuilderImpl extends AbstractEndpointBuilder implements EventbridgeEndpointBuilder, AdvancedEventbridgeEndpointBuilder {
            public EventbridgeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new EventbridgeEndpointBuilderImpl(path);
    }
}