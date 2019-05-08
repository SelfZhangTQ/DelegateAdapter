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
