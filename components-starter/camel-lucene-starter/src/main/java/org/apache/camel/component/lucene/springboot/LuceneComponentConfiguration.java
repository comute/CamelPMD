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
package org.apache.camel.component.lucene.springboot;

import java.io.File;
import org.apache.camel.component.lucene.LuceneConfiguration;
import org.apache.camel.component.lucene.LuceneOperation;
import org.apache.lucene.analysis.Analyzer;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * To insert or query from Apache Lucene databases.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.lucene")
public class LuceneComponentConfiguration {

    /**
     * To use a shared lucene configuration. Properties of the shared
     * configuration can also be set individually.
     */
    private LuceneConfiguration config;
    /**
     * The URL to the lucene server
     */
    private String host;
    /**
     * Operation to do such as insert or query.
     */
    private LuceneOperation operation;
    /**
     * An optional directory containing files to be used to be analyzed and
     * added to the index at producer startup.
     */
    private File sourceDirectory;
    /**
     * A file system directory in which index files are created upon analysis of
     * the document by the specified analyzer
     */
    private File indexDirectory;
    /**
     * An Analyzer builds TokenStreams which analyze text. It thus represents a
     * policy for extracting index terms from text. The value for analyzer can
     * be any class that extends the abstract class
     * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
     * analyzers out of the box
     */
    private Analyzer analyzer;
    /**
     * An integer value that limits the result set of the search operation
     */
    private Integer maxHits;

    public LuceneConfiguration getConfig() {
        return config;
    }

    public void setConfig(LuceneConfiguration config) {
        this.config = config;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public LuceneOperation getOperation() {
        return operation;
    }

    public void setOperation(LuceneOperation operation) {
        this.operation = operation;
    }

    public File getSourceDirectory() {
        return sourceDirectory;
    }

    public void setSourceDirectory(File sourceDirectory) {
        this.sourceDirectory = sourceDirectory;
    }

    public File getIndexDirectory() {
        return indexDirectory;
    }

    public void setIndexDirectory(File indexDirectory) {
        this.indexDirectory = indexDirectory;
    }

    public Analyzer getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(Analyzer analyzer) {
        this.analyzer = analyzer;
    }

    public Integer getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(Integer maxHits) {
        this.maxHits = maxHits;
    }
}