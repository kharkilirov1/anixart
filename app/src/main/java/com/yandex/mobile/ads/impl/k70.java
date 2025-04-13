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
final class k70 implements InterfaceC5366kx {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5651qo<NativeAdView> f51884a;

    /* renamed from: b */
    @NonNull
    private final qw0 f51885b = new qw0();

    /* renamed from: c */
    @NonNull
    private final C5339kj f51886c = new C5339kj();

    public k70(@NonNull C5973wi c5973wi) {
        this.f51884a = c5973wi;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5366kx
    @NonNull
    /* renamed from: a */
    public final o70 mo26066a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var) {
        NativeAdAssets adAssets = interfaceC6256u.getAdAssets();
        qw0 qw0Var = this.f51885b;
        int i2 = C4632R.dimen.yandex_ads_internal_landscape_horizontal_icon_size;
        Objects.requireNonNull(qw0Var);
        int round = Math.round(context.getResources().getDimension(i2));
        C5339kj c5339kj = this.f51886c;
        InterfaceC5651qo<NativeAdView> interfaceC5651qo = this.f51884a;
        Objects.requireNonNull(c5339kj);
        return new o70(C4632R.layout.f47618x935a4dbd, NativeAdView.class, new C5540oj(new C5642qj(adAssets, round), C5339kj.m26130a(interfaceC6256u, interfaceC5541ok, oj0Var, interfaceC5651qo), new la0(adAssets), new dq0(adAssets), new ei1(), new C5801tg(interfaceC6256u)), new qo0(2));
    }
}
