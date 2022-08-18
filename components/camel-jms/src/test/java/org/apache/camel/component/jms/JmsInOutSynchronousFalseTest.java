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
package org.apache.camel.component.jms;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.infra.activemq.services.ActiveMQService;
import org.apache.camel.test.infra.activemq.services.ActiveMQServiceFactory;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.apache.camel.component.jms.JmsComponent.jmsComponentAutoAcknowledge;
import static org.apache.camel.test.infra.activemq.common.ConnectionFactoryHelper.createConnectionFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@Tags({ @Tag("not-parallel") })
@Timeout(60)
public class JmsInOutSynchronousFalseTest extends CamelTestSupport {

    private static String beforeThreadName;
    private static String afterThreadName;

    @RegisterExtension
    public ActiveMQService service = ActiveMQServiceFactory.createVMService();

    private final String url = "activemq:queue:JmsInOutSynchronousFalseTest?synchronous=false";

    private String reply;

    @BeforeEach
    public void sendMessage() {
        reply = template.requestBody("direct:start", "Hello World", String.class);
    }

    @Timeout(30)
    @Test
    public void testSynchronous() {
        assertEquals("Bye World", reply);
        assertFalse(beforeThreadName.equalsIgnoreCase(afterThreadName), "Should use different threads");
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();
        ConnectionFactory connectionFactory = createConnectionFactory(service);
        camelContext.addComponent("activemq", jmsComponentAutoAcknowledge(connectionFactory));
        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:start")
                        .to("log:before")
                        .process(exchange -> beforeThreadName = Thread.currentThread().getName())
                        .to(url)
                        .process(exchange -> afterThreadName = Thread.currentThread().getName())
                        .to("log:after")
                        .to("mock:result");

                from("activemq:queue:JmsInOutSynchronousFalseTest")
                        .process(exchange -> exchange.getMessage().setBody("Bye World"));
            }
        };
    }

}
