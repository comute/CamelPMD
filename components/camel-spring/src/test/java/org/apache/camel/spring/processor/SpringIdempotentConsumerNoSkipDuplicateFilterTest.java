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
package org.apache.camel.spring.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spring.SpringTestSupport;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdempotentConsumerNoSkipDuplicateFilterTest extends SpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext(
                "org/apache/camel/spring/processor/SpringIdempotentConsumerNoSkipDuplicateFilterTest.xml");
    }

    @Test
    public void testDuplicateMessagesAreFilteredOut() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("one", "two", "three");

        getMockEndpoint("mock:duplicate").expectedBodiesReceived("one", "two", "one");
        getMockEndpoint("mock:duplicate").allMessages().exchangeProperty(Exchange.DUPLICATE_MESSAGE).isEqualTo(Boolean.TRUE);

        sendMessage("1", "one");
        sendMessage("2", "two");
        sendMessage("1", "one");
        sendMessage("2", "two");
        sendMessage("1", "one");
        sendMessage("3", "three");

        assertMockEndpointsSatisfied();
    }

    protected void sendMessage(final Object messageId, final Object body) {
        template.send("direct:start", new Processor() {
            public void process(Exchange exchange) {
                // now lets fire in a message
                Message in = exchange.getIn();
                in.setBody(body);
                in.setHeader("messageId", messageId);
            }
        });
    }

}
