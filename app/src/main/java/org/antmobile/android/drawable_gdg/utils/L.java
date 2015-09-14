package org.antmobile.android.drawable_gdg.utils;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by Antonenko Viacheslav on 12/08/15.
 */

public final class L {

    private final String mTag;

    private L(@NonNull String tag) {
        // disable custom class creating, use only factory method
        mTag = tag;
    }

    private static L getLogger(@NonNull String tag) {
        return new L(tag);
    }

    public static L getLogger(@NonNull Class clazz) {
        return new L(clazz.getSimpleName());
    }


    public void e(String msg) {
        Log.e(mTag, msg);
    }

    public void e(String msg, Throwable th) {
        Log.e(mTag, msg, th);
    }

    public void w(String msg) {
        Log.w(mTag, msg);
    }

    public void w(String msg, Throwable th) {
        Log.w(mTag, msg, th);
    }

    public void i(String msg) {
        Log.i(mTag, msg);
    }

    public void i(String msg, Throwable th) {
        Log.i(mTag, msg, th);
    }

    public void d(String msg) {
        Log.d(mTag, msg);
    }

    public void d(String msg, Throwable th) {
        Log.d(mTag, msg, th);
    }
}
