package com.yandex.div2;

import com.yandex.div2.DivAccessibility;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivAccessibility.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "v", "Lcom/yandex/div2/DivAccessibility$Type;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivAccessibility$writeToJSON$2 extends Lambda implements Function1<DivAccessibility.Type, Object> {
    static {
        new DivAccessibility$writeToJSON$2();
    }

    public DivAccessibility$writeToJSON$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(DivAccessibility.Type type) {
        DivAccessibility.Type v = type;
        Intrinsics.m32179h(v, "v");
        DivAccessibility.Type.Converter converter = DivAccessibility.Type.f34502c;
        return v.f34513b;
    }
}
