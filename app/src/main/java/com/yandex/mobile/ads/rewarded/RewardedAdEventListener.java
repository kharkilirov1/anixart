package com.yandex.mobile.ads.rewarded;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.InterfaceC5149gx;

@MainThread
/* loaded from: classes3.dex */
public interface RewardedAdEventListener extends InterfaceC5149gx {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToLoad(@NonNull AdRequestError adRequestError);

    @Override // com.yandex.mobile.ads.impl.InterfaceC5149gx
    void onAdLoaded();

    void onAdShown();

    void onImpression(@Nullable ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();

    void onRewarded(@NonNull Reward reward);
}
