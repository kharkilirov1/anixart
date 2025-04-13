package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class u81 {

    /* renamed from: a */
    @NonNull
    private final m30 f55424a;

    /* renamed from: b */
    @NonNull
    private final e50 f55425b = e50.m24007a();

    public u81(@NonNull m30 m30Var) {
        this.f55424a = m30Var;
    }

    @NonNull
    /* renamed from: a */
    public final t81 m28913a(@NonNull Context context, @NonNull m50 m50Var, @NonNull hc1 hc1Var, @NonNull h50 h50Var, @NonNull tf1 tf1Var, @NonNull sp0 sp0Var, @NonNull tb1 tb1Var) {
        return !this.f55425b.m24012c() ? new C5591ph(context, m50Var, h50Var, tb1Var, hc1Var, tf1Var) : new C6030xk(context, this.f55424a, h50Var, m50Var, hc1Var, tf1Var, sp0Var, tb1Var);
    }
}
