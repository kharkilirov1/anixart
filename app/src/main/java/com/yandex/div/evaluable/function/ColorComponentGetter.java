package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorComponentGetter;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class ColorComponentGetter extends Function {

    /* renamed from: c */
    @NotNull
    public final Function1<Color, Integer> f33210c;

    /* renamed from: d */
    @NotNull
    public final List<FunctionArgument> f33211d;

    /* renamed from: e */
    @NotNull
    public final EvaluableType f33212e;

    /* renamed from: f */
    public final boolean f33213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentGetter(@NotNull Function1<? super Color, Integer> componentGetter) {
        super(null, 1);
        Intrinsics.m32179h(componentGetter, "componentGetter");
        this.f33210c = componentGetter;
        this.f33211d = CollectionsKt.m31993F(new FunctionArgument(EvaluableType.COLOR, false));
        this.f33212e = EvaluableType.NUMBER;
        this.f33213f = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        int intValue = this.f33210c.invoke((Color) CollectionsKt.m32044u(args)).intValue();
        boolean z = false;
        if (intValue >= 0 && intValue < 256) {
            z = true;
        }
        if (z) {
            return Double.valueOf(intValue / 255.0f);
        }
        throw new IllegalArgumentException("Value out of channel range 0..255");
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33211d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33212e() {
        return this.f33212e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f, reason: from getter */
    public boolean getF33213f() {
        return this.f33213f;
    }
}
