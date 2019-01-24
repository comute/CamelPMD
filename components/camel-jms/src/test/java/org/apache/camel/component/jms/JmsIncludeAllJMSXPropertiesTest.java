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
package org.apache.camel.component.jms;

import java.util.HashMap;
import java.util.Map;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import static org.apache.camel.component.jms.JmsComponent.jmsComponentAutoAcknowledge;

public class JmsIncludeAllJMSXPropertiesTest extends CamelTestSupport {

    @Test
    public void testIncludeAll() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Hello World");
        getMockEndpoint("mock:result").expectedHeaderReceived("foo", "bar");
        getMockEndpoint("mock:result").expectedHeaderReceived("JMSXUserID", "Donald");
        getMockEndpoint("mock:result").expectedHeaderReceived("JMSXAppID", "MyApp");

        Map headers = new HashMap();
        headers.put("foo", "bar");
        headers.put("JMSXUserID", "Donald");
        headers.put("JMSXAppID", "MyApp");

        template.sendBodyAndHeaders("activemq:queue:in", "Hello World", headers);

        assertMockEndpointsSatisfied();
    }

    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();
        ConnectionFactory connectionFactory = CamelJmsTestHelper.createConnectionFactory();
        JmsComponent jms = jmsComponentAutoAcknowledge(connectionFactory);
        jms.setIncludeAllJMSXProperties(true);
        camelContext.addComponent("activemq", jms);
        return camelContext;
    }

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from("activemq:queue:in")
                    .to("mock:result");
            }
        };
    }

}
