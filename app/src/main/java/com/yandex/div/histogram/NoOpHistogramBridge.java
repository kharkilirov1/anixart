package com.yandex.div.histogram;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NoOpHistogramBridge.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/NoOpHistogramBridge;", "Lcom/yandex/div/histogram/HistogramBridge;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class NoOpHistogramBridge implements HistogramBridge {
    @Override // com.yandex.div.histogram.HistogramBridge
    /* renamed from: a */
    public void mo17281a(String str, long j2, long j3, long j4, TimeUnit timeUnit, int i2) {
        m17294b(str, j2, j3, j4, timeUnit, i2);
    }

    /* renamed from: b */
    public void m17294b(@NotNull String name, long j2, long j3, long j4, @NotNull TimeUnit unit, long j5) {
        Intrinsics.m32179h(name, "name");
        Intrinsics.m32179h(unit, "unit");
    }
}
