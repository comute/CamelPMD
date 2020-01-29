/* Generated by camel-package-maven-plugin - do not edit this file! */
package org.apache.camel.component.fhir;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Source code generated by camel-package-maven-plugin - do not edit this file!
 */
@SuppressWarnings("unchecked")
public class FhirJsonDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        FhirJsonDataFormat dataformat = (FhirJsonDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "fhirversion":
        case "fhirVersion": dataformat.setFhirVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "serverbaseurl":
        case "serverBaseUrl": dataformat.setServerBaseUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "omitresourceid":
        case "omitResourceId": dataformat.setOmitResourceId(property(camelContext, boolean.class, value)); return true;
        case "encodeelementsappliestochildresourcesonly":
        case "encodeElementsAppliesToChildResourcesOnly": dataformat.setEncodeElementsAppliesToChildResourcesOnly(property(camelContext, boolean.class, value)); return true;
        case "encodeelements":
        case "encodeElements": dataformat.setEncodeElements(property(camelContext, java.util.Set.class, value)); return true;
        case "dontencodeelements":
        case "dontEncodeElements": dataformat.setDontEncodeElements(property(camelContext, java.util.Set.class, value)); return true;
        case "stripversionsfromreferences":
        case "stripVersionsFromReferences": dataformat.setStripVersionsFromReferences(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "overrideresourceidwithbundleentryfullurl":
        case "overrideResourceIdWithBundleEntryFullUrl": dataformat.setOverrideResourceIdWithBundleEntryFullUrl(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "summarymode":
        case "summaryMode": dataformat.setSummaryMode(property(camelContext, boolean.class, value)); return true;
        case "suppressnarratives":
        case "suppressNarratives": dataformat.setSuppressNarratives(property(camelContext, boolean.class, value)); return true;
        case "dontstripversionsfromreferencesatpaths":
        case "dontStripVersionsFromReferencesAtPaths": dataformat.setDontStripVersionsFromReferencesAtPaths(property(camelContext, java.util.List.class, value)); return true;
        default: return false;
        }
    }

}

