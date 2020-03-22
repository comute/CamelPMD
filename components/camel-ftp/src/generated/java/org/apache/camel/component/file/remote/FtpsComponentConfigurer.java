/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.file.remote.FtpComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FtpsComponentConfigurer extends FtpComponentConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FtpsComponent target = (FtpsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = super.getAllOptions(target);
        answer.put("useGlobalSslContextParameters", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        FtpsComponent target = (FtpsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.isUseGlobalSslContextParameters(); return true;
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

