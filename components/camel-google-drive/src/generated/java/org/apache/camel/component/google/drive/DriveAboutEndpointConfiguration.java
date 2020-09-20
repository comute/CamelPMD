
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive$About}.
 */
@ApiParams(apiName = "drive-about", 
           description = "The about collection of methods",
           apiMethods = {@ApiMethod(methodName = "get", description="Gets the information about the current user along with Drive API settings", signatures={"com.google.api.services.drive.Drive$About$Get get()"})}, aliases = {})
@UriParams
@Configurer
public final class DriveAboutEndpointConfiguration extends GoogleDriveConfiguration {
}
