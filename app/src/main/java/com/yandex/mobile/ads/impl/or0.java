package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.Objects;

/* loaded from: classes3.dex */
final class or0 implements InterfaceC5366kx {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5651qo<NativeAdView> f53318a;

    /* renamed from: b */
    @NonNull
    private final C5339kj f53319b = new C5339kj();

    public or0(@NonNull C5973wi c5973wi) {
        this.f53318a = c5973wi;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5366kx
    @NonNull
    /* renamed from: a */
    public final o70 mo26066a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var) {
        NativeAdAssets adAssets = interfaceC6256u.getAdAssets();
        C5339kj c5339kj = this.f53319b;
        InterfaceC5651qo<NativeAdView> interfaceC5651qo = this.f53318a;
        Objects.requireNonNull(c5339kj);
        return new o70(C4632R.layout.yandex_ads_internal_native_interstitial_portrait, NativeAdView.class, new C5540oj(C5339kj.m26130a(interfaceC6256u, interfaceC5541ok, oj0Var, interfaceC5651qo), new qb0(adAssets), new ei1(), new C5801tg(interfaceC6256u), new C5688rg(context)), new qo0(1));
    }
}
