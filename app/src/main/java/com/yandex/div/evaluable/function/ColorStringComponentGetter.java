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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorStringComponentGetter;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class ColorStringComponentGetter extends Function {

    /* renamed from: c */
    @NotNull
    public final ColorComponentGetter f33242c;

    /* renamed from: d */
    @NotNull
    public final List<FunctionArgument> f33243d;

    /* renamed from: e */
    @NotNull
    public final EvaluableType f33244e;

    /* renamed from: f */
    public final boolean f33245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorStringComponentGetter(@NotNull ColorComponentGetter componentGetter) {
        super(null, 1);
        Intrinsics.m32179h(componentGetter, "componentGetter");
        this.f33242c = componentGetter;
        this.f33243d = CollectionsKt.m31993F(new FunctionArgument(EvaluableType.STRING, false));
        this.f33244e = EvaluableType.NUMBER;
        this.f33245f = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        try {
            return this.f33242c.m17234e(CollectionsKt.m31993F(new Color(Color.f33641b.m17274b((String) CollectionsKt.m32044u(args)))));
        } catch (IllegalArgumentException e2) {
            EvaluableExceptionKt.m17222e(mo17232c(), args, "Unable to convert value to Color, expected format #AARRGGBB.", e2);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33243d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33244e() {
        return this.f33244e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f, reason: from getter */
    public boolean getF33245f() {
        return this.f33245f;
    }
}
