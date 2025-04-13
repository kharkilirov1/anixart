package com.bumptech.glide.util;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class LogTime {

    /* renamed from: a */
    public static final double f8842a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b */
    public static final /* synthetic */ int f8843b = 0;

    /* renamed from: a */
    public static double m5335a(long j2) {
        return (SystemClock.elapsedRealtimeNanos() - j2) * f8842a;
    }
}
