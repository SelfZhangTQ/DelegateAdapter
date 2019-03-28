/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.adapter.adapter;



final class ChainOneToMany<T> implements Chain<T> {

    private final OneToMany<T> oneToMany;

    private final VHolder<T, ?>[] vHolders;


    public ChainOneToMany(
            OneToMany<T> oneToMany,
            VHolder<T, ?>[] vHolders) {
        this.oneToMany = oneToMany;
        this.vHolders = vHolders;
    }

    @Override
    public int indexItem(int position, T t) {
        Class<?> aClass = oneToMany.onItemView(position, t);
        for (int i = 0; i < vHolders.length; i++) {
            if (vHolders[i].getClass().equals(aClass)) {
                return i;
            }
        }
        return -1;

    }
}
