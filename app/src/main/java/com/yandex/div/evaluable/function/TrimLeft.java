package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/TrimLeft;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TrimLeft extends Function {

    /* renamed from: c */
    @NotNull
    public static final TrimLeft f33592c = new TrimLeft();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33593d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33594e;

    /* renamed from: f */
    public static final boolean f33595f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f33593d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, false));
        f33594e = evaluableType;
        f33595f = true;
    }

    public TrimLeft() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        CharSequence charSequence;
        Intrinsics.m32179h(args, "args");
        int i2 = 0;
        String str = (String) args.get(0);
        Intrinsics.m32179h(str, "<this>");
        int length = str.length();
        while (true) {
            if (i2 >= length) {
                charSequence = "";
                break;
            }
            if (!CharsKt.m33864c(str.charAt(i2))) {
                charSequence = str.subSequence(i2, str.length());
                break;
            }
            i2++;
        }
        return charSequence.toString();
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33593d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33414d() {
        return "trimLeft";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33416f() {
        return f33594e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33595f;
    }
}
