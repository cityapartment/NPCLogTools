package com.npc.log.library.core.strategy;

/**
 * @author leroy
 * @description:
 * @data: 2019/8/7
 */

/**
 * {"SystemAccountInfo":"true","CallRecordInfo":"true","BrowserRecordInfo":"false","CalendarInfo":"true",
 * "LocationInfo":"true","IsCallRecordInfoIncremental":"true","AppInstallListInfo":"true","SimCardInfo":"true",
 * "netWorkInfo":"true","IsSmsInfoIncremental":"true","DeviceInfo":"true","ContactInfo":"true","SmsInfo":"false",
 * "DeviceInfoRangeTime":"2","BroswerHistoryIncremental":"true"}
 */
public class DeviceInfoStrategyConfig {

    private String SystemAccountInfo;
    private String CallRecordInfo;
    private String BrowserRecordInfo;
    private String CalendarInfo;
    private String LocationInfo;
    private String IsCallRecordInfoIncremental;
    private String AppInstallListInfo;
    private String SimCardInfo;
    private String netWorkInfo;
    private String IsSmsInfoIncremental;
    private String DeviceInfo;
    private String ContactInfo;
    private String SmsInfo;
    private String DeviceInfoRangeTime;
    private String BroswerHistoryIncremental;

    public String getSystemAccountInfo() {
        return SystemAccountInfo;
    }

    public void setSystemAccountInfo(String systemAccountInfo) {
        SystemAccountInfo = systemAccountInfo;
    }

    public String getCallRecordInfo() {
        return CallRecordInfo;
    }

    public void setCallRecordInfo(String callRecordInfo) {
        CallRecordInfo = callRecordInfo;
    }

    public String getBrowserRecordInfo() {
        return BrowserRecordInfo;
    }

    public void setBrowserRecordInfo(String browserRecordInfo) {
        BrowserRecordInfo = browserRecordInfo;
    }

    public String getCalendarInfo() {
        return CalendarInfo;
    }

    public void setCalendarInfo(String calendarInfo) {
        CalendarInfo = calendarInfo;
    }

    public String getLocationInfo() {
        return LocationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        LocationInfo = locationInfo;
    }

    public String getIsCallRecordInfoIncremental() {
        return IsCallRecordInfoIncremental;
    }

    public void setIsCallRecordInfoIncremental(String isCallRecordInfoIncremental) {
        IsCallRecordInfoIncremental = isCallRecordInfoIncremental;
    }

    public String getAppInstallListInfo() {
        return AppInstallListInfo;
    }

    public void setAppInstallListInfo(String appInstallListInfo) {
        AppInstallListInfo = appInstallListInfo;
    }

    public String getSimCardInfo() {
        return SimCardInfo;
    }

    public void setSimCardInfo(String simCardInfo) {
        SimCardInfo = simCardInfo;
    }

    public String getNetWorkInfo() {
        return netWorkInfo;
    }

    public void setNetWorkInfo(String netWorkInfo) {
        this.netWorkInfo = netWorkInfo;
    }

    public String getIsSmsInfoIncremental() {
        return IsSmsInfoIncremental;
    }

    public void setIsSmsInfoIncremental(String isSmsInfoIncremental) {
        IsSmsInfoIncremental = isSmsInfoIncremental;
    }

    public String getDeviceInfo() {
        return DeviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        DeviceInfo = deviceInfo;
    }

    public String getContactInfo() {
        return ContactInfo;
    }

    public void setContactInfo(String contactInfo) {
        ContactInfo = contactInfo;
    }

    public String getSmsInfo() {
        return SmsInfo;
    }

    public void setSmsInfo(String smsInfo) {
        SmsInfo = smsInfo;
    }

    public String getDeviceInfoRangeTime() {
        return DeviceInfoRangeTime;
    }

    public void setDeviceInfoRangeTime(String deviceInfoRangeTime) {
        DeviceInfoRangeTime = deviceInfoRangeTime;
    }

    public String getBroswerHistoryIncremental() {
        return BroswerHistoryIncremental;
    }

    public void setBroswerHistoryIncremental(String broswerHistoryIncremental) {
        BroswerHistoryIncremental = broswerHistoryIncremental;
    }
}
