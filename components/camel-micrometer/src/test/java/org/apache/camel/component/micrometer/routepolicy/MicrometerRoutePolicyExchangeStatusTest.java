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
package org.apache.camel.component.micrometer.routepolicy;

import io.micrometer.core.instrument.Counter;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_FAILED_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_SUCCEEDED_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.ROUTE_ID_TAG;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MicrometerRoutePolicyExchangeStatusTest extends AbstractMicrometerRoutePolicyTest {

    @Test
    public void testMetricsExchangeStatus() throws Exception {
        int count = 10;
        MockEndpoint mockEndpoint = getMockEndpoint("mock:result");
        mockEndpoint.expectedMessageCount(count / 2);

        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                template.sendBody("direct:completing", "Hello");
            } else {
                assertThrows(RuntimeException.class, () -> template.sendBody("direct:failing", "Hello"));
            }
        }

        assertMockEndpointsSatisfied();
        Counter exchangesSucceededCounter = meterRegistry.find(DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_SUCCEEDED_METER_NAME)
                .tag(ROUTE_ID_TAG, "completing").counter();
        Counter exchangesFailedCounter = meterRegistry.find(DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_FAILED_METER_NAME)
                .tag(ROUTE_ID_TAG, "failing").counter();
        assertEquals(count / 2.0D, exchangesSucceededCounter.count(), 0.01D);
        assertEquals(count / 2.0D, exchangesFailedCounter.count(), 0.01D);

    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:completing").routeId("completing")
                        .to("mock:result");

                from("direct:failing").routeId("failing")
                        .throwException(RuntimeException.class, "Failing")
                        .to("mock:result");
            }
        };
    }
}
