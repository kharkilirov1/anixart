package com.airbnb.lottie.utils;

import com.airbnb.lottie.LottieLogger;

/* loaded from: classes.dex */
public class Logger {

    /* renamed from: a */
    public static LottieLogger f7834a = new LogcatLogger();

    /* renamed from: a */
    public static void m4833a(String str) {
        ((LogcatLogger) f7834a).m4832a(str, null);
    }

    /* renamed from: b */
    public static void m4834b(String str, Throwable th) {
        ((LogcatLogger) f7834a).m4832a(str, th);
    }
}
