/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.watch;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FileWatchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FileWatchComponent target = (FileWatchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "queuesize":
        case "queueSize": target.setQueueSize(property(camelContext, int.class, value)); return true;
        case "pollthreads":
        case "pollThreads": target.setPollThreads(property(camelContext, int.class, value)); return true;
        case "filehasher":
        case "fileHasher": target.setFileHasher(property(camelContext, io.methvin.watcher.hashing.FileHasher.class, value)); return true;
        case "usefilehashing":
        case "useFileHashing": target.setUseFileHashing(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

