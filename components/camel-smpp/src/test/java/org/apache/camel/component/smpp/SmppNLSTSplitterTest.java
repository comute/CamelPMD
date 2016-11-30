package org.apache.camel.component.smpp;

import java.nio.charset.Charset;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by engin on 30/11/2016.
 */
public class SmppNLSTSplitterTest {

    @Test
    public void splitTurkishShortMessageWith155Character() {
        String message = "12345678901234567890123456789012345678901234567890123456789012345678901234567890"
                + "123456789012345678901234567890123456789012345678901234567890123456789012345"; // 155 single message

        byte turkishLanguageIdentifier = 0x01;
        SmppSplitter splitter = new SmppNLSTSplitter(message.length(), turkishLanguageIdentifier);
        SmppSplitter.resetCurrentReferenceNumber();
        byte[][] result = splitter.split(message.getBytes());

        assertEquals(1, result.length);
        assertArrayEquals(new byte[]{SmppNLSTSplitter.UDHIE_NLI_SINGLE_MSG_HEADER_LENGTH, SmppNLSTSplitter.UDHIE_NLI_IDENTIFIER, SmppNLSTSplitter.UDHIE_NLI_HEADER_LENGTH, turkishLanguageIdentifier,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53,
                54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53}, result[0]);
    }

    @Test
    public void splitShortMessageWith156Character() {
        String message = "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789" + // first part 149
                "0123456"; // second part 7

        byte turkishLanguageIdentifier = 0x01;
        SmppSplitter splitter = new SmppNLSTSplitter(message.length(), turkishLanguageIdentifier);
        SmppSplitter.resetCurrentReferenceNumber();
        byte[][] result = splitter.split(message.getBytes());

        assertEquals(2, result.length);
        assertArrayEquals(new byte[]{
                SmppNLSTSplitter.UDHIE_NLI_MULTI_MSG_HEADER_LENGTH, SmppNLSTSplitter.UDHIE_IDENTIFIER_SAR, SmppNLSTSplitter.UDHIE_SAR_LENGTH, 1, 2, 1,
                SmppNLSTSplitter.UDHIE_NLI_IDENTIFIER, SmppNLSTSplitter.UDHIE_NLI_HEADER_LENGTH, turkishLanguageIdentifier,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53,
                54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48,
                49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57}, result[0]);

        assertArrayEquals(new byte[]{
                SmppNLSTSplitter.UDHIE_NLI_MULTI_MSG_HEADER_LENGTH, SmppNLSTSplitter.UDHIE_IDENTIFIER_SAR, SmppNLSTSplitter.UDHIE_SAR_LENGTH, 1, 2, 2,
                SmppNLSTSplitter.UDHIE_NLI_IDENTIFIER, SmppNLSTSplitter.UDHIE_NLI_HEADER_LENGTH, turkishLanguageIdentifier,
                48, 49, 50, 51, 52, 53, 54}, result[1]);

        String firstShortMessage = new String(result[0], SmppNLSTSplitter.UDHIE_NLI_MULTI_MSG_HEADER_REAL_LENGTH, result[0].length - SmppNLSTSplitter.UDHIE_NLI_MULTI_MSG_HEADER_REAL_LENGTH);
        String secondShortMessage = new String(result[1], SmppNLSTSplitter.UDHIE_NLI_MULTI_MSG_HEADER_REAL_LENGTH, result[1].length - SmppNLSTSplitter.UDHIE_NLI_MULTI_MSG_HEADER_REAL_LENGTH);
        assertEquals(message, firstShortMessage + secondShortMessage);
    }
}