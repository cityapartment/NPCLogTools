package com.npc.log.library.core.entity;

/**
 * @author leroy
 * @description:
 * @data: 25
 */
public class LogMessageModel {

    private String logKey;

    private String logType;

    private String logInfo;

    public String getLogKey() {
        return logKey;
    }

    public void setLogKey(String logKey) {
        this.logKey = logKey;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }
}
