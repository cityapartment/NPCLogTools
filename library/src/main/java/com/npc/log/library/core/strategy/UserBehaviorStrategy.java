package com.npc.log.library.core.strategy;

/**
 * @author leroy
 * @description:
 * @data: 05
 */

import android.content.Context;

/**
 * {"size":"1000","time":"1","status":"1"}
 */
public class UserBehaviorStrategy implements IStrategyConfig {
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
