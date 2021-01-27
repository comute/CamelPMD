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
import org.apache.camel.component.stitch.StitchComponent;

/**
 * Stitch is a cloud ETL service that integrates various data sources into a
 * central data warehouse through various integrations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface StitchComponentBuilderFactory {

    /**
     * Stitch (camel-stitch)
     * Stitch is a cloud ETL service that integrates various data sources into a
     * central data warehouse through various integrations.
     * 
     * Category: cloud,api,compute,bigdata
     * Since: 3.8
     * Maven coordinates: org.apache.camel:camel-stitch
     * 
     * @return the dsl builder
     */
    static StitchComponentBuilder stitch() {
        return new StitchComponentBuilderImpl();
    }

    /**
     * Builder for the Stitch component.
     */
    interface StitchComponentBuilder
            extends
                ComponentBuilder<StitchComponent> {
        /**
         * The component configurations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.stitch.StitchConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder configuration(
                org.apache.camel.component.stitch.StitchConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * A collection of comma separated strings representing the Primary Key
         * fields in the source table. Stitch use these Primary Keys to de-dupe
         * data during loading If not provided, the table will be loaded in an
         * append-only manner.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyNames the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder keyNames(java.lang.String keyNames) {
            doSetProperty("keyNames", keyNames);
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
        default StitchComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Stitch account region, e.g: europe.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.stitch.client.StitchRegion&lt;/code&gt; type.
         * 
         * Default: europe
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder region(
                org.apache.camel.component.stitch.client.StitchRegion region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * A schema that describes the record(s).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.stitch.client.models.StitchSchema&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param stitchSchema the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder stitchSchema(
                org.apache.camel.component.stitch.client.models.StitchSchema stitchSchema) {
            doSetProperty("stitchSchema", stitchSchema);
            return this;
        }
        /**
         * ConnectionProvider contain configuration for the HttpClient like
         * Maximum connection limit .. etc, you can inject this
         * ConnectionProvider and the StitchClient will initialize HttpClient
         * with this ConnectionProvider.
         * 
         * The option is a:
         * &lt;code&gt;reactor.netty.resources.ConnectionProvider&lt;/code&gt;
         * type.
         * 
         * Group: producer (advanced)
         * 
         * @param connectionProvider the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder connectionProvider(
                reactor.netty.resources.ConnectionProvider connectionProvider) {
            doSetProperty("connectionProvider", connectionProvider);
            return this;
        }
        /**
         * Reactor Netty HttpClient, you can injected it if you want to have
         * custom HttpClient.
         * 
         * The option is a:
         * &lt;code&gt;reactor.netty.http.client.HttpClient&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param httpClient the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder httpClient(
                reactor.netty.http.client.HttpClient httpClient) {
            doSetProperty("httpClient", httpClient);
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
        default StitchComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Set a custom StitchClient that implements
         * org.apache.camel.component.stitch.client.StitchClient interface.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.stitch.client.StitchClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param stitchClient the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder stitchClient(
                org.apache.camel.component.stitch.client.StitchClient stitchClient) {
            doSetProperty("stitchClient", stitchClient);
            return this;
        }
        /**
         * Stitch access token for the Stitch Import API.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default StitchComponentBuilder token(java.lang.String token) {
            doSetProperty("token", token);
            return this;
        }
    }

    class StitchComponentBuilderImpl
            extends
                AbstractComponentBuilder<StitchComponent>
            implements
                StitchComponentBuilder {
        @Override
        protected StitchComponent buildConcreteComponent() {
            return new StitchComponent();
        }
        private org.apache.camel.component.stitch.StitchConfiguration getOrCreateConfiguration(
                org.apache.camel.component.stitch.StitchComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.stitch.StitchConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((StitchComponent) component).setConfiguration((org.apache.camel.component.stitch.StitchConfiguration) value); return true;
            case "keyNames": getOrCreateConfiguration((StitchComponent) component).setKeyNames((java.lang.String) value); return true;
            case "lazyStartProducer": ((StitchComponent) component).setLazyStartProducer((boolean) value); return true;
            case "region": getOrCreateConfiguration((StitchComponent) component).setRegion((org.apache.camel.component.stitch.client.StitchRegion) value); return true;
            case "stitchSchema": getOrCreateConfiguration((StitchComponent) component).setStitchSchema((org.apache.camel.component.stitch.client.models.StitchSchema) value); return true;
            case "connectionProvider": getOrCreateConfiguration((StitchComponent) component).setConnectionProvider((reactor.netty.resources.ConnectionProvider) value); return true;
            case "httpClient": getOrCreateConfiguration((StitchComponent) component).setHttpClient((reactor.netty.http.client.HttpClient) value); return true;
            case "autowiredEnabled": ((StitchComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "stitchClient": getOrCreateConfiguration((StitchComponent) component).setStitchClient((org.apache.camel.component.stitch.client.StitchClient) value); return true;
            case "token": getOrCreateConfiguration((StitchComponent) component).setToken((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}