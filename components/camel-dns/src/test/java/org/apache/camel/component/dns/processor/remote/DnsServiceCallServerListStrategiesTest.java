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
package org.apache.camel.component.dns.processor.remote;

import java.util.List;

import org.apache.camel.component.dns.DnsConfiguration;
import org.apache.camel.spi.ServiceCallServer;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class DnsServiceCallServerListStrategiesTest {
    @Test
    public void testOnDemand() throws Exception {
        DnsConfiguration configuration = new DnsConfiguration();
        DnsServiceCallServerListStrategy strategy = DnsServiceCallServerListStrategies.onDemand(configuration);

        configuration.setDomain("gmail.com");
        configuration.setProto("_tcp");

        List<ServiceCallServer> servers = strategy.getUpdatedListOfServers("_xmpp-server");
        assertNotNull(servers);
        assertFalse(servers.isEmpty());

        for (ServiceCallServer server : servers) {
            assertFalse(server.getMetadata().isEmpty());
            assertNotNull(server.getMetadata().get("priority"));
            assertNotNull(server.getMetadata().get("weight"));
        }
    }
}
