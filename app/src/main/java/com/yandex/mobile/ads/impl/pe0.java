package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class pe0 {

    /* renamed from: a */
    @NonNull
    private final Object f53550a = new Object();

    /* renamed from: b */
    @NonNull
    private final ArrayList f53551b = new ArrayList();

    /* renamed from: a */
    public final void m27322a(@NonNull z20 z20Var) {
        synchronized (this.f53550a) {
            this.f53551b.add(z20Var);
        }
    }

    /* renamed from: a */
    public final void m27321a() {
        ArrayList arrayList;
        synchronized (this.f53550a) {
            arrayList = new ArrayList(this.f53551b);
            this.f53551b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z20) it.next()).m30044a();
        }
    }
}
