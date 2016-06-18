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
package org.apache.camel.component.influxdb;


import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriPath;
import org.influxdb.InfluxDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@UriEndpoint(scheme = "influxdb", title = "InfluxDB", syntax = "influxdb:connectionBean", label = "database,ticks")
public class InfluxDbEndpoint extends DefaultEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(InfluxDbEndpoint.class);

    private InfluxDB influxDB;

    @UriPath
    @Metadata(required = "true", description="Connection to the influx database, of class InfluxDB.class")
    private String connectionBean;

    @UriParam(description = "the name of the series where the points will be created, name can be modified dynamically by headers")
    private String databaseName;

    @UriParam(defaultValue = "default", description = "defines the retention policy for the points created in influxdb")
    private String retentionPolicy;

    @Override
    public Producer createProducer() throws Exception {
        return new InfluxDBProducer(this);
    }

    @Override
    public Consumer createConsumer(Processor processor) throws Exception {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void start() throws Exception {
        super.start();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void suspend() throws Exception {
        super.suspend();
    }

    @Override
    public void resume() throws Exception {
        super.resume();
    }

    @Override
    public void shutdown() throws Exception {
        super.shutdown();
    }

    public InfluxDB getInfluxDB() {
        return influxDB;
    }

    public void setInfluxDB(InfluxDB influxDB) {
        this.influxDB = influxDB;
    }

    /**
     * Getter for databaseName
     * @return the name of the database where the time series will be stored
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Setter for databaseName
     * @param databaseName
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * Getter for retentionPolicy
     * @return the string that defines the retention policy to the data created by the endpoint
     */
    public String getRetentionPolicy() {
        return retentionPolicy;
    }

    /**
     * Setter for retentionPolicy
     * @param retentionPolicy
     */
    public void setRetentionPolicy(String retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }
    
    /**
     * Getter for connectionBean
     * @return the name of the bean for the {@link org.influxdb.InfluxDB} connection
     */
    public String getConnectionBean() {
        return connectionBean;
    }

    /**
     * Name of {@link org.influxdb.InfluxDB} to use.
     */
    public void setConnectionBean(String connectionBean) {
        this.connectionBean = connectionBean;
    }
}
