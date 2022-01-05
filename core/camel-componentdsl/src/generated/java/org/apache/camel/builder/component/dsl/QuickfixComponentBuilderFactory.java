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
import org.apache.camel.component.quickfixj.QuickfixjComponent;

/**
 * Open a Financial Interchange (FIX) session using an embedded QuickFix/J
 * engine.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface QuickfixComponentBuilderFactory {

    /**
     * QuickFix (camel-quickfix)
     * Open a Financial Interchange (FIX) session using an embedded QuickFix/J
     * engine.
     * 
     * Category: messaging
     * Since: 2.1
     * Maven coordinates: org.apache.camel:camel-quickfix
     * 
     * @return the dsl builder
     */
    static QuickfixComponentBuilder quickfix() {
        return new QuickfixComponentBuilderImpl();
    }

    /**
     * Builder for the QuickFix component.
     */
    interface QuickfixComponentBuilder
            extends
                ComponentBuilder<QuickfixjComponent> {
        /**
         * If set to &lt;code&gt;true, the engines will be created and started
         * when needed (when first message is send).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param lazyCreateEngines the value to set
         * @return the dsl builder
         */
        default QuickfixComponentBuilder lazyCreateEngines(
                boolean lazyCreateEngines) {
            doSetProperty("lazyCreateEngines", lazyCreateEngines);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default QuickfixComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default QuickfixComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default QuickfixComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use the given LogFactory.
         * 
         * The option is a: &lt;code&gt;quickfix.LogFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param logFactory the value to set
         * @return the dsl builder
         */
        default QuickfixComponentBuilder logFactory(
                quickfix.LogFactory logFactory) {
            doSetProperty("logFactory", logFactory);
            return this;
        }
        /**
         * To use the given MessageFactory.
         * 
         * The option is a: &lt;code&gt;quickfix.MessageFactory&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param messageFactory the value to set
         * @return the dsl builder
         */
        default QuickfixComponentBuilder messageFactory(
                quickfix.MessageFactory messageFactory) {
            doSetProperty("messageFactory", messageFactory);
            return this;
        }
        /**
         * To use the given MessageStoreFactory.
         * 
         * The option is a:
         * &lt;code&gt;quickfix.MessageStoreFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param messageStoreFactory the value to set
         * @return the dsl builder
         */
        default QuickfixComponentBuilder messageStoreFactory(
                quickfix.MessageStoreFactory messageStoreFactory) {
            doSetProperty("messageStoreFactory", messageStoreFactory);
            return this;
        }
    }

    class QuickfixComponentBuilderImpl
            extends
                AbstractComponentBuilder<QuickfixjComponent>
            implements
                QuickfixComponentBuilder {
        @Override
        protected QuickfixjComponent buildConcreteComponent() {
            return new QuickfixjComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyCreateEngines": ((QuickfixjComponent) component).setLazyCreateEngines((boolean) value); return true;
            case "bridgeErrorHandler": ((QuickfixjComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((QuickfixjComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((QuickfixjComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "logFactory": ((QuickfixjComponent) component).setLogFactory((quickfix.LogFactory) value); return true;
            case "messageFactory": ((QuickfixjComponent) component).setMessageFactory((quickfix.MessageFactory) value); return true;
            case "messageStoreFactory": ((QuickfixjComponent) component).setMessageStoreFactory((quickfix.MessageStoreFactory) value); return true;
            default: return false;
            }
        }
    }
}