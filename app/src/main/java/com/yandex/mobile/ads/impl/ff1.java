package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ff1 implements ss0 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f50252a;

    /* renamed from: b */
    @NonNull
    private final je1 f50253b;

    /* renamed from: c */
    @NonNull
    private final zq0 f50254c;

    /* renamed from: d */
    @NonNull
    private final sr0 f50255d;

    public ff1(@NonNull C4794a6 c4794a6, @NonNull yq0 yq0Var, @NonNull sr0 sr0Var) {
        this.f50252a = c4794a6;
        this.f50254c = yq0Var.m29965d();
        this.f50253b = yq0Var.m29962a();
        this.f50255d = sr0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ss0
    @NonNull
    /* renamed from: a */
    public final oq0 mo24583a() {
        C5760st m28353a = this.f50255d.m28353a();
        wq0 m28356b = this.f50255d.m28356b();
        Long valueOf = m28353a != null ? Long.valueOf(m28353a.m28357a()) : (m28356b == null || this.f50252a.m22385c() || this.f50254c.m30284c()) ? null : Long.valueOf(m28356b.m29531a());
        long longValue = valueOf != null ? valueOf.longValue() : -1L;
        long m25878a = this.f50253b.m25878a();
        return new oq0(longValue, m25878a != -9223372036854775807L ? m25878a : -1L);
    }
}
