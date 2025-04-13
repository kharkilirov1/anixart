package com.yandex.mobile.ads.mediation.base;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.mediation.base.MediatedAdapterInfo;

/* renamed from: com.yandex.mobile.ads.mediation.base.a */
/* loaded from: classes3.dex */
public class C6164a {
    @NonNull
    public MediatedAdapterInfo getAdapterInfo() {
        return new MediatedAdapterInfo.Builder().build();
    }

    public boolean shouldTrackImpressionAutomatically() {
        return true;
    }
}
