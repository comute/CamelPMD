/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty.http;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.netty.NettyComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NettyHttpComponentConfigurer extends NettyComponentConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NettyHttpComponent target = (NettyHttpComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "nettyhttpbinding":
        case "nettyHttpBinding": target.setNettyHttpBinding(property(camelContext, org.apache.camel.component.netty.http.NettyHttpBinding.class, value)); return true;
        case "securityconfiguration":
        case "securityConfiguration": target.setSecurityConfiguration(property(camelContext, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = super.getAllOptions(target);
        answer.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        answer.put("nettyHttpBinding", org.apache.camel.component.netty.http.NettyHttpBinding.class);
        answer.put("securityConfiguration", org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        NettyHttpComponent target = (NettyHttpComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "nettyhttpbinding":
        case "nettyHttpBinding": return target.getNettyHttpBinding();
        case "securityconfiguration":
        case "securityConfiguration": return target.getSecurityConfiguration();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

