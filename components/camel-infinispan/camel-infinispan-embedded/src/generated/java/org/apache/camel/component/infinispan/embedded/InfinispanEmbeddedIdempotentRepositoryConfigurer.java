/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.infinispan.embedded;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedIdempotentRepository;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class InfinispanEmbeddedIdempotentRepositoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedIdempotentRepository target = (org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachecontainer":
        case "cacheContainer": target.setCacheContainer(property(camelContext, org.infinispan.manager.EmbeddedCacheManager.class, value)); return true;
        case "cachename":
        case "cacheName": target.setCacheName(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachecontainer":
        case "cacheContainer": return org.infinispan.manager.EmbeddedCacheManager.class;
        case "cachename":
        case "cacheName": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedIdempotentRepository target = (org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachecontainer":
        case "cacheContainer": return target.getCacheContainer();
        case "cachename":
        case "cacheName": return target.getCacheName();
        case "configuration": return target.getConfiguration();
        default: return null;
        }
    }
}
