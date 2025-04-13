package com.yandex.div.histogram;

import androidx.annotation.AnyThread;
import com.yandex.div.histogram.util.Cancelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p031j.C6523a;

/* compiled from: CpuUsageHistogramReporter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "", "NoOp", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface CpuUsageHistogramReporter {

    /* compiled from: CpuUsageHistogramReporter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/CpuUsageHistogramReporter$NoOp;", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class NoOp implements CpuUsageHistogramReporter {
        @Override // com.yandex.div.histogram.CpuUsageHistogramReporter
        @NotNull
        /* renamed from: a */
        public Cancelable mo17275a(@NotNull String str, int i2) {
            return C6523a.f63009D;
        }
    }

    @AnyThread
    @NotNull
    /* renamed from: a */
    Cancelable mo17275a(@NotNull String str, int i2);
}
