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
package org.apache.camel.component.sjms.tx;

import jakarta.jms.Connection;
import jakarta.jms.Session;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.RollbackExchangeException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.sjms.SjmsComponent;
import org.apache.camel.component.sjms.support.JmsTestSupport;
import org.apache.camel.test.infra.artemis.services.ArtemisService;
import org.apache.camel.test.infra.artemis.services.ArtemisServiceFactory;
import org.apache.camel.test.infra.core.annotations.ContextFixture;
import org.apache.camel.test.infra.core.annotations.RouteFixture;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.messaginghub.pooled.jms.JmsPoolConnectionFactory;

import static org.junit.jupiter.api.Assertions.fail;

public class TransactedTopicProducerTest extends JmsTestSupport {

    protected ActiveMQConnectionFactory connectionFactory;

    protected Session session;

    @RegisterExtension
    public static ArtemisService service = ArtemisServiceFactory.createSingletonVMService();

    private static final String CONNECTION_ID = "TransactedTopicProducerTest-connection";

    @Produce
    protected ProducerTemplate template;

    public TransactedTopicProducerTest() {
    }

    @Test
    public void testRoute() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Hello World 2");

        try {
            template.sendBodyAndHeader("direct:start", "Hello World 1", "isfailed", true);
            fail("Should throw exception");
        } catch (Exception e) {
            // expected
        }
        template.sendBodyAndHeader("direct:start", "Hello World 2", "isfailed", false);

        mock.assertIsSatisfied();
    }

    @Override
    protected void configureCamelContext(CamelContext camelContext) throws Exception {
        connectionFactory = new ActiveMQConnectionFactory(service.serviceAddress());

        Connection connection = connectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        SjmsComponent component = new SjmsComponent();
        component.setConnectionFactory(connectionFactory);
        camelContext.addComponent("sjms", component);
    }

    @Override
    @RouteFixture
    public void createRouteBuilder(CamelContext context) throws Exception {
        final RouteBuilder routeBuilder = createRouteBuilder();

        if (routeBuilder != null) {
            context.addRoutes(routeBuilder);
        }
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {

                from("direct:start")
                        .to("sjms:topic:test.TransactedTopicProducerTest.topic?transacted=true")
                        .process(
                                new Processor() {
                                    @Override
                                    public void process(Exchange exchange) throws Exception {
                                        if (exchange.getIn().getHeader("isfailed", Boolean.class)) {
                                            log.info("We failed.  Should roll back.");
                                            throw new RollbackExchangeException(exchange);
                                        } else {
                                            log.info("We passed.  Should commit.");
                                        }
                                    }
                                });

                from("sjms:topic:test.TransactedTopicProducerTest.topic?durableSubscriptionName=bar&transacted=true")
                        .to("mock:result");

            }
        };
    }
}
