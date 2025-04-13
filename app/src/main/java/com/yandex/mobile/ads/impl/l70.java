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
final class l70 implements InterfaceC5366kx {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5651qo<NativeAdView> f52275a;

    /* renamed from: b */
    @NonNull
    private final qw0 f52276b = new qw0();

    /* renamed from: c */
    @NonNull
    private final C5339kj f52277c = new C5339kj();

    public l70(@NonNull C5973wi c5973wi) {
        this.f52275a = c5973wi;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5366kx
    @NonNull
    /* renamed from: a */
    public final o70 mo26066a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var) {
        NativeAdAssets adAssets = interfaceC6256u.getAdAssets();
        qw0 qw0Var = this.f52276b;
        int i2 = C4632R.dimen.yandex_ads_internal_landscape_vertical_icon_size;
        Objects.requireNonNull(qw0Var);
        C5339kj c5339kj = this.f52277c;
        InterfaceC5651qo<NativeAdView> interfaceC5651qo = this.f52275a;
        Objects.requireNonNull(c5339kj);
        C5540oj c5540oj = new C5540oj(new C5642qj(adAssets, Math.round(context.getResources().getDimension(i2))), C5339kj.m26130a(interfaceC6256u, interfaceC5541ok, oj0Var, interfaceC5651qo), new la0(adAssets), new dq0(adAssets), new ei1(), new C5801tg(interfaceC6256u));
        NativeAdAssets adAssets2 = interfaceC6256u.getAdAssets();
        qw0 qw0Var2 = this.f52276b;
        int i3 = C4632R.dimen.yandex_ads_internal_landscape_vertical_media_content_min_width;
        Objects.requireNonNull(qw0Var2);
        return new o70(C4632R.layout.yandex_ads_internal_native_interstitial_landscape_vetrical_media, NativeAdView.class, c5540oj, new C5593pj(new qo0(2), new qa0(adAssets2, Math.round(context.getResources().getDimension(i3)))));
    }
}
