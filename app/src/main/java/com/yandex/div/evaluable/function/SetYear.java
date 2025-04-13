package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateTimeFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/SetYear;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SetYear extends Function {

    /* renamed from: c */
    @NotNull
    public static final SetYear f33532c = new SetYear();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33533d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33534e;

    /* renamed from: f */
    public static final boolean f33535f;

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        f33533d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(EvaluableType.INTEGER, false));
        f33534e = evaluableType;
        f33535f = true;
    }

    public SetYear() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        DateTime dateTime = (DateTime) args.get(0);
        long longValue = ((Long) args.get(1)).longValue();
        Calendar m17240b = DateTimeFunctionsKt.m17240b(dateTime);
        m17240b.set(1, (int) longValue);
        return new DateTime(m17240b.getTimeInMillis(), dateTime.f33645c);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33533d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "setYear";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33534e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33535f;
    }
}
