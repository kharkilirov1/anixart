package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yy0 implements InterfaceC4860bd {
    @Override // com.yandex.mobile.ads.impl.InterfaceC4860bd
    /* renamed from: a */
    public final int mo22626a(@NotNull Context context, int i2) {
        Intrinsics.m32179h(context, "context");
        return MathKt.m32223c(RangesKt.m32234a(RangesKt.m32236c(100.0f, tg1.m28656b(context) * 0.15f), 50.0f));
    }
}
