package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NumberArithmeticFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/DoubleCeil;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DoubleCeil extends Function {

    /* renamed from: c */
    @NotNull
    public static final DoubleCeil f33266c = new DoubleCeil();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33267d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33268e;

    /* renamed from: f */
    public static final boolean f33269f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f33267d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, false));
        f33268e = evaluableType;
        f33269f = true;
    }

    public DoubleCeil() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        return Double.valueOf(Math.ceil(((Double) CollectionsKt.m32044u(args)).doubleValue()));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33267d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String mo17232c() {
        return "ceil";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33248e() {
        return f33268e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33269f;
    }
}
