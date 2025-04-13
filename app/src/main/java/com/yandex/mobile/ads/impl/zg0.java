package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class zg0 {

    /* renamed from: a */
    @NonNull
    private final h50 f57180a;

    /* renamed from: b */
    @NonNull
    private final C5162h4 f57181b;

    public zg0(@NonNull h50 h50Var) {
        this.f57180a = h50Var;
        this.f57181b = new C5162h4(h50Var);
    }

    /* renamed from: a */
    public final void m30186a(@NonNull ub1 ub1Var, @NonNull q40 q40Var) {
        float m27612a = q40Var.m27612a();
        boolean m27615d = q40Var.m27615d();
        xg0 m28937i = ub1Var.m28937i();
        yg0 yg0Var = new yg0(this.f57180a, this.f57181b, q40Var, m28937i);
        if (m28937i != null) {
            m28937i.setOnClickListener(yg0Var);
            m28937i.setMuted(m27615d);
        }
        this.f57181b.m25049a(m27612a, m27615d);
    }
}
