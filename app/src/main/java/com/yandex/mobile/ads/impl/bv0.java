package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bv0 {

    /* renamed from: a */
    @Nullable
    private Long f49003a;

    /* renamed from: a */
    public final long m22938a() {
        Long l2 = this.f49003a;
        if (l2 == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l2.longValue();
    }

    /* renamed from: b */
    public final void m22939b() {
        this.f49003a = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
