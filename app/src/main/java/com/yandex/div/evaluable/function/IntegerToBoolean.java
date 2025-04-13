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

/* compiled from: ToBoolean.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/IntegerToBoolean;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerToBoolean extends Function {

    /* renamed from: c */
    @NotNull
    public static final IntegerToBoolean f33463c = new IntegerToBoolean();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33464d = CollectionsKt.m31993F(new FunctionArgument(EvaluableType.INTEGER, false));

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33465e = EvaluableType.BOOLEAN;

    /* renamed from: f */
    public static final boolean f33466f = true;

    public IntegerToBoolean() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        boolean z;
        Intrinsics.m32179h(args, "args");
        long longValue = ((Long) CollectionsKt.m32044u(args)).longValue();
        if (longValue == 0) {
            z = false;
        } else {
            if (longValue != 1) {
                EvaluableExceptionKt.m17223f("toBoolean", args, "Unable to convert value to Boolean.", null, 8);
                throw null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33464d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "toBoolean";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33465e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33466f;
    }
}
