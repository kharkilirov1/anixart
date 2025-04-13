package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* loaded from: classes3.dex */
public final class mf1 {

    /* renamed from: a */
    @NonNull
    private final zq0 f52676a;

    /* renamed from: b */
    @NonNull
    private final he1 f52677b;

    public mf1(@NonNull zq0 zq0Var, @NonNull he1 he1Var) {
        this.f52676a = zq0Var;
        this.f52677b = he1Var;
    }

    /* renamed from: a */
    public final void m26657a(@NonNull Player player) {
        if (this.f52676a.m30284c() || player.isPlayingAd()) {
            return;
        }
        this.f52677b.m25147c();
        boolean m25146b = this.f52677b.m25146b();
        Timeline m30283b = this.f52676a.m30283b();
        if (!(m25146b || m30283b.m5991s())) {
            m30283b.m5987h(0, this.f52676a.m30280a());
        }
    }
}
