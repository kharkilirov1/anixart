package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class MediatedInterstitialAdapter extends C6164a {

    public interface MediatedInterstitialAdapterListener {
        void onAdImpression();

        void onInterstitialClicked();

        void onInterstitialDismissed();

        void onInterstitialFailedToLoad(@NonNull AdRequestError adRequestError);

        void onInterstitialLeftApplication();

        void onInterstitialLoaded();

        void onInterstitialShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadInterstitial(@NonNull Context context, @NonNull MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, @NonNull Map<String, Object> map, @NonNull Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showInterstitial();
}
