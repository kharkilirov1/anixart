package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@MainThread
/* loaded from: classes3.dex */
public interface NativeAd {
    void addImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void bindNativeAd(@NonNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    @NonNull
    NativeAdAssets getAdAssets();

    @NonNull
    NativeAdType getAdType();

    @Nullable
    String getInfo();

    void loadImages();

    void removeImageLoadingListener(@NonNull NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void setNativeAdEventListener(@Nullable NativeAdEventListener nativeAdEventListener);
}
