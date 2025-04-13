package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EvaluableException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/evaluable/EvaluableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class EvaluableException extends RuntimeException {
    public /* synthetic */ EvaluableException(String str, Exception exc, int i2) {
        this(str, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvaluableException(@NotNull String message, @Nullable Exception exc) {
        super(message, exc);
        Intrinsics.m32179h(message, "message");
    }
}
