package com.npc.log.library.utils;

import android.content.Context;

import com.npc.log.library.core.strategy.DeviceInfoStrategyConfig;

/**
 * @author leroy
 * @description:
 * @data: 2019/8/7
 */
public class StrategySPUtils {

    private static final String SP_STRATEGY_NAME = "SP_STRATEGY";

    private static final String KEY_DEVICEINFO = "SP_DEVICE_INFO";

    private static final String KEY_EXCEPTION = "SP_EXCEPTION";

    private static final String KEY_BEHAVIOR = "SP_BEHAVIOR";

    /**
     * Strategy SharePreferences
     *
     * @param context
     * @param config
     */
    public static void saveStrategyOfDeviceInfo(Context context, DeviceInfoStrategyConfig config) {
        SharedPreferencesUtil.savaToShared(context, SP_STRATEGY_NAME, KEY_DEVICEINFO, config);
    }

    public static DeviceInfoStrategyConfig getStrategyOfDeviceInfo(Context context) {
        return (DeviceInfoStrategyConfig) SharedPreferencesUtil.getShareObject(context, SP_STRATEGY_NAME, KEY_DEVICEINFO);
    }
}
