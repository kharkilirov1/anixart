package com.yandex.div2;

import com.yandex.div2.DivRadialGradientRelativeRadius;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivRadialGradientRelativeRadius.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "v", "Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivRadialGradientRelativeRadius$writeToJSON$1 extends Lambda implements Function1<DivRadialGradientRelativeRadius.Value, String> {
    static {
        new DivRadialGradientRelativeRadius$writeToJSON$1();
    }

    public DivRadialGradientRelativeRadius$writeToJSON$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public String invoke(DivRadialGradientRelativeRadius.Value value) {
        DivRadialGradientRelativeRadius.Value v = value;
        Intrinsics.m32179h(v, "v");
        DivRadialGradientRelativeRadius.Value.Converter converter = DivRadialGradientRelativeRadius.Value.f38139c;
        return v.f38146b;
    }
}
