
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.olingo2.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.olingo2.api.Olingo2App;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.olingo2.api.Olingo2App
 */
public enum Olingo2AppApiMethod implements ApiMethod {

    BATCH(
        void.class,
        "batch",
        arg("edm", org.apache.olingo.odata2.api.edm.Edm.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("data", Object.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class)),

    CREATE(
        void.class,
        "create",
        arg("edm", org.apache.olingo.odata2.api.edm.Edm.class),
        arg("resourcePath", String.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("data", Object.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class)),

    DELETE(
        void.class,
        "delete",
        arg("resourcePath", String.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class)),

    MERGE(
        void.class,
        "merge",
        arg("edm", org.apache.olingo.odata2.api.edm.Edm.class),
        arg("resourcePath", String.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("data", Object.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class)),

    PATCH(
        void.class,
        "patch",
        arg("edm", org.apache.olingo.odata2.api.edm.Edm.class),
        arg("resourcePath", String.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("data", Object.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class)),

    READ(
        void.class,
        "read",
        arg("edm", org.apache.olingo.odata2.api.edm.Edm.class),
        arg("resourcePath", String.class),
        arg("queryParams", java.util.Map.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class)),

    UPDATE(
        void.class,
        "update",
        arg("edm", org.apache.olingo.odata2.api.edm.Edm.class),
        arg("resourcePath", String.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("data", Object.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class)),

    UREAD(
        void.class,
        "uread",
        arg("edm", org.apache.olingo.odata2.api.edm.Edm.class),
        arg("resourcePath", String.class),
        arg("queryParams", java.util.Map.class),
        arg("endpointHttpHeaders", java.util.Map.class),
        arg("responseHandler", org.apache.camel.component.olingo2.api.Olingo2ResponseHandler.class));

    private static final Olingo2AppApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private Olingo2AppApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Olingo2App.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static Olingo2AppApiMethod fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].getName().equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
