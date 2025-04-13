package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class f01 {

    /* renamed from: c */
    public static final f01 f50082c;

    /* renamed from: a */
    public final long f50083a;

    /* renamed from: b */
    public final long f50084b;

    static {
        f01 f01Var = new f01(0L, 0L);
        new f01(Long.MAX_VALUE, Long.MAX_VALUE);
        new f01(Long.MAX_VALUE, 0L);
        new f01(0L, Long.MAX_VALUE);
        f50082c = f01Var;
    }

    public f01(long j2, long j3) {
        C5220ia.m25473a(j2 >= 0);
        C5220ia.m25473a(j3 >= 0);
        this.f50083a = j2;
        this.f50084b = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f01.class != obj.getClass()) {
            return false;
        }
        f01 f01Var = (f01) obj;
        return this.f50083a == f01Var.f50083a && this.f50084b == f01Var.f50084b;
    }

    public final int hashCode() {
        return (((int) this.f50083a) * 31) + ((int) this.f50084b);
    }
}
