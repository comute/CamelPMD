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
package org.apache.camel.component.mina;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test to verify that MINA can be used with an InOut MEP but still use sync to send and receive data from a remote
 * server and using MAC textline delimiter.
 */
public class MinaInOutRouteTextLineDelimiterTest extends BaseMinaTest {

    @Test
    public void testInOutUsingMina() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Bye Chad");
        // we should preserve headers
        mock.setResultWaitTime(5000);

        Object out = template.requestBody(
                String.format("mina:tcp://localhost:%1$s?sync=true&textline=true&textlineDelimiter=MAC", getPort()), "Chad");

        MockEndpoint.assertIsSatisfied(context);
        assertEquals("Bye Chad", out);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {

            public void configure() {
                fromF("mina:tcp://localhost:%1$s?sync=true&textline=true&textlineDelimiter=MAC", getPort())
                        .process(exchange -> {
                            String body = exchange.getIn().getBody(String.class);
                            exchange.getMessage().setBody("Bye " + body);
                        }).to("mock:result");
            }
        };
    }
}
