package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.zc0;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.rewarded.c */
/* loaded from: classes3.dex */
final class C6195c implements zc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> {

    /* renamed from: a */
    @Nullable
    private MediatedRewardedAdapter f57592a;

    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final void mo30149a(@NonNull C6164a c6164a) {
        ((MediatedRewardedAdapter) c6164a).onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* renamed from: a */
    public final void mo30148a(@NonNull Context context, @NonNull C6164a c6164a, @NonNull Object obj, @NonNull Map map, @NonNull Map map2) {
        MediatedRewardedAdapter mediatedRewardedAdapter = (MediatedRewardedAdapter) c6164a;
        this.f57592a = mediatedRewardedAdapter;
        mediatedRewardedAdapter.loadRewardedAd(context, (MediatedRewardedAdapterListener) obj, map, map2);
    }

    @Nullable
    /* renamed from: a */
    public final MediatedRewardedAdapter m30441a() {
        return this.f57592a;
    }
}
