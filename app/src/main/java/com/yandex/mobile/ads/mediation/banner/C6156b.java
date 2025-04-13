package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.xc0;

/* renamed from: com.yandex.mobile.ads.mediation.banner.b */
/* loaded from: classes3.dex */
final class C6156b implements xc0<MediatedBannerAdapter> {

    /* renamed from: a */
    @NonNull
    private final ad0<MediatedBannerAdapter> f57472a;

    public C6156b(@NonNull ad0<MediatedBannerAdapter> ad0Var) {
        this.f57472a = ad0Var;
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    @Nullable
    /* renamed from: a */
    public final vc0<MediatedBannerAdapter> mo29736a(@NonNull Context context) {
        return this.f57472a.m22465a(context, MediatedBannerAdapter.class);
    }
}
