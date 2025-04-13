package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.core.identifiers.p024ad.gms.service.C4661d;

/* renamed from: com.yandex.mobile.ads.impl.ux */
/* loaded from: classes3.dex */
public final class C5891ux {

    /* renamed from: a */
    @NonNull
    private final C5945vx f55697a;

    /* renamed from: b */
    @NonNull
    private final C4661d f55698b;

    public C5891ux(@NonNull Context context) {
        this.f55697a = new C5945vx(context);
        this.f55698b = new C4661d(context);
    }

    @Nullable
    /* renamed from: a */
    public final C6061y7 m29145a() {
        C6061y7 m29283a = this.f55697a.m29283a();
        return m29283a == null ? this.f55698b.m21971a() : m29283a;
    }
}
