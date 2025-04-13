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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/TrimRight;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TrimRight extends Function {

    /* renamed from: c */
    @NotNull
    public static final TrimRight f33596c = new TrimRight();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33597d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33598e;

    /* renamed from: f */
    public static final boolean f33599f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f33597d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, false));
        f33598e = evaluableType;
        f33599f = true;
    }

    public TrimRight() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        CharSequence charSequence;
        Intrinsics.m32179h(args, "args");
        String str = (String) args.get(0);
        Intrinsics.m32179h(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!CharsKt.m33864c(str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33597d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33414d() {
        return "trimRight";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33416f() {
        return f33598e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33599f;
    }
}
