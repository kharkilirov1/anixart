package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntervalFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/GetIntervalTotalMinutes;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GetIntervalTotalMinutes extends Function {

    /* renamed from: c */
    @NotNull
    public static final GetIntervalTotalMinutes f33381c = new GetIntervalTotalMinutes();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33382d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33383e;

    /* renamed from: f */
    public static final boolean f33384f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f33382d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, false));
        f33383e = evaluableType;
        f33384f = true;
    }

    public GetIntervalTotalMinutes() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) throws EvaluableException {
        Intrinsics.m32179h(args, "args");
        long longValue = ((Long) args.get(0)).longValue();
        if (longValue >= 0) {
            return Long.valueOf((longValue / 1000) / 60);
        }
        throw new EvaluableException("Failed to evaluate [getIntervalTotalMinutes(-1)]. Expecting non-negative number of milliseconds.", null);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33382d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33414d() {
        return "getIntervalTotalMinutes";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33416f() {
        return f33383e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33384f;
    }
}
