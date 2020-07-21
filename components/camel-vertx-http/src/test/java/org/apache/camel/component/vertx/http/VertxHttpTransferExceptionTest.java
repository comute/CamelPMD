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
package org.apache.camel.component.vertx.http;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VertxHttpTransferExceptionTest extends VertxHttpTestSupport {

    @Test
    public void testTransferException() {
        Exchange exchange = template.request(getProducerUri() + "?transferException=true", null);
        assertTrue(exchange.isFailed());

        Exception exception = exchange.getException();
        assertNotNull(exception);
        assertTrue(exception instanceof IllegalStateException);
        assertEquals("Forced Exception", exception.getMessage());

        Message message = exchange.getMessage();
        Map<String, Object> headers = message.getHeaders();
        assertEquals(VertxHttpConstants.CONTENT_TYPE_JAVA_SERIALIZED_OBJECT, headers.get(Exchange.CONTENT_TYPE));
    }

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from(getTestServerUri() + "?transferException=true")
                        .throwException(new IllegalStateException("Forced Exception"));
            }
        };
    }
}
