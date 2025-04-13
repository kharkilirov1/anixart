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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/PadStartString;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PadStartString extends Function {

    /* renamed from: c */
    @NotNull
    public static final PadStartString f33496c = new PadStartString();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33497d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33498e;

    /* renamed from: f */
    public static final boolean f33499f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f33497d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(EvaluableType.INTEGER, false), new FunctionArgument(evaluableType, false));
        f33498e = evaluableType;
        f33499f = true;
    }

    public PadStartString() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        return Intrinsics.m32187p(StringFunctionsKt.m17243a((int) (((Long) args.get(1)).longValue() - r0.length()), (String) args.get(2)), (String) args.get(0));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33497d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "padStart";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33498e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33499f;
    }
}
