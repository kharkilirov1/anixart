package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TriggersController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/TriggersController;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class TriggersController {

    /* renamed from: a */
    @NotNull
    public final VariableController f31235a;

    /* renamed from: b */
    @NotNull
    public final ExpressionResolver f31236b;

    /* renamed from: c */
    @NotNull
    public final DivActionHandler f31237c;

    /* renamed from: d */
    @NotNull
    public final Evaluator f31238d;

    /* renamed from: e */
    @NotNull
    public final ErrorCollector f31239e;

    /* renamed from: f */
    @NotNull
    public final Div2Logger f31240f;

    /* renamed from: g */
    @NotNull
    public final List<TriggerExecutor> f31241g;

    public TriggersController(@Nullable List<? extends DivTrigger> list, @NotNull VariableController variableController, @NotNull ExpressionResolver expressionResolver, @NotNull DivActionHandler divActionHandler, @NotNull Evaluator evaluator, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger logger) {
        Intrinsics.m32179h(divActionHandler, "divActionHandler");
        Intrinsics.m32179h(logger, "logger");
        this.f31235a = variableController;
        this.f31236b = expressionResolver;
        this.f31237c = divActionHandler;
        this.f31238d = evaluator;
        this.f31239e = errorCollector;
        this.f31240f = logger;
        this.f31241g = new ArrayList();
        if (list == null) {
            return;
        }
        for (DivTrigger divTrigger : list) {
            String expr = divTrigger.f40596b.getF34336c().toString();
            try {
                Intrinsics.m32179h(expr, "expr");
                Evaluable.Lazy lazy = new Evaluable.Lazy(expr);
                if ((lazy.mo17216c().isEmpty() ? new RuntimeException("No variables defined!") : null) == null) {
                    this.f31241g.add(new TriggerExecutor(expr, lazy, this.f31238d, divTrigger.f40595a, divTrigger.f40597c, this.f31236b, this.f31237c, this.f31235a, this.f31239e, this.f31240f));
                } else {
                    Objects.toString(divTrigger.f40596b);
                }
            } catch (EvaluableException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m16679a() {
        Iterator<T> it = this.f31241g.iterator();
        while (it.hasNext()) {
            ((TriggerExecutor) it.next()).m16677a(null);
        }
    }

    /* renamed from: b */
    public void m16680b(@NotNull DivViewFacade divViewFacade) {
        Iterator<T> it = this.f31241g.iterator();
        while (it.hasNext()) {
            ((TriggerExecutor) it.next()).m16677a(divViewFacade);
        }
    }
}
