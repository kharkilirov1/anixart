package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.C2826a;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTrigger;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: TriggersController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/TriggerExecutor;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class TriggerExecutor {

    /* renamed from: a */
    @NotNull
    public final String f31216a;

    /* renamed from: b */
    @NotNull
    public final Evaluable f31217b;

    /* renamed from: c */
    @NotNull
    public final Evaluator f31218c;

    /* renamed from: d */
    @NotNull
    public final List<DivAction> f31219d;

    /* renamed from: e */
    @NotNull
    public final Expression<DivTrigger.Mode> f31220e;

    /* renamed from: f */
    @NotNull
    public final ExpressionResolver f31221f;

    /* renamed from: g */
    @NotNull
    public final DivActionHandler f31222g;

    /* renamed from: h */
    @NotNull
    public final VariableController f31223h;

    /* renamed from: i */
    @NotNull
    public final ErrorCollector f31224i;

    /* renamed from: j */
    @NotNull
    public final Div2Logger f31225j;

    /* renamed from: k */
    @NotNull
    public final Function1<Variable, Unit> f31226k;

    /* renamed from: l */
    @NotNull
    public Disposable f31227l;

    /* renamed from: m */
    @NotNull
    public DivTrigger.Mode f31228m;

    /* renamed from: n */
    public boolean f31229n;

    /* renamed from: o */
    @NotNull
    public Disposable f31230o;

    /* renamed from: p */
    @Nullable
    public DivViewFacade f31231p;

    /* JADX WARN: Multi-variable type inference failed */
    public TriggerExecutor(@NotNull String str, @NotNull Evaluable evaluable, @NotNull Evaluator evaluator, @NotNull List<? extends DivAction> actions, @NotNull Expression<DivTrigger.Mode> mode, @NotNull ExpressionResolver resolver, @NotNull DivActionHandler divActionHandler, @NotNull VariableController variableController, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger logger) {
        Intrinsics.m32179h(evaluator, "evaluator");
        Intrinsics.m32179h(actions, "actions");
        Intrinsics.m32179h(mode, "mode");
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(divActionHandler, "divActionHandler");
        Intrinsics.m32179h(variableController, "variableController");
        Intrinsics.m32179h(errorCollector, "errorCollector");
        Intrinsics.m32179h(logger, "logger");
        this.f31216a = str;
        this.f31217b = evaluable;
        this.f31218c = evaluator;
        this.f31219d = actions;
        this.f31220e = mode;
        this.f31221f = resolver;
        this.f31222g = divActionHandler;
        this.f31223h = variableController;
        this.f31224i = errorCollector;
        this.f31225j = logger;
        this.f31226k = new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$changeTrigger$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Variable variable) {
                Variable noName_0 = variable;
                Intrinsics.m32179h(noName_0, "$noName_0");
                TriggerExecutor.this.m16678b();
                return Unit.f63088a;
            }
        };
        this.f31227l = mode.mo17538f(resolver, new Function1<DivTrigger.Mode, Unit>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$modeObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivTrigger.Mode mode2) {
                DivTrigger.Mode it = mode2;
                Intrinsics.m32179h(it, "it");
                TriggerExecutor.this.f31228m = it;
                return Unit.f63088a;
            }
        });
        this.f31228m = DivTrigger.Mode.ON_CONDITION;
        this.f31230o = C2814a.f31000b;
    }

    /* renamed from: a */
    public final void m16677a(@Nullable DivViewFacade divViewFacade) {
        this.f31231p = divViewFacade;
        if (divViewFacade == null) {
            this.f31227l.close();
            this.f31230o.close();
            return;
        }
        this.f31227l.close();
        VariableController variableController = this.f31223h;
        List<String> names = this.f31217b.mo17216c();
        Function1<Variable, Unit> observer = this.f31226k;
        Objects.requireNonNull(variableController);
        Intrinsics.m32179h(names, "names");
        Intrinsics.m32179h(observer, "observer");
        Iterator<T> it = names.iterator();
        while (it.hasNext()) {
            variableController.m16690e((String) it.next(), null, false, observer);
        }
        this.f31230o = new C2826a(names, variableController, observer, 2);
        this.f31227l = this.f31220e.mo17538f(this.f31221f, new Function1<DivTrigger.Mode, Unit>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$startObserving$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivTrigger.Mode mode) {
                DivTrigger.Mode it2 = mode;
                Intrinsics.m32179h(it2, "it");
                TriggerExecutor.this.f31228m = it2;
                return Unit.f63088a;
            }
        });
        m16678b();
    }

    /* renamed from: b */
    public final void m16678b() {
        Assert.m17298b();
        DivViewFacade divViewFacade = this.f31231p;
        if (divViewFacade == null) {
            return;
        }
        boolean z = false;
        try {
            boolean booleanValue = ((Boolean) this.f31218c.m17226a(this.f31217b)).booleanValue();
            boolean z2 = this.f31229n;
            this.f31229n = booleanValue;
            if (booleanValue && (this.f31228m != DivTrigger.Mode.ON_CONDITION || !z2 || !booleanValue)) {
                z = true;
            }
        } catch (EvaluableException e2) {
            this.f31224i.m17112a(new RuntimeException(C0000a.m20q(C0000a.m24u("Condition evaluation failed: '"), this.f31216a, "'!"), e2));
        }
        if (z) {
            for (DivAction divAction : this.f31219d) {
                this.f31225j.mo16570e((Div2View) divViewFacade, divAction);
                this.f31222g.handleAction(divAction, divViewFacade);
            }
        }
    }
}
