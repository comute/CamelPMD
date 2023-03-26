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
package org.apache.camel.main.console;

import java.util.Map;

import org.apache.camel.main.download.DependencyDownloaderClassLoader;
import org.apache.camel.spi.annotations.DevConsole;
import org.apache.camel.support.console.AbstractDevConsole;
import org.apache.camel.util.json.JsonObject;

@DevConsole("dependency-downloader")
public class DependencyDownloaderConsole extends AbstractDevConsole {

    public DependencyDownloaderConsole() {
        super("jvm", "dependency-downloader", "Maven Dependency Downloader",
              "Displays information about dependencies downloaded at runtime");
    }

    @Override
    protected String doCallText(Map<String, Object> options) {
        StringBuilder sb = new StringBuilder();

        ClassLoader cl = getCamelContext().getApplicationContextClassLoader();
        if (cl instanceof DependencyDownloaderClassLoader) {
            DependencyDownloaderClassLoader ddcl = (DependencyDownloaderClassLoader) cl;
            sb.append("Dependencies:");
            String cp = String.join("\n    ", ddcl.getDownloaded());
            sb.append("\n    ").append(cp).append('\n');
        }

        return sb.toString();
    }

    @Override
    protected JsonObject doCallJson(Map<String, Object> options) {
        JsonObject root = new JsonObject();

        ClassLoader cl = getCamelContext().getApplicationContextClassLoader();
        if (cl instanceof DependencyDownloaderClassLoader) {
            DependencyDownloaderClassLoader ddcl = (DependencyDownloaderClassLoader) cl;
            String[] cp = ddcl.getDownloaded().toArray(new String[0]);
            root.put("dependencies", cp);
        }

        return root;
    }
}
