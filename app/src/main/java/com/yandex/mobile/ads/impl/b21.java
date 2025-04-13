package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.nativeads.C6266y;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
final class b21 implements InterfaceC5651qo<NativeAdView> {

    /* renamed from: a */
    @NonNull
    private final c21 f48734a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5541ok f48735b;

    /* renamed from: c */
    @NonNull
    private final C5689rh f48736c;

    /* renamed from: d */
    @NonNull
    private final hh0 f48737d;

    /* renamed from: e */
    @NonNull
    private final xi0 f48738e;

    /* renamed from: f */
    @NonNull
    private final C6134zp f48739f;

    /* renamed from: g */
    @NonNull
    private final C6266y f48740g;

    public b21(@NonNull c21 c21Var, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var, @NonNull C5689rh c5689rh) {
        this(c21Var, interfaceC5541ok, c5689rh, new jh0(), new xi0(c21Var, oj0Var), new C6134zp(), new C5703rp());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull NativeAdView nativeAdView) {
        NativeAdView nativeAdView2 = nativeAdView;
        try {
            NativeAdViewBinder m30758a = this.f48740g.m30758a(nativeAdView2, this.f48737d);
            C6134zp c6134zp = this.f48739f;
            Context context = nativeAdView2.getContext();
            Objects.requireNonNull(c6134zp);
            if (C6134zp.m30263a(context)) {
                this.f48734a.mo23012b(m30758a, this.f48736c);
            } else {
                this.f48734a.bindSliderAd(m30758a);
            }
            C5983wp.m29518a().m29519a(this.f48738e);
        } catch (NativeAdException unused) {
            this.f48735b.mo27088c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        C5983wp.m29518a().m29520b(this.f48738e);
        Iterator<NativeAd> it = this.f48734a.getNativeAds().iterator();
        while (it.hasNext()) {
            it.next().setNativeAdEventListener(null);
        }
    }

    @VisibleForTesting
    public b21(@NonNull c21 c21Var, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull C5689rh c5689rh, @NonNull jh0 jh0Var, @NonNull xi0 xi0Var, @NonNull C6134zp c6134zp, @NonNull C5703rp c5703rp) {
        this.f48734a = c21Var;
        this.f48735b = interfaceC5541ok;
        this.f48736c = c5689rh;
        this.f48737d = jh0Var;
        this.f48738e = xi0Var;
        this.f48739f = c6134zp;
        this.f48740g = new C6266y(c5703rp.m27964a(c21Var));
    }
}
