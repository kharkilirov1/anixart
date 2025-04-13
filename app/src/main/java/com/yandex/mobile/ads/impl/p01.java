package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;

/* loaded from: classes3.dex */
public final class p01 implements vx0 {

    /* renamed from: a */
    @NonNull
    private final C4957d6 f53367a;

    /* renamed from: b */
    @NonNull
    private final ServerSideReward f53368b;

    public p01(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull ServerSideReward serverSideReward) {
        this.f53367a = new C4957d6(context, c5101g2);
        this.f53368b = serverSideReward;
    }

    @Override // com.yandex.mobile.ads.impl.vx0
    /* renamed from: a */
    public final void mo22834a() {
        this.f53367a.m23816a(this.f53368b.m21938c());
    }
}
