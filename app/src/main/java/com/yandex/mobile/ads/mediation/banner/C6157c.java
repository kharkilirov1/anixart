package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.zc0;
import com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.banner.c */
/* loaded from: classes3.dex */
final class C6157c implements zc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final void mo30149a(@NonNull C6164a c6164a) {
        ((MediatedBannerAdapter) c6164a).onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final void mo30148a(@NonNull Context context, @NonNull C6164a c6164a, @NonNull Object obj, @NonNull Map map, @NonNull Map map2) {
        ((MediatedBannerAdapter) c6164a).loadBanner(context, (MediatedBannerAdapter.MediatedBannerAdapterListener) obj, map, map2);
    }
}
