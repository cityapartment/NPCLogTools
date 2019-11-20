package com.npc.log.library.core.strategy;

/**
 * @author leroy
 * @description:
 * @data: 05
 */

import android.content.Context;

/**
 * 10
 */
public class AppErrorStrategy implements IStrategyConfig {
    @Override
    public void saveStrategyConfig(Context context) {

    }

    @Override
    public Object getStrategyConfig(Context context) {
        return null;
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void handlerStrategy() {

    }
}
