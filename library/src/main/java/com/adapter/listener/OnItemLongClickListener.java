package com.adapter.listener;

import android.view.View;

/**
 * @author：tqzhang on 18/8/30 19:17
 */
public interface OnItemLongClickListener<T> {
    void onItemLongClick(View view, int position, T t);
}
