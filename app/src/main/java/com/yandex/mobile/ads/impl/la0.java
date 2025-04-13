package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class la0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final ph0 f52320a = new ph0();

    /* renamed from: b */
    @NonNull
    private final ma0 f52321b;

    public la0(@NonNull NativeAdAssets nativeAdAssets) {
        this.f52321b = new ma0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f52320a);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v.findViewById(C4632R.id.media_container);
        Float m26600a = this.f52321b.m26600a();
        if (extendedViewContainer == null || m26600a == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new at0(m26600a.floatValue()));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
