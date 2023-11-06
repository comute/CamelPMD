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

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Fetch, load and manage additional jars dynamically after Camel Context was
 * started.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GrapeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Grape component.
     */
    public interface GrapeEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedGrapeEndpointBuilder advanced() {
            return (AdvancedGrapeEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Grape component.
     */
    public interface AdvancedGrapeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default GrapeEndpointBuilder basic() {
            return (GrapeEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedGrapeEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedGrapeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface GrapeBuilders {
        /**
         * Grape (camel-grape)
         * Fetch, load and manage additional jars dynamically after Camel
         * Context was started.
         * 
         * Category: management,deployment
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-grape
         * 
         * @return the dsl builder for the headers' name.
         */
        default GrapeHeaderNameBuilder grape() {
            return GrapeHeaderNameBuilder.INSTANCE;
        }
        /**
         * Grape (camel-grape)
         * Fetch, load and manage additional jars dynamically after Camel
         * Context was started.
         * 
         * Category: management,deployment
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-grape
         * 
         * Syntax: <code>grape:defaultCoordinates</code>
         * 
         * Path parameter: defaultCoordinates (required)
         * Maven coordinates to use as default to grab if the message body is
         * empty.
         * 
         * @param path defaultCoordinates
         * @return the dsl builder
         */
        default GrapeEndpointBuilder grape(String path) {
            return GrapeEndpointBuilderFactory.endpointBuilder("grape", path);
        }
        /**
         * Grape (camel-grape)
         * Fetch, load and manage additional jars dynamically after Camel
         * Context was started.
         * 
         * Category: management,deployment
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-grape
         * 
         * Syntax: <code>grape:defaultCoordinates</code>
         * 
         * Path parameter: defaultCoordinates (required)
         * Maven coordinates to use as default to grab if the message body is
         * empty.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path defaultCoordinates
         * @return the dsl builder
         */
        default GrapeEndpointBuilder grape(String componentName, String path) {
            return GrapeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Grape component.
     */
    public static class GrapeHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final GrapeHeaderNameBuilder INSTANCE = new GrapeHeaderNameBuilder();

        /**
         * The command to be performed by the Grape endpoint.
         * 
         * The option is a: {@code
         * org.apache.camel.component.grape.GrapeCommand} type.
         * 
         * Default: grab
         * Group: producer
         * 
         * @return the name of the header {@code GrapeCommand}.
         */
        public String grapeCommand() {
            return "CamelGrapeCommand";
        }
    }
    static GrapeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class GrapeEndpointBuilderImpl extends AbstractEndpointBuilder implements GrapeEndpointBuilder, AdvancedGrapeEndpointBuilder {
            public GrapeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new GrapeEndpointBuilderImpl(path);
    }
}