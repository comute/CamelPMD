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
package org.apache.camel.component.http;

import java.net.URI;
import java.util.Map;

import org.apache.camel.Consumer;
import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.impl.DefaultComponent;

/**
 * Defines the <a href="http://activemq.apache.org/camel/http.html">HTTP
 * Component</a>
 * 
 * @version $Revision$
 */
public class HttpComponent extends DefaultComponent<HttpExchange> {

    /**
     * Connects the URL specified on the endpoint to the specified processor.
     * 
     * @throws Exception
     */
    public void connect(HttpConsumer consumer) throws Exception {
    }

    /**
     * Disconnects the URL specified on the endpoint from the specified
     * processor.
     * 
     * @throws Exception
     */
    public void disconnect(HttpConsumer consumer) throws Exception {
    }


    @Override
    protected Endpoint<HttpExchange> createEndpoint(String uri, String remaining, Map parameters) throws Exception {
        return new HttpEndpoint(uri, this, new URI(uri)) {
            
            // TODO: we should implement this using a polling http client.
            @Override
            public Consumer<HttpExchange> createConsumer(Processor processor) throws Exception {
                throw new RuntimeCamelException("Not implemented.  You can only produce to a http endpoint.");
            }
        };
    }

}
