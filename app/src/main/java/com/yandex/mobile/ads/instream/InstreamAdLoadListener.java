package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

@MainThread
/* loaded from: classes3.dex */
public interface InstreamAdLoadListener {
    void onInstreamAdFailedToLoad(@NonNull String str);

    void onInstreamAdLoaded(@NonNull InstreamAd instreamAd);
}
