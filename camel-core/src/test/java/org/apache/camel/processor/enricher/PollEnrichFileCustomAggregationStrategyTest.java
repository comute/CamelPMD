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
package org.apache.camel.processor.enricher;

import java.io.File;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.junit.Test;

public class PollEnrichFileCustomAggregationStrategyTest extends ContextTestSupport {

    @Override
    protected void setUp() throws Exception {
        deleteDirectory("target/enrich");
        deleteDirectory("target/enrichdata");
        super.setUp();
    }
    
    @Test
    public void testPollEnrichCustomAggregationStrategyBody() throws Exception {

        getMockEndpoint("mock:start").expectedBodiesReceived("Start");

        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Big file");
        mock.expectedFileExists("target/enrich/.done/AAA.fin");
        mock.expectedFileExists("target/enrichdata/.done/AAA.dat");

        template.sendBodyAndHeader("file://target/enrich", "Start", Exchange.FILE_NAME, "AAA.fin");

        log.info("Sleeping for 1 sec before writing enrichdata file");
        Thread.sleep(1000);
        template.sendBodyAndHeader("file://target/enrichdata", "Big file", Exchange.FILE_NAME, "AAA.dat");
        log.info("... write done");

        assertMockEndpointsSatisfied();
        
        assertFileDoesNotExists("target/enrichdata/AAA.dat.camelLock");
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file://target/enrich?move=.done")
                    .to("mock:start")
                    .pollEnrich("file://target/enrichdata?readLock=markerFile&move=.done", 10000, new ReplaceAggregationStrategy())
                    .to("mock:result");
            }
        };
    }
    
    private static void assertFileDoesNotExists(String filename) {
        File file = new File(filename);
        assertFalse("File " + filename + " should not exist, it should have been deleted after being processed", file.exists());
    }
    
    class ReplaceAggregationStrategy implements AggregationStrategy {

        public Exchange aggregate(Exchange original, Exchange resource) {
            Object resourceResponse = resource.getIn().getBody();
            if (original.getPattern().isOutCapable()) {
                original.getOut().setBody(resourceResponse);
                original.getProperties().putAll(resource.getProperties());
            } else {
                original.getIn().setBody(resourceResponse);
                original.getProperties().putAll(resource.getProperties());
            }
            return original;
        }
    }
}
