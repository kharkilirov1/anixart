package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.wx */
/* loaded from: classes3.dex */
public final class C5995wx {

    /* renamed from: a */
    private static final Object f56284a = new Object();

    /* renamed from: b */
    private static volatile C5463mx f56285b;

    @NonNull
    /* renamed from: a */
    public static x80 m29583a(@NonNull Context context) {
        if (f56285b == null) {
            synchronized (f56284a) {
                if (f56285b == null) {
                    f56285b = new C5463mx(context, "com.google.android.gms.location.LocationServices");
                }
            }
        }
        return f56285b;
    }
}
