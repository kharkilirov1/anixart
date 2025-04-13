package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.ly */
/* loaded from: classes3.dex */
public final class C5417ly {

    /* renamed from: a */
    private static final Object f52548a = new Object();

    /* renamed from: b */
    private static volatile C5463mx f52549b;

    @NonNull
    /* renamed from: a */
    public static x80 m26543a(@NonNull Context context) {
        if (f52549b == null) {
            synchronized (f52548a) {
                if (f52549b == null) {
                    f52549b = new C5463mx(context, "com.huawei.hms.location.LocationServices");
                }
            }
        }
        return f52549b;
    }
}
