/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.caffeine.load;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CaffeineLoadCacheComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.caffeine.CaffeineConfiguration getOrCreateConfiguration(CaffeineLoadCacheComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.caffeine.CaffeineConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CaffeineLoadCacheComponent target = (CaffeineLoadCacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": getOrCreateConfiguration(target).setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "cache": getOrCreateConfiguration(target).setCache(property(camelContext, com.github.benmanes.caffeine.cache.Cache.class, value)); return true;
        case "cacheloader":
        case "cacheLoader": getOrCreateConfiguration(target).setCacheLoader(property(camelContext, com.github.benmanes.caffeine.cache.CacheLoader.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.caffeine.CaffeineConfiguration.class, value)); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": getOrCreateConfiguration(target).setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "evictiontype":
        case "evictionType": getOrCreateConfiguration(target).setEvictionType(property(camelContext, org.apache.camel.component.caffeine.EvictionType.class, value)); return true;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": getOrCreateConfiguration(target).setExpireAfterAccessTime(property(camelContext, int.class, value)); return true;
        case "expireafterwritetime":
        case "expireAfterWriteTime": getOrCreateConfiguration(target).setExpireAfterWriteTime(property(camelContext, int.class, value)); return true;
        case "initialcapacity":
        case "initialCapacity": getOrCreateConfiguration(target).setInitialCapacity(property(camelContext, int.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "keytype":
        case "keyType": getOrCreateConfiguration(target).setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maximumsize":
        case "maximumSize": getOrCreateConfiguration(target).setMaximumSize(property(camelContext, int.class, value)); return true;
        case "removallistener":
        case "removalListener": getOrCreateConfiguration(target).setRemovalListener(property(camelContext, com.github.benmanes.caffeine.cache.RemovalListener.class, value)); return true;
        case "statscounter":
        case "statsCounter": getOrCreateConfiguration(target).setStatsCounter(property(camelContext, com.github.benmanes.caffeine.cache.stats.StatsCounter.class, value)); return true;
        case "statsenabled":
        case "statsEnabled": getOrCreateConfiguration(target).setStatsEnabled(property(camelContext, boolean.class, value)); return true;
        case "valuetype":
        case "valueType": getOrCreateConfiguration(target).setValueType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("action", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("cache", com.github.benmanes.caffeine.cache.Cache.class);
        answer.put("cacheLoader", com.github.benmanes.caffeine.cache.CacheLoader.class);
        answer.put("configuration", org.apache.camel.component.caffeine.CaffeineConfiguration.class);
        answer.put("createCacheIfNotExist", boolean.class);
        answer.put("evictionType", org.apache.camel.component.caffeine.EvictionType.class);
        answer.put("expireAfterAccessTime", int.class);
        answer.put("expireAfterWriteTime", int.class);
        answer.put("initialCapacity", int.class);
        answer.put("key", java.lang.Object.class);
        answer.put("keyType", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maximumSize", int.class);
        answer.put("removalListener", com.github.benmanes.caffeine.cache.RemovalListener.class);
        answer.put("statsCounter", com.github.benmanes.caffeine.cache.stats.StatsCounter.class);
        answer.put("statsEnabled", boolean.class);
        answer.put("valueType", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CaffeineLoadCacheComponent target = (CaffeineLoadCacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": getOrCreateConfiguration(target).getAction(); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "cache": getOrCreateConfiguration(target).getCache(); return true;
        case "cacheloader":
        case "cacheLoader": getOrCreateConfiguration(target).getCacheLoader(); return true;
        case "configuration": target.getConfiguration(); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": getOrCreateConfiguration(target).isCreateCacheIfNotExist(); return true;
        case "evictiontype":
        case "evictionType": getOrCreateConfiguration(target).getEvictionType(); return true;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": getOrCreateConfiguration(target).getExpireAfterAccessTime(); return true;
        case "expireafterwritetime":
        case "expireAfterWriteTime": getOrCreateConfiguration(target).getExpireAfterWriteTime(); return true;
        case "initialcapacity":
        case "initialCapacity": getOrCreateConfiguration(target).getInitialCapacity(); return true;
        case "key": getOrCreateConfiguration(target).getKey(); return true;
        case "keytype":
        case "keyType": getOrCreateConfiguration(target).getKeyType(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "maximumsize":
        case "maximumSize": getOrCreateConfiguration(target).getMaximumSize(); return true;
        case "removallistener":
        case "removalListener": getOrCreateConfiguration(target).getRemovalListener(); return true;
        case "statscounter":
        case "statsCounter": getOrCreateConfiguration(target).getStatsCounter(); return true;
        case "statsenabled":
        case "statsEnabled": getOrCreateConfiguration(target).isStatsEnabled(); return true;
        case "valuetype":
        case "valueType": getOrCreateConfiguration(target).getValueType(); return true;
        default: return null;
        }
    }
}

