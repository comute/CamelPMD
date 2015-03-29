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
package org.apache.camel.component.raspberry.converter;

import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.PinState;

import org.apache.camel.Converter;

@Converter
public final class RaspberryConverter {

    /**
     * 
     */
    private RaspberryConverter() {
        // TODO Auto-generated constructor stub
    }

    @Converter
    public static PinMode toPinMode(String mode) {
        for (PinMode pin : PinMode.all()) {
            if (pin.getName().compareTo(mode) == 0) {
                return pin;
            }
        }
        return null;
    }

    @Converter
    public static PinState toPinState(String state) {
        for (PinState pin : PinState.allStates()) {
            if (pin.getName().compareTo(state) == 0) {
                return pin;
            }
        }
        return null;
    }

    @Converter
    public static boolean toBoolean(PinState state) {
        return state.isHigh();
    }

    @Converter
    public static PinState toPinState(boolean state) {
        return PinState.getState(state);
    }

}
