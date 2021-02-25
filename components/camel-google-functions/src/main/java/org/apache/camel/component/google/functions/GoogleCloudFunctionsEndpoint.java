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
package org.apache.camel.component.google.functions;

import org.apache.camel.Category;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.support.DefaultEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Store and retrieve objects from Google Cloud Functions Service using the google-cloud-storage library.
 * 
 * Google Functions Endpoint definition represents a function within the GCP and contains configuration to customize the
 * behavior of Producer.
 */
@UriEndpoint(firstVersion = "3.9.0", scheme = "google-functions", title = "GoogleCloudFunctions",
             syntax = "google-functions:name",
             category = { Category.CLOUD }, producerOnly = true)
public class GoogleCloudFunctionsEndpoint extends DefaultEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(GoogleCloudFunctionsEndpoint.class);

    @UriParam
    private GoogleCloudFunctionsConfiguration configuration;

    public GoogleCloudFunctionsEndpoint(String uri, GoogleCloudFunctionsComponent component,
                                        GoogleCloudFunctionsConfiguration configuration) {
        super(uri, component);
        this.configuration = configuration;
        LOG.info("uris={}, configuration={}", uri, configuration);
    }

    public Producer createProducer() throws Exception {
        return new GoogleCloudFunctionsProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        throw new UnsupportedOperationException("Cannot consume from the google-functions endpoint: " + getEndpointUri());
    }

    public GoogleCloudFunctionsConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Setup configuration
     */
    public void setConfiguration(GoogleCloudFunctionsConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();

        System.out.println("start");
    }

    @Override
    protected void doStop() throws Exception {
        super.doStop();

        System.out.println("stop");
    }

}
