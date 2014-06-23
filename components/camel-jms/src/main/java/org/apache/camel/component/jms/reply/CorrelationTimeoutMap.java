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
package org.apache.camel.component.jms.reply;

import java.util.concurrent.ScheduledExecutorService;

import org.apache.camel.support.DefaultTimeoutMap;

/**
 * A {@link org.apache.camel.TimeoutMap} which is used to track reply messages which
 * has been timed out, and thus should trigger the waiting {@link org.apache.camel.Exchange} to
 * timeout as well.
 */
public class CorrelationTimeoutMap extends DefaultTimeoutMap<String, ReplyHandler> {

    private CorrelationListener listener;

    public CorrelationTimeoutMap(ScheduledExecutorService executor, long requestMapPollTimeMillis) {
        super(executor, requestMapPollTimeMillis);
    }

    public void setListener(CorrelationListener listener) {
        // there is only one listener needed
        this.listener = listener;
    }

    public boolean onEviction(String key, ReplyHandler value) {
        try {
            if (listener != null) {
                listener.onEviction(key);
            }
        } catch (Throwable e) {
            // ignore
        }

        // trigger timeout
        value.onTimeout(key);
        // return true to remove the element
        log.trace("Evicted correlationID: {}", key);
        return true;
    }

    @Override
    public ReplyHandler get(String key) {
        ReplyHandler answer = super.get(key);
        log.trace("Get correlationID: {} -> {}", key, answer != null);
        return answer;
    }

    @Override
    public void put(String key, ReplyHandler value, long keyTimeout, long valueTimeout) {
        try {
            if (listener != null) {
                listener.onPut(key);
            }
        } catch (Throwable e) {
            // ignore
        }

        super.put(key, value, keyTimeout, valueTimeout);
        log.trace("Added correlationID: {} to timeout after: {} millis", key, valueTimeout);
    }

    @Override
    public ReplyHandler remove(String key) {
        try {
            if (listener != null) {
                listener.onRemove(key);
            }
        } catch (Throwable e) {
            // ignore
        }

        ReplyHandler answer = super.remove(key);
        log.trace("Removed correlationID: {} -> {}", key, answer != null);
        return answer;
    }

}
