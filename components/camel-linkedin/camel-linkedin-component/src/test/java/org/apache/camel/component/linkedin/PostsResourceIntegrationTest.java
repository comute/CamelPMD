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
/*
 * Camel Api Route test generated by camel-component-util-maven-plugin
 * Generated on: Wed Jul 09 19:57:11 PDT 2014
 */
package org.apache.camel.component.linkedin;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Test class for {@link org.apache.camel.component.linkedin.api.PostsResource} APIs.
 */
public class PostsResourceIntegrationTest extends AbstractLinkedInTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(PostsResourceIntegrationTest.class);
    private static final String PATH_PREFIX = "comments";

    // TODO provide parameter values for addComment
    @Ignore
    @Test
    public void testAddComment() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelLinkedIn.post_id", null);
        // parameter type is org.apache.camel.component.linkedin.api.model.Comment
        headers.put("CamelLinkedIn.comment", null);

        requestBodyAndHeaders("direct://ADDCOMMENT", null, headers);
    }

    // TODO provide parameter values for flagCategory
    @Ignore
    @Test
    public void testFlagCategory() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelLinkedIn.post_id", null);
        // parameter type is org.apache.camel.component.linkedin.api.model.PostCategoryCode
        headers.put("CamelLinkedIn.postcategorycode", null);

        requestBodyAndHeaders("direct://FLAGCATEGORY", null, headers);
    }

    // TODO provide parameter values for followPost
    @Ignore
    @Test
    public void testFollowPost() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelLinkedIn.post_id", null);
        // parameter type is org.apache.camel.component.linkedin.api.model.IsFollowing
        headers.put("CamelLinkedIn.isfollowing", null);

        requestBodyAndHeaders("direct://FOLLOWPOST", null, headers);
    }

    // TODO provide parameter values for getPost
    @Ignore
    @Test
    public void testGetPost() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelLinkedIn.post_id", null);
        // parameter type is Long
        headers.put("CamelLinkedIn.count", null);
        // parameter type is Long
        headers.put("CamelLinkedIn.start", null);
        // parameter type is String
        headers.put("CamelLinkedIn.fields", null);

        final org.apache.camel.component.linkedin.api.model.Post result = requestBodyAndHeaders("direct://GETPOST", null, headers);

        assertNotNull("getPost result", result);
        LOG.debug("getPost: " + result);
    }

    // TODO provide parameter values for getPostComments
    @Ignore
    @Test
    public void testGetPostComments() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelLinkedIn.post_id", null);
        // parameter type is Long
        headers.put("CamelLinkedIn.count", null);
        // parameter type is Long
        headers.put("CamelLinkedIn.start", null);
        // parameter type is String
        headers.put("CamelLinkedIn.fields", null);

        final org.apache.camel.component.linkedin.api.model.Comments result = requestBodyAndHeaders("direct://GETPOSTCOMMENTS", null, headers);

        assertNotNull("getPostComments result", result);
        LOG.debug("getPostComments: " + result);
    }

    // TODO provide parameter values for likePost
    @Ignore
    @Test
    public void testLikePost() throws Exception {
        final Map<String, Object> headers = new HashMap<>();
        // parameter type is String
        headers.put("CamelLinkedIn.post_id", null);
        // parameter type is org.apache.camel.component.linkedin.api.model.IsLiked
        headers.put("CamelLinkedIn.isliked", null);

        requestBodyAndHeaders("direct://LIKEPOST", null, headers);
    }

    // TODO provide parameter values for removePost
    @Ignore
    @Test
    public void testRemovePost() throws Exception {
        // using String message body for single parameter "post_id"
        requestBody("direct://REMOVEPOST", null);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for addComment
                from("direct://ADDCOMMENT")
                    .to("linkedin://" + PATH_PREFIX + "/addComment");

                // test route for flagCategory
                from("direct://FLAGCATEGORY")
                    .to("linkedin://" + PATH_PREFIX + "/flagCategory");

                // test route for followPost
                from("direct://FOLLOWPOST")
                    .to("linkedin://" + PATH_PREFIX + "/followPost");

                // test route for getPost
                from("direct://GETPOST")
                    .to("linkedin://" + PATH_PREFIX + "/getPost");

                // test route for getPostComments
                from("direct://GETPOSTCOMMENTS")
                    .to("linkedin://" + PATH_PREFIX + "/getPostComments");

                // test route for likePost
                from("direct://LIKEPOST")
                    .to("linkedin://" + PATH_PREFIX + "/likePost");

                // test route for removePost
                from("direct://REMOVEPOST")
                    .to("linkedin://" + PATH_PREFIX + "/removePost?inBody=post_id");

            }
        };
    }
}
