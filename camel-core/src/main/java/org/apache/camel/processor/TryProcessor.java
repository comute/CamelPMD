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
package org.apache.camel.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.ServiceSupport;
import org.apache.camel.util.ExchangeHelper;
import org.apache.camel.util.ServiceHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implements try/catch/finally type processing
 *
 * @version $Revision$
 */
public class TryProcessor extends ServiceSupport implements Processor {
    private static final transient Log LOG = LogFactory.getLog(TryProcessor.class);

    private final Processor tryProcessor;
    private final List<CatchProcessor> catchClauses;
    private final Processor finallyProcessor;

    public TryProcessor(Processor tryProcessor, List<CatchProcessor> catchClauses, Processor finallyProcessor) {
        this.tryProcessor = tryProcessor;
        this.catchClauses = catchClauses;
        this.finallyProcessor = finallyProcessor;
    }

    public String toString() {
        String finallyText = (finallyProcessor == null) ? "" : " Finally {" + finallyProcessor + "}";
        return "Try {" + tryProcessor + "} " + catchClauses + finallyText;
    }

    public void process(Exchange exchange) throws Exception {
        Exception e;

        // try processor first
        try {
            tryProcessor.process(exchange);
            e = exchange.getException();

            // Ignore it if it was handled by the dead letter channel.
            if (e != null && DeadLetterChannel.isFailureHandled(exchange)) {
                e = null;
            }
        } catch (Exception ex) {
            e = ex;
            exchange.setException(e);
        }

        // handle any exception occured during the try processor
        try {
            if (e != null) {
                if (LOG.isDebugEnabled()) {
                    LOG.debug("Caught exception while processing exchange.", e);
                }
                handleException(exchange, e);
            }
        } finally {
            // and run finally
            // notice its always executed since we always enter the try block
            processFinally(exchange);
        }
    }

    protected void doStart() throws Exception {
        ServiceHelper.startServices(tryProcessor, catchClauses, finallyProcessor);
    }

    protected void doStop() throws Exception {
        ServiceHelper.stopServices(tryProcessor, catchClauses, finallyProcessor);
    }

    protected void handleException(Exchange exchange, Throwable e) throws Exception {
        for (CatchProcessor catchClause : catchClauses) {
            if (catchClause.catches(e)) {
                // lets attach the exception to the exchange
                Exchange localExchange = exchange.copy();
                
                localExchange.setProperty(Exchange.EXCEPTION_CAUGHT, e);
                // give the rest of the pipeline another chance
                localExchange.setException(null);

                // do not catch any exception here, let it propagate up
                catchClause.process(localExchange);
                localExchange.removeProperty(Exchange.EXCEPTION_CAUGHT);
                ExchangeHelper.copyResults(exchange, localExchange);
                return;
            }
        }
    }

    protected void processFinally(Exchange exchange) throws Exception {
        if (finallyProcessor != null) {
            Exception lastException = exchange.getException();
            exchange.setException(null);

            // do not catch any exception here, let it propagate up
            finallyProcessor.process(exchange);
            if (exchange.getException() == null) {
                exchange.setException(lastException);
            }
        }
    }
}
