package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.HashSet;

/* renamed from: com.yandex.mobile.ads.impl.eu */
/* loaded from: classes3.dex */
public final class C5045eu {

    /* renamed from: a */
    @NonNull
    private final HashSet f50059a;

    public C5045eu(@NonNull NativeAdAssets nativeAdAssets) {
        this.f50059a = C5279jc.m25862a(nativeAdAssets);
    }

    /* renamed from: a */
    public final boolean m24266a() {
        return this.f50059a.size() == 2 && (this.f50059a.contains("feedback") && this.f50059a.contains("media"));
    }
}
