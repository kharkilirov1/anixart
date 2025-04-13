package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d60 extends RuntimeException {

    /* renamed from: a */
    @NotNull
    private final String f49579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(@NotNull String message) {
        super(message);
        Intrinsics.m32179h(message, "message");
        this.f49579a = message;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f49579a;
    }
}
