package com.adapter.listener;

/**
 * @author：tqzhang on 18/9/12 14:06
 */
public interface OnTouchMoveListener {

    /**
     * 下拉的Y方向的距离
     * @param delta
     */
    void onMove(float delta);

    /**
     * 下拉刷新状态
     * @param state
     */
    void onRefreshState(int state);
}
