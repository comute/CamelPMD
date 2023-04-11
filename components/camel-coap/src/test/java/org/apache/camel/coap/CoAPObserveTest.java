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
package org.apache.camel.coap;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapResponse;
import org.junit.jupiter.api.Test;

public class CoAPObserveTest extends CoAPTestSupport {

    @Produce("direct:notify")
    protected ProducerTemplate notify;

    @Produce("mock:result")
    protected ProducerTemplate mockResult;

    @Test
    void testCoAPComponent() throws Exception {
        CoapClient client = createClient("/TestResource");
        client.observe(new CoapHandler() {
            @Override
            public void onLoad(CoapResponse response) {
                mockResult.sendBody(response.getResponseText());
            }

            @Override
            public void onError() {
                mockResult.sendBody(null);
            }
        });

        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Hello 0");
        MockEndpoint.assertIsSatisfied(context());
        mock.reset();

        notify.sendBody(null);
        notify.sendBody(null);

        mock.expectedBodiesReceivedInAnyOrder("Hello 1", "Hello 2");
        MockEndpoint.assertIsSatisfied(context());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                AtomicInteger i = new AtomicInteger(0);

                fromF("coap://localhost:%d/TestResource?observable=true", PORT)
                        .process(exchange -> exchange.getMessage().setBody("Hello " + i.getAndIncrement()));

                from("direct:notify")
                        .toF("coap://localhost:%d/TestResource?notify=true", PORT);
            }
        };
    }

}
