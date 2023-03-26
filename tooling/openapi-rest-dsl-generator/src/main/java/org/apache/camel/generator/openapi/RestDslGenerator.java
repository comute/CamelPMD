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
package org.apache.camel.generator.openapi;

import java.net.URI;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

import javax.annotation.processing.Filer;

import io.apicurio.datamodels.core.models.common.Server;
import io.apicurio.datamodels.core.models.common.ServerVariable;
import io.apicurio.datamodels.openapi.models.OasDocument;
import io.apicurio.datamodels.openapi.v2.models.Oas20Document;
import io.apicurio.datamodels.openapi.v3.models.Oas30Document;
import io.apicurio.datamodels.openapi.v3.models.Oas30Server;
import org.apache.camel.model.rest.RestsDefinition;

import static org.apache.camel.util.ObjectHelper.notNull;

/**
 * Source code and {@link RestsDefinition} generator that generates Camel REST DSL implementations from OpenAPI
 * specifications.
 */
public abstract class RestDslGenerator<G> {

    String apiContextPath;

    DestinationGenerator destinationGenerator;

    String destinationToSyntax;

    final OasDocument document;

    OperationFilter filter = new OperationFilter();

    String restComponent;

    String restContextPath;

    boolean clientRequestValidation;

    boolean springBootProject;

    boolean springComponent;

    String basePath;

    RestDslGenerator(final OasDocument document) {
        this.document = notNull(document, "document");
    }

    public G asSpringBootProject() {
        this.springBootProject = true;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G asSpringComponent() {
        this.springComponent = true;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withApiContextPath(final String contextPath) {
        this.apiContextPath = contextPath;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withClientRequestValidation() {
        this.clientRequestValidation = true;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withBasePath(final String basePath) {
        this.basePath = basePath;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withDestinationGenerator(final DestinationGenerator destinationGenerator) {
        this.destinationGenerator = destinationGenerator;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    /**
     * Syntax to use for to uri.
     *
     * The default is <tt>direct:${operationId}</tt>
     */
    public G withDestinationToSyntax(final String destinationToSyntax) {
        this.destinationToSyntax = destinationToSyntax;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withOperationFilter(final OperationFilter filter) {
        this.filter = filter;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withOperationFilter(final String include) {
        this.filter.setIncludes(include);

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withRestComponent(final String restComponent) {
        this.restComponent = restComponent;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    public G withRestContextPath(final String contextPath) {
        this.restContextPath = contextPath;

        @SuppressWarnings("unchecked")
        final G that = (G) this;

        return that;
    }

    DestinationGenerator destinationGenerator() {
        if (destinationGenerator == null) {
            destinationGenerator = destinationToSyntax != null
                    ? new DefaultDestinationGenerator(destinationToSyntax) : new DefaultDestinationGenerator();
        }
        return destinationGenerator;
    }

    public static String determineBasePathFrom(final String parameter, final OasDocument document) {
        return parameter != null
                ? determineBasePathFrom(parameter) : determineBasePathFrom(document);
    }

    public static String determineBasePathFrom(final String parameter) {
        Objects.requireNonNull(parameter, "parameter");

        return prepareBasePath(parameter.trim());
    }

    public static String determineBasePathFrom(final OasDocument document) {
        Objects.requireNonNull(document, "document");

        if (document instanceof Oas20Document) {
            return ((Oas20Document) document).basePath;
        } else if (document instanceof Oas30Document) {
            final Oas30Document oas30Document = (Oas30Document) document;
            final List<Server> servers = oas30Document.getServers();

            if (servers == null || servers.get(0) == null) {
                return "";
            }

            final Oas30Server firstServer = (Oas30Server) servers.get(0);
            final URI serverUrl = URI.create(resolveVariablesIn(firstServer.url, firstServer));
            return prepareBasePath(serverUrl.getPath());
        }

        throw new IllegalArgumentException("Unsupported document type: " + document.getClass().getName());
    }

    private static String prepareBasePath(String basePath) {
        if (basePath == null || basePath.length() == 0) {
            return "";
        }

        if (basePath.charAt(0) != '/') {
            basePath = '/' + basePath;
        }

        if (basePath.indexOf("//") == 0) {
            // strip off the first "/" if double "/" exists
            basePath = basePath.substring(1);
        }

        if ("/".equals(basePath)) {
            basePath = "";
        }

        return basePath;
    }

    public static String determineHostFrom(final OasDocument document) {
        if (document instanceof Oas20Document) {
            return ((Oas20Document) document).host;
        } else if (document instanceof Oas30Document) {
            final Oas30Document oas30Document = (Oas30Document) document;
            final List<Server> servers = oas30Document.getServers();

            if (servers == null || servers.get(0) == null) {
                return "";
            }

            final Oas30Server firstServer = (Oas30Server) servers.get(0);

            final URI serverUrl = URI.create(resolveVariablesIn(firstServer.url, firstServer));

            return serverUrl.getHost();
        }

        throw new IllegalArgumentException("Unsupported document type: " + document.getClass().getName());
    }

    public static String resolveVariablesIn(final String url, final Oas30Server server) {
        final List<ServerVariable> variables = Objects.requireNonNull(server, "server").getServerVariables();
        String withoutPlaceholders = url;
        for (final ServerVariable variable : variables) {
            final String name = '{' + variable.getName() + '}';
            withoutPlaceholders = withoutPlaceholders.replace(name, variable.default_);
        }

        return withoutPlaceholders;
    }

    public static RestDslSourceCodeGenerator<Appendable> toAppendable(final OasDocument document) {
        return new AppendableGenerator(document);
    }

    public static RestDslDefinitionGenerator toDefinition(final OasDocument document) {
        return new RestDslDefinitionGenerator(document);
    }

    public static RestDslSourceCodeGenerator<Filer> toFiler(final OasDocument document) {
        return new FilerGenerator(document);
    }

    public static RestDslSourceCodeGenerator<Path> toPath(final OasDocument document) {
        return new PathGenerator(document);
    }

    public static RestDslXmlGenerator toXml(final OasDocument document) {
        return new RestDslXmlGenerator(document);
    }

    public static RestDslYamlGenerator toYaml(final OasDocument document) {
        return new RestDslYamlGenerator(document);
    }
}
