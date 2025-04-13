package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.model.reward.ClientSideReward;

/* renamed from: com.yandex.mobile.ads.impl.bi */
/* loaded from: classes3.dex */
public final class C4867bi implements vx0 {

    /* renamed from: a */
    @NonNull
    private final ll1 f48883a;

    /* renamed from: b */
    @NonNull
    private final xx0 f48884b;

    public C4867bi(@NonNull ClientSideReward clientSideReward, @NonNull xx0 xx0Var) {
        this.f48884b = xx0Var;
        this.f48883a = new ll1(clientSideReward.m21926c(), clientSideReward.m21927d());
    }

    @Override // com.yandex.mobile.ads.impl.vx0
    /* renamed from: a */
    public final void mo22834a() {
        this.f48884b.mo25951a(this.f48883a);
    }
}
