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
package org.apache.camel.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.camel.CamelContext;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.model.RouteTemplateDefinition;

/**
 * Fluent builder for adding new routes from route templates.
 */
public final class RouteTemplateParameterBuilder {

    private final CamelContext camelContext;
    private final String routeTemplateId;
    private String routeId;
    private final Map<String, Object> parameters = new HashMap<>();
    private Consumer<RouteTemplateDefinition> handler;

    public static RouteTemplateParameterBuilder builder(CamelContext camelContext, String routeTemplateId) {
        return new RouteTemplateParameterBuilder(camelContext, routeTemplateId);
    }

    private RouteTemplateParameterBuilder(CamelContext camelContext, String routeTemplateId) {
        this.camelContext = camelContext;
        this.routeTemplateId = routeTemplateId;
    }

    /**
     * Sets the id of the route.
     * If no route id is configured, then Camel will auto assign a route id, which is returned from the build method.
     *
     * @param routeId the route id
     */
    public RouteTemplateParameterBuilder routeId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * Adds a parameter the route template will use when creating the route.
     *
     * @param name  parameter name
     * @param value parameter value
     */
    public RouteTemplateParameterBuilder parameter(String name, Object value) {
        parameters.put(name, value);
        return this;
    }

    public RouteTemplateParameterBuilder handler(Consumer<RouteTemplateDefinition> handler) {
        this.handler = handler;
        return this;
    }


    /**
     * Adds the route to the {@link CamelContext} which is built from the configured route template.
     *
     * @return the route id of the route that was added.
     */
    public String add() {
        try {
            if (handler != null) {
                RouteTemplateDefinition def = camelContext.adapt(ModelCamelContext.class).getRouteTemplateDefinition(routeTemplateId);
                if (def == null) {
                    throw new IllegalArgumentException("Cannot find RouteTemplate with id " + routeTemplateId);
                }
                handler.accept(def);
            }
            return camelContext.addRouteFromTemplate(routeId, routeTemplateId, parameters);
        } catch (Exception e) {
            throw RuntimeCamelException.wrapRuntimeException(e);
        }
    }
}
