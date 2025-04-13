package com.yandex.mobile.ads.impl;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final /* synthetic */ class bo0 implements vn0, FunctionAdapter {

    /* renamed from: a */
    public final /* synthetic */ ao0 f48950a;

    public bo0(ao0 ao0Var) {
        this.f48950a = ao0Var;
    }

    @Override // com.yandex.mobile.ads.impl.vn0
    /* renamed from: a */
    public final void mo22903a() {
        ao0.m22569a(this.f48950a);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof vn0) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.m32174c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.f48950a, ao0.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
