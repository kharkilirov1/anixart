package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes3.dex */
public final class si0 {
    @NonNull
    /* renamed from: a */
    public static gj0 m28253a(@NonNull AdResponse adResponse) {
        MediationData m21836z = adResponse.m21836z();
        return m21836z != null ? new kd0(adResponse, m21836z) : new hl1();
    }
}
