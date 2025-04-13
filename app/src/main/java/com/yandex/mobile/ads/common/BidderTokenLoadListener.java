package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface BidderTokenLoadListener {
    @MainThread
    void onBidderTokenFailedToLoad(@NonNull String str);

    @MainThread
    void onBidderTokenLoaded(@NonNull String str);
}
