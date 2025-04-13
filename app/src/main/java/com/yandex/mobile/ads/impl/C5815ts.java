package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ts */
/* loaded from: classes3.dex */
public final class C5815ts {

    /* renamed from: b */
    @NonNull
    private static final Object f55193b = new Object();

    /* renamed from: c */
    private static volatile C5815ts f55194c;

    /* renamed from: a */
    @NonNull
    private final C5759ss f55195a = new C5759ss(bf1.m22813a());

    private C5815ts() {
    }

    @NonNull
    /* renamed from: a */
    public static C5815ts m28734a() {
        if (f55194c == null) {
            synchronized (f55193b) {
                if (f55194c == null) {
                    f55194c = new C5815ts();
                }
            }
        }
        return f55194c;
    }

    @Nullable
    /* renamed from: a */
    public final C5987ws m28735a(@NonNull hc1 hc1Var) {
        return this.f55195a.get(hc1Var);
    }

    /* renamed from: a */
    public final void m28736a(@NonNull hc1 hc1Var, @NonNull C5987ws c5987ws) {
        this.f55195a.put(hc1Var, c5987ws);
    }
}
