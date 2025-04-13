package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import com.yandex.div.internal.util.SynchronizedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: VariableSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/variables/VariableSource;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class VariableSource {

    /* renamed from: a */
    @NotNull
    public final Map<String, Variable> f31266a;

    /* renamed from: b */
    @NotNull
    public final Function1<String, Unit> f31267b;

    /* renamed from: c */
    @NotNull
    public final SynchronizedList<Function1<Variable, Unit>> f31268c;

    /* JADX WARN: Multi-variable type inference failed */
    public VariableSource(@NotNull Map<String, ? extends Variable> map, @NotNull Function1<? super String, Unit> function1, @NotNull SynchronizedList<Function1<Variable, Unit>> synchronizedList) {
        this.f31266a = map;
        this.f31267b = function1;
        this.f31268c = synchronizedList;
    }
}
