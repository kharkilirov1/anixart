package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class f21 {

    /* renamed from: a */
    private final int f50103a;

    /* renamed from: b */
    private final int f50104b;

    /* renamed from: c */
    private final int f50105c;

    /* renamed from: d */
    private final int f50106d;

    /* renamed from: e */
    private final int f50107e;

    public f21(int i2, int i3, int i4, int i5) {
        this.f50103a = i2;
        this.f50104b = i3;
        this.f50105c = i4;
        this.f50106d = i5;
        this.f50107e = i4 * i5;
    }

    /* renamed from: a */
    public final int m24294a() {
        return this.f50107e;
    }

    /* renamed from: b */
    public final int m24295b() {
        return this.f50106d;
    }

    /* renamed from: c */
    public final int m24296c() {
        return this.f50105c;
    }

    /* renamed from: d */
    public final int m24297d() {
        return this.f50103a;
    }

    /* renamed from: e */
    public final int m24298e() {
        return this.f50104b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f21)) {
            return false;
        }
        f21 f21Var = (f21) obj;
        return this.f50103a == f21Var.f50103a && this.f50104b == f21Var.f50104b && this.f50105c == f21Var.f50105c && this.f50106d == f21Var.f50106d;
    }

    public final int hashCode() {
        return this.f50106d + ((this.f50105c + ((this.f50104b + (this.f50103a * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("SmartCenter(x=");
        m26356a.append(this.f50103a);
        m26356a.append(", y=");
        m26356a.append(this.f50104b);
        m26356a.append(", width=");
        m26356a.append(this.f50105c);
        m26356a.append(", height=");
        return C0000a.m17n(m26356a, this.f50106d, ')');
    }
}
