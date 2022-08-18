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
import org.apache.camel.ExchangeTimedOutException;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.apache.camel.component.jms.JmsComponent.jmsComponentAutoAcknowledge;
import static org.apache.camel.test.infra.activemq.common.ConnectionFactoryHelper.createConnectionFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Unit test for testing request timeout with a InOut exchange.
 */
@Tags({ @Tag("not-parallel") })
public class JmsRouteTimeoutTest extends AbstractJMSTest {

    @Test
    public void testTimeout() {
        try {
            // send a in-out with a timeout for 1 sec 
            template.requestBody("activemq:queue:slow?requestTimeout=1000", "Hello World");
            fail("Should have timed out with an exception");
        } catch (RuntimeCamelException e) {
            assertTrue(e.getCause() instanceof ExchangeTimedOutException, "Should have timed out with an exception");
        }
    }

    @Test
    public void testNoTimeout() {
        // START SNIPPET: e1
        // send a in-out with a timeout for 5 sec
        Object out = template.requestBody("activemq:queue:slow?requestTimeout=5000", "Hello World");
        // END SNIPPET: e1
        assertEquals("Bye World", out);
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
                from("activemq:queue:slow").delay(3000).transform(constant("Bye World"));
            }
        };
    }
}
