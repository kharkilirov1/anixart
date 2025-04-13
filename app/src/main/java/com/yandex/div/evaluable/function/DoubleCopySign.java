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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/DoubleCopySign;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DoubleCopySign extends Function {

    /* renamed from: c */
    @NotNull
    public static final DoubleCopySign f33270c = new DoubleCopySign();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33271d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33272e;

    /* renamed from: f */
    public static final boolean f33273f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f33271d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false));
        f33272e = evaluableType;
        f33273f = true;
    }

    public DoubleCopySign() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        return Double.valueOf(Math.copySign(((Double) CollectionsKt.m32044u(args)).doubleValue(), ((Double) CollectionsKt.m31991D(args)).doubleValue()));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33271d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String mo17232c() {
        return "copySign";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33248e() {
        return f33272e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33273f;
    }
}
