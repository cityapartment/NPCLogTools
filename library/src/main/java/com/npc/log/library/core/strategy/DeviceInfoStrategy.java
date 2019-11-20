package com.npc.log.library.core.strategy;

/**
 * @author leroy
 * @description:
 * @data: 05
 */

import android.content.Context;

import com.npc.log.library.utils.StrategySPUtils;

/**
 * {"SystemAccountInfo":"true","CallRecordInfo":"true","BrowserRecordInfo":"false","CalendarInfo":"true",
 * "LocationInfo":"true","IsCallRecordInfoIncremental":"true","AppInstallListInfo":"true","SimCardInfo":"true",
 * "netWorkInfo":"true","IsSmsInfoIncremental":"true","DeviceInfo":"true","ContactInfo":"true","SmsInfo":"false",
 * "DeviceInfoRangeTime":"2","BroswerHistoryIncremental":"true"}
 */
public class DeviceInfoStrategy implements IStrategyConfig {

    public DeviceInfoStrategy(Context context) {
        //获取存档策略
    }

    @Override
    public void saveStrategyConfig(Context context) {

    }

    @Override
    public Object getStrategyConfig(Context context) {
        DeviceInfoStrategyConfig  config = StrategySPUtils.getStrategyOfDeviceInfo(context);
        return config;
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void handlerStrategy() {

    }
}
