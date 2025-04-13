package com.yandex.mobile.ads.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.yi0;
import com.yandex.mobile.ads.nativeads.C6201b0;

/* renamed from: com.yandex.mobile.ads.nativeads.z */
/* loaded from: classes3.dex */
final class C6267z implements yi0<View> {

    /* renamed from: a */
    @NonNull
    private final NativeAdViewBinder f57977a;

    public C6267z(@NonNull NativeAdViewBinder nativeAdViewBinder) {
        this.f57977a = nativeAdViewBinder;
    }

    @Override // com.yandex.mobile.ads.impl.yi0
    @NonNull
    /* renamed from: a */
    public final C6201b0 mo29945a(@NonNull View view) {
        return new C6201b0.a(view, this.f57977a.getAssetViews()).m30527a();
    }
}
