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
package org.apache.camel.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.view.Viewable;

/**
 * A base class for any resource which is viewable in HTML
 *
 * @version $Revision: 1.1 $
 */
public abstract class ResourceSupport {


    @GET
    @Path("{view:\\w*}")
    @Produces({MediaType.TEXT_HTML})
    public Viewable view(@PathParam("view") String view) {
        if (view == null || view.length() == 0) {
            view = "index";
        }
        return new Viewable(view, this);
    }

    // TODO remove redunant non-DRY code ASAP
    //
    // The following redundant methods are here
    // until there is a way to specify a higher priority for HTML views
    //
    // for more details see these issues
    //
    // https://jsr311.dev.java.net/issues/show_bug.cgi?id=65
    // https://jsr311.dev.java.net/issues/show_bug.cgi?id=46

    @GET
    @Produces({MediaType.TEXT_HTML})
    public Viewable index() {
        return view("index");
    }
}
