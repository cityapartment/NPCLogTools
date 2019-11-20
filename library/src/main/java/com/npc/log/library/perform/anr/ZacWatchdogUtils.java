package com.npc.log.library.perform.anr;

import android.content.Context;
import android.util.Log;

import com.github.anrwatchdog.ANRError;
import com.github.anrwatchdog.ANRWatchDog;
import com.orhanobut.logger.Logger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author leroy
 * @description:
 * @data: 05
 */
public class ZacWatchdogUtils {

    private static ZacWatchdogUtils watchdogUtils = new ZacWatchdogUtils();

    public static ZacWatchdogUtils getInstance() {
        return watchdogUtils;
    }

    public ANRWatchDog anrWatchDog = new ANRWatchDog(2000);

    public int duration = 4;

    public final ANRWatchDog.ANRListener silentListener = new ANRWatchDog.ANRListener() {
        @Override
        public void onAppNotResponding(ANRError error) {
            Logger.e(error, "CATCH ANR 2222", null);
            Log.e("ANR-Watchdog-Demo", "", error);
        }
    };

    public void init(Context mContext) {
        anrWatchDog
                .setANRListener(new ANRWatchDog.ANRListener() {
                    @Override
                    public void onAppNotResponding(ANRError error) {
                        Logger.e(error, "CATCH ANR 1111", null);
                        Log.e("ANR-Watchdog-Demo", "Detected Application Not Responding!");

                        // Some tools like ACRA are serializing the exception, so we must make sure the exception serializes correctly
                        try {
                            new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(error);
                        }
                        catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                        Log.i("ANR-Watchdog-Demo", "Error was successfully serialized");

                        throw error;
                    }
                })
                .setANRInterceptor(new ANRWatchDog.ANRInterceptor() {
                    @Override
                    public long intercept(long duration) {
                        long ret = ZacWatchdogUtils.this.duration * 1000 - duration;
                        if (ret > 0)
                            Log.w("ANR-Watchdog-Demo", "Intercepted ANR that is too short (" + duration + " ms), postponing for " + ret + " ms.");
                        return ret;
                    }
                })
        ;

        anrWatchDog.start();
    }
}
