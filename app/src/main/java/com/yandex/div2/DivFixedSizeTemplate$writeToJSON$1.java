package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivFixedSizeTemplate.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "v", "Lcom/yandex/div2/DivSizeUnit;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivFixedSizeTemplate$writeToJSON$1 extends Lambda implements Function1<DivSizeUnit, String> {
    static {
        new DivFixedSizeTemplate$writeToJSON$1();
    }

    public DivFixedSizeTemplate$writeToJSON$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public String invoke(DivSizeUnit divSizeUnit) {
        DivSizeUnit v = divSizeUnit;
        Intrinsics.m32179h(v, "v");
        return DivSizeUnit.f38845c.m17700a(v);
    }
}
