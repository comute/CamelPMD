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
import org.apache.camel.component.yammer.YammerComponent;

/**
 * The yammer component allows you to interact with the Yammer enterprise social
 * network.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface YammerComponentBuilderFactory {

    /**
     * Yammer (camel-yammer)
     * The yammer component allows you to interact with the Yammer enterprise
     * social network.
     * 
     * Category: social
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-yammer
     */
    static YammerComponentBuilder yammer() {
        return new YammerComponentBuilderImpl();
    }

    /**
     * Builder for the Yammer component.
     */
    interface YammerComponentBuilder
            extends
                ComponentBuilder<YammerComponent> {
        /**
         * The consumer key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default YammerComponentBuilder consumerKey(java.lang.String consumerKey) {
            doSetProperty("consumerKey", consumerKey);
            return this;
        }
        /**
         * The consumer secret.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default YammerComponentBuilder consumerSecret(
                java.lang.String consumerSecret) {
            doSetProperty("consumerSecret", consumerSecret);
            return this;
        }
        /**
         * The access token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default YammerComponentBuilder accessToken(java.lang.String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * To use a shared yammer configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.yammer.YammerConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default YammerComponentBuilder config(
                org.apache.camel.component.yammer.YammerConfiguration config) {
            doSetProperty("config", config);
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
        default YammerComponentBuilder basicPropertyBinding(
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
        default YammerComponentBuilder lazyStartProducer(
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
        default YammerComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class YammerComponentBuilderImpl
            extends
                AbstractComponentBuilder<YammerComponent>
            implements
                YammerComponentBuilder {
        @Override
        protected YammerComponent buildConcreteComponent() {
            return new YammerComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "consumerKey": ((YammerComponent) component).setConsumerKey((java.lang.String) value); return true;
            case "consumerSecret": ((YammerComponent) component).setConsumerSecret((java.lang.String) value); return true;
            case "accessToken": ((YammerComponent) component).setAccessToken((java.lang.String) value); return true;
            case "config": ((YammerComponent) component).setConfig((org.apache.camel.component.yammer.YammerConfiguration) value); return true;
            case "basicPropertyBinding": ((YammerComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((YammerComponent) component).setLazyStartProducer((boolean) value); return true;
            case "bridgeErrorHandler": ((YammerComponent) component).setBridgeErrorHandler((boolean) value); return true;
            default: return false;
            }
        }
    }
}