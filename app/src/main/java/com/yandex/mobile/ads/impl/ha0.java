package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ha0 {

    /* renamed from: a */
    @NotNull
    private final ia0 f50884a;

    /* renamed from: b */
    @NotNull
    private final ia0 f50885b;

    public ha0(@NotNull ia0 width, @NotNull ia0 height) {
        Intrinsics.m32179h(width, "width");
        Intrinsics.m32179h(height, "height");
        this.f50884a = width;
        this.f50885b = height;
    }

    @NotNull
    /* renamed from: a */
    public final ia0 m25098a() {
        return this.f50885b;
    }

    @NotNull
    /* renamed from: b */
    public final ia0 m25099b() {
        return this.f50884a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return Intrinsics.m32174c(this.f50884a, ha0Var.f50884a) && Intrinsics.m32174c(this.f50885b, ha0Var.f50885b);
    }

    public final int hashCode() {
        return this.f50885b.hashCode() + (this.f50884a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("MeasuredSize(width=");
        m26356a.append(this.f50884a);
        m26356a.append(", height=");
        m26356a.append(this.f50885b);
        m26356a.append(')');
        return m26356a.toString();
    }
}
