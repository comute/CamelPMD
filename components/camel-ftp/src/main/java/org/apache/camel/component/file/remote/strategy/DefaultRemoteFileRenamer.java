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
package org.apache.camel.component.file.remote.strategy;

import org.apache.camel.component.file.remote.RemoteFile;
import org.apache.camel.component.file.remote.RemoteFileExchange;

public class DefaultRemoteFileRenamer implements RemoteFileRenamer {

    private String namePrefix;
    private String namePostfix;

    public DefaultRemoteFileRenamer() {
    }

    public DefaultRemoteFileRenamer(String namePrefix, String namePostfix) {
        this.namePrefix = namePrefix;
        this.namePostfix = namePostfix;
    }

    public RemoteFile renameFile(RemoteFileExchange exchange, RemoteFile file) {
        String newName = renameFileName(file.getFileName());

        // clone and change the name
        RemoteFile result = file.clone();
        result.changeFileName(newName);
        return result;
    }

    public String getNamePostfix() {
        return namePostfix;
    }

    /**
     * Sets the name postfix appended to moved files. For example
     * to rename all the files from * to *.done set this value to ".done"
     */
    public void setNamePostfix(String namePostfix) {
        this.namePostfix = namePostfix;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the name prefix appended to moved files. For example
     * to move processed files into a hidden directory called ".camel"
     * set this value to ".camel/"
     */
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    protected String renameFileName(String name) {
        StringBuffer buffer = new StringBuffer();
        if (namePrefix != null) {
            buffer.append(namePrefix);
        }
        buffer.append(name);
        if (namePostfix != null) {
            buffer.append(namePostfix);
        }
        return buffer.toString();
    }

}
