package com.yandex.div.histogram.reporter;

import androidx.annotation.AnyThread;
import com.yandex.div.histogram.HistogramFilter;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HistogramReporter.kt */
@AnyThread
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/reporter/HistogramReporter;", "", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class HistogramReporter {

    /* renamed from: a */
    @NotNull
    public final HistogramReporterDelegate f33699a;

    public HistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        this.f33699a = histogramReporterDelegate;
    }

    /* renamed from: a */
    public static void m17295a(HistogramReporter histogramReporter, String str, long j2, String str2, String str3, HistogramFilter filter, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            Objects.requireNonNull(HistogramFilter.f33683D1);
            filter = HistogramFilter.Companion.f33685b;
        }
        Objects.requireNonNull(histogramReporter);
        Intrinsics.m32179h(filter, "filter");
        if (filter.mo17293a(null)) {
            histogramReporter.f33699a.mo17296a(str, j2, str3);
        }
        if (str2 == null) {
            return;
        }
        String str4 = str2 + '.' + str;
        if (filter.mo17293a(str2)) {
            histogramReporter.f33699a.mo17296a(str4, j2, str3);
        }
    }
}
