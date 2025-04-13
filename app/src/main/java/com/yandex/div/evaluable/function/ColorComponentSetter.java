package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorComponentSetter;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class ColorComponentSetter extends Function {

    /* renamed from: c */
    @NotNull
    public final Function2<Color, Double, Color> f33214c;

    /* renamed from: d */
    @NotNull
    public final List<FunctionArgument> f33215d;

    /* renamed from: e */
    @NotNull
    public final EvaluableType f33216e;

    /* renamed from: f */
    public final boolean f33217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentSetter(@NotNull Function2<? super Color, ? super Double, Color> componentSetter) {
        super(null, 1);
        Intrinsics.m32179h(componentSetter, "componentSetter");
        this.f33214c = componentSetter;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.f33215d = CollectionsKt.m31994G(new FunctionArgument(evaluableType, false), new FunctionArgument(EvaluableType.NUMBER, false));
        this.f33216e = evaluableType;
        this.f33217f = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        int i2 = ((Color) args.get(0)).f33642a;
        double doubleValue = ((Double) args.get(1)).doubleValue();
        try {
            return new Color(this.f33214c.invoke(new Color(i2), Double.valueOf(doubleValue)).f33642a);
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.m17223f(mo17232c(), CollectionsKt.m31994G(Color.m17272a(i2), Double.valueOf(doubleValue)), "Value out of range 0..1.", null, 8);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33215d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33216e() {
        return this.f33216e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f, reason: from getter */
    public boolean getF33217f() {
        return this.f33217f;
    }
}
