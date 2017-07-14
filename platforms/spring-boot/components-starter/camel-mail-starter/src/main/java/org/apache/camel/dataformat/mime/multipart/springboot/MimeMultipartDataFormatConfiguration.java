/**
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
package org.apache.camel.dataformat.mime.multipart.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Camel Mail support
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.mime-multipart")
public class MimeMultipartDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Specify the subtype of the MIME Multipart. Default is mixed.
     */
    private String multipartSubType = "mixed";
    /**
     * Defines whether a message without attachment is also marshaled into a
     * MIME Multipart (with only one body part). Default is false.
     */
    private Boolean multipartWithoutAttachment = false;
    /**
     * Defines whether the MIME-Multipart headers are part of the message body
     * (true) or are set as Camel headers (false). Default is false.
     */
    private Boolean headersInline = false;
    /**
     * A regex that defines which Camel headers are also included as MIME
     * headers into the MIME multipart. This will only work if headersInline is
     * set to true. Default is to include no headers
     */
    private String includeHeaders;
    /**
     * Defines whether the content of binary parts in the MIME multipart is
     * binary (true) or Base-64 encoded (false) Default is false.
     */
    private Boolean binaryContent = false;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public String getMultipartSubType() {
        return multipartSubType;
    }

    public void setMultipartSubType(String multipartSubType) {
        this.multipartSubType = multipartSubType;
    }

    public Boolean getMultipartWithoutAttachment() {
        return multipartWithoutAttachment;
    }

    public void setMultipartWithoutAttachment(Boolean multipartWithoutAttachment) {
        this.multipartWithoutAttachment = multipartWithoutAttachment;
    }

    public Boolean getHeadersInline() {
        return headersInline;
    }

    public void setHeadersInline(Boolean headersInline) {
        this.headersInline = headersInline;
    }

    public String getIncludeHeaders() {
        return includeHeaders;
    }

    public void setIncludeHeaders(String includeHeaders) {
        this.includeHeaders = includeHeaders;
    }

    public Boolean getBinaryContent() {
        return binaryContent;
    }

    public void setBinaryContent(Boolean binaryContent) {
        this.binaryContent = binaryContent;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}