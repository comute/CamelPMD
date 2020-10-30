/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.multimap;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixMultiMapEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("resourceName", java.lang.String.class);
        map.put("atomix", io.atomix.Atomix.class);
        map.put("configurationUri", java.lang.String.class);
        map.put("defaultAction", org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action.class);
        map.put("key", java.lang.Object.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("nodes", java.lang.String.class);
        map.put("resultHeader", java.lang.String.class);
        map.put("transportClassName", java.lang.String.class);
        map.put("ttl", long.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("defaultResourceConfig", java.util.Properties.class);
        map.put("defaultResourceOptions", java.util.Properties.class);
        map.put("ephemeral", boolean.class);
        map.put("readConsistency", io.atomix.resource.ReadConsistency.class);
        map.put("resourceConfigs", java.util.Map.class);
        map.put("resourceOptions", java.util.Map.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(AtomixMultiMapEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtomixMultiMapEndpoint target = (AtomixMultiMapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": target.getConfiguration().setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultaction":
        case "defaultAction": target.getConfiguration().setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.multimap.AtomixMultiMap.Action.class, value)); return true;
        case "defaultresourceconfig":
        case "defaultResourceConfig": target.getConfiguration().setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultresourceoptions":
        case "defaultResourceOptions": target.getConfiguration().setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": target.getConfiguration().setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nodes": target.getConfiguration().setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "readconsistency":
        case "readConsistency": target.getConfiguration().setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceconfigs":
        case "resourceConfigs": target.getConfiguration().setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceoptions":
        case "resourceOptions": target.getConfiguration().setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "resultheader":
        case "resultHeader": target.getConfiguration().setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transportclassname":
        case "transportClassName": target.getConfiguration().setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AtomixMultiMapEndpoint target = (AtomixMultiMapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": return target.getConfiguration().getAtomix();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configurationuri":
        case "configurationUri": return target.getConfiguration().getConfigurationUri();
        case "defaultaction":
        case "defaultAction": return target.getConfiguration().getDefaultAction();
        case "defaultresourceconfig":
        case "defaultResourceConfig": return target.getConfiguration().getDefaultResourceConfig();
        case "defaultresourceoptions":
        case "defaultResourceOptions": return target.getConfiguration().getDefaultResourceOptions();
        case "ephemeral": return target.getConfiguration().isEphemeral();
        case "key": return target.getConfiguration().getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nodes": return target.getConfiguration().getNodes();
        case "readconsistency":
        case "readConsistency": return target.getConfiguration().getReadConsistency();
        case "resourceconfigs":
        case "resourceConfigs": return target.getConfiguration().getResourceConfigs();
        case "resourceoptions":
        case "resourceOptions": return target.getConfiguration().getResourceOptions();
        case "resultheader":
        case "resultHeader": return target.getConfiguration().getResultHeader();
        case "synchronous": return target.isSynchronous();
        case "transportclassname":
        case "transportClassName": return target.getConfiguration().getTransportClassName();
        case "ttl": return target.getConfiguration().getTtl();
        default: return null;
        }
    }
}

