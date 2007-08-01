/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.spring.bind;

import static org.apache.camel.util.ObjectHelper.isNullOrBlank;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Message;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.spring.util.MethodInvocationStrategy;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Method;

/**
 * A {@link Processor} which converts the inbound exchange to a method invocation on a POJO
 *
 * @version $Revision: $
 */
public class BeanProcessor implements Processor {
    public static final String METHOD_NAME = "org.apache.camel.MethodName";
    private static final Log log = LogFactory.getLog(BeanProcessor.class);

    private final Object pojo;
    private final BeanInfo beanInfo;
    private Method method;
    private String methodName;

    public BeanProcessor(Object pojo, BeanInfo beanInfo) {
        this.pojo = pojo;
        this.beanInfo = beanInfo;
    }

    public BeanProcessor(Object pojo, MethodInvocationStrategy invocationStrategy) {
        this(pojo, new BeanInfo(pojo.getClass(), invocationStrategy));
    }

    @Override
    public String toString() {
        String description = method != null ? " " + method : "";
        return "BeanProcessor[" + pojo + description + "]";
    }

    public void process(Exchange exchange) throws Exception {
        if (log.isDebugEnabled()) {
            log.debug(">>>> invoking method for: " + exchange);
        }
        MethodInvocation invocation;
        if (method != null) {
            invocation = beanInfo.createInvocation(method, pojo, exchange);
        }
        else {
            // lets pass in the method name to use if its specified
            if (ObjectHelper.isNotNullAndNonEmpty(methodName)) {
                Message in = exchange.getIn();
                if (isNullOrBlank(in.getHeader(METHOD_NAME, String.class))) {
                    in.setHeader(METHOD_NAME, methodName);
                }
            }
            invocation = beanInfo.createInvocation(pojo, exchange);
        }
        if (invocation == null) {
            throw new IllegalStateException("No method invocation could be created");
        }
        try {
            Object value = invocation.proceed();
            if (value != null) {
                exchange.getIn().setBody(value);
            }
        }
        catch (Exception e) {
            throw e;
        }
        catch (Throwable throwable) {
            throw new Exception(throwable);
        }
    }

    // Properties
    //-----------------------------------------------------------------------

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
