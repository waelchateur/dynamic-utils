/*
 * Copyright 2017-2021 Pranav Pandey
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

package com.pranavpandey.android.dynamic.util.concurrent;

import androidx.annotation.Nullable;

import java.util.concurrent.Callable;

/**
 * Base class to implement the {@link Callable} with parameters.
 *
 * @param <T> The type of the params.
 * @param <R> The type of the result.
 */
public abstract class DynamicCallable<T, R> implements Callable<R> {

    /**
     * Parameters associated with this class.
     */
    private T mParams;

    /**
     * Get the parameters associated with this class.
     *
     * @return The parameters associated with this class.
     */
    public @Nullable T getParams() {
        return mParams;
    }

    /**
     * Set the parameters associated for this class.
     *
     * @param params The parameters for this class.
     */
    public void setParams(@Nullable T params) {
        this.mParams = params;
    }
}