package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/IntegerSum;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerSum extends Function {

    /* renamed from: c */
    @NotNull
    public static final IntegerSum f33459c = new IntegerSum();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33460d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33461e;

    /* renamed from: f */
    public static final boolean f33462f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f33460d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, true));
        f33461e = evaluableType;
        f33462f = true;
    }

    public IntegerSum() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        Long l2 = 0L;
        Iterator<T> it = args.iterator();
        while (it.hasNext()) {
            l2 = Long.valueOf(((Long) Evaluator.f33163c.m17229b(Token.Operator.Binary.Sum.Plus.f33625a, Long.valueOf(l2.longValue()), it.next())).longValue());
        }
        return l2;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33460d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "sum";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33461e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33462f;
    }
}
