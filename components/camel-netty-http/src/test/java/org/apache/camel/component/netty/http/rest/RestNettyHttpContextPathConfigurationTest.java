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
package org.apache.camel.component.netty.http.rest;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.netty.http.BaseNettyTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestNettyHttpContextPathConfigurationTest extends BaseNettyTest {

    @Test
    public void testProducerGet() throws Exception {
        String out = template.requestBody("netty-http:http://localhost:{{port}}/rest/users/123", null, String.class);
        assertEquals("123;Donald Duck", out);

        out = template.requestBody("netty-http:http://localhost:{{port}}/rest/users/list", null, String.class);
        assertEquals("123;Donald Duck\n456;John Doe", out);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                // configure to use netty-http on localhost with the given port
                restConfiguration().component("netty-http").contextPath("/rest").host("localhost").port(getPort());

                // use the rest DSL to define the rest services
                rest("/users/")
                        .get("{id}")
                        .route()
                        .to("mock:input")
                        .process(exchange -> {
                            String id = exchange.getIn().getHeader("id", String.class);
                            exchange.getMessage().setBody(id + ";Donald Duck");
                        })
                        .endRest()
                        .get("list")
                        .route()
                        .to("mock:input")
                        .process(exchange -> exchange.getMessage().setBody("123;Donald Duck\n456;John Doe"));
            }
        };
    }

}
