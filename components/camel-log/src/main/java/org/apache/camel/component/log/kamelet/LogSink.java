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

package org.apache.camel.component.log.kamelet;

import org.apache.camel.builder.KameletRouteTemplate;
import org.apache.camel.model.RouteTemplateDefinition;
import org.apache.camel.spi.KameletIcon;
import org.apache.camel.spi.KameletProperty;
import org.apache.camel.spi.KameletSpec;

@KameletSpec(type = KameletSpec.KameletType.SINK,
             name = "log-sink",
             title = "Log Sink",
             description = "A sink that logs all data that it receives, useful for debugging purposes.",
             properties = {
                     @KameletProperty(
                                      name = "loggerName",
                                      title = "Logger Name",
                                      description = "Name of the logging category to use",
                                      defaultValue = "log-sink"),
                     @KameletProperty(
                                      name = "level",
                                      title = "Log Level",
                                      description = "Logging level to use",
                                      defaultValue = "INFO",
                                      enumeration = { "TRACE", "DEBUG", "INFO", "WARN", "ERROR", "OFF" }),
                     @KameletProperty(
                                      name = "logMask",
                                      title = "Log Mask",
                                      description = "Mask sensitive information like password or passphrase in the log",
                                      type = "boolean",
                                      defaultValue = "false"),
                     @KameletProperty(
                                      name = "marker",
                                      title = "Marker",
                                      description = "An optional Marker name to use"),
                     @KameletProperty(
                                      name = "multiline",
                                      title = "Multiline",
                                      description = "If enabled then each information is outputted on a newline",
                                      type = "boolean",
                                      defaultValue = "false"),
                     @KameletProperty(
                                      name = "showAllProperties",
                                      title = "Show All Properties",
                                      description = "Show all of the exchange properties (both internal and custom)",
                                      type = "boolean",
                                      defaultValue = "false"),
                     @KameletProperty(
                                      name = "showBody",
                                      title = "Show Body",
                                      description = "Show the message body",
                                      type = "boolean",
                                      defaultValue = "true"),
                     @KameletProperty(
                                      name = "showBodyType",
                                      title = "Show Body Type",
                                      description = "Show the body Java type",
                                      type = "boolean",
                                      defaultValue = "true"),
                     @KameletProperty(
                                      name = "showExchangePattern",
                                      title = "Show Exchange Pattern",
                                      description = "Shows the Message Exchange Pattern (or MEP for short)",
                                      type = "boolean",
                                      defaultValue = "true"),
                     @KameletProperty(
                                      name = "showHeaders",
                                      title = "Show Headers",
                                      description = "Show the headers received",
                                      type = "boolean",
                                      defaultValue = "false"),
                     @KameletProperty(
                                      name = "showProperties",
                                      title = "Show Properties",
                                      description = "Show the exchange properties (only custom). Use showAllProperties to show both internal and custom properties.",
                                      type = "boolean",
                                      defaultValue = "false"),
                     @KameletProperty(
                                      name = "showStreams",
                                      title = "Show Streams",
                                      description = "Show the stream bodies (they may not be available in following steps)",
                                      type = "boolean",
                                      defaultValue = "false"),
                     @KameletProperty(
                                      name = "showCachedStreams",
                                      title = "Show Cached Streams",
                                      description = "Whether Camel should show cached stream bodies or not.",
                                      type = "boolean",
                                      defaultValue = "true")
             },
             namespace = "Logging",
             dependencies = { "camel:kamelet", "camel:log" })
@KameletIcon(data = "data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iaXNvLTg4NTktMSI/Pg0KPCEtLSBHZW5lcmF0b3I6IEFkb2JlIElsbHVzdHJhdG9yIDE2LjAuMCwgU1ZHIEV4cG9ydCBQbHVnLUluIC4gU1ZHIFZlcnNpb246IDYuMDAgQnVpbGQgMCkgIC0tPg0KPCFET0NUWVBFIHN2ZyBQVUJMSUMgIi0vL1czQy8vRFREIFNWRyAxLjEvL0VOIiAiaHR0cDovL3d3dy53My5vcmcvR3JhcGhpY3MvU1ZHLzEuMS9EVEQvc3ZnMTEuZHRkIj4NCjxzdmcgdmVyc2lvbj0iMS4xIiBpZD0iQ2FwYV8xIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB4PSIwcHgiIHk9IjBweCINCgkgd2lkdGg9IjUxMnB4IiBoZWlnaHQ9IjUxMnB4IiB2aWV3Qm94PSIwIDAgNTEyIDUxMiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNTEyIDUxMjsiIHhtbDpzcGFjZT0icHJlc2VydmUiPg0KPGc+DQoJPHBhdGggZD0iTTQ0OCwwSDY0QzQ2LjMyOCwwLDMyLDE0LjMxMywzMiwzMnY0NDhjMCwxNy42ODgsMTQuMzI4LDMyLDMyLDMyaDM4NGMxNy42ODgsMCwzMi0xNC4zMTIsMzItMzJWMzINCgkJQzQ4MCwxNC4zMTMsNDY1LjY4OCwwLDQ0OCwweiBNNjQsNDgwVjEyOGg4MHY2NEg5NnYxNmg0OHY0OEg5NnYxNmg0OHY0OEg5NnYxNmg0OHY0OEg5NnYxNmg0OHY4MEg2NHogTTQ0OCw0ODBIMTYwdi04MGgyNTZ2LTE2DQoJCUgxNjB2LTQ4aDI1NnYtMTZIMTYwdi00OGgyNTZ2LTE2SDE2MHYtNDhoMjU2di0xNkgxNjB2LTY0aDI4OFY0ODB6Ii8+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8L3N2Zz4NCg==")
public class LogSink extends KameletRouteTemplate {
    @Override
    protected void template(RouteTemplateDefinition template) {
        template.from(kameletSource())
                .to("log:{{loggerName}}?level={{?level}}&" +
                    "logMask={{?logMask}}&" +
                    "marker={{?marker}}&" +
                    "multiline={{?multiline}}&" +
                    "showAllProperties={{?showAllProperties}}&" +
                    "showBody={{?showBody}}&" +
                    "showBodyType={{?showBodyType}}&" +
                    "showExchangePattern={{?showExchangePattern}}&" +
                    "showHeaders={{?showHeaders}}&" +
                    "showProperties={{?showProperties}}&" +
                    "showStreams={{?showStreams}}&" +
                    "showCachedStreams={{?showCachedStreams}}");
    }
}
