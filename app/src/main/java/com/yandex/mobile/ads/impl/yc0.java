package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class yc0 implements InterfaceC5373l3 {

    /* renamed from: a */
    @NonNull
    private final AdResponse f56797a;

    /* renamed from: b */
    @Nullable
    private final vc0 f56798b;

    public yc0(@NonNull AdResponse adResponse, @Nullable vc0 vc0Var) {
        this.f56797a = adResponse;
        this.f56798b = vc0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5373l3
    @NonNull
    /* renamed from: a */
    public final InterfaceC4836b1 mo26334a() {
        return new dd0(this.f56798b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5373l3
    @NonNull
    /* renamed from: b */
    public final InterfaceC5271j5 mo26335b() {
        return new bd0(this.f56797a);
    }
}
