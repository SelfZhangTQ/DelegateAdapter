package com.adapter.adapter;


import android.support.annotation.NonNull;

/**
 * @author：tqzhang on 18/9/6 11:22
 */
public class DefaultChain<T> implements Chain<T> {
    @Override
    public int indexItem(int var1, @NonNull T var2) {
        return 0;
    }
}
