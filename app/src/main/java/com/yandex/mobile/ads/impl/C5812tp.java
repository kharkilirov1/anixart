package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.div2.DivData;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.tp */
/* loaded from: classes3.dex */
public final class C5812tp implements InterfaceC5366kx {

    /* renamed from: a */
    @NonNull
    private final DivData f55167a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5651qo<NativeAdView> f55168b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5896v0 f55169c;

    /* renamed from: d */
    private final int f55170d;

    public C5812tp(@NonNull DivData divData, @NonNull InterfaceC5651qo<NativeAdView> interfaceC5651qo, @NonNull InterfaceC5896v0 interfaceC5896v0, int i2) {
        this.f55167a = divData;
        this.f55168b = interfaceC5651qo;
        this.f55169c = interfaceC5896v0;
        this.f55170d = i2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5366kx
    @NonNull
    /* renamed from: a */
    public final o70 mo26066a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var) {
        C5689rh c5689rh = new C5689rh();
        return new o70(C4632R.layout.yandex_ads_internal_divkit, NativeAdView.class, new C5540oj(new nw0(this.f55169c, this.f55170d), new C5407lp(context, this.f55167a, c5689rh, interfaceC5541ok), new C5095fx(interfaceC6256u, interfaceC5541ok, oj0Var, c5689rh), this.f55168b), new C5756sp(adResponse));
    }
}
