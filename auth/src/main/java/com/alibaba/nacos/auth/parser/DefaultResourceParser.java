/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.auth.parser;

import com.alibaba.nacos.plugin.auth.api.Resource;

/**
 * Default resource parser.
 *
 * @author nkorange
 * @author mai.jh
 * @since 1.2.0
 */
public class DefaultResourceParser implements ResourceParser<Object> {
    
    @Override
    public Resource parse(Object request, String type) {
        return Resource.EMPTY_RESOURCE;
    }
}
