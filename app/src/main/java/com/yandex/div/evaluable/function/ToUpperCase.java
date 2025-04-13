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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ToUpperCase;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ToUpperCase extends Function {

    /* renamed from: c */
    @NotNull
    public static final ToUpperCase f33584c = new ToUpperCase();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33585d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33586e;

    /* renamed from: f */
    public static final boolean f33587f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f33585d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, false));
        f33586e = evaluableType;
        f33587f = true;
    }

    public ToUpperCase() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        String upperCase = ((String) args.get(0)).toUpperCase();
        Intrinsics.m32178g(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33585d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33414d() {
        return "toUpperCase";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33416f() {
        return f33586e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33587f;
    }
}
