/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.docker;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DockerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.docker.DockerConfiguration getOrCreateConfiguration(DockerComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.docker.DockerConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DockerComponent target = (DockerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "certpath":
        case "certPath": getOrCreateConfiguration(target).setCertPath(property(camelContext, java.lang.String.class, value)); return true;
        case "cmdexecfactory":
        case "cmdExecFactory": getOrCreateConfiguration(target).setCmdExecFactory(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.docker.DockerConfiguration.class, value)); return true;
        case "email": getOrCreateConfiguration(target).setEmail(property(camelContext, java.lang.String.class, value)); return true;
        case "followredirectfilter":
        case "followRedirectFilter": getOrCreateConfiguration(target).setFollowRedirectFilter(property(camelContext, boolean.class, value)); return true;
        case "host": getOrCreateConfiguration(target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loggingfilter":
        case "loggingFilter": getOrCreateConfiguration(target).setLoggingFilter(property(camelContext, boolean.class, value)); return true;
        case "maxperrouteconnections":
        case "maxPerRouteConnections": getOrCreateConfiguration(target).setMaxPerRouteConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxtotalconnections":
        case "maxTotalConnections": getOrCreateConfiguration(target).setMaxTotalConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "parameters": getOrCreateConfiguration(target).setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "port": getOrCreateConfiguration(target).setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": getOrCreateConfiguration(target).setRequestTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "secure": getOrCreateConfiguration(target).setSecure(property(camelContext, boolean.class, value)); return true;
        case "serveraddress":
        case "serverAddress": getOrCreateConfiguration(target).setServerAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "socket": getOrCreateConfiguration(target).setSocket(property(camelContext, boolean.class, value)); return true;
        case "tlsverify":
        case "tlsVerify": getOrCreateConfiguration(target).setTlsVerify(property(camelContext, boolean.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "certpath":
        case "certPath": return java.lang.String.class;
        case "cmdexecfactory":
        case "cmdExecFactory": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.docker.DockerConfiguration.class;
        case "email": return java.lang.String.class;
        case "followredirectfilter":
        case "followRedirectFilter": return boolean.class;
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "loggingfilter":
        case "loggingFilter": return boolean.class;
        case "maxperrouteconnections":
        case "maxPerRouteConnections": return java.lang.Integer.class;
        case "maxtotalconnections":
        case "maxTotalConnections": return java.lang.Integer.class;
        case "parameters": return java.util.Map.class;
        case "password": return java.lang.String.class;
        case "port": return java.lang.Integer.class;
        case "requesttimeout":
        case "requestTimeout": return java.lang.Integer.class;
        case "secure": return boolean.class;
        case "serveraddress":
        case "serverAddress": return java.lang.String.class;
        case "socket": return boolean.class;
        case "tlsverify":
        case "tlsVerify": return boolean.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DockerComponent target = (DockerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "certpath":
        case "certPath": return getOrCreateConfiguration(target).getCertPath();
        case "cmdexecfactory":
        case "cmdExecFactory": return getOrCreateConfiguration(target).getCmdExecFactory();
        case "configuration": return target.getConfiguration();
        case "email": return getOrCreateConfiguration(target).getEmail();
        case "followredirectfilter":
        case "followRedirectFilter": return getOrCreateConfiguration(target).isFollowRedirectFilter();
        case "host": return getOrCreateConfiguration(target).getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loggingfilter":
        case "loggingFilter": return getOrCreateConfiguration(target).isLoggingFilter();
        case "maxperrouteconnections":
        case "maxPerRouteConnections": return getOrCreateConfiguration(target).getMaxPerRouteConnections();
        case "maxtotalconnections":
        case "maxTotalConnections": return getOrCreateConfiguration(target).getMaxTotalConnections();
        case "parameters": return getOrCreateConfiguration(target).getParameters();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "port": return getOrCreateConfiguration(target).getPort();
        case "requesttimeout":
        case "requestTimeout": return getOrCreateConfiguration(target).getRequestTimeout();
        case "secure": return getOrCreateConfiguration(target).isSecure();
        case "serveraddress":
        case "serverAddress": return getOrCreateConfiguration(target).getServerAddress();
        case "socket": return getOrCreateConfiguration(target).isSocket();
        case "tlsverify":
        case "tlsVerify": return getOrCreateConfiguration(target).isTlsVerify();
        case "username": return getOrCreateConfiguration(target).getUsername();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "parameters": return java.lang.Object.class;
        default: return null;
        }
    }
}

