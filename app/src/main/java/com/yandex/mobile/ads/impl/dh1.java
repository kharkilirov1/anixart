package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class dh1 implements id1 {

    /* renamed from: a */
    @NonNull
    private final cd1 f49650a;

    /* renamed from: b */
    @NonNull
    private final cg1 f49651b;

    public dh1(@NonNull vk0 vk0Var, @NonNull wl0 wl0Var) {
        this.f49650a = vk0Var;
        this.f49651b = hg0.m25193a(wl0Var);
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        if (this.f49651b.m23259a()) {
            if (this.f49650a.isPlayingAd()) {
                return;
            }
            this.f49650a.mo23231c();
        } else if (this.f49650a.isPlayingAd()) {
            this.f49650a.mo23227a();
        }
    }
}
