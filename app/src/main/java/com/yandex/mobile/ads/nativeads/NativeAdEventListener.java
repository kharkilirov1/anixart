package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.ImpressionData;

@MainThread
/* loaded from: classes3.dex */
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(@Nullable ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
