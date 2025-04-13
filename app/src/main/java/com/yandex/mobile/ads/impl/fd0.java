package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.mediation.banner.C6158d;

/* loaded from: classes3.dex */
final class fd0 implements InterfaceC6070yc {

    /* renamed from: a */
    @NonNull
    private final AdResponse<String> f50212a;

    /* renamed from: b */
    @NonNull
    private final MediationData f50213b;

    public fd0(@NonNull AdResponse<String> adResponse, @NonNull MediationData mediationData) {
        this.f50212a = adResponse;
        this.f50213b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6070yc
    @NonNull
    /* renamed from: a */
    public final InterfaceC6021xc mo24548a(@NonNull C4637e c4637e) {
        return new C6158d(c4637e, this.f50212a, this.f50213b);
    }
}
