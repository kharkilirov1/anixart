package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.model.MediationData;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class hp0 {

    /* renamed from: a */
    @NonNull
    private final ip0 f51116a;

    /* renamed from: b */
    @NonNull
    private final WeakReference<AbstractC5794td> f51117b;

    public hp0(@NonNull AbstractC5794td abstractC5794td, @NonNull MediationData mediationData, @NonNull C5724s3 c5724s3) {
        this.f51117b = new WeakReference<>(abstractC5794td);
        this.f51116a = new ip0(new jp0(C5728s6.m28072a(c5724s3.m28054b()), mediationData));
    }

    /* renamed from: a */
    public final void m25354a() {
        AbstractC5794td abstractC5794td = this.f51117b.get();
        if (abstractC5794td == null || abstractC5794td.m28623k()) {
            return;
        }
        abstractC5794td.m28607a(this.f51116a);
    }
}
