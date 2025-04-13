package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ry0 {
    /* renamed from: a */
    public static boolean m28031a(@NonNull Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        } catch (Throwable th) {
            n60.m26808a(th, th.getMessage(), new Object[0]);
            return false;
        }
    }
}
