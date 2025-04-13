package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.nx */
/* loaded from: classes3.dex */
final class C5514nx {

    /* renamed from: a */
    @NonNull
    private final Object f53098a;

    public C5514nx(@NonNull Object obj) {
        this.f53098a = obj;
    }

    @Nullable
    /* renamed from: a */
    public final b90 m26960a() {
        Object m29279a = vu0.m29279a(this.f53098a, "getLastLocation", new Object[0]);
        if (m29279a != null) {
            return new b90(m29279a);
        }
        return null;
    }
}
