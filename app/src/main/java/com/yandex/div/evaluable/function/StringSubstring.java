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

/* compiled from: StringFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/StringSubstring;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StringSubstring extends Function {

    /* renamed from: c */
    @NotNull
    public static final StringSubstring f33564c = new StringSubstring();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33565d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33566e;

    /* renamed from: f */
    public static final boolean f33567f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        EvaluableType evaluableType2 = EvaluableType.INTEGER;
        f33565d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType2, false), new FunctionArgument(evaluableType2, false));
        f33566e = evaluableType;
        f33567f = true;
    }

    public StringSubstring() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        String str = (String) args.get(0);
        long longValue = ((Long) args.get(1)).longValue();
        long longValue2 = ((Long) args.get(2)).longValue();
        if (longValue < 0 || longValue2 > str.length()) {
            EvaluableExceptionKt.m17223f("substring", args, "Indexes are out of bounds.", null, 8);
            throw null;
        }
        if (longValue > longValue2) {
            EvaluableExceptionKt.m17223f("substring", args, "Indexes should be in ascending order.", null, 8);
            throw null;
        }
        String substring = str.substring((int) longValue, (int) longValue2);
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33565d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "substring";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33566e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33567f;
    }
}
