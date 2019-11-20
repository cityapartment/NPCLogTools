package com.npc.log.utils;

import android.view.View;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author leroy
 * @description:
 * @data: 2019/8/8
 */
public class HookViewClickUtils {

    public static HookViewClickUtils getInstance() {
        return INSTANCE.clickUtils;
    }

    private static class INSTANCE {
        private static HookViewClickUtils clickUtils = new HookViewClickUtils();
    }

    /**
     * 操作对象,操作方法
     * 返回对象，
     * 替换变量，
     * 替换，设置代理
     * @param view
     */
    public void hookView(View view) {
        try {
            Class cls = Class.forName("android.view.View");
            Method method = cls.getDeclaredMethod("getListenerInfo");

            if(!method.isAccessible()) {
                method.setAccessible(true);
            }
            Object listenerInfoObj = method.invoke(view);

            //返回的对象
            Class resultClass = Class.forName("android.view.View$ListenerInfo");

            Field field = resultClass.getDeclaredField("mOnClickListener");
            if(!field.isAccessible()) {
                field.setAccessible(true);
            }
            View.OnClickListener onClickListener = (View.OnClickListener) field.get(listenerInfoObj);

            OnClickListenerProxy onClickListenerProxy = new OnClickListenerProxy(onClickListener);

            field.set(listenerInfoObj, onClickListenerProxy);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }


}
