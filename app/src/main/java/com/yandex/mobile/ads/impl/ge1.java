package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ge1 {

    /* renamed from: a */
    @NonNull
    private final sr0 f50566a;

    /* renamed from: b */
    @NonNull
    private final je1 f50567b;

    public ge1(@NonNull sr0 sr0Var, @NonNull je1 je1Var) {
        this.f50567b = je1Var;
        this.f50566a = sr0Var;
    }

    /* renamed from: a */
    public final boolean m24870a() {
        long m25878a = this.f50567b.m25878a();
        wq0 m28356b = this.f50566a.m28356b();
        return m25878a != -9223372036854775807L && (m28356b != null ? m28356b.m29531a() : -1L) + 1000 >= m25878a;
    }
}
