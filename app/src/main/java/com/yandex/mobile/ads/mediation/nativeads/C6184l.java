package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.zc0;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.l */
/* loaded from: classes3.dex */
final class C6184l implements zc0<MediatedNativeAdapter, MediatedNativeAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30149a(@NonNull C6164a c6164a) {
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final void mo30148a(@NonNull Context context, @NonNull C6164a c6164a, @NonNull Object obj, @NonNull Map map, @NonNull Map map2) {
        ((MediatedNativeAdapter) c6164a).loadAd(context, (MediatedNativeAdapterListener) obj, map, map2);
    }
}
