package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VariableFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/GetColorValue;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GetColorValue extends Function {

    /* renamed from: c */
    @NotNull
    public final VariableProvider f33337c;

    /* renamed from: d */
    @NotNull
    public final String f33338d;

    /* renamed from: e */
    @NotNull
    public final List<FunctionArgument> f33339e;

    /* renamed from: f */
    @NotNull
    public final EvaluableType f33340f;

    public GetColorValue(@NotNull VariableProvider variableProvider) {
        super(variableProvider);
        this.f33337c = variableProvider;
        this.f33338d = "getColorValue";
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.f33339e = CollectionsKt.m31994G(new FunctionArgument(EvaluableType.STRING, false), new FunctionArgument(evaluableType, false));
        this.f33340f = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        String str = (String) args.get(0);
        int i2 = ((Color) args.get(1)).f33642a;
        Object obj = this.f33337c.get(str);
        Color color = obj instanceof Color ? (Color) obj : null;
        return color == null ? new Color(i2) : color;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33339e;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c, reason: from getter */
    public String getF33342d() {
        return this.f33338d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33344f() {
        return this.f33340f;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return false;
    }
}
