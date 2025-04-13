package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class um0 {

    /* renamed from: a */
    @NonNull
    private static final Object f55567a = new Object();

    /* renamed from: b */
    private static volatile kw0 f55568b;

    @NonNull
    /* renamed from: a */
    public static kw0 m29048a(@NonNull Context context) {
        if (f55568b == null) {
            synchronized (f55567a) {
                if (f55568b == null) {
                    f55568b = lw0.m26541a(context, 1);
                    f55568b.m26290a();
                }
            }
        }
        return f55568b;
    }
}
