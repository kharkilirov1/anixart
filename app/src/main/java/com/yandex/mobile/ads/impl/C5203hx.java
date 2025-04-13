package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6266y;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.hx */
/* loaded from: classes3.dex */
public final class C5203hx implements InterfaceC5651qo<NativeAdView> {

    /* renamed from: a */
    @NonNull
    private final NativeAd f51142a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5541ok f51143b;

    /* renamed from: c */
    @NonNull
    private final NativeAdEventListener f51144c;

    /* renamed from: d */
    @NonNull
    private final C6266y f51145d = new C6266y();

    /* renamed from: e */
    @NonNull
    private final ih0 f51146e = new ih0();

    public C5203hx(@NonNull NativeAd nativeAd, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var) {
        this.f51142a = nativeAd;
        this.f51143b = interfaceC5541ok;
        this.f51144c = oj0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull NativeAdView nativeAdView) {
        try {
            this.f51142a.bindNativeAd(this.f51145d.m30758a(nativeAdView, this.f51146e));
            this.f51142a.setNativeAdEventListener(this.f51144c);
        } catch (NativeAdException unused) {
            this.f51143b.mo27088c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        this.f51142a.setNativeAdEventListener(null);
    }
}
