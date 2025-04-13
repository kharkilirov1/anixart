package com.yandex.mobile.ads.banner;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;

@MainThread
/* loaded from: classes2.dex */
public interface BannerAdEventListener {
    void onAdClicked();

    void onAdFailedToLoad(@NonNull AdRequestError adRequestError);

    void onAdLoaded();

    void onImpression(@Nullable ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
