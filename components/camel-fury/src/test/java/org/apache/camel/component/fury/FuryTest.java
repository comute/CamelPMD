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
package org.apache.camel.component.fury;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class FuryTest extends CamelTestSupport {

    @Test
    public void testMarshalAndUnmarshalMap() throws Exception {
        TestPojo pojo = new TestPojo();
        pojo.setName("camel");

        MockEndpoint mock = getMockEndpoint("mock:reverse");
        mock.expectedMessageCount(1);
        mock.message(0).body().isInstanceOf(TestPojo.class);
        mock.message(0).body().isEqualTo(pojo);

        Object marshalled = template.requestBody("direct:in", pojo);
        template.sendBody("direct:back", marshalled);

        mock.assertIsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                FuryDataFormat format = new FuryDataFormat();
                format.setUnmarshalType(TestPojo.class);

                from("direct:in").marshal(format);
                from("direct:back").unmarshal(format).to("mock:reverse");
            }
        };
    }

}
