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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/StringToBoolean;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StringToBoolean extends Function {

    /* renamed from: c */
    @NotNull
    public static final StringToBoolean f33568c = new StringToBoolean();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33569d = CollectionsKt.m31993F(new FunctionArgument(EvaluableType.STRING, false));

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33570e = EvaluableType.BOOLEAN;

    /* renamed from: f */
    public static final boolean f33571f = true;

    public StringToBoolean() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        boolean z;
        Intrinsics.m32179h(args, "args");
        String str = (String) CollectionsKt.m32044u(args);
        if (Intrinsics.m32174c(str, "true")) {
            z = true;
        } else {
            if (!Intrinsics.m32174c(str, "false")) {
                EvaluableExceptionKt.m17223f("toBoolean", args, "Unable to convert value to Boolean.", null, 8);
                throw null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33569d;
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
        return f33570e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33571f;
    }
}
