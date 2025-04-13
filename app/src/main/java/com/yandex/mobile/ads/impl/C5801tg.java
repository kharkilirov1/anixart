package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.tg */
/* loaded from: classes3.dex */
public final class C5801tg<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final NativeAd f55113a;

    /* renamed from: b */
    @NonNull
    private final ih0 f55114b = new ih0();

    public C5801tg(@NonNull NativeAd nativeAd) {
        this.f55113a = nativeAd;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        Objects.requireNonNull(this.f55114b);
        TextView textView = (TextView) v.findViewById(C4632R.id.call_to_action);
        NativeAdType adType = this.f55113a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == NativeAdType.APP_INSTALL) {
            return;
        }
        ((CallToActionView) textView).m22334a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
    }
}
