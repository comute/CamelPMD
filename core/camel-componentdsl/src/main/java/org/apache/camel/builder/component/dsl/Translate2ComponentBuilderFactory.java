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
import org.apache.camel.component.aws2.translate.Translate2Component;

/**
 * The aws2-translate component is used for managing Amazon Translate
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Translate2ComponentBuilderFactory {

    /**
     * AWS 2 Translate (camel-aws2-translate)
     * The aws2-translate component is used for managing Amazon Translate
     * 
     * Category: cloud,management
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-translate
     */
    static Translate2ComponentBuilder aws2Translate() {
        return new Translate2ComponentBuilderImpl();
    }

    /**
     * Builder for the AWS 2 Translate component.
     */
    interface Translate2ComponentBuilder
            extends
                ComponentBuilder<Translate2Component> {
        /**
         * The AWS Translate default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.translate.Translate2Configuration</code> type.
         * 
         * Group: advanced
         */
        default Translate2ComponentBuilder configuration(
                org.apache.camel.component.aws2.translate.Translate2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2ComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2ComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * The region in which Translate client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2ComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
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
        default Translate2ComponentBuilder basicPropertyBinding(
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
        default Translate2ComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class Translate2ComponentBuilderImpl
            extends
                AbstractComponentBuilder<Translate2Component>
            implements
                Translate2ComponentBuilder {
        @Override
        protected Translate2Component buildConcreteComponent() {
            return new Translate2Component();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((Translate2Component) component).setConfiguration((org.apache.camel.component.aws2.translate.Translate2Configuration) value); return true;
            case "accessKey": ((Translate2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": ((Translate2Component) component).setSecretKey((java.lang.String) value); return true;
            case "region": ((Translate2Component) component).setRegion((java.lang.String) value); return true;
            case "basicPropertyBinding": ((Translate2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((Translate2Component) component).setLazyStartProducer((boolean) value); return true;
            default: return false;
            }
        }
    }
}