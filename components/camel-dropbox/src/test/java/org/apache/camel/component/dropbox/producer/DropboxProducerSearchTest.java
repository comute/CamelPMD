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
package org.apache.camel.component.dropbox.producer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.dropbox.DropboxTestSupport;
import org.apache.camel.component.dropbox.util.DropboxConstants;
import org.apache.camel.component.dropbox.util.DropboxResultOpCode;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.util.List;

public class DropboxProducerSearchTest extends DropboxTestSupport {

    public DropboxProducerSearchTest() throws Exception {}

    @Test
    public void testCamelDropbox() throws Exception {
        template.send("direct:start", new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                exchange.getIn().setHeader("test", "test");
            }
        });


        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMinimumMessageCount(1);       
        assertMockEndpointsSatisfied();

        List<Exchange> exchanges = mock.getReceivedExchanges();
        Exchange exchange = exchanges.get(0);
        Object headerCode =  exchange.getIn().getHeader(DropboxConstants.RESULT_OP_CODE);
        Object header = exchange.getIn().getHeader(DropboxConstants.ENTRIES_SIZE);
        Object body = exchange.getIn().getBody();
        assertNotNull(headerCode);
        assertEquals(headerCode.toString(), DropboxResultOpCode.OK);
        assertNotNull(header);
        assertNotNull(body);

    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                from("direct:start")
                        .to("dropbox://search?"+getAuthParams()+"&remotePath=/XXX")
                        .to("mock:result");
            }
        };
    }
}
