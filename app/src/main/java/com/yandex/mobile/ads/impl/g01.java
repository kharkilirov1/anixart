package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class g01 {

    /* renamed from: c */
    public static final g01 f50467c = new g01(0, 0);

    /* renamed from: a */
    public final long f50468a;

    /* renamed from: b */
    public final long f50469b;

    public g01(long j2, long j3) {
        this.f50468a = j2;
        this.f50469b = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g01.class != obj.getClass()) {
            return false;
        }
        g01 g01Var = (g01) obj;
        return this.f50468a == g01Var.f50468a && this.f50469b == g01Var.f50469b;
    }

    public final int hashCode() {
        return (((int) this.f50468a) * 31) + ((int) this.f50469b);
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("[timeUs=");
        m26356a.append(this.f50468a);
        m26356a.append(", position=");
        return C0000a.m19p(m26356a, this.f50469b, "]");
    }
}
