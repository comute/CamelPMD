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

package org.apache.camel.component.rocketmq.reply;

import java.util.concurrent.ScheduledExecutorService;

import org.apache.camel.support.DefaultTimeoutMap;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class ReplyTimeoutMap extends DefaultTimeoutMap<String, ReplyHandler> {

    private static final Marker MARKER = MarkerFactory.getMarker("camel-rocketmq");

    public ReplyTimeoutMap(ScheduledExecutorService executor, long requestMapPollTimeMillis) {
        super(executor, requestMapPollTimeMillis);
        addListener(this::listener);
    }

    private static long encode(long timeoutMillis) {
        return timeoutMillis > 0 ? timeoutMillis : Integer.MAX_VALUE;
    }

    private void listener(Listener.Type type, String key, ReplyHandler handler) {
        switch (type) {
            case Put:
                log.trace(MARKER, "Added messageKey: {}", key);
                break;
            case Remove:
                log.trace(MARKER, "Removed messageKey: {}", key);
                break;
            case Evict:
                try {
                    handler.onTimeout(key);
                } catch (Throwable e) {
                    String message = String.format("Error processing onTimeout for messageKey: %s due: %s. " +
                                                   "This exception is ignored.",
                            key, e.getLocalizedMessage());
                    log.warn(MARKER, message, e);
                }
                log.trace(MARKER, "Evicted messageKey: {}", key);
                break;
            default:
        }
    }

    @Override
    public ReplyHandler put(String key, ReplyHandler value, long timeoutMillis) {
        return super.put(key, value, encode(timeoutMillis));
    }

    @Override
    public ReplyHandler putIfAbsent(String key, ReplyHandler value, long timeoutMillis) {
        return super.putIfAbsent(key, value, encode(timeoutMillis));
    }
}
