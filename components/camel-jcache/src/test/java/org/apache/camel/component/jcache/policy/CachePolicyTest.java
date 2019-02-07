package org.apache.camel.component.jcache.policy;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Test;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.CompleteConfiguration;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.CreatedExpiryPolicy;
import javax.cache.expiry.Duration;
import java.util.concurrent.TimeUnit;

public class CachePolicyTest extends CachePolicyTestBase {


    //Set cache - this use cases is also covered by tests in CachePolicyProcessorTest
    @Test
    public void testSetCache() throws Exception {
        final String key  = randomString();

        //Send exchange
        Object responseBody = this.template().requestBody("direct:policy-cache", key);

        //Verify the set cache was used
        assertEquals(generateValue(key),lookupCache("setCache").get(key));
        assertEquals(generateValue(key),responseBody);
        assertEquals(1,getMockEndpoint("mock:value").getExchanges().size());
    }

    //Set cacheManager, cacheName, cacheConfiguration
    @Test
    public void testSetManagerNameConfiguration() throws Exception {
        final String key  = randomString();

        //Send exchange
        Object responseBody = this.template().requestBody("direct:policy-manager-name-configuration", key);

        //Verify cache was created with the set configuration and used in route
        Cache cache = lookupCache("setManagerNameConfiguration");
        CompleteConfiguration completeConfiguration = (CompleteConfiguration) cache.getConfiguration(CompleteConfiguration.class);
        assertEquals(String.class,completeConfiguration.getKeyType());
        assertEquals(String.class,completeConfiguration.getValueType());
        assertEquals(CreatedExpiryPolicy.factoryOf(new Duration(TimeUnit.MINUTES, 60)),completeConfiguration.getExpiryPolicyFactory());
        assertEquals(generateValue(key), cache.get(key));
        assertEquals(generateValue(key), responseBody);
        assertEquals(1,getMockEndpoint("mock:value").getExchanges().size());
    }

    //Set cacheManager, cacheName
    @Test
    public void testSetManagerName() throws Exception {
        final String key  = randomString();

        //Send exchange
        Object responseBody = this.template().requestBody("direct:policy-manager-name", key);

        //Verify the cache was created with the name and used
        assertEquals(generateValue(key),lookupCache("setManagerName").get(key));
        assertEquals(generateValue(key),responseBody);
        assertEquals(1,getMockEndpoint("mock:value").getExchanges().size());
    }

    //Set cacheManager, cacheName - cache already exists
    @Test
    public void testSetManagerNameExists() throws Exception {
        final String key  = randomString();

        //Send exchange
        Object responseBody = this.template().requestBody("direct:policy-manager-name-exists", key);

        //Verify the existing cache with name was used
        assertEquals(generateValue(key),lookupCache("setManagerNameExists").get(key));
        assertEquals("dummy",lookupCache("setManagerNameExists").get("test"));
        assertEquals(generateValue(key),responseBody);
        assertEquals(1,getMockEndpoint("mock:value").getExchanges().size());
    }

    //Set cacheManager, cacheConfiguration
    @Test
    public void testSetManagerConfiguration() throws Exception {
        final String key  = randomString();

        //Send exchange
        Object responseBody = this.template().requestBody("direct:policy-manager-configuration", key);

        //Verify the cache was created with routeId and configuration
        Cache cache = lookupCache("direct-policy-manager-configuration");
        CompleteConfiguration completeConfiguration = (CompleteConfiguration) cache.getConfiguration(CompleteConfiguration.class);
        assertEquals(String.class,completeConfiguration.getKeyType());
        assertEquals(String.class,completeConfiguration.getValueType());
        assertEquals(CreatedExpiryPolicy.factoryOf(new Duration(TimeUnit.MINUTES, 61)),completeConfiguration.getExpiryPolicyFactory());

        assertEquals(generateValue(key),cache.get(key));
        assertEquals(generateValue(key),responseBody);
        assertEquals(1,getMockEndpoint("mock:value").getExchanges().size());
    }

    //Set cacheName - use CachingProvider to lookup CacheManager
    @Test
    public void testDefaultCacheManager() throws Exception {
        final String key  = randomString();

        //Send exchange
        Object responseBody = this.template().requestBody("direct:policy-default-manager", key);

        //Verify the default cacheManager was used, despite it was not set
        Cache cache = lookupCache("contextCacheManager");

        assertEquals(generateValue(key),cache.get(key));
        assertEquals(generateValue(key),responseBody);
        assertEquals(1,getMockEndpoint("mock:value").getExchanges().size());
    }

    //Not enabled
    @Test
    public void testNotEnabled() throws Exception {
        final String key  = randomString();

        //Send exchange
        Object responseBody = this.template().requestBody("direct:policy-not-enabled", key);

        //Verify the default cacheManager was used, despite it was not set
        Cache cache = lookupCache("notEnabled");

        assertNull(cache.get(key));
        assertEquals(generateValue(key),responseBody);
        assertEquals(1,getMockEndpoint("mock:value").getExchanges().size());
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                CacheManager cacheManager = Caching.getCachingProvider().getCacheManager();
                MutableConfiguration configuration;

                //Set cache
                Cache cache =cacheManager.createCache("setCache", new MutableConfiguration<>());
                CachePolicy cachePolicy = new CachePolicy();
                cachePolicy.setCache(cache);

                from("direct:policy-cache")
                        .policy(cachePolicy)
                        .to("mock:value");

                //Set cacheManager, cacheName, cacheConfiguration
                configuration = new MutableConfiguration<>();
                configuration.setTypes(String.class,String.class);
                configuration.setExpiryPolicyFactory(CreatedExpiryPolicy.factoryOf(new Duration(TimeUnit.MINUTES, 60)));
                cachePolicy = new CachePolicy();
                cachePolicy.setCacheManager(cacheManager);
                cachePolicy.setCacheName("setManagerNameConfiguration");
                cachePolicy.setCacheConfiguration(configuration);

                from("direct:policy-manager-name-configuration")
                        .policy(cachePolicy)
                        .to("mock:value");

                //Set cacheManager, cacheName
                cachePolicy = new CachePolicy();
                cachePolicy.setCacheManager(cacheManager);
                cachePolicy.setCacheName("setManagerName");

                from("direct:policy-manager-name")
                        .policy(cachePolicy)
                        .to("mock:value");

                //Set cacheManager, cacheName - cache already exists
                cache = cacheManager.createCache("setManagerNameExists",new MutableConfiguration<>());
                cache.put("test","dummy");
                cachePolicy = new CachePolicy();
                cachePolicy.setCacheManager(cacheManager);
                cachePolicy.setCacheName("setManagerNameExists");

                from("direct:policy-manager-name-exists")
                        .policy(cachePolicy)
                        .to("mock:value");

                //Set cacheManager, cacheConfiguration
                configuration = new MutableConfiguration<>();
                configuration.setTypes(String.class,String.class);
                configuration.setExpiryPolicyFactory(CreatedExpiryPolicy.factoryOf(new Duration(TimeUnit.MINUTES, 61)));
                cachePolicy = new CachePolicy();
                cachePolicy.setCacheManager(cacheManager);
                cachePolicy.setCacheConfiguration(configuration);

                from("direct:policy-manager-configuration").routeId("direct-policy-manager-configuration")
                        .policy(cachePolicy)
                        .to("mock:value");

                //Set cacheName - use CachingProvider to lookup CacheManager
                cachePolicy = new CachePolicy();
                cachePolicy.setCacheName("contextCacheManager");

                from("direct:policy-default-manager")
                        .policy(cachePolicy)
                        .to("mock:value");

                //Not enabled
                cachePolicy = new CachePolicy();
                cache = cacheManager.createCache("notEnabled", new MutableConfiguration<>());
                cachePolicy.setCache(cache);
                cachePolicy.setEnabled(false);

                from("direct:policy-not-enabled")
                        .policy(cachePolicy)
                        .to("mock:value");
            }
        };
    }


}
