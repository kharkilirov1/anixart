package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jd1 implements id1, kd1 {

    /* renamed from: a */
    @NotNull
    private final LinkedHashSet f51581a = new LinkedHashSet();

    /* renamed from: b */
    @NotNull
    private final LinkedHashSet f51582b = new LinkedHashSet();

    /* renamed from: a */
    public final void m25872a(@NotNull id1... newProgressChangeListeners) {
        Intrinsics.m32179h(newProgressChangeListeners, "newProgressChangeListeners");
        CollectionsKt.m32022h(this.f51581a, newProgressChangeListeners);
    }

    @Override // com.yandex.mobile.ads.impl.kd1
    /* renamed from: b */
    public final void mo25874b() {
        Iterator it = this.f51582b.iterator();
        while (it.hasNext()) {
            ((kd1) it.next()).mo25874b();
        }
    }

    /* renamed from: a */
    public final void m25873a(@NotNull kd1... newProgressLifecycleListeners) {
        Intrinsics.m32179h(newProgressLifecycleListeners, "newProgressLifecycleListeners");
        CollectionsKt.m32022h(this.f51582b, newProgressLifecycleListeners);
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        Iterator it = this.f51581a.iterator();
        while (it.hasNext()) {
            ((id1) it.next()).mo22386a(j2, j3);
        }
    }

    @Override // com.yandex.mobile.ads.impl.kd1
    /* renamed from: a */
    public final void mo25871a() {
        Iterator it = this.f51582b.iterator();
        while (it.hasNext()) {
            ((kd1) it.next()).mo25871a();
        }
    }
}
