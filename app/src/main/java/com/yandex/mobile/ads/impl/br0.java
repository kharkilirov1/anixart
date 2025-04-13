package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;

/* loaded from: classes3.dex */
public final class br0 {

    /* renamed from: a */
    @NonNull
    private final C5603ps f48967a;

    /* renamed from: b */
    @Nullable
    private Float f48968b;

    public br0(@NonNull C5603ps c5603ps) {
        this.f48967a = c5603ps;
    }

    /* renamed from: a */
    public final void m22926a(float f2) {
        if (this.f48968b == null) {
            this.f48968b = m22925a();
        }
        Player m27369a = this.f48967a.m27369a();
        if (m27369a != null) {
            m27369a.setVolume(f2);
        }
    }

    /* renamed from: b */
    public final void m22927b() {
        Float f2 = this.f48968b;
        if (f2 != null) {
            float floatValue = f2.floatValue();
            Player m27369a = this.f48967a.m27369a();
            if (m27369a != null) {
                m27369a.setVolume(floatValue);
            }
        }
        this.f48968b = null;
    }

    @Nullable
    /* renamed from: a */
    public final Float m22925a() {
        Player m27369a = this.f48967a.m27369a();
        if (m27369a != null) {
            return Float.valueOf(m27369a.getVolume());
        }
        return null;
    }
}
