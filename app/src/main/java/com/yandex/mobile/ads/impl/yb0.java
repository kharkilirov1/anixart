package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bc0;

/* loaded from: classes3.dex */
final class yb0 {

    /* renamed from: a */
    public final bc0.C4858b f56788a;

    /* renamed from: b */
    public final long f56789b;

    /* renamed from: c */
    public final long f56790c;

    /* renamed from: d */
    public final long f56791d;

    /* renamed from: e */
    public final long f56792e;

    /* renamed from: f */
    public final boolean f56793f;

    /* renamed from: g */
    public final boolean f56794g;

    /* renamed from: h */
    public final boolean f56795h;

    /* renamed from: i */
    public final boolean f56796i;

    public yb0(bc0.C4858b c4858b, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C5220ia.m25473a(!z4 || z2);
        C5220ia.m25473a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        C5220ia.m25473a(z5);
        this.f56788a = c4858b;
        this.f56789b = j2;
        this.f56790c = j3;
        this.f56791d = j4;
        this.f56792e = j5;
        this.f56793f = z;
        this.f56794g = z2;
        this.f56795h = z3;
        this.f56796i = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yb0.class != obj.getClass()) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        return this.f56789b == yb0Var.f56789b && this.f56790c == yb0Var.f56790c && this.f56791d == yb0Var.f56791d && this.f56792e == yb0Var.f56792e && this.f56793f == yb0Var.f56793f && this.f56794g == yb0Var.f56794g && this.f56795h == yb0Var.f56795h && this.f56796i == yb0Var.f56796i && s91.m28112a(this.f56788a, yb0Var.f56788a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f56788a.hashCode() + 527) * 31) + ((int) this.f56789b)) * 31) + ((int) this.f56790c)) * 31) + ((int) this.f56791d)) * 31) + ((int) this.f56792e)) * 31) + (this.f56793f ? 1 : 0)) * 31) + (this.f56794g ? 1 : 0)) * 31) + (this.f56795h ? 1 : 0)) * 31) + (this.f56796i ? 1 : 0);
    }
}
