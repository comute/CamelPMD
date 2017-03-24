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
package org.apache.camel.component.elsql.springboot;

import javax.sql.DataSource;
import com.opengamma.elsql.ElSqlConfig;
import org.apache.camel.component.elsql.ElSqlDatabaseVendor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The elsql component is an extension to the existing SQL Component that uses
 * ElSql to define the SQL queries.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.elsql")
public class ElsqlComponentConfiguration {

    /**
     * To use a vendor specific com.opengamma.elsql.ElSqlConfig
     */
    private ElSqlDatabaseVendor databaseVendor;
    /**
     * Sets the DataSource to use to communicate with the database.
     */
    private DataSource dataSource;
    /**
     * To use a specific configured ElSqlConfig. It may be better to use the
     * databaseVendor option instead.
     */
    @NestedConfigurationProperty
    private ElSqlConfig elSqlConfig;
    /**
     * The resource file which contains the elsql SQL statements to use. You can
     * specify multiple resources separated by comma. The resources are loaded
     * on the classpath by default you can prefix with file: to load from file
     * system. Notice you can set this option on the component and then you do
     * not have to configure this on the endpoint.
     */
    private String resourceUri;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public ElSqlDatabaseVendor getDatabaseVendor() {
        return databaseVendor;
    }

    public void setDatabaseVendor(ElSqlDatabaseVendor databaseVendor) {
        this.databaseVendor = databaseVendor;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ElSqlConfig getElSqlConfig() {
        return elSqlConfig;
    }

    public void setElSqlConfig(ElSqlConfig elSqlConfig) {
        this.elSqlConfig = elSqlConfig;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}