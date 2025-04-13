package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: FunctionArgument.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/FunctionArgument;", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class FunctionArgument {

    /* renamed from: a */
    @NotNull
    public final EvaluableType f33178a;

    /* renamed from: b */
    public final boolean f33179b;

    public FunctionArgument(@NotNull EvaluableType type, boolean z) {
        Intrinsics.m32179h(type, "type");
        this.f33178a = type;
        this.f33179b = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) obj;
        return this.f33178a == functionArgument.f33178a && this.f33179b == functionArgument.f33179b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f33178a.hashCode() * 31;
        boolean z = this.f33179b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("FunctionArgument(type=");
        m24u.append(this.f33178a);
        m24u.append(", isVariadic=");
        m24u.append(this.f33179b);
        m24u.append(')');
        return m24u.toString();
    }
}
