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
package org.apache.camel.component.rabbitmq;

import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.JndiRegistry;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class RabbitMQConsumerIntTest extends CamelTestSupport {

    private static final String EXCHANGE = "ex1";
    private static final String HEADERS_EXCHANGE = "ex2";
    private static final String QUEUE = "q1";
    private static final String HEADER_KEY = "foo";
    private static final String HEADER_VALUE = "bar";
    private static final String MSG = "hello world";

    @EndpointInject(uri = "rabbitmq:localhost:5672/" + EXCHANGE + "?username=cameltest&password=cameltest")
    private Endpoint from;

    @EndpointInject(uri = "mock:result")
    private MockEndpoint to;

    @EndpointInject(uri = "rabbitmq:localhost:5672/" + HEADERS_EXCHANGE + "?username=cameltest&password=cameltest&exchangeType=headers&queue=" + QUEUE + "&bindingArgsConfigurer=#bindArgs")
    private Endpoint headersExchangeWithQueue;

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {

            @Override
            public void configure() throws Exception {
                from(from).to(to);
                from(headersExchangeWithQueue).to(to);
            }
        };
    }

    @Override
    protected JndiRegistry createRegistry() throws Exception {
        JndiRegistry jndi = super.createRegistry();

        ArgsConfigurer queueArgs = new ArgsConfigurer() {
            @Override
            public void configurArgs(Map<String, Object> args) {
                args.put(HEADER_KEY, HEADER_VALUE);
            }
        };
        jndi.bind("bindArgs", queueArgs);

        return jndi;
    }

    @Test
    public void sentMessageIsReceived() throws InterruptedException, IOException, TimeoutException {

        to.expectedMessageCount(1);
        to.expectedHeaderReceived(RabbitMQConstants.REPLY_TO, "myReply");

        AMQP.BasicProperties.Builder properties = new AMQP.BasicProperties.Builder();
        properties.replyTo("myReply");

        Channel channel = connection().createChannel();
        channel.basicPublish(EXCHANGE, "", properties.build(), MSG.getBytes());

        to.assertIsSatisfied();
    }

    @Test
    public void sentMessageWithTimestampIsReceived() throws InterruptedException, IOException, TimeoutException {
        Date timestamp = currentTimestampWithoutMillis();

        to.expectedMessageCount(1);
        to.expectedHeaderReceived(RabbitMQConstants.TIMESTAMP, timestamp);


        AMQP.BasicProperties.Builder properties = new AMQP.BasicProperties.Builder();
        properties.timestamp(timestamp);

        Channel channel = connection().createChannel();
        channel.basicPublish(EXCHANGE, "", properties.build(), MSG.getBytes());

        to.assertIsSatisfied();
    }

    /**
     * Tests the proper rabbit binding arguments are in place when the headersExchangeWithQueue is created.
     * Should only receive messages with the header [foo=bar]
     */
    @Test
    public void sentMessageIsReceivedWithHeadersRouting() throws InterruptedException, IOException, TimeoutException {
        //should only be one message that makes it through because only
        //one has the correct header set
        to.expectedMessageCount(1);

        AMQP.BasicProperties.Builder properties = new AMQP.BasicProperties.Builder();
        properties.headers(Collections.singletonMap(HEADER_KEY, HEADER_VALUE));

        AMQP.BasicProperties.Builder nonMatchingProperties = new AMQP.BasicProperties.Builder();
        nonMatchingProperties.headers(Collections.singletonMap(HEADER_KEY, "wrong-value"));


        Channel channel = connection().createChannel();
        channel.basicPublish(HEADERS_EXCHANGE, "", properties.build(), MSG.getBytes());
        channel.basicPublish(HEADERS_EXCHANGE, "", null, MSG.getBytes());
        channel.basicPublish(HEADERS_EXCHANGE, "", nonMatchingProperties.build(), MSG.getBytes());

        to.assertIsSatisfied();
    }

    private Connection connection() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setUsername("cameltest");
        factory.setPassword("cameltest");
        factory.setVirtualHost("/");
        return factory.newConnection();
    }

    private Date currentTimestampWithoutMillis() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}

