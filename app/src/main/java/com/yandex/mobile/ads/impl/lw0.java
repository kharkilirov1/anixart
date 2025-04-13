package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.BuildConfigFieldProvider;

/* loaded from: classes3.dex */
public final class lw0 {
    /* renamed from: a */
    public static kw0 m26541a(@NonNull Context context, int i2) {
        boolean z = rh1.f54313a;
        n60.m26809b("Changing log tag to %s", "Yandex Mobile Ads");
        rh1.f54313a = Log.isLoggable("Yandex Mobile Ads", 2);
        rh1.f54313a = BuildConfigFieldProvider.isDebug();
        return new kw0(new C6133zo(C4819ap.m22577a(context, "mobileads-volley-cache"), (int) vd0.m29216a(context, 10485760L)), new C5281je(new q00(context, new ny0()).m27590a()), i2);
    }
}
