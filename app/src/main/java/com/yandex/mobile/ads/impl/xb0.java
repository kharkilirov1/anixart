package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class xb0 {

    /* renamed from: a */
    public final Object f56449a;

    /* renamed from: b */
    public final int f56450b;

    /* renamed from: c */
    public final int f56451c;

    /* renamed from: d */
    public final long f56452d;

    /* renamed from: e */
    public final int f56453e;

    public xb0(Object obj) {
        this(obj, -1L);
    }

    /* renamed from: a */
    public final xb0 m29734a(Object obj) {
        return this.f56449a.equals(obj) ? this : new xb0(obj, this.f56450b, this.f56451c, this.f56452d, this.f56453e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj;
        return this.f56449a.equals(xb0Var.f56449a) && this.f56450b == xb0Var.f56450b && this.f56451c == xb0Var.f56451c && this.f56452d == xb0Var.f56452d && this.f56453e == xb0Var.f56453e;
    }

    public final int hashCode() {
        return ((((((((this.f56449a.hashCode() + 527) * 31) + this.f56450b) * 31) + this.f56451c) * 31) + ((int) this.f56452d)) * 31) + this.f56453e;
    }

    public xb0(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public xb0(int i2, long j2, Object obj) {
        this(obj, -1, -1, j2, i2);
    }

    /* renamed from: a */
    public final boolean m29735a() {
        return this.f56450b != -1;
    }

    public xb0(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    public xb0(xb0 xb0Var) {
        this.f56449a = xb0Var.f56449a;
        this.f56450b = xb0Var.f56450b;
        this.f56451c = xb0Var.f56451c;
        this.f56452d = xb0Var.f56452d;
        this.f56453e = xb0Var.f56453e;
    }

    private xb0(Object obj, int i2, int i3, long j2, int i4) {
        this.f56449a = obj;
        this.f56450b = i2;
        this.f56451c = i3;
        this.f56452d = j2;
        this.f56453e = i4;
    }
}
