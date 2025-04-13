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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ToLowerCase;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ToLowerCase extends Function {

    /* renamed from: c */
    @NotNull
    public static final ToLowerCase f33580c = new ToLowerCase();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33581d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33582e;

    /* renamed from: f */
    public static final boolean f33583f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f33581d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, false));
        f33582e = evaluableType;
        f33583f = true;
    }

    public ToLowerCase() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        String lowerCase = ((String) args.get(0)).toLowerCase();
        Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33581d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33414d() {
        return "toLowerCase";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33416f() {
        return f33582e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33583f;
    }
}
