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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorStringComponentSetter;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class ColorStringComponentSetter extends Function {

    /* renamed from: c */
    @NotNull
    public final ColorComponentSetter f33246c;

    /* renamed from: d */
    @NotNull
    public final List<FunctionArgument> f33247d;

    /* renamed from: e */
    @NotNull
    public final EvaluableType f33248e;

    /* renamed from: f */
    public final boolean f33249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorStringComponentSetter(@NotNull ColorComponentSetter componentSetter) {
        super(null, 1);
        Intrinsics.m32179h(componentSetter, "componentSetter");
        this.f33246c = componentSetter;
        this.f33247d = CollectionsKt.m31994G(new FunctionArgument(EvaluableType.STRING, false), new FunctionArgument(EvaluableType.NUMBER, false));
        this.f33248e = EvaluableType.COLOR;
        this.f33249f = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        try {
            return this.f33246c.m17234e(CollectionsKt.m31994G(new Color(Color.f33641b.m17274b((String) args.get(0))), args.get(1)));
        } catch (IllegalArgumentException e2) {
            EvaluableExceptionKt.m17222e(mo17232c(), args, "Unable to convert value to Color, expected format #AARRGGBB.", e2);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33247d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33248e() {
        return this.f33248e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f, reason: from getter */
    public boolean getF33249f() {
        return this.f33249f;
    }
}
