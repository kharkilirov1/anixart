package com.yandex.div.core.expression.variables;

import com.yandex.div.core.ObserverList;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.SynchronizedList;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: VariableController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/variables/VariableController;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class VariableController {

    /* renamed from: d */
    @Nullable
    public Function1<? super Variable, Unit> f31262d;

    /* renamed from: a */
    @NotNull
    public final Map<String, Variable> f31259a = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    public final List<VariableSource> f31260b = new ArrayList();

    /* renamed from: c */
    @NotNull
    public final Map<String, ObserverList<Function1<Variable, Unit>>> f31261c = new LinkedHashMap();

    /* renamed from: e */
    @NotNull
    public final Function1<Variable, Unit> f31263e = new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.variables.VariableController$notifyVariableChangedCallback$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Variable variable) {
            Variable v = variable;
            Intrinsics.m32179h(v, "v");
            VariableController.this.m16689d(v);
            return Unit.f63088a;
        }
    };

    /* renamed from: a */
    public void m16686a(@NotNull VariableSource source) {
        Intrinsics.m32179h(source, "source");
        Function1<Variable, Unit> observer = this.f31263e;
        Intrinsics.m32179h(observer, "observer");
        for (Variable variable : source.f31266a.values()) {
            Objects.requireNonNull(variable);
            variable.f33098a.m16613d(observer);
        }
        Function1<Variable, Unit> function1 = new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.variables.VariableController$addSource$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Variable variable2) {
                Variable it = variable2;
                Intrinsics.m32179h(it, "it");
                VariableController variableController = VariableController.this;
                Function1<Variable, Unit> observer2 = variableController.f31263e;
                Intrinsics.m32179h(observer2, "observer");
                it.f33098a.m16613d(observer2);
                variableController.m16689d(it);
                return Unit.f63088a;
            }
        };
        SynchronizedList<Function1<Variable, Unit>> synchronizedList = source.f31268c;
        synchronized (synchronizedList.f33902a) {
            synchronizedList.f33902a.add(function1);
        }
        this.f31260b.add(source);
    }

    /* renamed from: b */
    public void m16687b(@NotNull Variable variable) throws VariableDeclarationException {
        Variable put = this.f31259a.put(variable.getF33117b(), variable);
        if (put == null) {
            Function1<Variable, Unit> observer = this.f31263e;
            Intrinsics.m32179h(observer, "observer");
            variable.f33098a.m16613d(observer);
            m16689d(variable);
            return;
        }
        this.f31259a.put(variable.getF33117b(), put);
        StringBuilder m24u = C0000a.m24u("Variable '");
        m24u.append(variable.getF33117b());
        m24u.append("' already declared!");
        throw new VariableDeclarationException(m24u.toString(), null, 2);
    }

    @Nullable
    /* renamed from: c */
    public Variable m16688c(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        Variable variable = this.f31259a.get(name);
        if (variable != null) {
            return variable;
        }
        for (VariableSource variableSource : this.f31260b) {
            Objects.requireNonNull(variableSource);
            variableSource.f31267b.invoke(name);
            Variable variable2 = variableSource.f31266a.get(name);
            if (variable2 != null) {
                return variable2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m16689d(Variable variable) {
        Assert.m17298b();
        Function1<? super Variable, Unit> function1 = this.f31262d;
        if (function1 != null) {
            function1.invoke(variable);
        }
        ObserverList<Function1<Variable, Unit>> observerList = this.f31261c.get(variable.getF33117b());
        if (observerList == null) {
            return;
        }
        Iterator<Function1<Variable, Unit>> it = observerList.iterator();
        while (it.hasNext()) {
            it.next().invoke(variable);
        }
    }

    /* renamed from: e */
    public final void m16690e(String str, ErrorCollector errorCollector, boolean z, Function1<? super Variable, Unit> function1) {
        Variable m16688c = m16688c(str);
        if (m16688c != null) {
            if (z) {
                Assert.m17298b();
                function1.invoke(m16688c);
            }
            Map<String, ObserverList<Function1<Variable, Unit>>> map = this.f31261c;
            ObserverList<Function1<Variable, Unit>> observerList = map.get(str);
            if (observerList == null) {
                observerList = new ObserverList<>();
                map.put(str, observerList);
            }
            observerList.m16613d(function1);
            return;
        }
        if (errorCollector != null) {
            errorCollector.f32876b.add(new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, Intrinsics.m32187p("No variable could be resolved for '", str), null, null, null, 24));
            errorCollector.m17114c();
        }
        Map<String, ObserverList<Function1<Variable, Unit>>> map2 = this.f31261c;
        ObserverList<Function1<Variable, Unit>> observerList2 = map2.get(str);
        if (observerList2 == null) {
            observerList2 = new ObserverList<>();
            map2.put(str, observerList2);
        }
        observerList2.m16613d(function1);
    }
}
