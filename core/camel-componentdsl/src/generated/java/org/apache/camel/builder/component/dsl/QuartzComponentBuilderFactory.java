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
import org.apache.camel.component.quartz.QuartzComponent;

/**
 * Schedule sending of messages using the Quartz 2.x scheduler.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface QuartzComponentBuilderFactory {

    /**
     * Quartz (camel-quartz)
     * Schedule sending of messages using the Quartz 2.x scheduler.
     * 
     * Category: scheduling
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-quartz
     */
    static QuartzComponentBuilder quartz() {
        return new QuartzComponentBuilderImpl();
    }

    /**
     * Builder for the Quartz component.
     */
    interface QuartzComponentBuilder
            extends
                ComponentBuilder<QuartzComponent> {
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
         * Default: false
         * Group: consumer
         */
        default QuartzComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether to enable Quartz JMX which allows to manage the Quartz
         * scheduler from JMX. This options is default true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default QuartzComponentBuilder enableJmx(boolean enableJmx) {
            doSetProperty("enableJmx", enableJmx);
            return this;
        }
        /**
         * Whether to prefix the Quartz Scheduler instance name with the
         * CamelContext name. This is enabled by default, to let each
         * CamelContext use its own Quartz scheduler instance by default. You
         * can set this option to false to reuse Quartz scheduler instances
         * between multiple CamelContext's.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default QuartzComponentBuilder prefixInstanceName(
                boolean prefixInstanceName) {
            doSetProperty("prefixInstanceName", prefixInstanceName);
            return this;
        }
        /**
         * Whether to prefix the quartz job with the endpoint id. This option is
         * default false.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default QuartzComponentBuilder prefixJobNameWithEndpointId(
                boolean prefixJobNameWithEndpointId) {
            doSetProperty("prefixJobNameWithEndpointId", prefixJobNameWithEndpointId);
            return this;
        }
        /**
         * Properties to configure the Quartz scheduler.
         * 
         * The option is a: <code>java.util.Map</code> type.
         * 
         * Group: consumer
         */
        default QuartzComponentBuilder properties(java.util.Map properties) {
            doSetProperty("properties", properties);
            return this;
        }
        /**
         * File name of the properties to load from the classpath.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default QuartzComponentBuilder propertiesFile(
                java.lang.String propertiesFile) {
            doSetProperty("propertiesFile", propertiesFile);
            return this;
        }
        /**
         * References to an existing Properties or Map to lookup in the registry
         * to use for configuring quartz.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default QuartzComponentBuilder propertiesRef(
                java.lang.String propertiesRef) {
            doSetProperty("propertiesRef", propertiesRef);
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
        default QuartzComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use the custom configured Quartz scheduler, instead of creating a
         * new Scheduler.
         * 
         * The option is a: <code>org.quartz.Scheduler</code> type.
         * 
         * Group: advanced
         */
        default QuartzComponentBuilder scheduler(org.quartz.Scheduler scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To use the custom SchedulerFactory which is used to create the
         * Scheduler.
         * 
         * The option is a: <code>org.quartz.SchedulerFactory</code> type.
         * 
         * Group: advanced
         */
        default QuartzComponentBuilder schedulerFactory(
                org.quartz.SchedulerFactory schedulerFactory) {
            doSetProperty("schedulerFactory", schedulerFactory);
            return this;
        }
        /**
         * Whether or not the scheduler should be auto started. This options is
         * default true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: scheduler
         */
        default QuartzComponentBuilder autoStartScheduler(
                boolean autoStartScheduler) {
            doSetProperty("autoStartScheduler", autoStartScheduler);
            return this;
        }
        /**
         * Whether to interrupt jobs on shutdown which forces the scheduler to
         * shutdown quicker and attempt to interrupt any running jobs. If this
         * is enabled then any running jobs can fail due to being interrupted.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: scheduler
         */
        default QuartzComponentBuilder interruptJobsOnShutdown(
                boolean interruptJobsOnShutdown) {
            doSetProperty("interruptJobsOnShutdown", interruptJobsOnShutdown);
            return this;
        }
        /**
         * Seconds to wait before starting the quartz scheduler.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default QuartzComponentBuilder startDelayedSeconds(
                int startDelayedSeconds) {
            doSetProperty("startDelayedSeconds", startDelayedSeconds);
            return this;
        }
    }

    class QuartzComponentBuilderImpl
            extends
                AbstractComponentBuilder<QuartzComponent>
            implements
                QuartzComponentBuilder {
        @Override
        protected QuartzComponent buildConcreteComponent() {
            return new QuartzComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((QuartzComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "enableJmx": ((QuartzComponent) component).setEnableJmx((boolean) value); return true;
            case "prefixInstanceName": ((QuartzComponent) component).setPrefixInstanceName((boolean) value); return true;
            case "prefixJobNameWithEndpointId": ((QuartzComponent) component).setPrefixJobNameWithEndpointId((boolean) value); return true;
            case "properties": ((QuartzComponent) component).setProperties((java.util.Map) value); return true;
            case "propertiesFile": ((QuartzComponent) component).setPropertiesFile((java.lang.String) value); return true;
            case "propertiesRef": ((QuartzComponent) component).setPropertiesRef((java.lang.String) value); return true;
            case "basicPropertyBinding": ((QuartzComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "scheduler": ((QuartzComponent) component).setScheduler((org.quartz.Scheduler) value); return true;
            case "schedulerFactory": ((QuartzComponent) component).setSchedulerFactory((org.quartz.SchedulerFactory) value); return true;
            case "autoStartScheduler": ((QuartzComponent) component).setAutoStartScheduler((boolean) value); return true;
            case "interruptJobsOnShutdown": ((QuartzComponent) component).setInterruptJobsOnShutdown((boolean) value); return true;
            case "startDelayedSeconds": ((QuartzComponent) component).setStartDelayedSeconds((int) value); return true;
            default: return false;
            }
        }
    }
}