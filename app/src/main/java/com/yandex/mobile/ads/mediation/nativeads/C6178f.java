package com.yandex.mobile.ads.mediation.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.nativeads.C6218k;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.f */
/* loaded from: classes3.dex */
final class C6178f {

    /* renamed from: a */
    private final WeakHashMap<C6218k, Object> f57542a = new WeakHashMap<>();

    /* renamed from: a */
    public final void m30425a(@NonNull C6218k c6218k) {
        this.f57542a.put(c6218k, null);
    }

    /* renamed from: b */
    public final void m30426b() {
        Iterator<C6218k> it = this.f57542a.keySet().iterator();
        while (it.hasNext()) {
            it.next().m30569c();
        }
    }

    /* renamed from: c */
    public final void m30427c() {
        Iterator<C6218k> it = this.f57542a.keySet().iterator();
        while (it.hasNext()) {
            it.next().m30570d();
        }
    }

    /* renamed from: d */
    public final void m30428d() {
        Iterator<C6218k> it = this.f57542a.keySet().iterator();
        while (it.hasNext()) {
            it.next().m30571e();
        }
    }

    /* renamed from: a */
    public final void m30423a() {
        Iterator<C6218k> it = this.f57542a.keySet().iterator();
        while (it.hasNext()) {
            it.next().m30568b();
        }
    }

    /* renamed from: a */
    public final void m30424a(@Nullable AdImpressionData adImpressionData) {
        Iterator<C6218k> it = this.f57542a.keySet().iterator();
        while (it.hasNext()) {
            it.next().mo21751a(adImpressionData);
        }
    }
}
