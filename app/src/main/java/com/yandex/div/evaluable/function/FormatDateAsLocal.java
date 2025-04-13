package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateTimeFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/FormatDateAsLocal;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class FormatDateAsLocal extends Function {

    /* renamed from: c */
    @NotNull
    public static final FormatDateAsLocal f33316c = new FormatDateAsLocal();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33317d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33318e;

    /* renamed from: f */
    public static final boolean f33319f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f33317d = CollectionsKt.m31994G(new FunctionArgument(EvaluableType.DATETIME, false), new FunctionArgument(evaluableType, false));
        f33318e = evaluableType;
        f33319f = true;
    }

    public FormatDateAsLocal() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        DateTime dateTime = (DateTime) args.get(0);
        String str = (String) args.get(1);
        DateTimeFunctionsKt.m17239a(str);
        Date m17241c = DateTimeFunctionsKt.m17241c(dateTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String format = simpleDateFormat.format(m17241c);
        Intrinsics.m32178g(format, "sdf.format(date)");
        return format;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33317d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "formatDateAsLocal";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33318e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33319f;
    }
}
