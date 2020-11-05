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
package org.apache.camel.language.datasonnet;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionsInJavaTest extends CamelTestSupport {
    @EndpointInject("mock:direct:response")
    protected MockEndpoint endEndpoint;

    @Produce("direct:expressionsInJava")
    protected ProducerTemplate expressionsInJavaProducer;

    @Produce("direct:chainExpressions")
    protected ProducerTemplate chainExpressionsProducer;

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:chainExpressions")
                        .setHeader("ScriptHeader", constant("{ hello: \"World\"}"))
                        .setBody(datasonnet(simple("${header.ScriptHeader}", String.class)))
                        .to("mock:direct:response");

                from("direct:expressionsInJava")
                                .choice()
                                    .when(datasonnet("payload == 'World'"))
                                        .setBody(datasonnet("'Hello, ' + payload", String.class))
                                    .otherwise()
                                        .setBody(datasonnet("'Good bye, ' + payload", String.class))
                                    .end()
                                .to("mock:direct:response");
            }
        };
    }

    @Test
    public void testExpressionLanguageInJava() throws Exception {
        endEndpoint.expectedMessageCount(1);
        expressionsInJavaProducer.sendBody("World");
        Exchange exchange = endEndpoint.assertExchangeReceived(endEndpoint.getReceivedCounter() - 1);
        String response = exchange.getIn().getBody().toString();
        assertEquals("Hello, World", response);
    }

    @Test
    public void testChainExpressions() throws Exception {
        endEndpoint.expectedMessageCount(1);
        chainExpressionsProducer.sendBody("{}");
        Exchange exchange = endEndpoint.assertExchangeReceived(endEndpoint.getReceivedCounter() - 1);
        String response = exchange.getIn().getBody().toString();
        JSONAssert.assertEquals("{\"hello\":\"World\"}", response, true);
    }
}
