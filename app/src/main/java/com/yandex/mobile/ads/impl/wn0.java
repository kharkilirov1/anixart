package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wn0 {

    /* renamed from: a */
    @NotNull
    private final Object f56166a = new Object();

    /* renamed from: b */
    @NotNull
    private final WeakHashMap<vn0, Object> f56167b = new WeakHashMap<>();

    /* renamed from: a */
    public final void m29513a(@NotNull vn0 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f56166a) {
            this.f56167b.put(listener, null);
        }
    }

    /* renamed from: b */
    public final void m29516b(@NotNull vn0 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f56166a) {
            this.f56167b.remove(listener);
        }
    }

    /* renamed from: a */
    public final boolean m29514a() {
        boolean z;
        synchronized (this.f56166a) {
            z = !this.f56167b.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public final void m29515b() {
        List m32027j0;
        synchronized (this.f56166a) {
            Set<vn0> keySet = this.f56167b.keySet();
            Intrinsics.m32178g(keySet, "listeners.keys");
            m32027j0 = CollectionsKt.m32027j0(keySet);
            this.f56167b.clear();
        }
        Iterator it = m32027j0.iterator();
        while (it.hasNext()) {
            ((vn0) it.next()).mo22903a();
        }
    }
}
