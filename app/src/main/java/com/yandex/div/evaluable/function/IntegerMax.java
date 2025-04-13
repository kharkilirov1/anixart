package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/IntegerMax;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerMax extends Function {

    /* renamed from: c */
    @NotNull
    public static final IntegerMax f33433c = new IntegerMax();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33434d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33435e;

    /* renamed from: f */
    public static final boolean f33436f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f33434d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, true));
        f33435e = evaluableType;
        f33436f = true;
    }

    public IntegerMax() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        if (args.isEmpty()) {
            String format = String.format("Non empty argument list is required for function '%s'.", Arrays.copyOf(new Object[]{"max"}, 1));
            Intrinsics.m32178g(format, "format(this, *args)");
            EvaluableExceptionKt.m17223f("max", args, format, null, 8);
            throw null;
        }
        Long l2 = Long.MIN_VALUE;
        Iterator<T> it = args.iterator();
        while (it.hasNext()) {
            l2 = Long.valueOf(Math.max(l2.longValue(), ((Long) it.next()).longValue()));
        }
        return l2;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33434d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "max";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33435e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33436f;
    }
}
