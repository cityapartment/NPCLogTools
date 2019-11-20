package com.npc.log.library.core.handler;

/**
 * @author leroy
 * @description:
 * @data: 05
 */
public interface ISaveLogEvent {

    void saveDeviceInfoData(String data);

    void saveUserBehaviorData(String data);

    void saveBusinessLogData(String data);

    String getDeviceInfoData();

    String getUserBehaviorData();

    String getBusinessLogData();
}
