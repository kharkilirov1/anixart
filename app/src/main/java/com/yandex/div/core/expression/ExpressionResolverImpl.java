package com.yandex.div.core.expression;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.JsonFactory;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ExpressionResolverImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ExpressionResolverImpl implements ExpressionResolver {

    /* renamed from: b */
    @NotNull
    public final VariableController f31183b;

    /* renamed from: c */
    @NotNull
    public final ErrorCollector f31184c;

    /* renamed from: d */
    @NotNull
    public final Evaluator f31185d;

    /* renamed from: e */
    @NotNull
    public final Map<String, Object> f31186e = new LinkedHashMap();

    /* renamed from: f */
    @NotNull
    public final Map<String, Set<String>> f31187f = new LinkedHashMap();

    /* renamed from: g */
    @NotNull
    public final Map<String, ObserverList<Function0<Unit>>> f31188g = new LinkedHashMap();

    public ExpressionResolverImpl(@NotNull VariableController variableController, @NotNull ExpressionEvaluatorFactory expressionEvaluatorFactory, @NotNull ErrorCollector errorCollector) {
        this.f31183b = variableController;
        this.f31184c = errorCollector;
        this.f31185d = new Evaluator(new C2722a(this, 6), expressionEvaluatorFactory.f31182a);
        variableController.f31262d = new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.ExpressionResolverImpl.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Variable variable) {
                Variable v = variable;
                Intrinsics.m32179h(v, "v");
                Set<String> set = ExpressionResolverImpl.this.f31187f.get(v.getF33117b());
                if (set != null) {
                    ExpressionResolverImpl expressionResolverImpl = ExpressionResolverImpl.this;
                    for (String str : set) {
                        expressionResolverImpl.f31186e.remove(str);
                        ObserverList<Function0<Unit>> observerList = expressionResolverImpl.f31188g.get(str);
                        if (observerList != null) {
                            Iterator<Function0<Unit>> it = observerList.iterator();
                            while (it.hasNext()) {
                                it.next().invoke();
                            }
                        }
                    }
                }
                return Unit.f63088a;
            }
        };
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    /* renamed from: a */
    public <R, T> T mo16670a(@NotNull String expressionKey, @NotNull String rawExpression, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> validator, @NotNull TypeHelper<T> fieldType, @NotNull ParsingErrorLogger logger) {
        Intrinsics.m32179h(expressionKey, "expressionKey");
        Intrinsics.m32179h(rawExpression, "rawExpression");
        Intrinsics.m32179h(validator, "validator");
        Intrinsics.m32179h(fieldType, "fieldType");
        Intrinsics.m32179h(logger, "logger");
        try {
            return (T) m16674e(expressionKey, rawExpression, evaluable, function1, validator, fieldType);
        } catch (ParsingException e2) {
            if (e2.f34318b == ParsingExceptionReason.MISSING_VARIABLE) {
                throw e2;
            }
            logger.mo17368a(e2);
            ErrorCollector errorCollector = this.f31184c;
            errorCollector.f32876b.add(e2);
            errorCollector.m17114c();
            return (T) m16674e(expressionKey, rawExpression, evaluable, function1, validator, fieldType);
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    /* renamed from: b */
    public Disposable mo16671b(@NotNull String rawExpression, @NotNull List<String> list, @NotNull Function0<Unit> function0) {
        Intrinsics.m32179h(rawExpression, "rawExpression");
        for (String str : list) {
            Map<String, Set<String>> map = this.f31187f;
            Set<String> set = map.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                map.put(str, set);
            }
            set.add(rawExpression);
        }
        Map<String, ObserverList<Function0<Unit>>> map2 = this.f31188g;
        ObserverList<Function0<Unit>> observerList = map2.get(rawExpression);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map2.put(rawExpression, observerList);
        }
        observerList.m16613d(function0);
        return new C2826a(this, rawExpression, function0, 0);
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    /* renamed from: c */
    public void mo16672c(@NotNull ParsingException e2) {
        Intrinsics.m32179h(e2, "e");
        this.f31184c.m17112a(e2);
    }

    /* renamed from: d */
    public final <R> R m16673d(String str, Evaluable evaluable) {
        Object obj = this.f31186e.get(str);
        if (obj == null) {
            obj = (R) null;
        }
        if (obj == null) {
            obj = (R) this.f31185d.m17226a(evaluable);
            if (evaluable.f33121b) {
                for (String str2 : evaluable.mo17216c()) {
                    Map<String, Set<String>> map = this.f31187f;
                    Set<String> set = map.get(str2);
                    if (set == null) {
                        set = new LinkedHashSet<>();
                        map.put(str2, set);
                    }
                    set.add(str);
                }
                this.f31186e.put(str, obj);
            }
        }
        return (R) obj;
    }

    /* renamed from: e */
    public final <R, T> T m16674e(String str, String str2, Evaluable evaluable, Function1<? super R, ? extends T> function1, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper) {
        T invoke;
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        try {
            Object obj = (Object) m16673d(str2, evaluable);
            if (!typeHelper.mo17371b(obj)) {
                if (function1 == null) {
                    invoke = (T) obj;
                } else {
                    try {
                        invoke = function1.invoke(obj);
                    } catch (ClassCastException e2) {
                        throw ParsingExceptionKt.m17526k(str, str2, obj, e2);
                    } catch (Exception e3) {
                        throw new ParsingException(parsingExceptionReason, C0576a.m4117p(C0000a.m29z("Field '", str, "' with expression '", str2, "' received wrong value: '"), obj, '\''), e3, null, null, 24);
                    }
                }
                boolean z = false;
                if (invoke != null && (typeHelper.getF33854b() instanceof String) && !typeHelper.mo17371b(invoke)) {
                    z = true;
                }
                if (z) {
                    invoke = String.valueOf(invoke);
                }
                if (invoke == null) {
                    StringBuilder m24u = C0000a.m24u("Value '");
                    m24u.append(ParsingExceptionKt.m17525j(obj));
                    m24u.append("' for key '");
                    m24u.append(str);
                    m24u.append("' at path '");
                    m24u.append(str2);
                    m24u.append("' is not valid");
                    throw new ParsingException(parsingExceptionReason, m24u.toString(), null, null, null, 28);
                }
                obj = (T) invoke;
            }
            try {
                if (valueValidator.mo17302a(obj)) {
                    return (T) obj;
                }
                throw ParsingExceptionKt.m17517b(str2, obj);
            } catch (ClassCastException e4) {
                throw ParsingExceptionKt.m17526k(str, str2, obj, e4);
            }
        } catch (EvaluableException e5) {
            String str3 = e5 instanceof MissingVariableException ? ((MissingVariableException) e5).f33180b : null;
            if (str3 != null) {
                throw new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, C0576a.m4118q(C0000a.m29z("Undefined variable '", str3, "' at \"", str, "\": \""), str2, JsonFactory.DEFAULT_QUOTE_CHAR), e5, null, null, 24);
            }
            throw ParsingExceptionKt.m17524i(str, str2, e5);
        }
    }
}
