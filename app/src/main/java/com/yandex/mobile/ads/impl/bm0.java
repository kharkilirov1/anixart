package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class bm0 implements ko0, ve0 {

    /* renamed from: a */
    @NonNull
    private final CopyOnWriteArrayList f48925a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m22864a(@NonNull cm0 cm0Var) {
        this.f48925a.add(cm0Var);
    }

    /* renamed from: b */
    public final void m22866b(@NonNull cm0 cm0Var) {
        this.f48925a.remove(cm0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ko0
    /* renamed from: c */
    public final void mo22867c() {
    }

    @Override // com.yandex.mobile.ads.impl.ko0
    /* renamed from: a */
    public final void mo22865a(boolean z) {
        Iterator it = this.f48925a.iterator();
        while (it.hasNext()) {
            ((cm0) it.next()).mo22547a(z);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ve0
    /* renamed from: a */
    public final void mo22863a() {
        Iterator it = this.f48925a.iterator();
        while (it.hasNext()) {
            ((cm0) it.next()).mo22546a();
        }
    }
}
