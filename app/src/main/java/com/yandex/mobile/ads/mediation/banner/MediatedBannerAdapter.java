package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class MediatedBannerAdapter extends C6164a {

    public interface MediatedBannerAdapterListener {
        void onAdClicked();

        void onAdFailedToLoad(@NonNull AdRequestError adRequestError);

        void onAdImpression();

        void onAdLeftApplication();

        void onAdLoaded(@NonNull View view);
    }

    public abstract void loadBanner(@NonNull Context context, @NonNull MediatedBannerAdapterListener mediatedBannerAdapterListener, @NonNull Map<String, Object> map, @NonNull Map<String, String> map2);

    public abstract void onInvalidate();
}
