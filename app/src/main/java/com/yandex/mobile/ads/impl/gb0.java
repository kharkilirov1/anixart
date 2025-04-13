package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class gb0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final NativeAdAssets f50543a;

    /* renamed from: b */
    @NonNull
    private final ph0 f50544b = new ph0();

    public gb0(@NonNull NativeAdAssets nativeAdAssets) {
        this.f50543a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f50544b);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v.findViewById(C4632R.id.media_container);
        if (extendedViewContainer != null && this.f50543a.getImage() == null && this.f50543a.getMedia() == null) {
            extendedViewContainer.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
