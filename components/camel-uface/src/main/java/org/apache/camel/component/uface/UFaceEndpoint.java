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

package org.apache.camel.component.uface;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.component.browse.BrowseEndpoint;
import org.apache.camel.util.ObjectHelper;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.WritableList;

/**
 * @version $Revision$
 */
public class UFaceEndpoint extends BrowseEndpoint {
    public UFaceEndpoint(String uri, UFaceComponent component) {
        super(uri, component);
    }

    public UFaceEndpoint(String endpointUri) {
        super(endpointUri);
    }

    @Override
    protected List<Exchange> createExchangeList() {
        Realm realm = Realm.getDefault();
        ObjectHelper.notNull(realm, "DataBinding Realm");
        return new WritableList(realm);
    }
}
