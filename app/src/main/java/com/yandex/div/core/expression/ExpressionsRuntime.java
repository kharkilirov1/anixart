package com.yandex.div.core.expression;

import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExpressionsRuntime.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/ExpressionsRuntime;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ExpressionsRuntime {

    /* renamed from: a */
    @NotNull
    public final ExpressionResolver f31190a;

    /* renamed from: b */
    @NotNull
    public final VariableController f31191b;

    /* renamed from: c */
    @NotNull
    public final TriggersController f31192c;

    public ExpressionsRuntime(@NotNull ExpressionResolver expressionResolver, @NotNull VariableController variableController, @NotNull TriggersController triggersController) {
        this.f31190a = expressionResolver;
        this.f31191b = variableController;
        this.f31192c = triggersController;
    }
}
