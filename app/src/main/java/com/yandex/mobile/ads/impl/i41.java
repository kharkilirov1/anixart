package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i41 extends IOException {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final EnumC5708rr f51214a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(@NotNull EnumC5708rr errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.m32179h(errorCode, "errorCode");
        this.f51214a = errorCode;
    }
}
