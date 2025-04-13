package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class kg1 {

    /* renamed from: a */
    private final int f51970a;

    /* renamed from: b */
    private final int f51971b;

    public kg1(int i2, int i3) {
        this.f51970a = i2;
        this.f51971b = i3;
    }

    /* renamed from: a */
    public final int m26124a() {
        return this.f51971b;
    }

    /* renamed from: b */
    public final int m26125b() {
        return this.f51970a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg1)) {
            return false;
        }
        kg1 kg1Var = (kg1) obj;
        return this.f51970a == kg1Var.f51970a && this.f51971b == kg1Var.f51971b;
    }

    public final int hashCode() {
        return this.f51971b + (this.f51970a * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("ViewSize(width=");
        m26356a.append(this.f51970a);
        m26356a.append(", height=");
        return C0000a.m17n(m26356a, this.f51971b, ')');
    }
}
