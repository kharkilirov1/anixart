package com.yandex.div.core.expression;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.DivVariablesParserKt;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.evaluable.function.BuiltinFunctionProvider;
import com.yandex.div2.DivData;
import com.yandex.div2.DivVariable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ExpressionsRuntimeProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/ExpressionsRuntimeProvider;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class ExpressionsRuntimeProvider {

    /* renamed from: a */
    @NotNull
    public final GlobalVariableController f31193a;

    /* renamed from: b */
    @NotNull
    public final DivActionHandler f31194b;

    /* renamed from: c */
    @NotNull
    public final ErrorCollectors f31195c;

    /* renamed from: d */
    @NotNull
    public final Div2Logger f31196d;

    /* renamed from: e */
    public final Map<Object, ExpressionsRuntime> f31197e;

    @Inject
    public ExpressionsRuntimeProvider(@NotNull GlobalVariableController globalVariableController, @NotNull DivActionHandler divActionHandler, @NotNull ErrorCollectors errorCollectors, @NotNull Div2Logger logger) {
        Intrinsics.m32179h(globalVariableController, "globalVariableController");
        Intrinsics.m32179h(divActionHandler, "divActionHandler");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        Intrinsics.m32179h(logger, "logger");
        this.f31193a = globalVariableController;
        this.f31194b = divActionHandler;
        this.f31195c = errorCollectors;
        this.f31196d = logger;
        this.f31197e = Collections.synchronizedMap(new LinkedHashMap());
    }

    @NotNull
    /* renamed from: a */
    public ExpressionsRuntime m16675a(@NotNull DivDataTag tag, @NotNull DivData divData) {
        boolean z;
        Intrinsics.m32179h(tag, "tag");
        Map<Object, ExpressionsRuntime> runtimes = this.f31197e;
        Intrinsics.m32178g(runtimes, "runtimes");
        String str = tag.f30859a;
        ExpressionsRuntime expressionsRuntime = runtimes.get(str);
        if (expressionsRuntime == null) {
            ErrorCollector m17115a = this.f31195c.m17115a(tag, divData);
            final VariableController variableController = new VariableController();
            List<DivVariable> list = divData.f35457f;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        variableController.m16687b(DivVariablesParserKt.m16681a((DivVariable) it.next()));
                    } catch (VariableDeclarationException e2) {
                        m17115a.f32876b.add(e2);
                        m17115a.m17114c();
                    }
                }
            }
            variableController.m16686a(this.f31193a.f31244c);
            final int i2 = 0;
            BuiltinFunctionProvider builtinFunctionProvider = new BuiltinFunctionProvider(new VariableProvider() { // from class: com.yandex.div.core.expression.b
                @Override // com.yandex.div.evaluable.VariableProvider
                public final Object get(String name) {
                    switch (i2) {
                        case 0:
                            VariableController variableController2 = variableController;
                            Intrinsics.m32179h(variableController2, "$variableController");
                            Intrinsics.m32179h(name, "variableName");
                            Variable m16688c = variableController2.m16688c(name);
                            if (m16688c == null) {
                                return null;
                            }
                            return m16688c.m17210b();
                        default:
                            VariableController variableController3 = variableController;
                            Intrinsics.m32179h(variableController3, "$variableController");
                            Intrinsics.m32179h(name, "name");
                            Variable m16688c2 = variableController3.m16688c(name);
                            Object m17210b = m16688c2 == null ? null : m16688c2.m17210b();
                            if (m17210b != null) {
                                return m17210b;
                            }
                            throw new EvaluableException(Intrinsics.m32187p("Unknown variable ", name), null);
                    }
                }
            });
            ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl(variableController, new ExpressionEvaluatorFactory(builtinFunctionProvider), m17115a);
            final int i3 = 1;
            ExpressionsRuntime expressionsRuntime2 = new ExpressionsRuntime(expressionResolverImpl, variableController, new TriggersController(divData.f35456e, variableController, expressionResolverImpl, this.f31194b, new Evaluator(new VariableProvider() { // from class: com.yandex.div.core.expression.b
                @Override // com.yandex.div.evaluable.VariableProvider
                public final Object get(String name) {
                    switch (i3) {
                        case 0:
                            VariableController variableController2 = variableController;
                            Intrinsics.m32179h(variableController2, "$variableController");
                            Intrinsics.m32179h(name, "variableName");
                            Variable m16688c = variableController2.m16688c(name);
                            if (m16688c == null) {
                                return null;
                            }
                            return m16688c.m17210b();
                        default:
                            VariableController variableController3 = variableController;
                            Intrinsics.m32179h(variableController3, "$variableController");
                            Intrinsics.m32179h(name, "name");
                            Variable m16688c2 = variableController3.m16688c(name);
                            Object m17210b = m16688c2 == null ? null : m16688c2.m17210b();
                            if (m17210b != null) {
                                return m17210b;
                            }
                            throw new EvaluableException(Intrinsics.m32187p("Unknown variable ", name), null);
                    }
                }
            }, builtinFunctionProvider), m17115a, this.f31196d));
            runtimes.put(str, expressionsRuntime2);
            expressionsRuntime = expressionsRuntime2;
        }
        ExpressionsRuntime expressionsRuntime3 = expressionsRuntime;
        ErrorCollector m17115a2 = this.f31195c.m17115a(tag, divData);
        VariableController variableController2 = expressionsRuntime3.f31191b;
        List<DivVariable> list2 = divData.f35457f;
        if (list2 != null) {
            for (DivVariable divVariable : list2) {
                Variable m16688c = variableController2.m16688c(ExpressionsRuntimeProviderKt.m16676a(divVariable));
                if (m16688c == null) {
                    try {
                        variableController2.m16687b(DivVariablesParserKt.m16681a(divVariable));
                    } catch (VariableDeclarationException e3) {
                        m17115a2.f32876b.add(e3);
                        m17115a2.m17114c();
                    }
                } else {
                    if (divVariable instanceof DivVariable.Bool) {
                        z = m16688c instanceof Variable.BooleanVariable;
                    } else if (divVariable instanceof DivVariable.Integer) {
                        z = m16688c instanceof Variable.IntegerVariable;
                    } else if (divVariable instanceof DivVariable.Number) {
                        z = m16688c instanceof Variable.DoubleVariable;
                    } else if (divVariable instanceof DivVariable.Str) {
                        z = m16688c instanceof Variable.StringVariable;
                    } else if (divVariable instanceof DivVariable.Color) {
                        z = m16688c instanceof Variable.ColorVariable;
                    } else if (divVariable instanceof DivVariable.Url) {
                        z = m16688c instanceof Variable.UrlVariable;
                    } else {
                        if (!(divVariable instanceof DivVariable.Dict)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = m16688c instanceof Variable.DictVariable;
                    }
                    if (!z) {
                        StringBuilder m24u = C0000a.m24u("\n                           Variable inconsistency detected!\n                           at DivData: ");
                        m24u.append(ExpressionsRuntimeProviderKt.m16676a(divVariable));
                        m24u.append(" (");
                        m24u.append(divVariable);
                        m24u.append(")\n                           at VariableController: ");
                        m24u.append(variableController2.m16688c(ExpressionsRuntimeProviderKt.m16676a(divVariable)));
                        m24u.append("\n                        ");
                        m17115a2.f32876b.add(new IllegalArgumentException(StringsKt.m33916o0(m24u.toString())));
                        m17115a2.m17114c();
                    }
                }
            }
        }
        return expressionsRuntime3;
    }
}
