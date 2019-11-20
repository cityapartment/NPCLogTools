package com.npc.log;

import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.anrwatchdog.ANRError;
import com.npc.log.library.core.handler.MainHandlerFactory;
import com.npc.log.utils.HookViewClickUtils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.DiskLogAdapter;
import com.orhanobut.logger.Logger;

import java.io.Serializable;


public class MainActivity extends AppCompatActivity {
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MainHandlerFactory.getInstance().saveDeviceInfo();
        Logger.addLogAdapter(new DiskLogAdapter());
        Logger.addLogAdapter(new AndroidLogAdapter());
        findViewById(R.id.anrText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logger.i("anrText is Clicked.");
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.anrText2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logger.i("anrText2 is Clicked.");
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        HookViewClickUtils.getInstance().hookView(findViewById(R.id.anrText));

        HookViewClickUtils.getInstance().hookView(findViewById(R.id.anrText2));
        Logger.i("=============================sssssssssssssssss");
        Logger.d("=============================sdfsfssf");
        Logger.w("==========================warning");
        Logger.e("==========================error");
        Thread looper = Looper.getMainLooper().getThread();
        StackTraceElement[] stackTraceElements = looper.getStackTrace();

        Throwable throwable = new $(MainActivity.class.getSimpleName(), stackTraceElements).new _Thread(null);
        Logger.e(throwable, "CATCH ANR", null);
        Logger.e("==========================error");
    }


    private static class $ implements Serializable {
        private final String _name;
        private final StackTraceElement[] _stackTrace;

        private class _Thread extends Throwable {
            private _Thread(_Thread other) {
                super(_name, other);
            }

            @Override
            public Throwable fillInStackTrace() {
                setStackTrace(_stackTrace);
                return this;
            }
        }

        private $(String name, StackTraceElement[] stackTrace) {
            _name = name;
            _stackTrace = stackTrace;
        }
    }

    @Override
    protected void onDestroy() {
        Logger.clearLogAdapters();
        super.onDestroy();
    }
}
