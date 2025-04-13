package com.yandex.mobile.ads.impl;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final /* synthetic */ class hb1 implements db1, FunctionAdapter {

    /* renamed from: a */
    public final /* synthetic */ ib1 f50896a;

    public hb1(ib1 ib1Var) {
        this.f50896a = ib1Var;
    }

    @Override // com.yandex.mobile.ads.impl.db1
    /* renamed from: a */
    public final void mo23863a(@NotNull cb1 p0) {
        Intrinsics.m32179h(p0, "p0");
        ib1.m25501a(this.f50896a, p0);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof db1) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.m32174c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.f50896a, ib1.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/verification/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
