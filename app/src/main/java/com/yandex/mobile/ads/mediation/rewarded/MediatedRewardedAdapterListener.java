package com.yandex.mobile.ads.mediation.rewarded;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes3.dex */
interface MediatedRewardedAdapterListener {
    void onAdImpression();

    void onRewarded(@Nullable MediatedReward mediatedReward);

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToLoad(@NonNull AdRequestError adRequestError);

    void onRewardedAdLeftApplication();

    void onRewardedAdLoaded();

    void onRewardedAdShown();
}
