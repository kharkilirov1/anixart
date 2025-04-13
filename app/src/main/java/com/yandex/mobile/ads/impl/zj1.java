package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class zj1 implements InterfaceC5373l3 {

    /* renamed from: a */
    @NonNull
    private final AdResponse f57209a;

    public zj1(@NonNull AdResponse adResponse) {
        this.f57209a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5373l3
    @NonNull
    /* renamed from: a */
    public final InterfaceC4836b1 mo26334a() {
        return new bk1();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5373l3
    @NonNull
    /* renamed from: b */
    public final InterfaceC5271j5 mo26335b() {
        return new ak1(this.f57209a);
    }
}
