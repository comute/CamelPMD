
/*
 * Camel ApiCollection generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.sheets.internal;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.component.google.sheets.GoogleSheetsConfiguration;
import org.apache.camel.component.google.sheets.SheetsSpreadsheetsEndpointConfiguration;
import org.apache.camel.component.google.sheets.SheetsSpreadsheetsValuesEndpointConfiguration;

import org.apache.camel.support.component.ApiCollection;
import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodHelper;

/**
 * Camel {@link ApiCollection} for GoogleSheets
 */
public final class GoogleSheetsApiCollection extends ApiCollection<GoogleSheetsApiName, GoogleSheetsConfiguration> {

    private static GoogleSheetsApiCollection collection;

    private GoogleSheetsApiCollection() {
        final Map<String, String> aliases = new HashMap<>();
        final Map<GoogleSheetsApiName, ApiMethodHelper<? extends ApiMethod>> apiHelpers = new EnumMap<>(GoogleSheetsApiName.class);
        final Map<Class<? extends ApiMethod>, GoogleSheetsApiName> apiMethods = new HashMap<>();

        List<String> nullableArgs;

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleSheetsApiName.SPREADSHEETS, new ApiMethodHelper<>(SheetsSpreadsheetsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(SheetsSpreadsheetsApiMethod.class, GoogleSheetsApiName.SPREADSHEETS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleSheetsApiName.DATA, new ApiMethodHelper<>(SheetsSpreadsheetsValuesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(SheetsSpreadsheetsValuesApiMethod.class, GoogleSheetsApiName.DATA);

        setApiHelpers(apiHelpers);
        setApiMethods(apiMethods);
    }

    public GoogleSheetsConfiguration getEndpointConfiguration(GoogleSheetsApiName apiName) {
        GoogleSheetsConfiguration result = null;
        switch (apiName) {
            case SPREADSHEETS:
                result = new SheetsSpreadsheetsEndpointConfiguration();
                break;
            case DATA:
                result = new SheetsSpreadsheetsValuesEndpointConfiguration();
                break;
        }
        return result;
    }

    public static synchronized GoogleSheetsApiCollection getCollection() {
        if (collection == null) {
            collection = new GoogleSheetsApiCollection();
        }
        return collection;
    }
}
