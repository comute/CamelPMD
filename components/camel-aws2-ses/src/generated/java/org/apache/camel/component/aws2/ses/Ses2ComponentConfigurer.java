/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ses;

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
public class Ses2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("amazonSESClient", software.amazon.awssdk.services.ses.SesClient.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("configuration", org.apache.camel.component.aws2.ses.Ses2Configuration.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("region", java.lang.String.class);
        map.put("replyToAddresses", java.util.List.class);
        map.put("returnPath", java.lang.String.class);
        map.put("subject", java.lang.String.class);
        map.put("to", java.util.List.class);
        map.put("trustAllCertificates", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(Ses2ComponentConfigurer::clearConfigurers);
    }

    private org.apache.camel.component.aws2.ses.Ses2Configuration getOrCreateConfiguration(Ses2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.ses.Ses2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Ses2Component target = (Ses2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsesclient":
        case "amazonSESClient": getOrCreateConfiguration(target).setAmazonSESClient(property(camelContext, software.amazon.awssdk.services.ses.SesClient.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.ses.Ses2Configuration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "replytoaddresses":
        case "replyToAddresses": getOrCreateConfiguration(target).setReplyToAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "returnpath":
        case "returnPath": getOrCreateConfiguration(target).setReturnPath(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "subject": getOrCreateConfiguration(target).setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "to": getOrCreateConfiguration(target).setTo(property(camelContext, java.util.List.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
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
        Ses2Component target = (Ses2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonsesclient":
        case "amazonSESClient": return getOrCreateConfiguration(target).getAmazonSESClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configuration": return target.getConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "replytoaddresses":
        case "replyToAddresses": return getOrCreateConfiguration(target).getReplyToAddresses();
        case "returnpath":
        case "returnPath": return getOrCreateConfiguration(target).getReturnPath();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "subject": return getOrCreateConfiguration(target).getSubject();
        case "to": return getOrCreateConfiguration(target).getTo();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        default: return null;
        }
    }
}

