package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorArgb;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ColorArgb extends Function {

    /* renamed from: c */
    @NotNull
    public static final ColorArgb f33200c = new ColorArgb();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33201d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33202e;

    /* renamed from: f */
    public static final boolean f33203f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f33201d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false));
        f33202e = EvaluableType.COLOR;
        f33203f = true;
    }

    public ColorArgb() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        try {
            return new Color(Color.f33641b.m17273a(ColorFunctionsKt.m17238a(((Double) args.get(0)).doubleValue()), ColorFunctionsKt.m17238a(((Double) args.get(1)).doubleValue()), ColorFunctionsKt.m17238a(((Double) args.get(2)).doubleValue()), ColorFunctionsKt.m17238a(((Double) args.get(3)).doubleValue())));
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.m17223f("argb", args, "Value out of range 0..1.", null, 8);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33201d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "argb";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33202e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33203f;
    }
}
