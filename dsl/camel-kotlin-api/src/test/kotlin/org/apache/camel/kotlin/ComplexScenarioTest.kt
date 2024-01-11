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
package org.apache.camel.kotlin

import org.apache.camel.impl.DefaultCamelContext
import org.apache.camel.kotlin.components.direct
import org.junit.jupiter.api.Test
import java.util.concurrent.atomic.AtomicBoolean

class ComplexScenarioTest {

    @Test
    fun test() {
        val ctx = DefaultCamelContext()
        val producer = ctx.createProducerTemplate()

        val input = AtomicBoolean()
        val firstWhen = AtomicBoolean()
        val secondWhen = AtomicBoolean()
        val otherwise = AtomicBoolean()
        val wireTap = AtomicBoolean()
        val afterWireTap = AtomicBoolean()
        val filtered = AtomicBoolean()
        val afterFilter = AtomicBoolean()

        val clean = {
            input.set(false)
            firstWhen.set(false)
            secondWhen.set(false)
            otherwise.set(false)
            wireTap.set(false)
            afterWireTap.set(false)
            filtered.set(false)
            afterFilter.set(false)
        }

        camel(ctx) {
            route {
                from { direct { name("input") } }
                steps {
                    process { input.set(true) }
                    choice {
                        `when`(body().contains(constant("x"))) {
                            process { firstWhen.set(true) }
                        }
                        `when`(body().contains(constant("y"))) {
                            process { secondWhen.set(true) }
                        }
                        otherwise {
                            process { otherwise.set(true) }
                        }
                    }
                    wireTap { direct { name("wireTap") } }
                    process {
                        afterWireTap.set(true)
                    }
                    filter(body().contains(constant("x"))) {
                        outputs {
                            process { filtered.set(true) }
                        }
                    }
                    process { afterFilter.set(true) }
                }
            }
            route {
                from { direct { name("wireTap") } }
                steps {
                    process { wireTap.set(true) }
                }
            }
        }
        ctx.start()

        clean()
        producer.sendBody("direct:input", "x")
        assert(input.get())
        assert(firstWhen.get())
        assert(secondWhen.get().not())
        assert(otherwise.get().not())
        assert(wireTap.get())
        assert(afterWireTap.get())
        assert(filtered.get())
        assert(afterFilter.get())

        clean()
        producer.sendBody("direct:input", "y")
        assert(input.get())
        assert(firstWhen.get().not())
        assert(secondWhen.get())
        assert(otherwise.get().not())
        assert(wireTap.get())
        assert(afterWireTap.get())
        assert(filtered.get().not())
        assert(afterFilter.get())

        ctx.stop()
    }
}