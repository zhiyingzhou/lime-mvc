/*****************************************************************************
 * Copyright 2011 Zdenko Vrabel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 *****************************************************************************/
package org.zdevra.guice.mvc;

import com.google.inject.Injector;

/**
 * This binding class bind an exception to concrete instance 
 * of the {@link ExceptionHandler}. 
 * 
 * @see ExceptionHandler
 * @see ExceptionBind
 * @see GuiceExceptionResolver
 */
public class ExceptionBindToInstance extends ExceptionBind {

    /** holds reference to exception handler */
    private final ExceptionHandler handler;


    /**
     * Constructor
     * @param handler
     * @param exceptionClass
     * @param order
     */
    public ExceptionBindToInstance(ExceptionHandler handler, Class<? extends Throwable> exceptionClass, int order) {
        super(exceptionClass, order);
        this.handler = handler;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public ExceptionHandler getHandler(Injector injetor) {
        return handler;
    }
}
