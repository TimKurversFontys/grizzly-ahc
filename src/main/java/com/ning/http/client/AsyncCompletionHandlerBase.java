/*
 * Copyright (c) 2017-2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.http.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple {@link AsyncHandler} of type {@link Response}
 */
public class AsyncCompletionHandlerBase extends AsyncCompletionHandler<Response> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncCompletionHandlerBase.class);

    @Override
    public Response onCompleted(Response response) throws Exception {
        return response;
    }

    @Override
    public void onThrowable(Throwable t) {
        LOGGER.debug(t.getMessage(), t);
    }
}
