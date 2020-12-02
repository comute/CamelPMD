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
import org.apache.camel.component.spark.SparkComponent;

/**
 * Send RDD or DataFrame jobs to Apache Spark clusters.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SparkComponentBuilderFactory {

    /**
     * Spark (camel-spark)
     * Send RDD or DataFrame jobs to Apache Spark clusters.
     * 
     * Category: bigdata,iot
     * Since: 2.17
     * Maven coordinates: org.apache.camel:camel-spark
     */
    static SparkComponentBuilder spark() {
        return new SparkComponentBuilderImpl();
    }

    /**
     * Builder for the Spark component.
     */
    interface SparkComponentBuilder extends ComponentBuilder<SparkComponent> {
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
        default SparkComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * RDD to compute against.
         * 
         * The option is a: <code>org.apache.spark.api.java.JavaRDDLike</code>
         * type.
         * 
         * Group: producer
         */
        default SparkComponentBuilder rdd(
                org.apache.spark.api.java.JavaRDDLike rdd) {
            doSetProperty("rdd", rdd);
            return this;
        }
        /**
         * Function performing action against an RDD.
         * 
         * The option is a:
         * <code>org.apache.camel.component.spark.RddCallback</code> type.
         * 
         * Group: producer
         */
        default SparkComponentBuilder rddCallback(
                org.apache.camel.component.spark.RddCallback rddCallback) {
            doSetProperty("rddCallback", rddCallback);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default SparkComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class SparkComponentBuilderImpl
            extends
                AbstractComponentBuilder<SparkComponent>
            implements
                SparkComponentBuilder {
        @Override
        protected SparkComponent buildConcreteComponent() {
            return new SparkComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((SparkComponent) component).setLazyStartProducer((boolean) value); return true;
            case "rdd": ((SparkComponent) component).setRdd((org.apache.spark.api.java.JavaRDDLike) value); return true;
            case "rddCallback": ((SparkComponent) component).setRddCallback((org.apache.camel.component.spark.RddCallback) value); return true;
            case "autowiredEnabled": ((SparkComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}