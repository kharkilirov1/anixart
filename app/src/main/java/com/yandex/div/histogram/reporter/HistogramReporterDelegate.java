package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramCallType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HistogramReporterDelegate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "", "NoOp", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface HistogramReporterDelegate {

    /* compiled from: HistogramReporterDelegate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate$NoOp;", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class NoOp implements HistogramReporterDelegate {

        /* renamed from: a */
        @NotNull
        public static final NoOp f33700a = new NoOp();

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        /* renamed from: a */
        public void mo17296a(@NotNull String histogramName, long j2, @HistogramCallType @Nullable String str) {
            Intrinsics.m32179h(histogramName, "histogramName");
        }
    }

    /* renamed from: a */
    void mo17296a(@NotNull String str, long j2, @HistogramCallType @Nullable String str2);
}
