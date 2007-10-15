/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder;

import org.apache.camel.model.language.ExpressionType;


/**
 * TODO workaround for a compiler bug. Remove ASAP!
 * We seem to get compile time errors when creating routes of the form
 *
 * <code>from("foo").filter().xpath("//foo").to("bar")</code>
 * as the type of the return value of xpath(String) is of type {@link Object} rather than
 * the expected FilterType if we remove the "extends ProcessorType" from the T declaration
 * so we've split the ExpressionClause class into two; one with the extends and one without
 * with some cut and paste between them which is not ideal
 *
 * @version $Revision: 1.1 $
 */
public class ExpressionClauseSupport<T> extends ExpressionType {
    private T result;
    private String language;

    public ExpressionClauseSupport(T result) {
        this.result = result;
    }

    // Fluent API
    //-------------------------------------------------------------------------

    /**
     * Evaluates the  <a href="http://activemq.apache.org/camel/el.html">EL Language from JSP and JSF</a>
     * using the <a href="http://activemq.apache.org/camel/juel.html">JUEL library</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T el(String text) {
        return language("el", text);
    }

    /**
     * Evaluates a <a href="http://activemq.apache.org/camel/groovy.html">Groovy expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T groovy(String text) {
        return language("groovy", text);
    }

    /**
     * Evaluates a <a href="http://activemq.apache.org/camel/java-script.html">JavaScript expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T javaScript(String text) {
        return language("js", text);
    }

    /**
     * Evaluates an <a href="http://activemq.apache.org/camel/ognl.html">OGNL expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T ognl(String text) {
        return language("ognl", text);
    }

    /**
     * Evaluates a <a href="http://activemq.apache.org/camel/php.html">PHP expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T php(String text) {
        return language("php", text);
    }

    /**
     * Evaluates a <a href="http://activemq.apache.org/camel/python.html">Python expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T python(String text) {
        return language("python", text);
    }

    /**
     * Evaluates a <a href="http://activemq.apache.org/camel/ruby.html">Ruby expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T ruby(String text) {
        return language("ruby", text);
    }

    /**
     * Evaluates an <a href="http://activemq.apache.org/camel/sql.html">SQL expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T sql(String text) {
        return language("sql", text);
    }

    /**
     * Evaluates a <a href="http://activemq.apache.org/camel/simple.html">Simple expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T simple(String text) {
        return language("simple", text);
    }

    /**
     * Evaluates an <a href="http://activemq.apache.org/camel/xpath.html">XPath expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T xpath(String text) {
        return language("xpath", text);
    }

    /**
     * Evaluates an <a href="http://activemq.apache.org/camel/xquery.html">XQuery expression</a>
     *
     * @param text the expression to be evaluated
     * @return the builder to continue processing the DSL
     */
    public T xquery(String text) {
        return language("xquery", text);
    }

    /**
     * Evaluates a given language name with the expression text
     *
     * @param language   the name of the language
     * @param expression the expression in the given language
     * @return the builder to continue processing the DSL
     */
    public T language(String language, String expression) {
        setLanguage(language);
        setExpression(expression);
        return result;
    }

    // Properties
    //-------------------------------------------------------------------------
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
