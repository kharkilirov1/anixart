package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EvaluableException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/MissingVariableException;", "Lcom/yandex/div/evaluable/EvaluableException;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class MissingVariableException extends EvaluableException {

    /* renamed from: b */
    @NotNull
    public final String f33180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingVariableException(String variableName, Exception exc, int i2) {
        super("Variable '" + variableName + "' is missing", null);
        Intrinsics.m32179h(variableName, "variableName");
        this.f33180b = variableName;
    }
}
