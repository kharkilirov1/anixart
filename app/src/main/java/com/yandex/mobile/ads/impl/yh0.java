package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.nativeads.C6266y;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class yh0 implements InterfaceC5651qo<NativeAdView> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC6256u f56855a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5541ok f56856b;

    /* renamed from: c */
    @NonNull
    private final NativeAdEventListener f56857c;

    /* renamed from: d */
    @NonNull
    private final hh0 f56858d;

    /* renamed from: e */
    @NonNull
    private final C6134zp f56859e;

    /* renamed from: f */
    @NonNull
    private final C5689rh f56860f;

    /* renamed from: g */
    @NonNull
    private final C6266y f56861g;

    public yh0(@NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull NativeAdEventListener nativeAdEventListener, @NonNull C5689rh c5689rh) {
        this(interfaceC6256u, interfaceC5541ok, nativeAdEventListener, new jh0(), new C5703rp(), c5689rh, new C6134zp());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull NativeAdView nativeAdView) {
        NativeAdView nativeAdView2 = nativeAdView;
        NativeAdViewBinder m30758a = this.f56861g.m30758a(nativeAdView2, this.f56858d);
        try {
            C6134zp c6134zp = this.f56859e;
            Context context = nativeAdView2.getContext();
            Objects.requireNonNull(c6134zp);
            if (C6134zp.m30263a(context)) {
                this.f56855a.mo30561a(m30758a, this.f56860f);
            } else {
                this.f56855a.bindNativeAd(m30758a);
            }
            this.f56855a.setNativeAdEventListener(this.f56857c);
        } catch (NativeAdException unused) {
            this.f56856b.mo27088c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        this.f56855a.setNativeAdEventListener(null);
    }

    @VisibleForTesting
    public yh0(@NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull NativeAdEventListener nativeAdEventListener, @NonNull jh0 jh0Var, @NonNull C5703rp c5703rp, @NonNull C5689rh c5689rh, @NonNull C6134zp c6134zp) {
        this.f56855a = interfaceC6256u;
        this.f56856b = interfaceC5541ok;
        this.f56857c = nativeAdEventListener;
        this.f56858d = jh0Var;
        this.f56861g = new C6266y(c5703rp.m27964a(interfaceC6256u));
        this.f56860f = c5689rh;
        this.f56859e = c6134zp;
    }
}
