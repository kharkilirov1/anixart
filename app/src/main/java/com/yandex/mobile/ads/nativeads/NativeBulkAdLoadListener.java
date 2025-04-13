package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.AdRequestError;
import java.util.List;

@MainThread
/* loaded from: classes3.dex */
public interface NativeBulkAdLoadListener {
    void onAdsFailedToLoad(@NonNull AdRequestError adRequestError);

    void onAdsLoaded(@NonNull List<NativeAd> list);
}
