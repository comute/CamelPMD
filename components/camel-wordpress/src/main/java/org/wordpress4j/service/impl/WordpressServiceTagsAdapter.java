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
package org.wordpress4j.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import org.wordpress4j.model.Context;
import org.wordpress4j.model.Tag;
import org.wordpress4j.model.TagSearchCriteria;
import org.wordpress4j.service.WordpressServiceTags;
import org.wordpress4j.service.spi.TagsSPI;

public class WordpressServiceTagsAdapter extends AbstractWordpressCrudServiceAdapter<TagsSPI, Tag, TagSearchCriteria> implements WordpressServiceTags {

    public WordpressServiceTagsAdapter(String wordpressUrl, String apiVersion) {
        super(wordpressUrl, apiVersion);
    }

    @Override
    protected Class<TagsSPI> getSpiType() {
        return TagsSPI.class;
    }

    //@formatter:off
    @Override
    public List<Tag> list(TagSearchCriteria criteria) {
        checkNotNull(criteria, "The search criteria must be defined");
        return this.getSpi().list(this.getApiVersion(), 
                             criteria.getContext(), 
                             criteria.getPage(), 
                             criteria.getPerPage(), 
                             criteria.getSearch(), 
                             criteria.getExclude(), 
                             criteria.getInclude(),
                             criteria.getOffset(),
                             criteria.getOrder(), 
                             criteria.getOrderBy(), 
                             criteria.isHideEmpty(), 
                             criteria.getPostId(), 
                             criteria.getSlug());
    }
    //@formatter:on

    @Override
    protected Tag doCreate(Tag object) {
        return getSpi().create(getApiVersion(), object);
    }

    @Override
    protected Tag doDelete(Integer id) {
        return getSpi().delete(getApiVersion(), id, false);
    }

    @Override
    protected Tag doUpdate(Integer id, Tag object) {
        return getSpi().update(getApiVersion(), id, object);
    }

    @Override
    protected Tag doRetrieve(Integer entityID, Context context) {
        return getSpi().retrieve(getApiVersion(), entityID, context);
    }

}
