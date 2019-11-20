package com.npc.log.library.core.strategy;

import android.content.Context;

/**
 * @author leroy
 * @description:
 * @data: 05
 */
public interface IStrategyConfig {

    void saveStrategyConfig(Context context);

    Object getStrategyConfig(Context context);

    boolean isOpen();

    void handlerStrategy();
}
