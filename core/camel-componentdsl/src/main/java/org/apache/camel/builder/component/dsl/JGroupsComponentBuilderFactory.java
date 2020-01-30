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
import org.apache.camel.component.jgroups.JGroupsComponent;

/**
 * The jgroups component provides exchange of messages between Camel and JGroups
 * clusters.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JGroupsComponentBuilderFactory {

    /**
     * JGroups (camel-jgroups)
     * The jgroups component provides exchange of messages between Camel and
     * JGroups clusters.
     * 
     * Category: clustering,messaging
     * Since: 2.13
     * Maven coordinates: org.apache.camel:camel-jgroups
     */
    static JGroupsComponentBuilder jgroups() {
        return new JGroupsComponentBuilderImpl();
    }

    /**
     * Builder for the JGroups component.
     */
    interface JGroupsComponentBuilder
            extends
                ComponentBuilder<JGroupsComponent> {
        /**
         * Channel to use.
         * 
         * The option is a: <code>org.jgroups.JChannel</code> type.
         * 
         * Group: common
         */
        default JGroupsComponentBuilder channel(org.jgroups.JChannel channel) {
            doSetProperty("channel", channel);
            return this;
        }
        /**
         * Specifies configuration properties of the JChannel used by the
         * endpoint.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default JGroupsComponentBuilder channelProperties(
                java.lang.String channelProperties) {
            doSetProperty("channelProperties", channelProperties);
            return this;
        }
        /**
         * If set to true, the consumer endpoint will receive org.jgroups.View
         * messages as well (not only org.jgroups.Message instances). By default
         * only regular messages are consumed by the endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default JGroupsComponentBuilder enableViewMessages(
                boolean enableViewMessages) {
            doSetProperty("enableViewMessages", enableViewMessages);
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
        default JGroupsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default JGroupsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default JGroupsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class JGroupsComponentBuilderImpl
            extends
                AbstractComponentBuilder<JGroupsComponent>
            implements
                JGroupsComponentBuilder {
        @Override
        protected JGroupsComponent buildConcreteComponent() {
            return new JGroupsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "channel": ((JGroupsComponent) component).setChannel((org.jgroups.JChannel) value); return true;
            case "channelProperties": ((JGroupsComponent) component).setChannelProperties((java.lang.String) value); return true;
            case "enableViewMessages": ((JGroupsComponent) component).setEnableViewMessages((boolean) value); return true;
            case "basicPropertyBinding": ((JGroupsComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((JGroupsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "bridgeErrorHandler": ((JGroupsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            default: return false;
            }
        }
    }
}