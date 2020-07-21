/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.IncomingPhoneNumberTollFreeEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class IncomingPhoneNumberTollFreeEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.IncomingPhoneNumberTollFreeEndpointConfiguration target = (org.apache.camel.component.twilio.IncomingPhoneNumberTollFreeEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "PathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "phonenumber":
        case "PhoneNumber": target.setPhoneNumber(property(camelContext, com.twilio.type.PhoneNumber.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        answer.put("MethodName", java.lang.String.class);
        answer.put("PathAccountSid", java.lang.String.class);
        answer.put("PhoneNumber", com.twilio.type.PhoneNumber.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.IncomingPhoneNumberTollFreeEndpointConfiguration target = (org.apache.camel.component.twilio.IncomingPhoneNumberTollFreeEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "pathaccountsid":
        case "PathAccountSid": return target.getPathAccountSid();
        case "phonenumber":
        case "PhoneNumber": return target.getPhoneNumber();
        default: return null;
        }
    }
}

