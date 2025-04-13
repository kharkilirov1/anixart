package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class la1<T> implements id1 {

    /* renamed from: a */
    @NonNull
    private final bg1 f52322a;

    /* renamed from: b */
    @NonNull
    private final hc1<T> f52323b;

    /* renamed from: c */
    @NonNull
    private final tf1 f52324c;

    /* renamed from: d */
    @NonNull
    private final sc1<T> f52325d;

    /* renamed from: e */
    private boolean f52326e;

    public la1(@NonNull hc1<T> hc1Var, @NonNull ag1 ag1Var, @NonNull tf1 tf1Var, @NonNull sc1<T> sc1Var) {
        this.f52323b = hc1Var;
        this.f52324c = tf1Var;
        this.f52325d = sc1Var;
        this.f52322a = new bg1(ag1Var);
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        boolean m22815a = this.f52322a.m22815a();
        if (this.f52326e || !m22815a) {
            return;
        }
        this.f52326e = true;
        this.f52324c.mo25515h();
        this.f52325d.mo24930c(this.f52323b);
    }
}
