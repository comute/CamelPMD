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
package org.apache.camel.component.mail;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;

/**
 * Unit test for Mail subject support.
 */
public class MailSubjectTest extends ContextTestSupport {
    private String subject = "Camel rocks";

    public void testMailSubject() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);

        String body = "Hello Claus.\nYes it does.\n\nRegards James.";

        template.sendBody("direct:a", body);

        // need some time for camel to consume mail
        Thread.sleep(1000);

        Exchange exchange = mock.assertExchangeReceived(0);
        Message in = exchange.getIn();
        assertEquals("body", body, in.getBody(String.class));
        assertEquals("subject", subject, in.getHeader("subject", String.class));

        mock.assertIsSatisfied();
    }

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                // START SNIPPET: e1
                from("direct:a").setHeader("subject", subject).to("smtp://james@localhost");
                // END SNIPPET: e1

                from("pop3://localhost?username=james&password=secret").to("mock:result");
            }
        };
    }
}
