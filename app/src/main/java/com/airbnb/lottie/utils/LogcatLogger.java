package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class LogcatLogger implements LottieLogger {

    /* renamed from: a */
    public static final Set<String> f7833a = new HashSet();

    /* renamed from: a */
    public void m4832a(String str, Throwable th) {
        Set<String> set = f7833a;
        if (((HashSet) set).contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        ((HashSet) set).add(str);
    }
}
