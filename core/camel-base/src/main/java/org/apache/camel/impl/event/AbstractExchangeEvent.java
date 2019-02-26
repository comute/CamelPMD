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
package org.apache.camel.impl.event;

import java.util.EventObject;

import org.apache.camel.Exchange;
import org.apache.camel.spi.CamelEvent.ExchangeEvent;

/**
 * Base class for {@link Exchange} events.
 */
public abstract class AbstractExchangeEvent extends EventObject implements ExchangeEvent {
    private static final long serialVersionUID = 1L;
    private final Exchange exchange;

    public AbstractExchangeEvent(Exchange source) {
        super(source);
        this.exchange = source;
    }

    public Exchange getExchange() {
        return exchange;
    }
}
