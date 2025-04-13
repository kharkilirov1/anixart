package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.zc0;
import com.yandex.mobile.ads.mediation.base.C6164a;
import com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.interstitial.c */
/* loaded from: classes3.dex */
final class C6168c implements zc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> {

    /* renamed from: a */
    @Nullable
    private MediatedInterstitialAdapter f57495a;

    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final void mo30149a(@NonNull C6164a c6164a) {
        ((MediatedInterstitialAdapter) c6164a).onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final void mo30148a(@NonNull Context context, @NonNull C6164a c6164a, @NonNull Object obj, @NonNull Map map, @NonNull Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) c6164a;
        this.f57495a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj, map, map2);
    }

    @Nullable
    /* renamed from: a */
    public final MediatedInterstitialAdapter m30419a() {
        return this.f57495a;
    }
}
