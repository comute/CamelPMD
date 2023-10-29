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
package org.apache.camel.component.debug;

import java.util.Map;

import org.apache.camel.impl.debugger.BacklogDebugger;
import org.apache.camel.spi.annotations.DevConsole;
import org.apache.camel.support.console.AbstractDevConsole;
import org.apache.camel.util.json.JsonArray;
import org.apache.camel.util.json.JsonObject;

@DevConsole("debug")
public class DebugDevConsole extends AbstractDevConsole {

    public DebugDevConsole() {
        super("camel", "debug", "Debug", "Camel route debugger");
    }

    @Override
    protected String doCallText(Map<String, Object> options) {
        StringBuilder sb = new StringBuilder();

        BacklogDebugger backlog = getCamelContext().hasService(BacklogDebugger.class);
        if (backlog != null) {
            sb.append("Settings:");
            sb.append(String.format("\n    Enabled: %s", backlog.isEnabled()));
            sb.append(String.format("\n    Suspended Mode: %s", backlog.isSuspendMode()));
            sb.append(String.format("\n    Fallback Timeout: %ss", backlog.getFallbackTimeout())); // is in seconds
            sb.append(String.format("\n    Logging Level: %s", backlog.getLoggingLevel()));
            sb.append(String.format("\n    Include Files: %s", backlog.isBodyIncludeFiles()));
            sb.append(String.format("\n    Include Streams: %s", backlog.isBodyIncludeStreams()));
            sb.append(String.format("\n    Body Max Chars: %s", backlog.getBodyMaxChars()));

            sb.append("\n\nBreakpoints:");
            sb.append(String.format("\n    Debug Counter: %s", backlog.getDebugCounter()));
            sb.append(String.format("\n    Single Step Mode: %s", backlog.isSingleStepMode()));
            for (String n : backlog.getBreakpoints()) {
                boolean suspended = backlog.getSuspendedBreakpointNodeIds().contains(n);
                if (suspended) {
                    sb.append(String.format("\n    Breakpoint: %s (suspended)", n));
                } else {
                    sb.append(String.format("\n    Breakpoint: %s", n));
                }
            }
        }

        return sb.toString();
    }

    @Override
    protected Map<String, Object> doCallJson(Map<String, Object> options) {
        JsonObject root = new JsonObject();

        BacklogDebugger backlog = getCamelContext().hasService(BacklogDebugger.class);
        if (backlog != null) {
            root.put("enabled", backlog.isEnabled());
            root.put("suspendedMode", backlog.isSuspendMode());
            root.put("fallbackTimeout", backlog.getFallbackTimeout());
            root.put("loggingLevel", backlog.getLoggingLevel());
            root.put("bodyIncludeFiles", backlog.isBodyIncludeFiles());
            root.put("bodyIncludeStreams", backlog.isBodyIncludeStreams());
            root.put("bodyMaxChars", backlog.getBodyMaxChars());
            root.put("debugCounter", backlog.getDebugCounter());
            root.put("singleStepMode", backlog.isSingleStepMode());

            JsonArray arr = new JsonArray();
            for (String n : backlog.getBreakpoints()) {
                JsonObject jo = new JsonObject();
                jo.put("nodeId", n);
                boolean suspended = backlog.getSuspendedBreakpointNodeIds().contains(n);
                jo.put("suspended", suspended);
                arr.add(jo);
            }
            if (!arr.isEmpty()) {
                root.put("breakpoints", arr);
            }
        }

        return root;
    }
}
