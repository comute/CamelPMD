/**
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
package org.apache.camel.component.properties;

import org.apache.camel.CamelContext;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;

public class PropertiesComponentConcatenatePropertiesTest extends ContextTestSupport {
    
    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext context = super.createCamelContext();
        context.addComponent("properties", new PropertiesComponent("classpath:org/apache/camel/component/properties/concatenate.properties"));
        return context;
    }
    
    @Override
    protected void setUp() throws Exception {
        System.setProperty("environment", "junit");
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        System.clearProperty("environment");
        super.tearDown();
    }
    
    public void testConcatPropertiesComponentDefault() throws Exception {
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").setBody(simple("${properties:concat.property}"))
                .to("mock:result");
            }
        });
        context.start();

        getMockEndpoint("mock:result").expectedBodiesReceived("file:dirname");

        template.sendBody("direct:start", "Test");

        assertMockEndpointsSatisfied();
    }
    
    public void testWithoutConcatPropertiesComponentDefault() throws Exception {
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").setBody(simple("${properties:property.complete}"))
                .to("mock:result");
            }
        });
        context.start();

        getMockEndpoint("mock:result").expectedBodiesReceived("file:dirname");

        template.sendBody("direct:start", "Test");

        assertMockEndpointsSatisfied();
    }
    
    public void testWithConcatAndNestedPropertiesComponentDefault() throws Exception {
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").setBody(simple("${properties:concatnest.property}"))
                .to("mock:result");
            }
        });
        context.start();

        getMockEndpoint("mock:result").expectedBodiesReceived("junitpropjunitfile:dirname");

        template.sendBody("direct:start", "Test");

        assertMockEndpointsSatisfied();
    }
    
    public void testWithConcatAndNestedComplexPropertiesComponentDefault() throws Exception {
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").setBody(simple("${properties:complete.property}"))
                .to("mock:result");
            }
        });
        context.start();

        getMockEndpoint("mock:result").expectedBodiesReceived("file.dirname:l.junitprop");

        template.sendBody("direct:start", "Test");

        assertMockEndpointsSatisfied();
    }
    
    public void testWithDottedComplexPropertiesComponentDefault() throws Exception {
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").setBody(simple("${properties:completedotted.property}"))
                .to("mock:result");
            }
        });
        context.start();

        getMockEndpoint("mock:result").expectedBodiesReceived("file.dirname.l");

        template.sendBody("direct:start", "Test");

        assertMockEndpointsSatisfied();
    }

}
