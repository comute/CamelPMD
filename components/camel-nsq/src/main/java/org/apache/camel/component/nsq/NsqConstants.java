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
package org.apache.camel.component.nsq;

import org.apache.camel.spi.Metadata;

public interface NsqConstants {

    int NSQ_DEFAULT_PORT = 4150;
    int NSQ_DEFAULT_LOOKUP_PORT = 4160;
    int NSQ_DEFAULT_LOOKUP_PORT_HTTP = 4161;
    @Metadata(label = "consumer", description = "The message Id.", javaType = "byte[]")
    String NSQ_MESSAGE_ID = "CamelNsqMessageId";
    @Metadata(label = "consumer", description = "The message attempts.", javaType = "int")
    String NSQ_MESSAGE_ATTEMPTS = "CamelNsqMessageAttempts";
    @Metadata(label = "consumer", description = "The message timestamp.", javaType = "java.util.Date")
    String NSQ_MESSAGE_TIMESTAMP = "CamelNsqMessageTimestamp";
    @Metadata(label = "producer", description = "The message topic.", javaType = "String")
    String NSQ_MESSAGE_TOPIC = "CamelNsqMessageTopic";
}
