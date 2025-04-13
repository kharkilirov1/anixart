package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NumberArithmeticFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/DoubleMul;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DoubleMul extends Function {

    /* renamed from: c */
    @NotNull
    public static final DoubleMul f33296c = new DoubleMul();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33297d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33298e;

    /* renamed from: f */
    public static final boolean f33299f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f33297d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, true));
        f33298e = evaluableType;
        f33299f = true;
    }

    public DoubleMul() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        Double valueOf = Double.valueOf(0.0d);
        int i2 = 0;
        for (Object obj : args) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            double doubleValue = valueOf.doubleValue();
            if (i2 != 0) {
                obj = Evaluator.f33163c.m17228a(Token.Operator.Binary.Factor.Multiplication.f33620a, Double.valueOf(doubleValue), obj);
            }
            valueOf = Double.valueOf(((Double) obj).doubleValue());
            i2 = i3;
        }
        return valueOf;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33297d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "mul";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33298e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33299f;
    }
}
