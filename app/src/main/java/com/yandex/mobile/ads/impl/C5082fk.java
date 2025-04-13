package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fk */
/* loaded from: classes3.dex */
public final class C5082fk {

    /* renamed from: a */
    @NotNull
    private final ou0 f50279a;

    public C5082fk(@NotNull ou0 delegate) {
        Intrinsics.m32179h(delegate, "delegate");
        this.f50279a = delegate;
    }

    @NotNull
    /* renamed from: a */
    public final ou0 m24611a() {
        return this.f50279a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5082fk(@NotNull TimeUnit timeUnit) {
        this(new ou0(r51.f54199h, timeUnit));
        Intrinsics.m32179h(timeUnit, "timeUnit");
    }

    public C5082fk() {
        this(TimeUnit.MINUTES);
    }
}
