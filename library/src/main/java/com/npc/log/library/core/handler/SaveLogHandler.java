package com.npc.log.library.core.handler;

import com.npc.log.library.core.strategy.DeviceInfoStrategy;
import com.npc.log.library.core.strategy.DeviceInfoStrategyConfig;
import com.npc.log.library.core.strategy.IStrategyConfig;

/**
 * @author leroy
 * @description:
 * @data: 05
 */
public class SaveLogHandler implements ISaveLogEvent {

    /**
     * 获取采集策略/从存档中取出策略对方，
     * 根据策略进行采集
     * 采集数据存档
     * @param data
     */
    @Override
    public void saveDeviceInfoData(String data) {
        //TODO:根据策略进行设备信息采集

        IStrategyConfig strategyConfig = new DeviceInfoStrategy(null);
        DeviceInfoStrategyConfig config = (DeviceInfoStrategyConfig) strategyConfig.getStrategyConfig(null);
        String isDeviceInfo = config.getDeviceInfo();
        if(isDeviceInfo.equals("true")) {
            //TODO: 采集设备信息数据
        }
    }

    @Override
    public void saveUserBehaviorData(String data) {

    }

    @Override
    public void saveBusinessLogData(String data) {

    }

    @Override
    public String getDeviceInfoData() {
        return null;
    }

    @Override
    public String getUserBehaviorData() {
        return null;
    }

    @Override
    public String getBusinessLogData() {
        return null;
    }
}
