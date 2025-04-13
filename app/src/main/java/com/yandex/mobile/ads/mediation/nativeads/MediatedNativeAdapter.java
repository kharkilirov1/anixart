package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class MediatedNativeAdapter extends C6164a {
    public abstract void loadAd(@NonNull Context context, @NonNull MediatedNativeAdapterListener mediatedNativeAdapterListener, @NonNull Map<String, Object> map, @NonNull Map<String, String> map2);
}
