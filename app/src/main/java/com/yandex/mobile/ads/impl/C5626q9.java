package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.q9 */
/* loaded from: classes3.dex */
public final class C5626q9 {

    /* renamed from: a */
    @NotNull
    private final Object f53981a = new Object();

    /* renamed from: b */
    @NotNull
    private final ArrayList f53982b = new ArrayList();

    /* renamed from: a */
    public final void m27660a(@NotNull k10 observer) {
        Intrinsics.m32179h(observer, "observer");
        synchronized (this.f53981a) {
            this.f53982b.add(observer);
        }
    }

    /* renamed from: a */
    public final void m27659a() {
        synchronized (this.f53981a) {
            this.f53982b.clear();
        }
    }

    /* renamed from: a */
    public final void m27661a(@NotNull C5571p9 appMetricaIdentifiers) {
        ArrayList arrayList;
        Intrinsics.m32179h(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (this.f53981a) {
            arrayList = new ArrayList(this.f53982b);
            this.f53982b.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k10) it.next()).m26008a(appMetricaIdentifiers);
        }
    }
}
