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

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;

/**
 * The rss component is used for consuming RSS feeds.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RssEndpointBuilderFactory {


    /**
     * Builder for endpoint for the RSS component.
     */
    public interface RssEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedRssEndpointBuilder advanced() {
            return (AdvancedRssEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Sets whether to add the feed object as a header.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder feedHeader(boolean feedHeader) {
            doSetProperty("feedHeader", feedHeader);
            return this;
        }
        /**
         * Sets whether to add the feed object as a header.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder feedHeader(String feedHeader) {
            doSetProperty("feedHeader", feedHeader);
            return this;
        }
        /**
         * Sets whether to use filtering or not of the entries.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder filter(boolean filter) {
            doSetProperty("filter", filter);
            return this;
        }
        /**
         * Sets whether to use filtering or not of the entries.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder filter(String filter) {
            doSetProperty("filter", filter);
            return this;
        }
        /**
         * Sets the timestamp to be used for filtering entries from the atom
         * feeds. This options is only in conjunction with the splitEntries.
         * 
         * The option is a: <code>java.util.Date</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder lastUpdate(Date lastUpdate) {
            doSetProperty("lastUpdate", lastUpdate);
            return this;
        }
        /**
         * Sets the timestamp to be used for filtering entries from the atom
         * feeds. This options is only in conjunction with the splitEntries.
         * 
         * The option will be converted to a <code>java.util.Date</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder lastUpdate(String lastUpdate) {
            doSetProperty("lastUpdate", lastUpdate);
            return this;
        }
        /**
         * Sets the password to be used for basic authentication when polling
         * from a HTTP feed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * Sets whether to sort entries by published date. Only works when
         * splitEntries = true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder sortEntries(boolean sortEntries) {
            doSetProperty("sortEntries", sortEntries);
            return this;
        }
        /**
         * Sets whether to sort entries by published date. Only works when
         * splitEntries = true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder sortEntries(String sortEntries) {
            doSetProperty("sortEntries", sortEntries);
            return this;
        }
        /**
         * Sets whether or not entries should be sent individually or whether
         * the entire feed should be sent as a single message.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder splitEntries(boolean splitEntries) {
            doSetProperty("splitEntries", splitEntries);
            return this;
        }
        /**
         * Sets whether or not entries should be sent individually or whether
         * the entire feed should be sent as a single message.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder splitEntries(String splitEntries) {
            doSetProperty("splitEntries", splitEntries);
            return this;
        }
        /**
         * Sets whether all entries identified in a single feed poll should be
         * delivered immediately. If true, only one entry is processed per
         * consumer.delay. Only applicable when splitEntries = true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder throttleEntries(boolean throttleEntries) {
            doSetProperty("throttleEntries", throttleEntries);
            return this;
        }
        /**
         * Sets whether all entries identified in a single feed poll should be
         * delivered immediately. If true, only one entry is processed per
         * consumer.delay. Only applicable when splitEntries = true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder throttleEntries(String throttleEntries) {
            doSetProperty("throttleEntries", throttleEntries);
            return this;
        }
        /**
         * Sets the username to be used for basic authentication when polling
         * from a HTTP feed.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RssEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder backoffIdleThreshold(int backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder backoffMultiplier(int backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder backoffMultiplier(String backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder greedy(boolean greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder greedy(String greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder repeatCount(long repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder repeatCount(String repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option is a: <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder runLoggingLevel(LoggingLevel runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder runLoggingLevel(String runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option is a:
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder scheduler(String scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            doSetProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder schedulerProperties(
                String schedulerProperties) {
            doSetProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder startScheduler(boolean startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder startScheduler(String startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option is a: <code>java.util.concurrent.TimeUnit</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder timeUnit(TimeUnit timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.TimeUnit</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder timeUnit(String timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder useFixedDelay(boolean useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default RssEndpointBuilder useFixedDelay(String useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the RSS component.
     */
    public interface AdvancedRssEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default RssEndpointBuilder basic() {
            return (RssEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRssEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRssEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRssEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRssEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRssEndpointBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRssEndpointBuilder pollStrategy(String pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedRssEndpointBuilder basicPropertyBinding(
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
        default AdvancedRssEndpointBuilder basicPropertyBinding(
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
        default AdvancedRssEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedRssEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * RSS (camel-rss)
     * The rss component is used for consuming RSS feeds.
     * 
     * Category: rss
     * Available as of version: 2.0
     * Maven coordinates: org.apache.camel:camel-rss
     * 
     * Syntax: <code>rss:feedUri</code>
     * 
     * Path parameter: feedUri (required)
     * The URI to the feed to poll.
     */
    default RssEndpointBuilder rss(String path) {
        class RssEndpointBuilderImpl extends AbstractEndpointBuilder implements RssEndpointBuilder, AdvancedRssEndpointBuilder {
            public RssEndpointBuilderImpl(String path) {
                super("rss", path);
            }
        }
        return new RssEndpointBuilderImpl(path);
    }
}