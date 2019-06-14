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
 * The jira component interacts with the JIRA issue tracker.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JiraEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Jira component.
     */
    public interface JiraEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedJiraEndpointConsumerBuilder advanced() {
            return (AdvancedJiraEndpointConsumerBuilder) this;
        }
        /**
         * Operation to perform. Consumers: NewIssues, NewComments. Producers:
         * AddIssue, AttachFile, DeleteIssue, TransitionIssue, UpdateIssue,
         * Watchers. See this class javadoc description for more information.
         * The option is a <code>org.apache.camel.component.jira.JiraType</code>
         * type.
         * @group common
         */
        public default JiraEndpointConsumerBuilder type(JiraType type) {
            setProperty("type", type);
            return this;
        }
        /**
         * Operation to perform. Consumers: NewIssues, NewComments. Producers:
         * AddIssue, AttachFile, DeleteIssue, TransitionIssue, UpdateIssue,
         * Watchers. See this class javadoc description for more information.
         * The option will be converted to a
         * <code>org.apache.camel.component.jira.JiraType</code> type.
         * @group common
         */
        public default JiraEndpointConsumerBuilder type(String type) {
            setProperty("type", type);
            return this;
        }
        /**
         * Time in milliseconds to elapse for the next poll.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default JiraEndpointConsumerBuilder delay(Integer delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * Time in milliseconds to elapse for the next poll.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default JiraEndpointConsumerBuilder delay(String delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * The Jira server url, example: http://my_jira.com:8081.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JiraEndpointConsumerBuilder jiraUrl(String jiraUrl) {
            setProperty("jiraUrl", jiraUrl);
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
        public default JiraEndpointConsumerBuilder bridgeErrorHandler(
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
        public default JiraEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * JQL is the query language from JIRA which allows you to retrieve the
         * data you want. For example jql=project=MyProject Where MyProject is
         * the product key in Jira. It is important to use the RAW() and set the
         * JQL inside it to prevent camel parsing it, example: RAW(project in
         * (MYP, COM) AND resolution = Unresolved).
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        public default JiraEndpointConsumerBuilder jql(String jql) {
            setProperty("jql", jql);
            return this;
        }
        /**
         * Max number of issues to search for.
         * The option is a <code>java.lang.Integer</code> type.
         * @group consumer
         */
        public default JiraEndpointConsumerBuilder maxResults(Integer maxResults) {
            setProperty("maxResults", maxResults);
            return this;
        }
        /**
         * Max number of issues to search for.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group consumer
         */
        public default JiraEndpointConsumerBuilder maxResults(String maxResults) {
            setProperty("maxResults", maxResults);
            return this;
        }
        /**
         * (OAuth only) The access token generated by the Jira server.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointConsumerBuilder accessToken(
                String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * (OAuth only) The consumer key from Jira settings.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointConsumerBuilder consumerKey(
                String consumerKey) {
            setProperty("consumerKey", consumerKey);
            return this;
        }
        /**
         * (Basic authentication only) The password to authenticate to the Jira
         * server. Use only if username basic authentication is used.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * (OAuth only) The private key generated by the client to encrypt the
         * conversation to the server.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointConsumerBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * (Basic authentication only) The username to authenticate to the Jira
         * server. Use only if OAuth is not enabled on the Jira server. Do not
         * set the username and OAuth token parameter, if they are both set, the
         * username basic authentication takes precedence.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointConsumerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * (OAuth only) The verification code from Jira generated in the first
         * step of the authorization proccess.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointConsumerBuilder verificationCode(
                String verificationCode) {
            setProperty("verificationCode", verificationCode);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Jira component.
     */
    public interface AdvancedJiraEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default JiraEndpointConsumerBuilder basic() {
            return (JiraEndpointConsumerBuilder) this;
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
        public default AdvancedJiraEndpointConsumerBuilder exceptionHandler(
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
        public default AdvancedJiraEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedJiraEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedJiraEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedJiraEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedJiraEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedJiraEndpointConsumerBuilder synchronous(
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
        public default AdvancedJiraEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Jira component.
     */
    public static interface JiraEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedJiraEndpointProducerBuilder advanced() {
            return (AdvancedJiraEndpointProducerBuilder) this;
        }
        /**
         * Operation to perform. Consumers: NewIssues, NewComments. Producers:
         * AddIssue, AttachFile, DeleteIssue, TransitionIssue, UpdateIssue,
         * Watchers. See this class javadoc description for more information.
         * The option is a <code>org.apache.camel.component.jira.JiraType</code>
         * type.
         * @group common
         */
        public default JiraEndpointProducerBuilder type(JiraType type) {
            setProperty("type", type);
            return this;
        }
        /**
         * Operation to perform. Consumers: NewIssues, NewComments. Producers:
         * AddIssue, AttachFile, DeleteIssue, TransitionIssue, UpdateIssue,
         * Watchers. See this class javadoc description for more information.
         * The option will be converted to a
         * <code>org.apache.camel.component.jira.JiraType</code> type.
         * @group common
         */
        public default JiraEndpointProducerBuilder type(String type) {
            setProperty("type", type);
            return this;
        }
        /**
         * Time in milliseconds to elapse for the next poll.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default JiraEndpointProducerBuilder delay(Integer delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * Time in milliseconds to elapse for the next poll.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default JiraEndpointProducerBuilder delay(String delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * The Jira server url, example: http://my_jira.com:8081.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JiraEndpointProducerBuilder jiraUrl(String jiraUrl) {
            setProperty("jiraUrl", jiraUrl);
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
        public default JiraEndpointProducerBuilder lazyStartProducer(
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
        public default JiraEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * (OAuth only) The access token generated by the Jira server.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointProducerBuilder accessToken(
                String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * (OAuth only) The consumer key from Jira settings.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointProducerBuilder consumerKey(
                String consumerKey) {
            setProperty("consumerKey", consumerKey);
            return this;
        }
        /**
         * (Basic authentication only) The password to authenticate to the Jira
         * server. Use only if username basic authentication is used.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * (OAuth only) The private key generated by the client to encrypt the
         * conversation to the server.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointProducerBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * (Basic authentication only) The username to authenticate to the Jira
         * server. Use only if OAuth is not enabled on the Jira server. Do not
         * set the username and OAuth token parameter, if they are both set, the
         * username basic authentication takes precedence.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointProducerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * (OAuth only) The verification code from Jira generated in the first
         * step of the authorization proccess.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointProducerBuilder verificationCode(
                String verificationCode) {
            setProperty("verificationCode", verificationCode);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Jira component.
     */
    public interface AdvancedJiraEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default JiraEndpointProducerBuilder basic() {
            return (JiraEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedJiraEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedJiraEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedJiraEndpointProducerBuilder synchronous(
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
        public default AdvancedJiraEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Jira component.
     */
    public static interface JiraEndpointBuilder
            extends
                JiraEndpointConsumerBuilder, JiraEndpointProducerBuilder {
        public default AdvancedJiraEndpointBuilder advanced() {
            return (AdvancedJiraEndpointBuilder) this;
        }
        /**
         * Operation to perform. Consumers: NewIssues, NewComments. Producers:
         * AddIssue, AttachFile, DeleteIssue, TransitionIssue, UpdateIssue,
         * Watchers. See this class javadoc description for more information.
         * The option is a <code>org.apache.camel.component.jira.JiraType</code>
         * type.
         * @group common
         */
        public default JiraEndpointBuilder type(JiraType type) {
            setProperty("type", type);
            return this;
        }
        /**
         * Operation to perform. Consumers: NewIssues, NewComments. Producers:
         * AddIssue, AttachFile, DeleteIssue, TransitionIssue, UpdateIssue,
         * Watchers. See this class javadoc description for more information.
         * The option will be converted to a
         * <code>org.apache.camel.component.jira.JiraType</code> type.
         * @group common
         */
        public default JiraEndpointBuilder type(String type) {
            setProperty("type", type);
            return this;
        }
        /**
         * Time in milliseconds to elapse for the next poll.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default JiraEndpointBuilder delay(Integer delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * Time in milliseconds to elapse for the next poll.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default JiraEndpointBuilder delay(String delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * The Jira server url, example: http://my_jira.com:8081.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JiraEndpointBuilder jiraUrl(String jiraUrl) {
            setProperty("jiraUrl", jiraUrl);
            return this;
        }
        /**
         * (OAuth only) The access token generated by the Jira server.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointBuilder accessToken(String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * (OAuth only) The consumer key from Jira settings.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointBuilder consumerKey(String consumerKey) {
            setProperty("consumerKey", consumerKey);
            return this;
        }
        /**
         * (Basic authentication only) The password to authenticate to the Jira
         * server. Use only if username basic authentication is used.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * (OAuth only) The private key generated by the client to encrypt the
         * conversation to the server.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * (Basic authentication only) The username to authenticate to the Jira
         * server. Use only if OAuth is not enabled on the Jira server. Do not
         * set the username and OAuth token parameter, if they are both set, the
         * username basic authentication takes precedence.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * (OAuth only) The verification code from Jira generated in the first
         * step of the authorization proccess.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        public default JiraEndpointBuilder verificationCode(
                String verificationCode) {
            setProperty("verificationCode", verificationCode);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Jira component.
     */
    public static interface AdvancedJiraEndpointBuilder
            extends
                AdvancedJiraEndpointConsumerBuilder, AdvancedJiraEndpointProducerBuilder {
        public default JiraEndpointBuilder basic() {
            return (JiraEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedJiraEndpointBuilder basicPropertyBinding(
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
        public default AdvancedJiraEndpointBuilder basicPropertyBinding(
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
        public default AdvancedJiraEndpointBuilder synchronous(
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
        public default AdvancedJiraEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.jira.JiraType</code>
     * enum.
     */
    public static enum JiraType {
        ADDCOMMENT, ADDISSUE, ATTACH, DELETEISSUE, NEWISSUES, NEWCOMMENTS, UPDATEISSUE, TRANSITIONISSUE, WATCHERS;
    }
    /**
     * The jira component interacts with the JIRA issue tracker. Creates a
     * builder to build endpoints for the Jira component.
     */
    public default JiraEndpointBuilder jira(String path) {
        class JiraEndpointBuilderImpl extends AbstractEndpointBuilder implements JiraEndpointBuilder, AdvancedJiraEndpointBuilder {
            public JiraEndpointBuilderImpl(String path) {
                super("jira", path);
            }
        }
        return new JiraEndpointBuilderImpl(path);
    }
}