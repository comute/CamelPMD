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
package org.apache.camel.model;

import org.apache.camel.model.language.ExpressionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A base class for nodes which contain an expression and a number of outputs
 *
 * @version $Revision: $
 */
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder = {"interceptors", "expression", "outputs"})
public class ExpressionNode extends ProcessorType {
    @XmlElement(required = false)
    private List<InterceptorRef> interceptors = new ArrayList<InterceptorRef>();// TODO can we zap this hack to get schemagen to generate the correct schema?
    @XmlElementRef
    private List<ExpressionType> expressions;
    @XmlTransient
    private ExpressionType expression;
    @XmlElementRef
    private List<ProcessorType> outputs = new ArrayList<ProcessorType>();

    public List<InterceptorRef> getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(List<InterceptorRef> interceptors) {
        this.interceptors = interceptors;
    }

    public ExpressionType getExpression() {
        if (expression == null && expressions != null && !expressions.isEmpty()) {
            expression = expressions.get(0);
        }
        return expression;
    }

    public void setExpression(ExpressionType expression) {
        this.expression = expression;
        this.expressions = Collections.singletonList(expression);
    }

    public List<ProcessorType> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<ProcessorType> outputs) {
        this.outputs = outputs;
    }
}
