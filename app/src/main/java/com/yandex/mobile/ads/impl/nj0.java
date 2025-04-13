package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nj0 implements hi0 {

    /* renamed from: a */
    @NotNull
    private final CopyOnWriteArrayList f53023a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private boolean f53024b;

    /* renamed from: a */
    public final void m26918a(@NotNull mj0 listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f53023a.add(listener);
        if (this.f53024b) {
            listener.mo25211b();
        }
    }

    /* renamed from: b */
    public final void m26919b(@NotNull mj0 listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f53023a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.hi0
    /* renamed from: b */
    public final void mo25211b() {
        this.f53024b = true;
        Iterator it = this.f53023a.iterator();
        while (it.hasNext()) {
            ((hi0) it.next()).mo25211b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hi0
    /* renamed from: a */
    public final void mo25210a() {
        this.f53024b = false;
        Iterator it = this.f53023a.iterator();
        while (it.hasNext()) {
            ((hi0) it.next()).mo25210a();
        }
    }
}
