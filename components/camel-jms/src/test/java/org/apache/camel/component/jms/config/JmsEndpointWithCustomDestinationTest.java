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
package org.apache.camel.component.jms.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

/**
 * @version $Revision$
 */
@ContextConfiguration
public class JmsEndpointWithCustomDestinationTest extends AbstractJUnit38SpringContextTests {
    @Produce(uri = "direct:start")
    protected ProducerTemplate template;
    @EndpointInject(uri = "mock:result")
    protected MockEndpoint result;
    @Autowired
    protected ActiveMQQueue jmsQueue;

    private Object expectedBody = "<hello>world!</hello>";

    public void testMessageSentToCustomEndpoint() throws Exception {
        assertNotNull("jmsQueue", jmsQueue);
        assertEquals("jmsqueue.getPhysicalName()", "Test.Camel.CustomEndpoint", jmsQueue.getPhysicalName());

        result.expectedBodiesReceived(expectedBody);

        template.sendBody(expectedBody);

        result.assertIsSatisfied();
    }

}
