package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/IntegerCopySign;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerCopySign extends Function {

    /* renamed from: c */
    @NotNull
    public static final IntegerCopySign f33425c = new IntegerCopySign();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33426d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33427e;

    /* renamed from: f */
    public static final boolean f33428f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f33426d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false));
        f33427e = evaluableType;
        f33428f = true;
    }

    public IntegerCopySign() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        long longValue = ((Long) CollectionsKt.m32044u(args)).longValue();
        int m32221a = MathKt.m32221a(((Long) CollectionsKt.m31991D(args)).longValue());
        if (m32221a == 0) {
            return Long.valueOf(longValue);
        }
        if (longValue != Long.MIN_VALUE) {
            return Long.valueOf(Math.abs(longValue) * m32221a);
        }
        if (m32221a == -1) {
            return Long.valueOf(longValue);
        }
        EvaluableExceptionKt.m17223f("copySign", args, "Integer overflow.", null, 8);
        throw null;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33426d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "copySign";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33427e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33428f;
    }
}
