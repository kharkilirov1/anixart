package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kk */
/* loaded from: classes3.dex */
public final class C5342kk implements InterfaceC4860bd {
    @Override // com.yandex.mobile.ads.impl.InterfaceC4860bd
    /* renamed from: a */
    public final int mo22626a(@NotNull Context context, int i2) {
        Intrinsics.m32179h(context, "context");
        float m32236c = RangesKt.m32236c(100.0f, tg1.m28656b(context) * 0.15f);
        int m32222b = i2 > 655 ? MathKt.m32222b((i2 / 728.0d) * 90.0d) : i2 > 632 ? 81 : i2 > 526 ? MathKt.m32222b((i2 / 468.0d) * 60.0d) : i2 > 432 ? 68 : MathKt.m32222b((i2 / 320.0d) * 50.0d);
        int i3 = (int) m32236c;
        if (m32222b > i3) {
            m32222b = i3;
        }
        if (m32222b < 50) {
            return 50;
        }
        return m32222b;
    }
}
