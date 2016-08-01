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
package org.apache.camel.component.ganglia.springboot;

import info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode;
import info.ganglia.gmetric4j.gmetric.GMetricSlope;
import info.ganglia.gmetric4j.gmetric.GMetricType;
import org.apache.camel.component.ganglia.GangliaConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The ganglia component is used for sending metrics to the Ganglia monitoring
 * system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.ganglia")
public class GangliaComponentConfiguration {

    /**
     * To use the shared configuration. Properties of the shared configuration
     * can also be set individually.
     */
    private GangliaConfiguration configuration;
    /**
     * Host name for Ganglia server
     */
    private String host;
    /**
     * Port for Ganglia server
     */
    private Integer port;
    /**
     * Send the UDP metric packets using MULTICAST or UNICAST
     */
    private UDPAddressingMode mode;
    /**
     * If using multicast set the TTL of the packets
     */
    private Integer ttl;
    /**
     * Use the wire format of Ganglia 3.1.0 and later versions. Set this to
     * false to use Ganglia 3.0.x or earlier.
     */
    private Boolean wireFormat31x = false;
    /**
     * Spoofing information IP:hostname
     */
    private String spoofHostname;
    /**
     * The group that the metric belongs to.
     */
    private String groupName;
    /**
     * Prefix the metric name with this string and an underscore.
     */
    private String prefix;
    /**
     * The name to use for the metric.
     */
    private String metricName;
    /**
     * The type of value
     */
    private GMetricType type;
    /**
     * The slope
     */
    private GMetricSlope slope;
    /**
     * Any unit of measurement that qualifies the metric e.g. widgets litres
     * bytes. Do not include a prefix such as k (kilo) or m (milli) other tools
     * may scale the units later. The value should be unscaled.
     */
    private String units;
    /**
     * Maximum time in seconds that the value can be considered current. After
     * this Ganglia considers the value to have expired.
     */
    private Integer tmax;
    /**
     * Minumum time in seconds before Ganglia will purge the metric value if it
     * expires. Set to 0 and the value will remain in Ganglia indefinitely until
     * a gmond agent restart.
     */
    private Integer dmax;

    public GangliaConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(GangliaConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public UDPAddressingMode getMode() {
        return mode;
    }

    public void setMode(UDPAddressingMode mode) {
        this.mode = mode;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public Boolean getWireFormat31x() {
        return wireFormat31x;
    }

    public void setWireFormat31x(Boolean wireFormat31x) {
        this.wireFormat31x = wireFormat31x;
    }

    public String getSpoofHostname() {
        return spoofHostname;
    }

    public void setSpoofHostname(String spoofHostname) {
        this.spoofHostname = spoofHostname;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public GMetricType getType() {
        return type;
    }

    public void setType(GMetricType type) {
        this.type = type;
    }

    public GMetricSlope getSlope() {
        return slope;
    }

    public void setSlope(GMetricSlope slope) {
        this.slope = slope;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getTmax() {
        return tmax;
    }

    public void setTmax(Integer tmax) {
        this.tmax = tmax;
    }

    public Integer getDmax() {
        return dmax;
    }

    public void setDmax(Integer dmax) {
        this.dmax = dmax;
    }
}