package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.j8 */
/* loaded from: classes3.dex */
public final class C5274j8<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final NativeAdAssets f51530a;

    /* renamed from: b */
    @NonNull
    private final zh0 f51531b = new zh0();

    public C5274j8(@NonNull NativeAdAssets nativeAdAssets) {
        this.f51530a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f51531b);
        View findViewById = v.findViewById(C4632R.id.age_divider);
        if (findViewById == null || this.f51530a.getAge() != null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
