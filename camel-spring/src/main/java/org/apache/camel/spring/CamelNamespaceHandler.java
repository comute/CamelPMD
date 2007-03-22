package org.apache.camel.spring;

import org.apache.camel.spring.builder.CamelBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CamelNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		 registerBeanDefinitionParser("routeBuilder", new CamelBeanDefinitionParser());    
	}

}
