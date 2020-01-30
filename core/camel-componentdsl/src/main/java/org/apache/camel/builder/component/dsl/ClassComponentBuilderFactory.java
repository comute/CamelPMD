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
import org.apache.camel.component.beanclass.ClassComponent;

/**
 * The Class component is for invoking Java classes (Java beans) from Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ClassComponentBuilderFactory {

    /**
     * Class (camel-bean)
     * The Class component is for invoking Java classes (Java beans) from Camel.
     * 
     * Category: core,java
     * Since: 2.4
     * Maven coordinates: org.apache.camel:camel-bean
     */
    static ClassComponentBuilder clas() {
        return new ClassComponentBuilderImpl();
    }

    /**
     * Builder for the Class component.
     */
    interface ClassComponentBuilder extends ComponentBuilder<ClassComponent> {
        /**
         * Use singleton option instead.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        @Deprecated
        default ClassComponentBuilder cache(java.lang.Boolean cache) {
            doSetProperty("cache", cache);
            return this;
        }
        /**
         * Scope of bean. When using singleton scope (default) the bean is
         * created or looked up only once and reused for the lifetime of the
         * endpoint. The bean should be thread-safe in case concurrent threads
         * is calling the bean at the same time. When using request scope the
         * bean is created or looked up once per request (exchange). This can be
         * used if you want to store state on a bean while processing a request
         * and you want to call the same bean instance multiple times while
         * processing the request. The bean does not have to be thread-safe as
         * the instance is only called from the same request. When using
         * delegate scope, then the bean will be looked up or created per call.
         * However in case of lookup then this is delegated to the bean registry
         * such as Spring or CDI (if in use), which depends on their
         * configuration can act as either singleton or prototype scope. so when
         * using prototype then this depends on the delegated registry.
         * 
         * The option is a: <code>org.apache.camel.BeanScope</code> type.
         * 
         * Default: Singleton
         * Group: producer
         */
        default ClassComponentBuilder scope(org.apache.camel.BeanScope scope) {
            doSetProperty("scope", scope);
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
        default ClassComponentBuilder basicPropertyBinding(
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
        default ClassComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class ClassComponentBuilderImpl
            extends
                AbstractComponentBuilder<ClassComponent>
            implements
                ClassComponentBuilder {
        @Override
        protected ClassComponent buildConcreteComponent() {
            return new ClassComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "cache": ((ClassComponent) component).setCache((java.lang.Boolean) value); return true;
            case "scope": ((ClassComponent) component).setScope((org.apache.camel.BeanScope) value); return true;
            case "basicPropertyBinding": ((ClassComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((ClassComponent) component).setLazyStartProducer((boolean) value); return true;
            default: return false;
            }
        }
    }
}