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
package org.apache.camel.impl;

import java.io.InputStream;
import java.io.OutputStream;

import com.ning.compress.lzf.LZFInputStream;
import com.ning.compress.lzf.LZFOutputStream;
import org.apache.camel.Exchange;
import org.apache.camel.converter.stream.OutputStreamBuilder;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.spi.DataFormatName;
import org.apache.camel.util.IOHelper;

/**
 * GZip {@link DataFormat} for reading/writing data using lzf.
 */
public class LzfDataFormat extends org.apache.camel.support.ServiceSupport implements DataFormat, DataFormatName {

    @Override
    public String getDataFormatName() {
        return "lzf";
    }

    @Override
    public void marshal(final Exchange exchange, final Object graph, final OutputStream stream) throws Exception {
        InputStream is = exchange.getContext().getTypeConverter().mandatoryConvertTo(InputStream.class, exchange, graph);

        OutputStream compressedOutput = new LZFOutputStream(stream);
        try {
            IOHelper.copy(is, compressedOutput);
        } finally {
            // must close all input streams
            IOHelper.close(is, compressedOutput);
        }
    }

    @Override
    public Object unmarshal(final Exchange exchange, final InputStream inputStream) throws Exception {
        InputStream compressedInput = null;

        OutputStreamBuilder osb = OutputStreamBuilder.withExchange(exchange);
        try {
            compressedInput = new LZFInputStream(inputStream);
            IOHelper.copy(compressedInput, osb);
            return osb.build();
        } finally {
            // must close all input streams
            IOHelper.close(osb, compressedInput, inputStream);
        }
    }

    @Override
    protected void doStart() throws Exception {
        // noop
    }

    @Override
    protected void doStop() throws Exception {
        // noop
    }
}
