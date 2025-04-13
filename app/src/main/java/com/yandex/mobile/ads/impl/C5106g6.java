package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;

/* renamed from: com.yandex.mobile.ads.impl.g6 */
/* loaded from: classes3.dex */
final class C5106g6 {

    /* renamed from: a */
    @NonNull
    private final BiddingSettings f50510a;

    public C5106g6(@NonNull BiddingSettings biddingSettings) {
        this.f50510a = biddingSettings;
    }

    @Nullable
    /* renamed from: a */
    public final AdUnitIdBiddingSettings m24807a(@Nullable String str) {
        for (AdUnitIdBiddingSettings adUnitIdBiddingSettings : this.f50510a.m21923c()) {
            if (adUnitIdBiddingSettings.m21920c().equals(str)) {
                return adUnitIdBiddingSettings;
            }
        }
        return null;
    }
}
