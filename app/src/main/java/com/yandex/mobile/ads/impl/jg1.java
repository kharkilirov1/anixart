package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class jg1 {

    /* renamed from: a */
    private final int f51604a;

    /* renamed from: b */
    private final int f51605b;

    public jg1(int i2, int i3) {
        this.f51604a = i2;
        this.f51605b = i3;
    }

    /* renamed from: a */
    public final int m25888a() {
        return this.f51605b;
    }

    /* renamed from: b */
    public final int m25889b() {
        return this.f51604a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg1)) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        return this.f51604a == jg1Var.f51604a && this.f51605b == jg1Var.f51605b;
    }

    public final int hashCode() {
        return this.f51605b + (this.f51604a * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("ViewSize(width=");
        m26356a.append(this.f51604a);
        m26356a.append(", height=");
        return C0000a.m17n(m26356a, this.f51605b, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jg1(@NotNull View view) {
        this(view.getWidth(), view.getHeight());
        Intrinsics.m32179h(view, "view");
    }
}
