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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/IntegerMin;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerMin extends Function {

    /* renamed from: c */
    @NotNull
    public static final IntegerMin f33438c = new IntegerMin();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33439d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33440e;

    /* renamed from: f */
    public static final boolean f33441f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f33439d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, true));
        f33440e = evaluableType;
        f33441f = true;
    }

    public IntegerMin() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        if (args.isEmpty()) {
            String format = String.format("Non empty argument list is required for function '%s'.", Arrays.copyOf(new Object[]{"min"}, 1));
            Intrinsics.m32178g(format, "format(this, *args)");
            EvaluableExceptionKt.m17223f("min", args, format, null, 8);
            throw null;
        }
        Long l2 = Long.MAX_VALUE;
        Iterator<T> it = args.iterator();
        while (it.hasNext()) {
            l2 = Long.valueOf(Math.min(l2.longValue(), ((Long) it.next()).longValue()));
        }
        return l2;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33439d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "min";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33440e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33441f;
    }
}
