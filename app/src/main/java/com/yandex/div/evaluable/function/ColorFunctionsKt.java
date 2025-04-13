package com.yandex.div.evaluable.function;

import kotlin.Metadata;

/* compiled from: ColorFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-evaluable"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ColorFunctionsKt {
    /* renamed from: a */
    public static final int m17238a(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d * 255.0f) + 0.5f);
    }
}
