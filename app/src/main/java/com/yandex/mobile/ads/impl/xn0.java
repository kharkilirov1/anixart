package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xn0 {

    /* renamed from: a */
    @NotNull
    private final ao0 f56508a;

    /* renamed from: b */
    @NotNull
    private final Object f56509b;

    /* renamed from: c */
    @NotNull
    private final ArrayList f56510c;

    public xn0(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f56508a = ao0.f48621g.m22576a(context);
        this.f56509b = new Object();
        this.f56510c = new ArrayList();
    }

    /* renamed from: a */
    public final void m29777a(@NotNull vn0 listener) {
        Intrinsics.m32179h(listener, "listener");
        synchronized (this.f56509b) {
            this.f56510c.add(listener);
            this.f56508a.m22575b(listener);
        }
    }

    /* renamed from: a */
    public final void m29776a() {
        List m32027j0;
        synchronized (this.f56509b) {
            m32027j0 = CollectionsKt.m32027j0(this.f56510c);
            this.f56510c.clear();
        }
        Iterator it = m32027j0.iterator();
        while (it.hasNext()) {
            this.f56508a.m22574a((vn0) it.next());
        }
    }
}
