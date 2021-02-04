/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul.endpoint;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.spi.InvokeOnHeaderStrategy;
import org.apache.camel.component.consul.endpoint.ConsulHealthProducer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulHealthProducerInvokeOnHeaderFactory implements InvokeOnHeaderStrategy {

    @Override
    public Object invoke(Object obj, String key, Exchange exchange, AsyncCallback callback) throws Exception {
        org.apache.camel.component.consul.endpoint.ConsulHealthProducer target = (org.apache.camel.component.consul.endpoint.ConsulHealthProducer) obj;
        switch (key) {
        case "node_checks":
        case "NODE_CHECKS": target.nodeChecks(exchange.getMessage()); return null;
        case "service_instances":
        case "SERVICE_INSTANCES": target.serviceInstances(exchange.getMessage()); return null;
        case "service_checks":
        case "SERVICE_CHECKS": target.serviceChecks(exchange.getMessage()); return null;
        case "checks":
        case "CHECKS": target.checks(exchange.getMessage()); return null;
        default: return null;
        }
    }

}

