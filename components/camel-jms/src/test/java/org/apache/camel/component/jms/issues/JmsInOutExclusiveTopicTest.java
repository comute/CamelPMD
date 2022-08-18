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
package org.apache.camel.component.jms.issues;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.AbstractJMSTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.apache.camel.component.jms.JmsComponent.jmsComponentAutoAcknowledge;
import static org.apache.camel.test.infra.activemq.common.ConnectionFactoryHelper.createConnectionFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tags({ @Tag("not-parallel") })
public class JmsInOutExclusiveTopicTest extends AbstractJMSTest {

    @Test
    public void testJmsInOutExclusiveTopicTest() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Bye Camel");

        String out = template.requestBody("direct:start", "Camel", String.class);
        assertEquals("Bye Camel", out);

        assertMockEndpointsSatisfied();
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();
        ConnectionFactory connectionFactory
                = createConnectionFactory(service);
        camelContext.addComponent("activemq", jmsComponentAutoAcknowledge(connectionFactory));
        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:start")
                        .to("activemq:topic:news?replyToType=Exclusive&replyTo=queue:JmsInOutExclusiveTopicTest.reply")
                        .to("mock:result");

                from("activemq:topic:news?disableReplyTo=true")
                        .transform(body().prepend("Bye "))
                        .process(exchange -> {
                            String replyTo = exchange.getIn().getHeader("JMSReplyTo", String.class);
                            String cid = exchange.getIn().getHeader("JMSCorrelationID", String.class);

                            log.info("ReplyTo: {}", replyTo);
                            log.info("CorrelationID: {}", cid);
                            if (replyTo != null && cid != null) {
                                // wait a bit before sending back
                                Thread.sleep(1000);
                                log.info("Sending back reply message on {}", replyTo);
                                template.sendBodyAndHeader("activemq:" + replyTo, exchange.getIn().getBody(),
                                        "JMSCorrelationID", cid);
                            }
                        });
            }
        };
    }

}
