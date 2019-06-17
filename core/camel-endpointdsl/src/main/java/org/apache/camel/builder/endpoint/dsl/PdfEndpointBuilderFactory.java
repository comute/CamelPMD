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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The pdf components provides the ability to create, modify or extract content
 * from PDF documents.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PdfEndpointBuilderFactory {


    /**
     * Builder for endpoint for the PDF component.
     */
    public interface PdfEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedPdfEndpointBuilder advanced() {
            return (AdvancedPdfEndpointBuilder) this;
        }
        /**
         * Operation type.
         * The option is a
         * <code>org.apache.camel.component.pdf.PdfOperation</code> type.
         * @group producer
         */
        default PdfEndpointBuilder operation(PdfOperation operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Operation type.
         * The option will be converted to a
         * <code>org.apache.camel.component.pdf.PdfOperation</code> type.
         * @group producer
         */
        default PdfEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Font.
         * The option is a <code>org.apache.pdfbox.pdmodel.font.PDFont</code>
         * type.
         * @group producer
         */
        default PdfEndpointBuilder font(Object font) {
            setProperty("font", font);
            return this;
        }
        /**
         * Font.
         * The option will be converted to a
         * <code>org.apache.pdfbox.pdmodel.font.PDFont</code> type.
         * @group producer
         */
        default PdfEndpointBuilder font(String font) {
            setProperty("font", font);
            return this;
        }
        /**
         * Font size in pixels.
         * The option is a <code>float</code> type.
         * @group producer
         */
        default PdfEndpointBuilder fontSize(float fontSize) {
            setProperty("fontSize", fontSize);
            return this;
        }
        /**
         * Font size in pixels.
         * The option will be converted to a <code>float</code> type.
         * @group producer
         */
        default PdfEndpointBuilder fontSize(String fontSize) {
            setProperty("fontSize", fontSize);
            return this;
        }
        /**
         * Margin bottom in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginBottom(int marginBottom) {
            setProperty("marginBottom", marginBottom);
            return this;
        }
        /**
         * Margin bottom in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginBottom(String marginBottom) {
            setProperty("marginBottom", marginBottom);
            return this;
        }
        /**
         * Margin left in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginLeft(int marginLeft) {
            setProperty("marginLeft", marginLeft);
            return this;
        }
        /**
         * Margin left in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginLeft(String marginLeft) {
            setProperty("marginLeft", marginLeft);
            return this;
        }
        /**
         * Margin right in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginRight(int marginRight) {
            setProperty("marginRight", marginRight);
            return this;
        }
        /**
         * Margin right in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginRight(String marginRight) {
            setProperty("marginRight", marginRight);
            return this;
        }
        /**
         * Margin top in pixels.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginTop(int marginTop) {
            setProperty("marginTop", marginTop);
            return this;
        }
        /**
         * Margin top in pixels.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default PdfEndpointBuilder marginTop(String marginTop) {
            setProperty("marginTop", marginTop);
            return this;
        }
        /**
         * Page size.
         * The option is a
         * <code>org.apache.pdfbox.pdmodel.common.PDRectangle</code> type.
         * @group producer
         */
        default PdfEndpointBuilder pageSize(Object pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Page size.
         * The option will be converted to a
         * <code>org.apache.pdfbox.pdmodel.common.PDRectangle</code> type.
         * @group producer
         */
        default PdfEndpointBuilder pageSize(String pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Text processing to use. autoFormatting: Text is getting sliced by
         * words, then max amount of words that fits in the line will be written
         * into pdf document. With this strategy all words that doesn't fit in
         * the line will be moved to the new line. lineTermination: Builds set
         * of classes for line-termination writing strategy. Text getting sliced
         * by line termination symbol and then it will be written regardless it
         * fits in the line or not.
         * The option is a
         * <code>org.apache.camel.component.pdf.TextProcessingFactory</code>
         * type.
         * @group producer
         */
        default PdfEndpointBuilder textProcessingFactory(
                TextProcessingFactory textProcessingFactory) {
            setProperty("textProcessingFactory", textProcessingFactory);
            return this;
        }
        /**
         * Text processing to use. autoFormatting: Text is getting sliced by
         * words, then max amount of words that fits in the line will be written
         * into pdf document. With this strategy all words that doesn't fit in
         * the line will be moved to the new line. lineTermination: Builds set
         * of classes for line-termination writing strategy. Text getting sliced
         * by line termination symbol and then it will be written regardless it
         * fits in the line or not.
         * The option will be converted to a
         * <code>org.apache.camel.component.pdf.TextProcessingFactory</code>
         * type.
         * @group producer
         */
        default PdfEndpointBuilder textProcessingFactory(
                String textProcessingFactory) {
            setProperty("textProcessingFactory", textProcessingFactory);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the PDF component.
     */
    public interface AdvancedPdfEndpointBuilder
            extends
                EndpointProducerBuilder {
        default PdfEndpointBuilder basic() {
            return (PdfEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPdfEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPdfEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPdfEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedPdfEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.pdf.PdfOperation</code>
     * enum.
     */
    enum PdfOperation {
        create, append, extractText;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.pdf.TextProcessingFactory</code> enum.
     */
    enum TextProcessingFactory {
        autoFormatting, lineTermination;
    }
    /**
     * The pdf components provides the ability to create, modify or extract
     * content from PDF documents. Creates a builder to build endpoints for the
     * PDF component.
     */
    default PdfEndpointBuilder pdf(String path) {
        class PdfEndpointBuilderImpl extends AbstractEndpointBuilder implements PdfEndpointBuilder, AdvancedPdfEndpointBuilder {
            public PdfEndpointBuilderImpl(String path) {
                super("pdf", path);
            }
        }
        return new PdfEndpointBuilderImpl(path);
    }
}