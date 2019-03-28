package com.adapter.holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adapter.adapter.VHolder;

/**
 * @author：tqzhang on 18/8/15 15:04
 */
public abstract class AbsItemHolder<T, VH extends AbsHolder> extends VHolder<T, VH> {

    protected Context mContext;

    public AbsItemHolder(Context context) {
        this.mContext = context;
    }

    @Override
    protected @NonNull
    VH onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return createViewHolder(inflater.inflate(getLayoutResId(), parent, false));
    }

    public abstract int getLayoutResId();


    public abstract VH createViewHolder(View view);


}
