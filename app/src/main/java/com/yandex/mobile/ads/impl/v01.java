package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class v01 {

    /* renamed from: a */
    private long f55719a;

    /* renamed from: b */
    private String f55720b;

    /* renamed from: c */
    private int f55721c;

    /* renamed from: a */
    public final void m29160a(long j2) {
        this.f55719a = j2;
    }

    /* renamed from: b */
    public final String m29162b() {
        return this.f55720b;
    }

    /* renamed from: c */
    public final int m29163c() {
        return this.f55721c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v01.class != obj.getClass()) {
            return false;
        }
        v01 v01Var = (v01) obj;
        if (this.f55719a != v01Var.f55719a || this.f55721c != v01Var.f55721c) {
            return false;
        }
        String str = this.f55720b;
        String str2 = v01Var.f55720b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        long j2 = this.f55719a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f55720b;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f55721c;
    }

    /* renamed from: a */
    public final void m29161a(String str) {
        this.f55720b = str;
    }

    /* renamed from: a */
    public final void m29159a(int i2) {
        this.f55721c = i2;
    }

    /* renamed from: a */
    public final long m29158a() {
        return this.f55719a;
    }
}
