package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: FunctionRegistry.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/FunctionRegistry;", "Lcom/yandex/div/evaluable/FunctionProvider;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class FunctionRegistry implements FunctionProvider {

    /* renamed from: a */
    @NotNull
    public final Map<String, List<Function>> f33332a = new LinkedHashMap();

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    /* renamed from: a */
    public Function mo17237a(@NotNull String name, @NotNull List<? extends EvaluableType> list) {
        Object obj;
        Intrinsics.m32179h(name, "name");
        List<Function> list2 = this.f33332a.get(name);
        if (list2 == null) {
            throw new EvaluableException(C0000a.m15l("Unknown function name: ", name, '.'), null);
        }
        List<Function> list3 = list2;
        if (list3.size() != 1) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.m32174c(((Function) obj).m17236g(list), Function.MatchResult.C2884Ok.f33172a)) {
                    break;
                }
            }
            Function function = (Function) obj;
            if (function != null) {
                return function;
            }
            if (list.isEmpty()) {
                throw new EvaluableException(C0000a.m16m("Non empty argument list is required for function '", name, "'."), null);
            }
            StringBuilder m28y = C0000a.m28y("Function '", name, "' has no matching override for given argument types: ");
            m28y.append(EvaluableExceptionKt.m17225h(list));
            m28y.append('.');
            throw new EvaluableException(m28y.toString(), null);
        }
        Function function2 = (Function) CollectionsKt.m32044u(list3);
        Function.MatchResult m17236g = function2.m17236g(list);
        if (m17236g instanceof Function.MatchResult.C2884Ok) {
            return function2;
        }
        if (m17236g instanceof Function.MatchResult.TooFewArguments) {
            StringBuilder m28y2 = C0000a.m28y("Too few arguments passed to function '", name, "': expected ");
            Function.MatchResult.TooFewArguments tooFewArguments = (Function.MatchResult.TooFewArguments) m17236g;
            m28y2.append(tooFewArguments.f33173a);
            m28y2.append(", got ");
            throw new EvaluableException(C0000a.m17n(m28y2, tooFewArguments.f33174b, '.'), null);
        }
        if (m17236g instanceof Function.MatchResult.TooManyArguments) {
            StringBuilder m28y3 = C0000a.m28y("Too many arguments passed to function '", name, "': expected ");
            Function.MatchResult.TooManyArguments tooManyArguments = (Function.MatchResult.TooManyArguments) m17236g;
            m28y3.append(tooManyArguments.f33175a);
            m28y3.append(", got ");
            throw new EvaluableException(C0000a.m17n(m28y3, tooManyArguments.f33176b, '.'), null);
        }
        if (!(m17236g instanceof Function.MatchResult.ArgTypeMismatch)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder m28y4 = C0000a.m28y("Call of function '", name, "' has argument type mismatch: expected ");
        Function.MatchResult.ArgTypeMismatch argTypeMismatch = (Function.MatchResult.ArgTypeMismatch) m17236g;
        m28y4.append(argTypeMismatch.f33170a);
        m28y4.append(", got ");
        m28y4.append(argTypeMismatch.f33171b);
        m28y4.append('.');
        throw new EvaluableException(m28y4.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[LOOP:1: B:18:0x0048->B:41:?, LOOP_END, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17242b(@org.jetbrains.annotations.NotNull com.yandex.div.evaluable.Function r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.function.FunctionRegistry.m17242b(com.yandex.div.evaluable.Function):void");
    }
}
