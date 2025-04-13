package com.yandex.mobile.ads.appopenad;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

@MainThread
/* loaded from: classes2.dex */
public interface AppOpenAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToPresent(@NonNull AdError adError);

    void onAdShown();

    void onImpression(@Nullable ImpressionData impressionData);
}
