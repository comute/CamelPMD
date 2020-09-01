
/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.olingo2.internal;

import org.apache.camel.support.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component Olingo2
 */
public enum Olingo2ApiName implements ApiName {

    DEFAULT("");


    private static final Olingo2ApiName[] CACHED_ENUM_VALUES = values();
    
    private final String name;

    private Olingo2ApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Olingo2ApiName fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].name.equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}
