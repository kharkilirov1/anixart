package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class qb0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final ph0 f53999a = new ph0();

    /* renamed from: b */
    @NonNull
    private final ma0 f54000b;

    public qb0(@NonNull NativeAdAssets nativeAdAssets) {
        this.f54000b = new ma0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f53999a);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v.findViewById(C4632R.id.media_container);
        Float m26600a = this.f54000b.m26600a();
        if (extendedViewContainer == null || m26600a == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new C5805tj(new at0(Math.min(Math.max(m26600a.floatValue(), 1.0f), 1.7777778f)), new ea0(v, 0.5f)));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
