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
import org.apache.camel.component.hazelcast.topic.HazelcastTopicComponent;

/**
 * The hazelcast-topic component is used to access Hazelcast distributed topic.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface HazelcastTopicComponentBuilderFactory {

    /**
     * Hazelcast Topic (camel-hazelcast)
     * The hazelcast-topic component is used to access Hazelcast distributed
     * topic.
     * 
     * Category: cache,datagrid
     * Since: 2.15
     * Maven coordinates: org.apache.camel:camel-hazelcast
     */
    static HazelcastTopicComponentBuilder hazelcastTopic() {
        return new HazelcastTopicComponentBuilderImpl();
    }

    /**
     * Builder for the Hazelcast Topic component.
     */
    interface HazelcastTopicComponentBuilder
            extends
                ComponentBuilder<HazelcastTopicComponent> {
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: advanced
         */
        default HazelcastTopicComponentBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast mode reference which kind of instance should be used.
         * If you don't specify the mode, then the node mode will be the
         * default.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: node
         * Group: advanced
         */
        default HazelcastTopicComponentBuilder hazelcastMode(
                java.lang.String hazelcastMode) {
            doSetProperty("hazelcastMode", hazelcastMode);
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
        default HazelcastTopicComponentBuilder basicPropertyBinding(
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
        default HazelcastTopicComponentBuilder lazyStartProducer(
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
        default HazelcastTopicComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class HazelcastTopicComponentBuilderImpl
            extends
                AbstractComponentBuilder<HazelcastTopicComponent>
            implements
                HazelcastTopicComponentBuilder {
        @Override
        protected HazelcastTopicComponent buildConcreteComponent() {
            return new HazelcastTopicComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "hazelcastInstance": ((HazelcastTopicComponent) component).setHazelcastInstance((com.hazelcast.core.HazelcastInstance) value); return true;
            case "hazelcastMode": ((HazelcastTopicComponent) component).setHazelcastMode((java.lang.String) value); return true;
            case "basicPropertyBinding": ((HazelcastTopicComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((HazelcastTopicComponent) component).setLazyStartProducer((boolean) value); return true;
            case "bridgeErrorHandler": ((HazelcastTopicComponent) component).setBridgeErrorHandler((boolean) value); return true;
            default: return false;
            }
        }
    }
}