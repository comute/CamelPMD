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
package org.apache.camel;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.impl.ProducerCache;
import org.apache.camel.impl.ServiceSupport;
import org.apache.camel.util.ObjectHelper;

/**
 * A client helper object (named like Spring's TransactionTemplate & JmsTemplate
 * et al) for working with Camel and sending {@link Message} instances in an
 * {@link Exchange} to an {@link Endpoint}.
 *
 * @version $Revision$
 */
public class CamelTemplate<E extends Exchange> extends ServiceSupport implements ProducerTemplate<E> {
    private CamelContext context;
    private final ProducerCache<E> producerCache = new ProducerCache<E>();
    private boolean useEndpointCache = true;
    private final Map<String, Endpoint<E>> endpointCache = new HashMap<String, Endpoint<E>>();
    private Endpoint<E> defaultEndpoint;

    public CamelTemplate(CamelContext context) {
        this.context = context;
    }

    public CamelTemplate(CamelContext context, Endpoint defaultEndpoint) {
        this(context);
        this.defaultEndpoint = defaultEndpoint;
    }

    public E send(String endpointUri, E exchange) {
        Endpoint endpoint = resolveMandatoryEndpoint(endpointUri);
        return send(endpoint, exchange);
    }

    public E send(String endpointUri, Processor processor) {
        Endpoint endpoint = resolveMandatoryEndpoint(endpointUri);
        return send(endpoint, processor);
    }

    public E send(String endpointUri, Processor processor, AsyncCallback callback) {
        Endpoint endpoint = resolveMandatoryEndpoint(endpointUri);
        return send(endpoint, processor, callback);
    }

    public E send(String endpointUri, ExchangePattern pattern, Processor processor) {
        Endpoint endpoint = resolveMandatoryEndpoint(endpointUri);
        return send(endpoint, pattern, processor);
    }

    public E send(Endpoint<E> endpoint, E exchange) {
        //E convertedExchange = endpoint.createExchange(exchange);
        E convertedExchange = exchange;
        producerCache.send(endpoint, convertedExchange);
        return convertedExchange;
    }

    public E send(Endpoint<E> endpoint, Processor processor) {
        return producerCache.send(endpoint, processor);
    }

    public E send(Endpoint<E> endpoint, Processor processor, AsyncCallback callback) {
        return producerCache.send(endpoint, processor, callback);
    }

    public E send(Endpoint<E> endpoint, ExchangePattern pattern, Processor processor) {
        return producerCache.send(endpoint, pattern, processor);
    }

    public Object sendBody(Endpoint<E> endpoint, ExchangePattern pattern, Object body) {
        E result = send(endpoint, pattern, createSetBodyProcessor(body));
        return extractResultBody(result);
    }

    public Object sendBody(Endpoint<E> endpoint, Object body) {
        E result = send(endpoint, createSetBodyProcessor(body));
        return extractResultBody(result);
    }

    public Object sendBody(String endpointUri, Object body) {
        Endpoint endpoint = resolveMandatoryEndpoint(endpointUri);
        return sendBody(endpoint, body);
    }

    public Object sendBody(String endpointUri, ExchangePattern pattern, Object body) {
        Endpoint endpoint = resolveMandatoryEndpoint(endpointUri);
        return sendBody(endpoint, pattern, body);
    }

    public Object sendBodyAndHeader(String endpointUri, final Object body, final String header,
            final Object headerValue) {
        return sendBodyAndHeader(resolveMandatoryEndpoint(endpointUri), body, header, headerValue);
    }

    public Object sendBodyAndHeader(Endpoint endpoint, final Object body, final String header,
            final Object headerValue) {
        E result = send(endpoint, createBodyAndHeaderProcessor(body, header, headerValue));
        return extractResultBody(result);
    }

    public Object sendBodyAndHeader(Endpoint endpoint, ExchangePattern pattern, final Object body, final String header,
            final Object headerValue) {
        E result = send(endpoint, pattern, createBodyAndHeaderProcessor(body, header, headerValue));
        return extractResultBody(result);
    }

    public Object sendBodyAndHeader(String endpoint, ExchangePattern pattern, final Object body, final String header,
            final Object headerValue) {
        E result = send(endpoint, pattern, createBodyAndHeaderProcessor(body, header, headerValue));
        return extractResultBody(result);
    }

    public Object sendBodyAndHeaders(String endpointUri, final Object body, final Map<String, Object> headers) {
        return sendBodyAndHeaders(resolveMandatoryEndpoint(endpointUri), body, headers);
    }

    public Object sendBodyAndHeaders(Endpoint endpoint, final Object body, final Map<String, Object> headers) {
        E result = send(endpoint, new Processor() {
            public void process(Exchange exchange) {
                Message in = exchange.getIn();
                for (Map.Entry<String, Object> header : headers.entrySet()) {
                    in.setHeader(header.getKey(), header.getValue());
                }
                in.setBody(body);
            }
        });
        return extractResultBody(result);
    }

    // Methods using an InOut ExchangePattern
    // -----------------------------------------------------------------------

    public E request(Endpoint<E> endpoint, Processor processor) {
        return send(endpoint, ExchangePattern.InOut, processor);
    }

    public Object requestBody(Endpoint<E> endpoint, Object body) {
        return sendBody(endpoint, ExchangePattern.InOut, body);
    }

    public Object requestBodyAndHeader(Endpoint<E> endpoint, Object body, String header, Object headerValue) {
        return sendBodyAndHeader(endpoint, ExchangePattern.InOut, body, header, headerValue);
    }

    public E request(String endpoint, Processor processor) {
        return send(endpoint, ExchangePattern.InOut, processor);
    }

    public Object requestBody(String endpoint, Object body) {
        return sendBody(endpoint, ExchangePattern.InOut, body);
    }

    public Object requestBodyAndHeader(String endpoint, Object body, String header, Object headerValue) {
        return sendBodyAndHeader(endpoint, ExchangePattern.InOut, body, header, headerValue);
    }

    // Methods using the default endpoint
    // -----------------------------------------------------------------------

    public Object sendBody(Object body) {
        return sendBody(getMandatoryDefaultEndpoint(), body);
    }

    public E send(E exchange) {
        return send(getMandatoryDefaultEndpoint(), exchange);
    }

    public E send(Processor processor) {
        return send(getMandatoryDefaultEndpoint(), processor);
    }

    public Object sendBodyAndHeader(Object body, String header, Object headerValue) {
        return sendBodyAndHeader(getMandatoryDefaultEndpoint(), body, header, headerValue);
    }

    public Object sendBodyAndHeaders(Object body, Map<String, Object> headers) {
        return sendBodyAndHeaders(getMandatoryDefaultEndpoint(), body, headers);
    }

    // Properties
    // -----------------------------------------------------------------------
    public Producer<E> getProducer(Endpoint<E> endpoint) {
        return producerCache.getProducer(endpoint);
    }

    public CamelContext getContext() {
        return context;
    }

    public Endpoint<E> getDefaultEndpoint() {
        return defaultEndpoint;
    }

    public void setDefaultEndpoint(Endpoint<E> defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
    }

    /**
     * Sets the default endpoint to use if none is specified
     */
    public void setDefaultEndpointUri(String endpointUri) {
        setDefaultEndpoint(getContext().getEndpoint(endpointUri));
    }

    public boolean isUseEndpointCache() {
        return useEndpointCache;
    }

    public void setUseEndpointCache(boolean useEndpointCache) {
        this.useEndpointCache = useEndpointCache;
    }

    public <T extends Endpoint<?>> T getResolvedEndpoint(String endpointUri, Class<T> expectedClass) {
        Endpoint<?> e = null;
        synchronized (endpointCache) {
            e = endpointCache.get(endpointUri);
        }
        if (e != null && expectedClass.isAssignableFrom(e.getClass())) {
            return expectedClass.asSubclass(expectedClass).cast(e);
        }
        return null;
    }
    
    // Implementation methods
    // -----------------------------------------------------------------------

    protected Processor createBodyAndHeaderProcessor(final Object body, final String header, final Object headerValue) {
        return new Processor() {
            public void process(Exchange exchange) {
                Message in = exchange.getIn();
                in.setHeader(header, headerValue);
                in.setBody(body);
            }
        };
    }

    protected Processor createSetBodyProcessor(final Object body) {
        return new Processor() {
            public void process(Exchange exchange) {
                Message in = exchange.getIn();
                in.setBody(body);
            }
        };
    }

    protected Endpoint resolveMandatoryEndpoint(String endpointUri) {
        Endpoint endpoint = null;

        if (isUseEndpointCache()) {
            synchronized (endpointCache) {
                endpoint = endpointCache.get(endpointUri);
                if (endpoint == null) {
                    endpoint = context.getEndpoint(endpointUri);
                    if (endpoint != null) {
                        endpointCache.put(endpointUri, endpoint);
                    }
                }
            }
        } else {
            endpoint = context.getEndpoint(endpointUri);
        }
        if (endpoint == null) {
            throw new NoSuchEndpointException(endpointUri);
        }
        return endpoint;
    }

    protected Endpoint<E> getMandatoryDefaultEndpoint() {
        Endpoint<E> answer = getDefaultEndpoint();
        ObjectHelper.notNull(answer, "defaultEndpoint");
        return answer;
    }

    protected void doStart() throws Exception {
        producerCache.start();
    }

    protected void doStop() throws Exception {
        producerCache.stop();
    }

    protected Object extractResultBody(E result) {
        Object answer = null;
        if (result != null) {
            Message out = result.getOut(false);
            if (out != null) {
                answer = out.getBody();
            } else {
                answer = result.getIn().getBody();
            }
        }
        return answer;
    }

}
