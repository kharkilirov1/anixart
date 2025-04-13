package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.xc0;

/* renamed from: com.yandex.mobile.ads.mediation.rewarded.b */
/* loaded from: classes3.dex */
final class C6194b implements xc0<MediatedRewardedAdapter> {

    /* renamed from: a */
    @NonNull
    private final ad0<MediatedRewardedAdapter> f57591a;

    public C6194b(@NonNull ad0<MediatedRewardedAdapter> ad0Var) {
        this.f57591a = ad0Var;
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    @Nullable
    /* renamed from: a */
    public final vc0<MediatedRewardedAdapter> mo29736a(@NonNull Context context) {
        return this.f57591a.m22465a(context, MediatedRewardedAdapter.class);
    }
}
