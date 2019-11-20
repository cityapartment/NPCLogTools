package com.npc.log.library.core.handler;

/**
 * @author leroy
 * @description:
 * @data: 05
 */
public class MainHandlerFactory {

    private static MainHandlerFactory handlerFactory = new MainHandlerFactory();

    public static MainHandlerFactory getInstance() {
        return  handlerFactory;
    }

    public void saveDeviceInfo() {
        new SaveLogHandler().saveDeviceInfoData("");
    }

    public void saveBusinessLog() {
        new SaveLogHandler().saveBusinessLogData("");
    }

    public void saveBehaviorEvent() {
        new SaveLogHandler().saveUserBehaviorData("");
    }
}
