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
package org.apache.camel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.camel.AsyncProcessor;
import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.NoSuchEndpointException;
import org.apache.camel.Processor;
import org.apache.camel.Route;
import org.apache.camel.impl.converter.AsyncProcessorTypeConverter;
import org.apache.camel.model.FromType;
import org.apache.camel.model.ProcessorType;
import org.apache.camel.model.RouteType;
import org.apache.camel.processor.Interceptor;
import org.apache.camel.processor.Pipeline;
import org.apache.camel.processor.ProceedProcessor;
import org.apache.camel.processor.UnitOfWorkProcessor;
import org.apache.camel.spi.InterceptStrategy;

/**
 * The context used to activate new routing rules
 *
 * @version $Revision$
 */
public class RouteContext {
    private RouteType route;
    private FromType from;
    private Collection<Route> routes;
    private Endpoint<? extends Exchange> endpoint;
    private List<Processor> eventDrivenProcessors = new ArrayList<Processor>();
    private Interceptor lastInterceptor;
    private CamelContext camelContext;
    private InterceptStrategy interceptStrategy;

    public RouteContext(RouteType route, FromType from, Collection<Route> routes) {
        this.route = route;
        this.from = from;
        this.routes = routes;
    }

    /**
     * Only used for lazy construction from inside ExpressionType
     */
    public RouteContext(CamelContext camelContext) {
        this.camelContext = camelContext;
        routes = new ArrayList<Route>();
        route = new RouteType("temporary");
    }

    public Endpoint<? extends Exchange> getEndpoint() {
        if (endpoint == null) {
            endpoint = from.resolveEndpoint(this);
        }
        return endpoint;
    }

    public FromType getFrom() {
        return from;
    }

    public RouteType getRoute() {
        return route;
    }

    public CamelContext getCamelContext() {
        if (camelContext == null) {
            camelContext = getRoute().getCamelContext();
        }
        return camelContext;
    }

    public Processor createProcessor(ProcessorType node) throws Exception {
        return node.createOutputsProcessor(this);
    }

    public Endpoint<? extends Exchange> resolveEndpoint(String uri) {
        return route.resolveEndpoint(uri);
    }

    /**
     * Resolves an endpoint from either a URI or a named reference
     */
    public Endpoint<? extends Exchange> resolveEndpoint(String uri, String ref) {
        Endpoint<? extends Exchange> endpoint = null;
        if (uri != null) {
            endpoint = resolveEndpoint(uri);
            if (endpoint == null) {
                throw new NoSuchEndpointException(uri);
            }
        }
        if (ref != null) {
            endpoint = lookup(ref, Endpoint.class);
            if (endpoint == null) {
                throw new NoSuchEndpointException("ref:" + ref);
            }
        }
        if (endpoint == null) {
            throw new IllegalArgumentException("Either 'uri' or 'ref' must be specified on: " + this);
        } else {
            return endpoint;
        }
    }

    /**
     * lookup an object by name and type
     */
    public <T> T lookup(String name, Class<T> type) {
        return getCamelContext().getRegistry().lookup(name, type);
    }

    /**
     * Lets complete the route creation, creating a single event driven route
     * for the current from endpoint with any processors required
     */
    public void commit() {
        // now lets turn all of the event driven consumer processors into a
        // single route
        if (!eventDrivenProcessors.isEmpty()) {
            Processor processor = Pipeline.newInstance(eventDrivenProcessors);

            // lets create the async processor
            final AsyncProcessor asyncProcessor = AsyncProcessorTypeConverter.convert(processor);
            Processor unitOfWorkProcessor = new UnitOfWorkProcessor(asyncProcessor);

            // TODO: hz: move all this into the lifecycle strategy! (used by jmx naming strategy)
            Route edcr = new EventDrivenConsumerRoute(getEndpoint(), unitOfWorkProcessor);
            edcr.getProperties().put(Route.PARENT_PROPERTY, Integer.toHexString(route.hashCode()));
            if (route.getGroup() != null) {
                edcr.getProperties().put(Route.GROUP_PROPERTY, route.getGroup());
            }
            routes.add(edcr);
        }
    }

    public void addEventDrivenProcessor(Processor processor) {
        eventDrivenProcessors.add(processor);
    }

    public void intercept(Interceptor interceptor) {
/*
        InterceptorRef block = new InterceptorRef(interceptor);
        RouteType route = getRoute();
        List<ProcessorType<?>> list = route.getOutputs();
        for (ProcessorType<?> processorType : list) {
            block.addOutput(processorType);
        }
        route.clearOutput();
        route.addInterceptor(block);
*/

        //getRoute().getInterceptors().add(new InterceptorRef(interceptor));
        lastInterceptor = interceptor;
    }

    public Processor createProceedProcessor() {
        if (lastInterceptor == null) {
            throw new IllegalArgumentException("Cannot proceed() from outside of an interceptor!");
        } else {
            return new ProceedProcessor(lastInterceptor);
        }
    }

    /**
     * This method retrieves the InterceptStrategy on this route context.
     *
     * @return InterceptStrategy
     */
    public InterceptStrategy getInterceptStrategy() {
        return interceptStrategy;
    }

    /**
     * This method sets the InterceptStrategy on this route context.
     *
     * @param strategy
     */
    public void setInterceptStrategy(InterceptStrategy strategy) {
        interceptStrategy = strategy;
    }
}
