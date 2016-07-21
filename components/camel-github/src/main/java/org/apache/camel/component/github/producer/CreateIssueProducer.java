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
package org.apache.camel.component.github.producer;

import org.apache.camel.Exchange;
import org.apache.camel.component.github.GitHubEndpoint;
import org.apache.camel.spi.Registry;
import org.apache.camel.util.ObjectHelper;
import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.service.IssueService;

/**
 * Producer endpoint that closes a pull request.  The endpoint requires the "GitHubPullRequest" header,
 * identifying the pull request number (integer).
 */
public class CreateIssueProducer extends AbstractGitHubProducer {
    
    private IssueService issueService;

    public CreateIssueProducer(GitHubEndpoint endpoint) throws Exception {
        super(endpoint);
        
        Registry registry = endpoint.getCamelContext().getRegistry();
        Object service = registry.lookupByName("githubIssuesService");
        if (service != null) {
            issueService = (IssueService) service;
        } else {
            issueService = new IssueService();
        }
        initService(issueService);
    }

    public void process(Exchange exchange) throws Exception {
        Issue issue = new Issue();
        String issueTitle = exchange.getIn().getHeader("GitHubIssueTitle", String.class);
        if (ObjectHelper.isEmpty(issueTitle)) {
            throw new IllegalArgumentException("Issue Title must be specified to create an issue");
        }
        issue.setTitle(issueTitle);
        issue.setBody(exchange.getIn().getBody(String.class));
        
        Issue finalIssue = issueService.createIssue(getRepository(), issue);
        
        // copy the header of in message to the out message
        exchange.getOut().copyFrom(exchange.getIn());
        exchange.getOut().setBody(finalIssue);
    }

}
