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
package org.apache.camel.spi;

import java.util.Map;

import org.apache.camel.Endpoint;

/**
 * Represents a traced message by the BacklogTracer.
 */
public interface BacklogTracerEventMessage {

    String ROOT_TAG = "backlogTracerEventMessage";
    String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    /**
     * Unique id of the traced message
     */
    long getUid();

    /**
     * Whether this is a new incoming message and this is the first trace.
     */
    boolean isFirst();

    /**
     * Whether this is the last trace of the message (its complete).
     */
    boolean isLast();

    /**
     * Timestamp of the traced event
     */
    long getTimestamp();

    /**
     * The location of the trace (source code name:line) if possible.
     */
    String getLocation();

    /**
     * Route id
     */
    String getRouteId();

    /**
     * Whether this event was from a route that is created from Rest DSL.
     */
    boolean isRest();

    /**
     * Whether this event was from a route that is created from route template or kamelet.
     */
    boolean isTemplate();

    /**
     * Node id where the message is being routed to
     */
    String getToNode();

    /**
     * The exchange id
     */
    String getExchangeId();

    /**
     * The name of the thread that is processing the message, when this event was captured.
     */
    String getProcessingThreadName();

    /**
     * The content of the message as XML (body and headers)
     *
     * This requires having XML enabled on {@link BacklogTracer}.
     */
    @Deprecated
    String getMessageAsXml();

    /**
     * The content of the message as JSon (body and headers)
     *
     * This requires having JSon enabled on {@link BacklogTracer}.
     */
    String getMessageAsJSon();

    /**
     * Time elapsed for processing the given node (in millis).
     */
    long getElapsed();

    /**
     * Whether the message is done processing the given node
     */
    boolean isDone();

    /**
     * Did the message fail during processing (i.e. was an exception thrown)
     */
    boolean isFailed();

    /**
     * Was there an exception thrown during processing
     */
    boolean hasException();

    /**
     * The exception as XML (exception type, message and stacktrace)
     *
     * This requires having XML enabled on {@link BacklogTracer}.
     */
    String getExceptionAsXml();

    /**
     * The exception as XML (exception type, message and stacktrace)
     *
     * This requires having XML enabled on {@link BacklogTracer}.
     */
    void setExceptionAsXml(String exceptionAsXml);

    /**
     * The exception as JSon (exception type, message and stacktrace)
     *
     * This requires having JSon enabled on {@link BacklogTracer}.
     */
    String getExceptionAsJSon();

    /**
     * The exception as JSon (exception type, message and stacktrace)
     *
     * This requires having JSon enabled on {@link BacklogTracer}.
     */
    void setExceptionAsJSon(String exceptionAsJSon);

    /**
     * The endpoint uri if this trace is either from a route input (from), or the exchange was sent to an endpoint such
     * as (to, toD, wireTap) etc.
     */
    String getEndpointUri();

    /**
     * Whether the endpoint is remote.
     *
     * @see Endpoint#isRemote()
     */
    boolean isRemoteEndpoint();

    /**
     * Gets the endpoint remote address such as URL, hostname, connection-string, or cloud region, that are component
     * specific.
     *
     * @return the address or null if no address can be determined.
     * @see    EndpointServiceLocation
     */
    String getEndpointServiceUrl();

    /**
     * Get the endpoint protocol the service is using such as http, amqp, tcp.
     *
     * @see EndpointServiceLocation
     */
    String getEndpointServiceProtocol();

    /**
     * Optional endpoint metadata that is relevant to the service as key value pairs. Notice that the metadata is not
     * supposed to contain sensitive security details such as access token, api keys, or passwords. Only share
     * information that can be safely accessed and written to logs.
     *
     * @return optional metadata or null if no data
     * @see    EndpointServiceLocation
     */
    Map<String, String> getEndpointServiceMetadata();

    /**
     * Dumps the event message as XML using the {@link #ROOT_TAG} as root tag.
     * <p/>
     * The <tt>timestamp</tt> tag is formatted in the format defined by {@link #TIMESTAMP_FORMAT}
     *
     * This requires having XML enabled on {@link BacklogTracer}.
     *
     * @param  indent number of spaces to indent
     * @return        xml representation of this event
     */
    @Deprecated
    String toXml(int indent);

    /**
     * Dumps the event message as JSon.
     *
     * This requires having XML enabled on {@link BacklogTracer}.
     *
     * @param  indent number of spaces to indent
     * @return        JSon representation of this event
     */
    String toJSon(int indent);

    /**
     * The event message as an org.apache.camel.util.json.JsonObject object.
     *
     * This requires having JSon enabled on {@link BacklogTracer}.
     */
    Map<String, Object> asJSon();

}
