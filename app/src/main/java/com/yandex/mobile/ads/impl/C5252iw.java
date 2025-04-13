package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* renamed from: com.yandex.mobile.ads.impl.iw */
/* loaded from: classes3.dex */
public final class C5252iw {
    @NonNull
    /* renamed from: a */
    public static InterfaceC5202hw m25738a(@NonNull AdResponse adResponse) {
        MediationData m21836z = adResponse.m21836z();
        return m21836z != null ? new hd0(adResponse, m21836z) : EnumC5870uk.f55549b.equals(adResponse.m21832v()) ? new il1() : new xk1();
    }
}
