/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package org.apache.camel.component.dropbox.dto;


public class DropboxMoveResult {

    private final String oldPath;

    private final String newPath;

    public DropboxMoveResult(String oldPath, String newPath) {
        this.oldPath = oldPath;
        this.newPath = newPath;
    }

    public String getOldPath() {
        return oldPath;
    }

    public String getNewPath() {
        return newPath;
    }

    /*
      Object payload contained in Exchange
      Exchange Header and Body contains the mode path
      @param exchange
     */
//    @Override
//    public void populateExchange(Exchange exchange) {
//        String movedPath = (String)resultEntries;
//        exchange.getIn().setHeader(DropboxResultHeader.MOVED_PATH.name(), movedPath);
//        exchange.getIn().setBody(movedPath);
//    }
}
