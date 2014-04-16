/*
 * Copyright 2014 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.dataformat.code;

import com.google.zxing.BarcodeFormat;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.camel.builder.RouteBuilder;
import static org.apache.camel.dataformat.code.BarcodeTestBase.FILE_ENDPOINT;
import static org.apache.camel.dataformat.code.BarcodeTestBase.MSG;
import org.apache.camel.spi.DataFormat;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author claus.straube
 */
public class BarcodeDataFormatCamelTest extends BarcodeTestBase {
    
    private static final Logger LOG = LoggerFactory.getLogger(BarcodeDataFormatCamelTest.class);
    
    @Before
    public void setUp() throws Exception {
        super.setUp();
        
        // clean directory
        File directory = new File(PATH);
        if(!directory.isDirectory() || !directory.exists()) {
            LOG.error(String.format("Cannot delete files from directory '%s', because path is not a directory, or it doesn't exist.", PATH));
        } else {
            LOG.info("Deleting files from " + PATH);
            File[] files = directory.listFiles();
            for (File file : files) {
                file.delete();
            }
        }
    }

    @Test
    public void testDefaultQRCode() throws Exception {
        out.expectedBodiesReceived(MSG);
        image.expectedMessageCount(1);

        template.sendBody("direct:code1", MSG);

        assertMockEndpointsSatisfied(5, TimeUnit.SECONDS);
        this.checkImage(image, 100, 100, BarcodeImageType.PNG.toString());
    }
    
    @Test
    public void testQRCodeWithModifiedSize() throws Exception {
        out.expectedBodiesReceived(MSG);
        image.expectedMessageCount(1);

        template.sendBody("direct:code2", MSG);

        assertMockEndpointsSatisfied(5, TimeUnit.SECONDS);
        this.checkImage(image, 200, 200, BarcodeImageType.PNG.toString());
    }
    
    @Test
    public void testQRCodeWithJPEGType() throws Exception {
        out.expectedBodiesReceived(MSG);
        image.expectedMessageCount(1);

        template.sendBody("direct:code3", MSG);

        assertMockEndpointsSatisfied(5, TimeUnit.SECONDS);
        this.checkImage(image, 100, 100, "JPEG");
    }
    
    @Test
    public void testPDF417CodeWidthModifiedSizeAndImageType() throws Exception {
        out.expectedBodiesReceived(MSG);
        image.expectedMessageCount(1);

        template.sendBody("direct:code4", MSG);

        assertMockEndpointsSatisfied(60, TimeUnit.SECONDS);
        this.checkImage(image, "JPEG");
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() {

                // QR-Code default
                DataFormat code1 = new BarcodeDataFormat();

                from("direct:code1")
                        .marshal(code1)
                        .to(FILE_ENDPOINT);

                // QR-Code with modified size
                DataFormat code2 = new BarcodeDataFormat(200, 200);

                from("direct:code2")
                        .marshal(code2)
                        .to(FILE_ENDPOINT);

                // QR-Code with JPEG type
                DataFormat code3 = new BarcodeDataFormat(BarcodeImageType.JPG);

                from("direct:code3")
                        .marshal(code3)
                        .to(FILE_ENDPOINT);

                // PDF-417 code with modified size and image type
                DataFormat code4 = new BarcodeDataFormat(200, 200, BarcodeImageType.JPG, BarcodeFormat.PDF_417);
                
                from("direct:code4")
                        .marshal(code4)
                        .to(FILE_ENDPOINT);


                // generic file read --->
                // 
                // read file and route it
                from(FILE_ENDPOINT + "?noop=true")
                        .multicast().to("direct:marshall", "mock:image");

                // get the message from code
                from("direct:marshall")
                        .unmarshal(code1) // for unmarshalling, the instance doesn't matter
                        .to("log:OUT")
                        .to("mock:out");

            }
        };
    }
}
