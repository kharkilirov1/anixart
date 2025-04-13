package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ot0 extends n60 {

    /* renamed from: b */
    private static boolean f53326b;

    /* renamed from: a */
    public static void m27109a(boolean z) {
        f53326b = z;
    }

    /* renamed from: f */
    public static void m27110f(String str, Object... objArr) {
        if (n60.f52852a || f53326b) {
            Log.w("Yandex Mobile Ads", String.format(Locale.US, str, objArr));
        }
    }
}
