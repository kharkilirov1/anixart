package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EvaluableException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/IntegerOverflow;", "Lcom/yandex/div/evaluable/EvaluableException;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerOverflow extends EvaluableException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerOverflow(String expression, Exception exc, int i2) {
        super("Failed to evaluate [" + expression + "]. Integer overflow.", null);
        Intrinsics.m32179h(expression, "expression");
    }
}
