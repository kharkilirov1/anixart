package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class m11 {

    /* renamed from: a */
    private final int f52560a;

    /* renamed from: b */
    private final int f52561b;

    public m11(int i2, int i3) {
        this.f52560a = i2;
        this.f52561b = i3;
    }

    /* renamed from: a */
    public final int m26556a() {
        return this.f52561b;
    }

    /* renamed from: b */
    public final int m26557b() {
        return this.f52560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m11.class != obj.getClass()) {
            return false;
        }
        m11 m11Var = (m11) obj;
        return this.f52560a == m11Var.f52560a && this.f52561b == m11Var.f52561b;
    }

    public final int hashCode() {
        return (this.f52560a * 31) + this.f52561b;
    }
}
