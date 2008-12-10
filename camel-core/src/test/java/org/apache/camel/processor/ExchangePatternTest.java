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
package org.apache.camel.processor;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;

public class ExchangePatternTest extends ContextTestSupport {
    
    private void sendMessage(String uri, final ExchangePattern ep, final String message) {
        template.send(uri, new Processor() {
            public void process(Exchange exchange) throws Exception {
                exchange.setPattern(ep); 
                exchange.getIn().setBody(message);
            }
            
        });
    }
   
    public void testInOut() throws Exception {
        MockEndpoint resultEndpoint = resolveMandatoryEndpoint("mock:result", MockEndpoint.class);
        resultEndpoint.expectedBodiesReceived("InOnlyMessage");        
        sendMessage("direct:inOnly", ExchangePattern.InOnly, "InOnlyMessage");
        resultEndpoint.assertIsSatisfied();
        assertEquals("The exchange pattern should be InOut", resultEndpoint.getExchanges().get(0).getPattern(), ExchangePattern.InOut);
    }
    
    public void testInOnly() throws Exception {
        MockEndpoint resultEndpoint = resolveMandatoryEndpoint("mock:result", MockEndpoint.class);
        resultEndpoint.expectedBodiesReceived("InOutMessage");        
        sendMessage("direct:inOut", ExchangePattern.InOut, "InOutMessage");
        resultEndpoint.assertIsSatisfied();
        assertEquals("The exchange pattern should be InOnly", resultEndpoint.getExchanges().get(0).getPattern(), ExchangePattern.InOnly);
    }
    
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {

                from("direct:inOnly").inOut().to("mock:result");
               
                from("direct:inOut").setExchangePattern(ExchangePattern.InOnly).to("mock:result");
                
            }
        };
    }

}
