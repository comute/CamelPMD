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
package org.apache.camel.processor;

import org.apache.camel.Processor;
import org.apache.camel.impl.ServiceSupport;
import org.apache.camel.util.ServiceHelper;

import java.util.Collection;

/**
 * Represents a composite pattern, aggregating a collection of processors together as a single processor
 *
 * @version $Revision$
 */
public class CompositeProcessor<E> extends ServiceSupport implements Processor<E> {
    private final Collection<Processor<E>> processors;

    public CompositeProcessor(Collection<Processor<E>> processors) {
        this.processors = processors;
    }

    public void process(E exchange) {
        for (Processor<E> processor : processors) {
            processor.process(exchange);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");
        boolean first = true;
        for (Processor<E> processor : processors) {
            if (first) {
                first = false;
            }
            else {
                builder.append(", ");
            }
            builder.append(processor.toString());
        }
        builder.append(" ]");
        return builder.toString();
    }

    public Collection<Processor<E>> getProcessors() {
        return processors;
    }

    protected void doStart() throws Exception {
        ServiceHelper.startServices(processors);
    }

    protected void doStop() throws Exception {
        ServiceHelper.stopServices(processors);
    }
}
