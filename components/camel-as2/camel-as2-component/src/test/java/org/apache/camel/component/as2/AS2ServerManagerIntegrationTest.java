/*
 * Camel Api Route test generated by camel-api-component-maven-plugin
 * Generated on: Fri May 12 15:43:59 EDT 2017
 */
package org.apache.camel.component.as2;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.as2.api.AS2ClientConnection;
import org.apache.camel.component.as2.api.AS2ClientManager;
import org.apache.camel.component.as2.api.InvalidAS2NameException;
import org.apache.camel.component.as2.internal.AS2ApiCollection;
import org.apache.camel.component.as2.internal.AS2ServerManagerApiMethod;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.http.HttpException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class for {@link org.apache.camel.component.as2.api.AS2ServerManager} APIs.
 */
public class AS2ServerManagerIntegrationTest extends AbstractAS2TestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(AS2ServerManagerIntegrationTest.class);
    private static final String PATH_PREFIX = AS2ApiCollection.getCollection().getApiName(AS2ServerManagerApiMethod.class).getName();

    private static final String REQUEST_URI = "/";
    private static final String AS2_NAME = "878051556";
    private static final String SUBJECT = "Test Case";
    
    public static final String EDI_MESSAGE = "UNB+UNOA:1+005435656:1+006415160:1+060515:1434+00000000000778'\n"
            +"UNH+00000000000117+INVOIC:D:97B:UN'\n"
            +"BGM+380+342459+9'\n"
            +"DTM+3:20060515:102'\n"
            +"RFF+ON:521052'\n"
            +"NAD+BY+792820524::16++CUMMINS MID-RANGE ENGINE PLANT'\n"
            +"NAD+SE+005435656::16++GENERAL WIDGET COMPANY'\n"
            +"CUX+1:USD'\n"
            +"LIN+1++157870:IN'\n"
            +"IMD+F++:::WIDGET'\n"
            +"QTY+47:1020:EA'\n"
            +"ALI+US'\n"
            +"MOA+203:1202.58'\n"
            +"PRI+INV:1.179'\n"
            +"LIN+2++157871:IN'\n"
            +"IMD+F++:::DIFFERENT WIDGET'\n"
            +"QTY+47:20:EA'\n"
            +"ALI+JP'\n"
            +"MOA+203:410'\n"
            +"PRI+INV:20.5'\n"
            +"UNS+S'\n"
            +"MOA+39:2137.58'\n"
            +"ALC+C+ABG'\n"
            +"MOA+8:525'\n"
            +"UNT+23+00000000000117'\n"
            +"UNZ+1+00000000000778'\n";

    @Test
    public void testListen() throws Exception {
        sendTestMessage();
        
        MockEndpoint mockEndpoint = getMockEndpoint("mock:as2Server");
        mockEndpoint.expectedMinimumMessageCount(1);
        mockEndpoint.setResultWaitTime(TimeUnit.MILLISECONDS.convert(10, TimeUnit.SECONDS));
        mockEndpoint.assertIsSatisfied();

        final List<Exchange> exchanges = mockEndpoint.getExchanges();
        assertNotNull("poll result", exchanges);
        assertFalse("poll result", exchanges.isEmpty());
        LOG.debug("poll result: " + exchanges);
        
    }
    

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for listen
                from("as2://" + PATH_PREFIX + "/listen?serverPortNumber=8888").to("mock:as2Receive");
            }
        };
    }
    
    private void sendTestMessage() throws UnknownHostException, IOException, InvalidAS2NameException, HttpException {
        AS2ClientConnection clientConnection = new AS2ClientConnection("1.1", "AS2ServerManagerIntegrationTest Client", "example.org", "localhost", 8888);
        AS2ClientManager clientManager = new AS2ClientManager(clientConnection);
//        clientManager.sendNoEncryptNoSign(REQUEST_URI, EDI_MESSAGE, SUBJECT, AS2_NAME, AS2_NAME);
    }
    
    @Override
    protected int getShutdownTimeout() {
        return 600000;
    }
}
