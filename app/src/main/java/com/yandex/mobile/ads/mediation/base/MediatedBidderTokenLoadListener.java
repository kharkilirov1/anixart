package com.yandex.mobile.ads.mediation.base;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface MediatedBidderTokenLoadListener {
    @MainThread
    void onBidderTokenFailedToLoad(@NonNull String str);

    @MainThread
    void onBidderTokenLoaded(@NonNull String str);
}
