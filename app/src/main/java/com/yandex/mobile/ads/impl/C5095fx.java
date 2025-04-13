package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.fx */
/* loaded from: classes3.dex */
public final class C5095fx implements InterfaceC5651qo<NativeAdView> {

    /* renamed from: a */
    @Nullable
    private final InterfaceC5651qo<NativeAdView> f50448a;

    public C5095fx(@NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var, @NonNull C5689rh c5689rh) {
        if (interfaceC6256u instanceof c21) {
            this.f50448a = new b21((c21) interfaceC6256u, interfaceC5541ok, oj0Var, c5689rh);
        } else {
            this.f50448a = new yh0(interfaceC6256u, interfaceC5541ok, oj0Var, c5689rh);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull NativeAdView nativeAdView) {
        NativeAdView nativeAdView2 = nativeAdView;
        InterfaceC5651qo<NativeAdView> interfaceC5651qo = this.f50448a;
        if (interfaceC5651qo != null) {
            interfaceC5651qo.mo22712a(nativeAdView2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        InterfaceC5651qo<NativeAdView> interfaceC5651qo = this.f50448a;
        if (interfaceC5651qo != null) {
            interfaceC5651qo.mo22713c();
        }
    }
}
