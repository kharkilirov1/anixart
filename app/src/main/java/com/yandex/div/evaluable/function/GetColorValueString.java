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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/GetColorValueString;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GetColorValueString extends Function {

    /* renamed from: c */
    @NotNull
    public final VariableProvider f33341c;

    /* renamed from: d */
    @NotNull
    public final String f33342d;

    /* renamed from: e */
    @NotNull
    public final List<FunctionArgument> f33343e;

    /* renamed from: f */
    @NotNull
    public final EvaluableType f33344f;

    public GetColorValueString(@NotNull VariableProvider variableProvider) {
        super(variableProvider);
        this.f33341c = variableProvider;
        this.f33342d = "getColorValue";
        EvaluableType evaluableType = EvaluableType.STRING;
        this.f33343e = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false));
        this.f33344f = EvaluableType.COLOR;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        String str = (String) args.get(0);
        int m17274b = Color.f33641b.m17274b((String) args.get(1));
        Object obj = this.f33341c.get(str);
        Color color = obj instanceof Color ? (Color) obj : null;
        return color == null ? new Color(m17274b) : color;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33343e;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c, reason: from getter */
    public String getF33342d() {
        return this.f33342d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33344f() {
        return this.f33344f;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return false;
    }
}
