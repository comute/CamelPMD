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
package org.apache.camel.component.stitch;

import org.apache.camel.RuntimeCamelException;
import org.apache.camel.component.stitch.client.StitchRegion;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.apache.camel.spi.UriPath;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

@UriParams
public class StitchConfiguration implements Cloneable {

    @UriPath
    @Metadata(required = true)
    private String tableName;
    @UriParam(label = "security", secret = true)
    @Metadata(required = true)
    private String token;
    @UriParam(label = "producer", defaultValue = "europe")
    private StitchRegion region = StitchRegion.EUROPE;
    @UriParam(label = "producer,advance")
    @Metadata(autowired = true)
    private HttpClient httpClient;
    @UriParam(label = "producer,advance")
    @Metadata(autowired = true)
    private ConnectionProvider connectionProvider;

    /**
     * The name of the destination table the data is being pushed to. Table names must be unique in each destination
     * schema, or loading issues will occur.
     *
     * Note: The number of characters in the table name should be within the destination’s allowed limits or data will
     * rejected.
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Stitch access token for the Stitch Import API
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Stitch account region, e.g: europe
     */
    public StitchRegion getRegion() {
        return region;
    }

    public void setRegion(StitchRegion region) {
        this.region = region;
    }

    /**
     * Reactor Netty HttpClient, you can injected it if you want to have custom HttpClient
     */
    public HttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    /**
     * ConnectionProvider contain configuration for the HttpClient like Maximum connection limit .. etc, you can inject
     * this ConnectionProvider and the StitchClient will initialize HttpClient with this ConnectionProvider
     */
    public ConnectionProvider getConnectionProvider() {
        return connectionProvider;
    }

    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    // *************************************************
    //
    // *************************************************

    public StitchConfiguration copy() {
        try {
            return (StitchConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeCamelException(e);
        }
    }
}
