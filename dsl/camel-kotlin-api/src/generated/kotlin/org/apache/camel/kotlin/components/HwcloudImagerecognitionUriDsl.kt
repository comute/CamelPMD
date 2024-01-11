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
package org.apache.camel.kotlin.components

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.UriDsl

public fun UriDsl.`hwcloud-imagerecognition`(i: HwcloudImagerecognitionUriDsl.() -> Unit) {
  HwcloudImagerecognitionUriDsl(this).apply(i)
}

@CamelDslMarker
public class HwcloudImagerecognitionUriDsl(
  it: UriDsl,
) {
  private val it: UriDsl

  init {
    this.it = it
    this.it.component("hwcloud-imagerecognition")
  }

  private var operation: String = ""

  public fun operation(operation: String) {
    this.operation = operation
    it.url("$operation")
  }

  public fun accessKey(accessKey: String) {
    it.property("accessKey", accessKey)
  }

  public fun endpoint(endpoint: String) {
    it.property("endpoint", endpoint)
  }

  public fun imageContent(imageContent: String) {
    it.property("imageContent", imageContent)
  }

  public fun imageUrl(imageUrl: String) {
    it.property("imageUrl", imageUrl)
  }

  public fun projectId(projectId: String) {
    it.property("projectId", projectId)
  }

  public fun proxyHost(proxyHost: String) {
    it.property("proxyHost", proxyHost)
  }

  public fun proxyPassword(proxyPassword: String) {
    it.property("proxyPassword", proxyPassword)
  }

  public fun proxyPort(proxyPort: String) {
    it.property("proxyPort", proxyPort)
  }

  public fun proxyPort(proxyPort: Int) {
    it.property("proxyPort", proxyPort.toString())
  }

  public fun proxyUser(proxyUser: String) {
    it.property("proxyUser", proxyUser)
  }

  public fun region(region: String) {
    it.property("region", region)
  }

  public fun secretKey(secretKey: String) {
    it.property("secretKey", secretKey)
  }

  public fun serviceKeys(serviceKeys: String) {
    it.property("serviceKeys", serviceKeys)
  }

  public fun tagLanguage(tagLanguage: String) {
    it.property("tagLanguage", tagLanguage)
  }

  public fun tagLimit(tagLimit: String) {
    it.property("tagLimit", tagLimit)
  }

  public fun tagLimit(tagLimit: Int) {
    it.property("tagLimit", tagLimit.toString())
  }

  public fun threshold(threshold: String) {
    it.property("threshold", threshold)
  }

  public fun threshold(threshold: Double) {
    it.property("threshold", threshold.toString())
  }

  public fun lazyStartProducer(lazyStartProducer: String) {
    it.property("lazyStartProducer", lazyStartProducer)
  }

  public fun lazyStartProducer(lazyStartProducer: Boolean) {
    it.property("lazyStartProducer", lazyStartProducer.toString())
  }

  public fun ignoreSslVerification(ignoreSslVerification: String) {
    it.property("ignoreSslVerification", ignoreSslVerification)
  }

  public fun ignoreSslVerification(ignoreSslVerification: Boolean) {
    it.property("ignoreSslVerification", ignoreSslVerification.toString())
  }
}
