package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateTimeFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/GetDayOfWeek;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GetDayOfWeek extends Function {

    /* renamed from: c */
    @NotNull
    public static final GetDayOfWeek f33349c = new GetDayOfWeek();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33350d = CollectionsKt.m31993F(new FunctionArgument(EvaluableType.DATETIME, false));

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33351e = EvaluableType.INTEGER;

    /* renamed from: f */
    public static final boolean f33352f = true;

    public GetDayOfWeek() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) throws EvaluableException {
        Intrinsics.m32179h(args, "args");
        int i2 = DateTimeFunctionsKt.m17240b((DateTime) args.get(0)).get(7) - 1;
        return Long.valueOf(i2 == 0 ? 7L : i2);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33350d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "getDayOfWeek";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33351e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33352f;
    }
}
