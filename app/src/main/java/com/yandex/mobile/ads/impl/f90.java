package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f90 {

    /* renamed from: a */
    @NotNull
    private final g90 f50183a = new g90();

    /* renamed from: b */
    @NotNull
    private final c61 f50184b = new c61();

    /* renamed from: a */
    public final void m24373a(@NotNull Runnable runnable) {
        Intrinsics.m32179h(runnable, "runnable");
        Objects.requireNonNull(this.f50184b);
        if (c61.m23031a()) {
            runnable.run();
        } else {
            this.f50183a.m24830a(runnable);
        }
    }

    /* renamed from: a */
    public final void m24372a() {
        this.f50183a.m24828a();
    }
}
