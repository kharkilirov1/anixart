package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.xc0;

/* renamed from: com.yandex.mobile.ads.mediation.interstitial.b */
/* loaded from: classes3.dex */
final class C6167b implements xc0<MediatedInterstitialAdapter> {

    /* renamed from: a */
    @NonNull
    private final ad0<MediatedInterstitialAdapter> f57494a;

    public C6167b(@NonNull ad0<MediatedInterstitialAdapter> ad0Var) {
        this.f57494a = ad0Var;
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    @Nullable
    /* renamed from: a */
    public final vc0<MediatedInterstitialAdapter> mo29736a(@NonNull Context context) {
        return this.f57494a.m22465a(context, MediatedInterstitialAdapter.class);
    }
}
