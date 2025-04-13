package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class MediatedRewardedAdapter extends C6164a {
    public abstract boolean isLoaded();

    public abstract void loadRewardedAd(@NonNull Context context, @NonNull MediatedRewardedAdapterListener mediatedRewardedAdapterListener, @NonNull Map<String, Object> map, @NonNull Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showRewardedAd();
}
