package com.yandex.div.core.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStatePath.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/state/PathFormatException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PathFormatException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathFormatException(String message, Throwable th, int i2) {
        super(message, null);
        Intrinsics.m32179h(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathFormatException(@NotNull String message, @Nullable Throwable th) {
        super(message, th);
        Intrinsics.m32179h(message, "message");
    }
}
