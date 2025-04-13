package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.yandex.mobile.ads.impl.rt */
/* loaded from: classes3.dex */
public final class C5710rt {

    /* renamed from: a */
    @NonNull
    private final sr0 f54413a;

    /* renamed from: b */
    @NonNull
    private final je1 f54414b;

    public C5710rt(@NonNull sr0 sr0Var, @NonNull je1 je1Var) {
        this.f54413a = sr0Var;
        this.f54414b = je1Var;
    }

    /* renamed from: a */
    public final void m27983a(@NonNull AdPlaybackState adPlaybackState, int i2) {
        long m7735d0 = Util.m7735d0(adPlaybackState.m6925b(i2).f12609b);
        if (m7735d0 == Long.MIN_VALUE) {
            m7735d0 = this.f54414b.m25878a();
        }
        this.f54413a.m28354a(new C5760st(m7735d0));
    }

    /* renamed from: a */
    public final void m27982a() {
        this.f54413a.m28354a((C5760st) null);
    }
}
