package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fy0 extends RuntimeException {

    /* renamed from: a */
    @NotNull
    private final IOException f50459a;

    /* renamed from: b */
    @NotNull
    private IOException f50460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy0(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.m32179h(firstConnectException, "firstConnectException");
        this.f50459a = firstConnectException;
        this.f50460b = firstConnectException;
    }

    @NotNull
    /* renamed from: a */
    public final IOException m24755a() {
        return this.f50459a;
    }

    @NotNull
    /* renamed from: b */
    public final IOException m24757b() {
        return this.f50460b;
    }

    /* renamed from: a */
    public final void m24756a(@NotNull IOException e2) {
        Intrinsics.m32179h(e2, "e");
        ExceptionsKt.m31878a(this.f50459a, e2);
        this.f50460b = e2;
    }
}
