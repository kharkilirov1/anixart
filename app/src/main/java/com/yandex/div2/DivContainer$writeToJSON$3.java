package com.yandex.div2;

import com.yandex.div2.DivContentAlignmentHorizontal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivContainer.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "v", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivContainer$writeToJSON$3 extends Lambda implements Function1<DivContentAlignmentHorizontal, String> {
    static {
        new DivContainer$writeToJSON$3();
    }

    public DivContainer$writeToJSON$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public String invoke(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
        DivContentAlignmentHorizontal v = divContentAlignmentHorizontal;
        Intrinsics.m32179h(v, "v");
        DivContentAlignmentHorizontal.Converter converter = DivContentAlignmentHorizontal.f35193c;
        return v.f35202b;
    }
}
