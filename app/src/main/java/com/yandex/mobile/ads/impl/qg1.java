package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class qg1 {

    /* renamed from: a */
    @NotNull
    private final String f54045a;

    /* renamed from: b */
    private final int f54046b;

    public qg1(int i2, @NotNull String adUnitId) {
        Intrinsics.m32179h(adUnitId, "adUnitId");
        this.f54045a = adUnitId;
        this.f54046b = i2;
    }

    @NotNull
    /* renamed from: a */
    public final String m27720a() {
        return this.f54045a;
    }

    /* renamed from: b */
    public final int m27721b() {
        return this.f54046b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg1)) {
            return false;
        }
        qg1 qg1Var = (qg1) obj;
        return Intrinsics.m32174c(this.f54045a, qg1Var.f54045a) && this.f54046b == qg1Var.f54046b;
    }

    public final int hashCode() {
        return this.f54046b + (this.f54045a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("ViewSizeKey(adUnitId=");
        m26356a.append(this.f54045a);
        m26356a.append(", screenOrientation=");
        return C0000a.m17n(m26356a, this.f54046b, ')');
    }
}
