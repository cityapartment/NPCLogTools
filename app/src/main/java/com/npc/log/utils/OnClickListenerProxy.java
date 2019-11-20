package com.npc.log.utils;

import android.view.View;

import com.orhanobut.logger.Logger;


/**
 * @author leroy
 * @description:
 * @data: 2019/8/8
 */
public class OnClickListenerProxy implements View.OnClickListener {

    private View.OnClickListener onClickListener;

    public OnClickListenerProxy (View.OnClickListener listener) {
        this.onClickListener = listener;
    }

    @Override
    public void onClick(View v) {
        Logger.i("OnClickListenerProxy is Clicked.");
        if(onClickListener != null) {
            onClickListener.onClick(v);
        }
    }
}
