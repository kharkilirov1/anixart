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

/* compiled from: ToInteger.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/NumberToInteger;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class NumberToInteger extends Function {

    /* renamed from: c */
    @NotNull
    public static final NumberToInteger f33476c = new NumberToInteger();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33477d = CollectionsKt.m31993F(new FunctionArgument(EvaluableType.NUMBER, false));

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33478e = EvaluableType.INTEGER;

    /* renamed from: f */
    public static final boolean f33479f = true;

    public NumberToInteger() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        double doubleValue = ((Double) CollectionsKt.m32044u(args)).doubleValue();
        if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
            return Long.valueOf((long) doubleValue);
        }
        EvaluableExceptionKt.m17223f("toInteger", args, "Unable to convert value to Integer.", null, 8);
        throw null;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33477d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "toInteger";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33478e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33479f;
    }
}
