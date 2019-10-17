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
package org.apache.camel.component.hdfs;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HdfsInputStream implements Closeable {

    private static final Logger LOG = LoggerFactory.getLogger(HdfsInputStream.class);

    private HdfsFileType fileType;
    private String actualPath;
    private String suffixedPath;
    private String suffixedReadPath;
    private Closeable in;
    private boolean opened;
    private int chunkSize;
    private final AtomicLong numOfReadBytes = new AtomicLong(0L);
    private final AtomicLong numOfReadMessages = new AtomicLong(0L);

    private HdfsConfiguration config;

    protected HdfsInputStream() {
    }

    /**
     *
     * @param hdfsPath
     * @param configuration
     * @return
     * @throws IOException
     */
    public static HdfsInputStream createInputStream(String hdfsPath, HdfsConfiguration configuration) {
        HdfsInputStream iStream = new HdfsInputStream();
        iStream.fileType = configuration.getFileType();
        iStream.actualPath = hdfsPath;
        iStream.suffixedPath = iStream.actualPath + '.' + configuration.getOpenedSuffix();
        iStream.suffixedReadPath = iStream.actualPath + '.' + configuration.getReadSuffix();
        iStream.chunkSize = configuration.getChunkSize();
        try {
            HdfsInfo info = HdfsInfoFactory.newHdfsInfo(iStream.actualPath, configuration);
            if (info.getFileSystem().rename(new Path(iStream.actualPath), new Path(iStream.suffixedPath))) {
                iStream.in = iStream.fileType.createInputStream(iStream.suffixedPath, configuration);
                iStream.opened = true;
                iStream.config = configuration;
            } else {
                LOG.debug("Failed to open file [{}] because it doesn't exist", hdfsPath);
                iStream = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return iStream;
    }

    @Override
    public final void close() throws IOException {
        if (opened) {
            IOUtils.closeStream(in);
            HdfsInfo info = HdfsInfoFactory.newHdfsInfo(actualPath, config);
            info.getFileSystem().rename(new Path(suffixedPath), new Path(suffixedReadPath));
            opened = false;
        }
    }

    /**
     * Reads next record/chunk specific to give file type.
     * @param key
     * @param value
     * @return number of bytes read. 0 is correct number of bytes (empty file), -1 indicates no record was read
     */
    public final long next(Holder<Object> key, Holder<Object> value) {
        long nb = fileType.next(this, key, value);
        // when zero bytes was read from given type of file, we may still have a record (e.g., empty file)
        // null value.value is the only indication that no (new) record/chunk was read
        if (nb == 0 && numOfReadMessages.get() > 0) {
            // we've read all chunks from file, which size is exact multiple the chunk size
            return -1;
        }
        if (value.value != null) {
            numOfReadBytes.addAndGet(nb);
            numOfReadMessages.incrementAndGet();
            return nb;
        }
        return -1;
    }

    public final long getNumOfReadBytes() {
        return numOfReadBytes.longValue();
    }

    public final long getNumOfReadMessages() {
        return numOfReadMessages.longValue();
    }

    public final String getActualPath() {
        return actualPath;
    }

    public final int getChunkSize() {
        return chunkSize;
    }

    public final Closeable getIn() {
        return in;
    }

    public boolean isOpened() {
        return opened;
    }

}
