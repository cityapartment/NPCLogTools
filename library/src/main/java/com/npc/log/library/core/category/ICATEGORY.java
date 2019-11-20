package com.npc.log.library.core.category;

/**
 * @author leroy
 * @description:
 * @data: 24
 */
public interface ICATEGORY {

    interface IAppLogCategory {
        /**
         * App 的闪退情况、卡死、卡顿
         */
        String APP_SYSTEM = "AppSystem";
        /**
         * 电量使用情况、流量使用、内存使用、启动速度
         */
        String APP_PERFORM = "AppPerform";
        /**
         * 打印日志
         */
        String APP_RUNTIME = "AppRuntime";
    }

    interface IAppLogLevel {
        
        String APP_INFO = "info";

        String APP_ERROR = "error";

        String APP_EXCEPTION = "exception";

        String APP_WARNING = "warning";
    }

    interface IAppModelLevel {
        String APP_VIEW = "view";
        String APP_LOGIC = "logic";
        String APP_HTTP = "http";
        String APP_DB = "db";
    }
}
