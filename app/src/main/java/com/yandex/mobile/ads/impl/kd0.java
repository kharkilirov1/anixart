package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.mediation.nativeads.C6185m;
import com.yandex.mobile.ads.nativeads.C6226o;

/* loaded from: classes3.dex */
final class kd0 implements gj0 {

    /* renamed from: a */
    @NonNull
    private final AdResponse<qi0> f51954a;

    /* renamed from: b */
    @NonNull
    private final MediationData f51955b;

    public kd0(@NonNull AdResponse<qi0> adResponse, @NonNull MediationData mediationData) {
        this.f51954a = adResponse;
        this.f51955b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.gj0
    @NonNull
    /* renamed from: a */
    public final fj0 mo24906a(@NonNull C6226o c6226o) {
        return new C6185m(c6226o, this.f51954a, this.f51955b);
    }
}
