package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.VariableProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VariableFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/GetStringValue;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GetStringValue extends Function {

    /* renamed from: c */
    @NotNull
    public final VariableProvider f33413c;

    /* renamed from: d */
    @NotNull
    public final String f33414d;

    /* renamed from: e */
    @NotNull
    public final List<FunctionArgument> f33415e;

    /* renamed from: f */
    @NotNull
    public final EvaluableType f33416f;

    public GetStringValue(@NotNull VariableProvider variableProvider) {
        super(variableProvider);
        this.f33413c = variableProvider;
        this.f33414d = "getStringValue";
        EvaluableType evaluableType = EvaluableType.STRING;
        this.f33415e = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false));
        this.f33416f = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        String str = (String) args.get(0);
        String str2 = (String) args.get(1);
        Object obj = this.f33413c.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33415e;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c, reason: from getter */
    public String getF33414d() {
        return this.f33414d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33416f() {
        return this.f33416f;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return false;
    }
}
