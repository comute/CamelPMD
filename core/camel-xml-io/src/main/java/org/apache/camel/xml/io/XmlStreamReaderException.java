/*
 * Copyright 2004 Sun Microsystems, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.camel.xml.io;

import java.io.InputStream;
import java.io.IOException;

/**
 * The XmlReaderException is thrown by the XmlReader constructors if the charset encoding can not be
 * determined according to the XML 1.0 specification and RFC 3023.
 * <p>
 * The exception returns the unconsumed InputStream to allow the application to do an alternate
 * processing with the stream. Note that the original InputStream given to the XmlReader cannot be
 * used as that one has been already read.
 */
public class XmlStreamReaderException extends IOException {
    private static final long serialVersionUID = 1L;
    private final String bomEncoding;
    private final String xmlGuessEncoding;
    private final String xmlEncoding;
    private final String contentTypeMime;
    private final String contentTypeEncoding;
    private final InputStream is;

    /**
     * Creates an exception instance if the charset encoding could not be determined.
     * <p>
     * Instances of this exception are thrown by the XmlReader.
     * <p>
     *
     * @param msg message describing the reason for the exception.
     * @param bomEnc BOM encoding.
     * @param xmlGuessEnc XML guess encoding.
     * @param xmlEnc XML prolog encoding.
     * @param is the unconsumed InputStream.
     *
     */
    public XmlStreamReaderException(final String msg, final String bomEnc, final String xmlGuessEnc, final String xmlEnc, final InputStream is) {
        this(msg, null, null, bomEnc, xmlGuessEnc, xmlEnc, is);
    }

    /**
     * Creates an exception instance if the charset encoding could not be determined.
     * <p>
     * Instances of this exception are thrown by the XmlReader.
     * <p>
     *
     * @param msg message describing the reason for the exception.
     * @param ctMime MIME type in the content-type.
     * @param ctEnc encoding in the content-type.
     * @param bomEnc BOM encoding.
     * @param xmlGuessEnc XML guess encoding.
     * @param xmlEnc XML prolog encoding.
     * @param is the unconsumed InputStream.
     *
     */
    public XmlStreamReaderException(final String msg, final String ctMime, final String ctEnc, final String bomEnc, final String xmlGuessEnc, final String xmlEnc,
                                    final InputStream is) {
        super(msg);
        contentTypeMime = ctMime;
        contentTypeEncoding = ctEnc;
        bomEncoding = bomEnc;
        xmlGuessEncoding = xmlGuessEnc;
        xmlEncoding = xmlEnc;
        this.is = is;
    }

    /**
     * Returns the BOM encoding found in the InputStream.
     * <p>
     *
     * @return the BOM encoding, null if none.
     *
     */
    public String getBomEncoding() {
        return bomEncoding;
    }

    /**
     * Returns the encoding guess based on the first bytes of the InputStream.
     * <p>
     *
     * @return the encoding guess, null if it couldn't be guessed.
     *
     */
    public String getXmlGuessEncoding() {
        return xmlGuessEncoding;
    }

    /**
     * Returns the encoding found in the XML prolog of the InputStream.
     * <p>
     *
     * @return the encoding of the XML prolog, null if none.
     *
     */
    public String getXmlEncoding() {
        return xmlEncoding;
    }

    /**
     * Returns the MIME type in the content-type used to attempt determining the encoding.
     * <p>
     *
     * @return the MIME type in the content-type, null if there was not content-type or the encoding
     *         detection did not involve HTTP.
     *
     */
    public String getContentTypeMime() {
        return contentTypeMime;
    }

    /**
     * Returns the encoding in the content-type used to attempt determining the encoding.
     * <p>
     *
     * @return the encoding in the content-type, null if there was not content-type, no encoding in
     *         it or the encoding detection did not involve HTTP.
     *
     */
    public String getContentTypeEncoding() {
        return contentTypeEncoding;
    }

    /**
     * Returns the unconsumed InputStream to allow the application to do an alternate encoding
     * detection on the InputStream.
     * <p>
     *
     * @return the unconsumed InputStream.
     *
     */
    public InputStream getInputStream() {
        return is;
    }
}
