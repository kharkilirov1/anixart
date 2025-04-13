package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;

/* loaded from: classes3.dex */
public final class ma0 {

    /* renamed from: a */
    @NonNull
    private final NativeAdAssets f52616a;

    public ma0(@NonNull NativeAdAssets nativeAdAssets) {
        this.f52616a = nativeAdAssets;
    }

    @Nullable
    /* renamed from: a */
    public final Float m26600a() {
        NativeAdMedia media = this.f52616a.getMedia();
        NativeAdImage image = this.f52616a.getImage();
        if (media != null) {
            return Float.valueOf(media.getAspectRatio());
        }
        if (image == null || image.getWidth() <= 0 || image.getHeight() <= 0) {
            return null;
        }
        return Float.valueOf(image.getWidth() / image.getHeight());
    }
}
