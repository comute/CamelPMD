/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.list;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.processor.loadbalancer.LoadBalancerConsumer;
import org.apache.camel.processor.loadbalancer.TopicLoadBalancer;
import org.apache.camel.component.seda.CollectionProducer;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.impl.DefaultProducer;

/**
 * An endpoint which maintains a {@link List} of {@link Exchange} instances
 * which can be useful for tooling, debugging and visualising routes.
 *
 * @version $Revision: 1.1 $
 */
public class ListEndpoint extends DefaultEndpoint<Exchange> {
    private List<Exchange> exchanges = new ArrayList<Exchange>();
    private TopicLoadBalancer loadBalancer = new TopicLoadBalancer();

    public ListEndpoint(String uri, CamelContext camelContext) {
        super(uri, camelContext);
    }

    public ListEndpoint(String uri, Component component) {
        super(uri, component);
    }

    public boolean isSingleton() {
        return true;
    }

    public List<Exchange> getExchanges() {
        return exchanges;
    }

    public TopicLoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    public Producer<Exchange> createProducer() throws Exception {
        return new DefaultProducer<Exchange>(this) {
            public void process(Exchange exchange) throws Exception {
                onExchange(exchange);
            }
        };
    }

    public Consumer<Exchange> createConsumer(Processor processor) throws Exception {
        return new LoadBalancerConsumer(this, processor, loadBalancer);
    }

    public void reset() {
        exchanges = new CopyOnWriteArrayList<Exchange>();
    }

    /**
     * Invoked on a message exchange being sent by a producer
     */
    protected void onExchange(Exchange exchange) throws Exception {
        exchanges.add(exchange);

        // lets fire any consumers
        loadBalancer.process(exchange);
    }
}
