package com.yandex.mobile.ads.appopenad;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.AdRequestError;

@MainThread
/* loaded from: classes2.dex */
public interface AppOpenAdLoadListener {
    void onAdFailedToLoad(@NonNull AdRequestError adRequestError);

    void onAdLoaded(@NonNull AppOpenAd appOpenAd);
}
