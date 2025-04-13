package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/PadEndInteger;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PadEndInteger extends Function {

    /* renamed from: c */
    @NotNull
    public static final PadEndInteger f33484c = new PadEndInteger();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33485d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33486e;

    /* renamed from: f */
    public static final boolean f33487f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        EvaluableType evaluableType2 = EvaluableType.STRING;
        f33485d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType2, false));
        f33486e = evaluableType2;
        f33487f = true;
    }

    public PadEndInteger() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        return Intrinsics.m32187p(String.valueOf(((Long) args.get(0)).longValue()), StringFunctionsKt.m17243a((int) (((Long) args.get(1)).longValue() - r0.length()), (String) args.get(2)));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33485d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "padEnd";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33486e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33487f;
    }
}
