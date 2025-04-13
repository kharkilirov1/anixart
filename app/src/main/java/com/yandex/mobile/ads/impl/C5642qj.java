package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.qj */
/* loaded from: classes3.dex */
public final class C5642qj implements InterfaceC5651qo<NativeAdView> {

    /* renamed from: a */
    @NonNull
    private final NativeAdAssets f54066a;

    /* renamed from: b */
    private final int f54067b;

    public C5642qj(@NonNull NativeAdAssets nativeAdAssets, int i2) {
        this.f54066a = nativeAdAssets;
        this.f54067b = i2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull NativeAdView nativeAdView) {
        NativeAdView nativeAdView2 = nativeAdView;
        C5692rj c5692rj = new C5692rj(this.f54066a, this.f54067b);
        ImageView m27933a = c5692rj.m27933a(nativeAdView2);
        ImageView m27934b = c5692rj.m27934b(nativeAdView2);
        if (m27933a != null) {
            m27933a.setId(C4632R.id.favicon);
        }
        if (m27934b != null) {
            m27934b.setId(C4632R.id.icon);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
