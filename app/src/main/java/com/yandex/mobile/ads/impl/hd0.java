package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.mediation.interstitial.C6169d;
import com.yandex.mobile.ads.mediation.rewarded.C6193a;

/* loaded from: classes3.dex */
final class hd0 implements InterfaceC5202hw {

    /* renamed from: a */
    @NonNull
    private final AdResponse<String> f50908a;

    /* renamed from: b */
    @NonNull
    private final MediationData f50909b;

    public hd0(@NonNull AdResponse<String> adResponse, @NonNull MediationData mediationData) {
        this.f50908a = adResponse;
        this.f50909b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5202hw
    @NonNull
    /* renamed from: a */
    public final InterfaceC5148gw<t60> mo25121a(@NonNull AbstractC5462mw<t60> abstractC5462mw) {
        return new C6169d(abstractC5462mw, this.f50908a, this.f50909b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5202hw
    @NonNull
    /* renamed from: b */
    public final InterfaceC5148gw<C4798aa> mo25123b(@NonNull AbstractC5462mw<C4798aa> abstractC5462mw) {
        return new C6169d(abstractC5462mw, this.f50908a, this.f50909b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5202hw
    @NonNull
    /* renamed from: a */
    public final InterfaceC5148gw<tx0> mo25122a(@NonNull yx0 yx0Var) {
        return new C6193a(yx0Var, this.f50908a, this.f50909b);
    }
}
