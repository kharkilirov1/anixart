package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* loaded from: classes3.dex */
public final class nw0 implements InterfaceC5651qo<NativeAdView> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5896v0 f53096a;

    /* renamed from: b */
    public final int f53097b;

    public nw0(@NonNull InterfaceC5896v0 interfaceC5896v0, int i2) {
        this.f53096a = interfaceC5896v0;
        this.f53097b = i2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull NativeAdView nativeAdView) {
        if (this.f53097b == 1) {
            ((C4788a1) this.f53096a).m22359a(7);
        } else {
            ((C4788a1) this.f53096a).m22359a(6);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
