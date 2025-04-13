package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u70 {

    /* renamed from: a */
    @Nullable
    private final Integer f55418a;

    /* renamed from: b */
    @Nullable
    private final Integer f55419b;

    public u70(@Nullable Integer num, @Nullable Integer num2) {
        this.f55418a = num;
        this.f55419b = num2;
    }

    @Nullable
    /* renamed from: a */
    public final Integer m28908a() {
        return this.f55419b;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m28909b() {
        return this.f55418a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u70)) {
            return false;
        }
        u70 u70Var = (u70) obj;
        return Intrinsics.m32174c(this.f55418a, u70Var.f55418a) && Intrinsics.m32174c(this.f55419b, u70Var.f55419b);
    }

    public final int hashCode() {
        Integer num = this.f55418a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f55419b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("LayoutParamsSize(width=");
        m26356a.append(this.f55418a);
        m26356a.append(", height=");
        m26356a.append(this.f55419b);
        m26356a.append(')');
        return m26356a.toString();
    }
}
