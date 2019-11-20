package com.npc.log.application;

import android.app.Application;

import com.npc.log.library.perform.anr.ZacWatchdogUtils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @author leroy
 * @description:
 * @data: 31
 */
public class ANRWatchdogTestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
        ZacWatchdogUtils.getInstance().init(this);
    }
}
