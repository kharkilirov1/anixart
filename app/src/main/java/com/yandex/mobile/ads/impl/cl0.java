package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class cl0 implements hl0 {

    /* renamed from: a */
    @NonNull
    private final CopyOnWriteArrayList f49299a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m23310a(@NonNull hl0 hl0Var) {
        this.f49299a.add(hl0Var);
    }

    /* renamed from: b */
    public final void m23311b(@NonNull hl0 hl0Var) {
        this.f49299a.remove(hl0Var);
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22859a() {
        Iterator it = this.f49299a.iterator();
        while (it.hasNext()) {
            ((hl0) it.next()).mo22859a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: b */
    public final void mo22861b() {
        Iterator it = this.f49299a.iterator();
        while (it.hasNext()) {
            ((hl0) it.next()).mo22861b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22860a(long j2, long j3) {
        Iterator it = this.f49299a.iterator();
        while (it.hasNext()) {
            ((hl0) it.next()).mo22860a(j2, j3);
        }
    }
}
