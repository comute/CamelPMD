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
package org.apache.camel.component.workday;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;

import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.apache.camel.spi.UriPath;
import org.apache.camel.util.ObjectHelper;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

@UriParams
public class WorkdayConfiguration {

    // Implemented entities
    public enum Entity {
        report,
        commonAPI
    }

    @UriPath(description = "The entity to be requested or subscribed via API.", enums = "report,commonAPI")
    @Metadata(required = true)
    private Entity entity;

    @UriPath(description = "The API path to access an entity structure.")
    @Metadata(required = true)
    private String path;

    @UriParam(label = "security", secret = true, description = "Workday client Id generated by API client for integrations.")
    @Metadata(required = true)
    private String clientId;

    @UriParam(label = "security", secret = true, description = "Workday client Secret generated by API client for integrations.")
    @Metadata(required = true)
    private String clientSecret;

    @UriParam(label = "security", secret = true, description = "Workday token Refresh generated for integrations system user.")
    @Metadata(required = true)
    private String tokenRefresh;

    @UriParam(label = "host", description = "Workday Host name.")
    @Metadata(required = true)
    private String host;

    @UriParam(label = "tenant", description = "Workday Tenant name.")
    @Metadata(required = true)
    private String tenant;

    @UriParam(label = "format", description = "Workday Report as a service output format.",  enums = "json", defaultValue = "json")
    private String reportFormat = "json";

    @UriParam(label = "advanced", description = "Pool connection manager for advanced configuration.")
    private PoolingHttpClientConnectionManager httpConnectionManager = new PoolingHttpClientConnectionManager();

    private Map<String, Object> parameters;

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getTokenRefresh() {
        return tokenRefresh;
    }

    public void setTokenRefresh(String tokenRefresh) {
        this.tokenRefresh = tokenRefresh;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public PoolingHttpClientConnectionManager getHttpConnectionManager() {
        return httpConnectionManager;
    }

    public void setHttpConnectionManager(PoolingHttpClientConnectionManager httpConnectionManager) {
        this.httpConnectionManager = httpConnectionManager;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public void parseURI(String remaining, Map<String, Object> parameters) throws Exception {
        String entity;
        String path;
        try {
            URI u = new URI(remaining);
            entity = u.getScheme();
            path = u.getPath();
        } catch (Exception e) {
            throw new MalformedURLException(String.format("An invalid workday remaining uri: '%s' was provided. Error: '%s'", remaining, e.getMessage()));
        }
        ObjectHelper.notNull(entity, "Entity");

        setPath(path);
        setEntity(Entity.valueOf(entity));
        setParameters(parameters);
    }
}