package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.internal.Token;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/IntegerSub;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IntegerSub extends Function {

    /* renamed from: c */
    @NotNull
    public static final IntegerSub f33455c = new IntegerSub();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33456d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33457e;

    /* renamed from: f */
    public static final boolean f33458f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f33456d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, true));
        f33457e = evaluableType;
        f33458f = true;
    }

    public IntegerSub() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        Long l2 = 0L;
        int i2 = 0;
        for (Object obj : args) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            long longValue = l2.longValue();
            if (i2 != 0) {
                obj = Evaluator.f33163c.m17229b(Token.Operator.Binary.Sum.Minus.f33624a, Long.valueOf(longValue), obj);
            }
            l2 = Long.valueOf(((Long) obj).longValue());
            i2 = i3;
        }
        return l2;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33456d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "sub";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33457e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33458f;
    }
}
