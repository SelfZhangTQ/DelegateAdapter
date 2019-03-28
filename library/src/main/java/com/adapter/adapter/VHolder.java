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

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public abstract class VHolder<T, VH extends ViewHolder> {

    DelegateAdapter adapter;

    protected abstract @NonNull
    VH onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent);


    protected abstract void onBindViewHolder(@NonNull VH holder, @NonNull T item);


    protected void onBindViewHolder(@NonNull VH holder, @NonNull T item, @NonNull List<Object> payloads) {
        holder.itemView.setTag(item);
        onBindViewHolder(holder, item);
    }


    protected final int getPosition(@NonNull final ViewHolder holder) {
        return holder.getAdapterPosition();
    }


    protected final @NonNull
    DelegateAdapter getAdapter() {
        if (adapter == null) {
            throw new IllegalStateException("VHolder " + this + " not attached to DelegateAdapter. ");
        }
        return adapter;
    }


    protected long getItemId(@NonNull T item) {
        return item.hashCode();
    }


    protected void onViewRecycled(@NonNull VH holder) {
    }


    protected boolean onFailedToRecycleView(@NonNull VH holder) {
        return false;
    }


    protected void onViewAttachedToWindow(@NonNull VH holder) {
    }


    protected void onViewDetachedFromWindow(@NonNull VH holder) {
    }
}
