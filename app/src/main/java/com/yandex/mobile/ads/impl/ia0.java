package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ia0 {

    /* renamed from: a */
    private final int f51244a;

    /* renamed from: b */
    @NotNull
    private final ja0 f51245b;

    public ia0(int i2, @NotNull ja0 mode) {
        Intrinsics.m32179h(mode, "mode");
        this.f51244a = i2;
        this.f51245b = mode;
    }

    @NotNull
    /* renamed from: a */
    public final ja0 m25477a() {
        return this.f51245b;
    }

    /* renamed from: b */
    public final int m25478b() {
        return this.f51244a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia0)) {
            return false;
        }
        ia0 ia0Var = (ia0) obj;
        return this.f51244a == ia0Var.f51244a && this.f51245b == ia0Var.f51245b;
    }

    public final int hashCode() {
        return this.f51245b.hashCode() + (this.f51244a * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("MeasuredSizeSpec(value=");
        m26356a.append(this.f51244a);
        m26356a.append(", mode=");
        m26356a.append(this.f51245b);
        m26356a.append(')');
        return m26356a.toString();
    }
}
