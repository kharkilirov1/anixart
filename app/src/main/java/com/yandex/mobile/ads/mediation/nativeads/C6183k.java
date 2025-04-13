package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.xc0;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.k */
/* loaded from: classes3.dex */
final class C6183k implements xc0<MediatedNativeAdapter> {

    /* renamed from: a */
    @NonNull
    private final ad0<MediatedNativeAdapter> f57553a;

    public C6183k(@NonNull ad0<MediatedNativeAdapter> ad0Var) {
        this.f57553a = ad0Var;
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    @Nullable
    /* renamed from: a */
    public final vc0<MediatedNativeAdapter> mo29736a(@NonNull Context context) {
        return this.f57553a.m22465a(context, MediatedNativeAdapter.class);
    }
}
