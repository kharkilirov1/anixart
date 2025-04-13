package com.yandex.div2;

import com.yandex.div2.DivInput;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivInput.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "v", "Lcom/yandex/div2/DivInput$KeyboardType;", "invoke"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivInput$writeToJSON$6 extends Lambda implements Function1<DivInput.KeyboardType, String> {
    static {
        new DivInput$writeToJSON$6();
    }

    public DivInput$writeToJSON$6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public String invoke(DivInput.KeyboardType keyboardType) {
        DivInput.KeyboardType v = keyboardType;
        Intrinsics.m32179h(v, "v");
        DivInput.KeyboardType.Converter converter = DivInput.KeyboardType.f37373c;
        return v.f37382b;
    }
}
