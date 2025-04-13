package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/IntegerDiv;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerDiv extends Function {

    /* renamed from: c */
    @NotNull
    public static final IntegerDiv f33429c = new IntegerDiv();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33430d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33431e;

    /* renamed from: f */
    public static final boolean f33432f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f33430d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false));
        f33431e = evaluableType;
        f33432f = true;
    }

    public IntegerDiv() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        long longValue = ((Long) CollectionsKt.m32044u(args)).longValue();
        long longValue2 = ((Long) CollectionsKt.m31991D(args)).longValue();
        if (longValue2 != 0) {
            return Long.valueOf(longValue / longValue2);
        }
        EvaluableExceptionKt.m17223f("div", args, "Division by zero is not supported.", null, 8);
        throw null;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33430d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "div";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33431e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33432f;
    }
}
