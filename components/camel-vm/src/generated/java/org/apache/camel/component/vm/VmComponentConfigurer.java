/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vm;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.seda.SedaComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VmComponentConfigurer extends SedaComponentConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bridgeErrorHandler", boolean.class);
        map.put("concurrentConsumers", int.class);
        map.put("defaultBlockWhenFull", boolean.class);
        map.put("defaultDiscardWhenFull", boolean.class);
        map.put("defaultOfferTimeout", long.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("defaultQueueFactory", org.apache.camel.component.seda.BlockingQueueFactory.class);
        map.put("queueSize", int.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(VmComponentConfigurer::clearConfigurers);
    }

}

