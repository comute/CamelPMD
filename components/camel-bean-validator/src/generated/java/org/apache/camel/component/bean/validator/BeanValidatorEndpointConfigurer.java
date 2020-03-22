/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.bean.validator;

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
public class BeanValidatorEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BeanValidatorEndpoint target = (BeanValidatorEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "constraintvalidatorfactory":
        case "constraintValidatorFactory": target.setConstraintValidatorFactory(property(camelContext, javax.validation.ConstraintValidatorFactory.class, value)); return true;
        case "group": target.setGroup(property(camelContext, java.lang.String.class, value)); return true;
        case "ignorexmlconfiguration":
        case "ignoreXmlConfiguration": target.setIgnoreXmlConfiguration(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messageinterpolator":
        case "messageInterpolator": target.setMessageInterpolator(property(camelContext, javax.validation.MessageInterpolator.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "traversableresolver":
        case "traversableResolver": target.setTraversableResolver(property(camelContext, javax.validation.TraversableResolver.class, value)); return true;
        case "validationproviderresolver":
        case "validationProviderResolver": target.setValidationProviderResolver(property(camelContext, javax.validation.ValidationProviderResolver.class, value)); return true;
        case "validatorfactory":
        case "validatorFactory": target.setValidatorFactory(property(camelContext, javax.validation.ValidatorFactory.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("constraintValidatorFactory", javax.validation.ConstraintValidatorFactory.class);
        answer.put("group", java.lang.String.class);
        answer.put("ignoreXmlConfiguration", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("messageInterpolator", javax.validation.MessageInterpolator.class);
        answer.put("synchronous", boolean.class);
        answer.put("traversableResolver", javax.validation.TraversableResolver.class);
        answer.put("validationProviderResolver", javax.validation.ValidationProviderResolver.class);
        answer.put("validatorFactory", javax.validation.ValidatorFactory.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BeanValidatorEndpoint target = (BeanValidatorEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.isBasicPropertyBinding(); return true;
        case "constraintvalidatorfactory":
        case "constraintValidatorFactory": target.getConstraintValidatorFactory(); return true;
        case "group": target.getGroup(); return true;
        case "ignorexmlconfiguration":
        case "ignoreXmlConfiguration": target.isIgnoreXmlConfiguration(); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.isLazyStartProducer(); return true;
        case "messageinterpolator":
        case "messageInterpolator": target.getMessageInterpolator(); return true;
        case "synchronous": target.isSynchronous(); return true;
        case "traversableresolver":
        case "traversableResolver": target.getTraversableResolver(); return true;
        case "validationproviderresolver":
        case "validationProviderResolver": target.getValidationProviderResolver(); return true;
        case "validatorfactory":
        case "validatorFactory": target.getValidatorFactory(); return true;
        default: return null;
        }
    }
}

