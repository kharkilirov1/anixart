package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorRgb;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ColorRgb extends Function {

    /* renamed from: c */
    @NotNull
    public static final ColorRgb f33230c = new ColorRgb();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33231d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33232e;

    /* renamed from: f */
    public static final boolean f33233f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f33231d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false), new FunctionArgument(evaluableType, false));
        f33232e = EvaluableType.COLOR;
        f33233f = true;
    }

    public ColorRgb() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        try {
            return new Color(Color.f33641b.m17273a(KotlinVersion.MAX_COMPONENT_VALUE, ColorFunctionsKt.m17238a(((Double) args.get(0)).doubleValue()), ColorFunctionsKt.m17238a(((Double) args.get(1)).doubleValue()), ColorFunctionsKt.m17238a(((Double) args.get(2)).doubleValue())));
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.m17223f("rgb", args, "Value out of range 0..1.", null, 8);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33231d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "rgb";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33232e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33233f;
    }
}
