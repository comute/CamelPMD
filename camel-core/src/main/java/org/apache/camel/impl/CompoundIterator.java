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
package org.apache.camel.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Compound iterator to iterate over multiple iterators sequentially.
 */
public class CompoundIterator<T> implements Iterator<T> {

    final Iterator<Iterator<T>> it;
    Iterator<T> current;

    public CompoundIterator(Iterable<Iterator<T>> it) {
        this(it.iterator());
    }

    public CompoundIterator(Iterator<Iterator<T>> it) {
        this.it = it;
        this.current = it.hasNext() ? it.next() : null;
    }

    @Override
    public boolean hasNext() {
        while (current != null) {
            if (current.hasNext()) {
                return true;
            } else {
                current = it.hasNext() ? it.next() : null;
            }

        }
        return false;
    }

    @Override
    public T next() {
        if (current != null) {
            return current.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        current.remove();
    }
}
