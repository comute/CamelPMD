/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.flink;

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
public class FlinkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("endpointType", org.apache.camel.component.flink.EndpointType.class);
        map.put("collect", boolean.class);
        map.put("dataSet", org.apache.flink.api.java.DataSet.class);
        map.put("dataSetCallback", org.apache.camel.component.flink.DataSetCallback.class);
        map.put("dataStream", org.apache.flink.streaming.api.datastream.DataStream.class);
        map.put("dataStreamCallback", org.apache.camel.component.flink.DataStreamCallback.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FlinkEndpoint target = (FlinkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "collect": target.setCollect(property(camelContext, boolean.class, value)); return true;
        case "dataset":
        case "dataSet": target.setDataSet(property(camelContext, org.apache.flink.api.java.DataSet.class, value)); return true;
        case "datasetcallback":
        case "dataSetCallback": target.setDataSetCallback(property(camelContext, org.apache.camel.component.flink.DataSetCallback.class, value)); return true;
        case "datastream":
        case "dataStream": target.setDataStream(property(camelContext, org.apache.flink.streaming.api.datastream.DataStream.class, value)); return true;
        case "datastreamcallback":
        case "dataStreamCallback": target.setDataStreamCallback(property(camelContext, org.apache.camel.component.flink.DataStreamCallback.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        FlinkEndpoint target = (FlinkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "collect": return target.isCollect();
        case "dataset":
        case "dataSet": return target.getDataSet();
        case "datasetcallback":
        case "dataSetCallback": return target.getDataSetCallback();
        case "datastream":
        case "dataStream": return target.getDataStream();
        case "datastreamcallback":
        case "dataStreamCallback": return target.getDataStreamCallback();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

