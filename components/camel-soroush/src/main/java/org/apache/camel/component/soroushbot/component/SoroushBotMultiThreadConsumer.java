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

package org.apache.camel.component.soroushbot.component;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.soroushbot.models.SoroushMessage;
import org.apache.camel.component.soroushbot.utils.CongestionException;
import org.apache.camel.component.soroushbot.utils.MultiQueueWithTopicThreadPool;

/**
 * create a thread pool and process each message using one of threads,
 * it is guaranteed that all message from a same person will processed by the same thread.
 * thread pool size could be configured using {@link SoroushBotEndpoint#concurrentConsumers}
 * this consumer support both Sync and Async processors.
 */
public class SoroushBotMultiThreadConsumer extends SoroushBotAbstractConsumer {
    MultiQueueWithTopicThreadPool threadPool;

    public SoroushBotMultiThreadConsumer(SoroushBotEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        threadPool = new MultiQueueWithTopicThreadPool(endpoint.concurrentConsumers, endpoint.queueCapacityPerThread, "Soroush Thread");
    }

    @Override
    protected void sendExchange(Exchange exchange) {
        try {
            threadPool.execute(exchange.getIn().getBody(SoroushMessage.class).getFrom(), () -> {
                try {
                    if (endpoint.isSynchronous()) {
                        getProcessor().process(exchange);
                    } else {
                        getAsyncProcessor().process(exchange);
                    }
                } catch (Exception ex) {
                    log.error("internal error occurs", ex);
                }
            });
        } catch (IllegalStateException ex) {
            throw new CongestionException(ex, exchange.getIn().getBody(SoroushMessage.class));
        }
    }
}
