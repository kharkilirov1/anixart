package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.iz */
/* loaded from: classes3.dex */
public final class C5257iz {

    /* renamed from: a */
    @Nullable
    private final cz0 f51468a;

    public C5257iz(@Nullable cz0 cz0Var) {
        this.f51468a = cz0Var;
    }

    /* renamed from: a */
    public final long m25749a() {
        cz0 cz0Var = this.f51468a;
        Long valueOf = cz0Var != null ? Long.valueOf(cz0Var.m23603l()) : null;
        if (valueOf == null || valueOf.longValue() == 0) {
            return 10000L;
        }
        return valueOf.longValue();
    }
}
