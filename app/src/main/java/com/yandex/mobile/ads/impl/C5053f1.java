package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.f1 */
/* loaded from: classes3.dex */
public final class C5053f1 {

    /* renamed from: a */
    @NotNull
    private final Object f50085a = new Object();

    /* renamed from: b */
    @NotNull
    private final WeakHashMap<InterfaceC4999e1, Object> f50086b = new WeakHashMap<>();

    /* renamed from: a */
    public final void m24290a(@NotNull InterfaceC4999e1 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f50085a) {
            this.f50086b.put(listener, null);
        }
    }

    /* renamed from: b */
    public final void m24291b(@NotNull InterfaceC4999e1 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f50085a) {
            this.f50086b.remove(listener);
        }
    }

    /* renamed from: a */
    public final void m24289a() {
        HashSet hashSet;
        synchronized (this.f50085a) {
            hashSet = new HashSet(this.f50086b.keySet());
            this.f50086b.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC4999e1) it.next()).mo23757a();
        }
    }
}
