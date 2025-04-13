package com.yandex.div.histogram;

import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivParsingHistogramReporter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/histogram/DivParsingHistogramReporterImpl;", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "div-histogram_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {

    /* renamed from: b */
    @NotNull
    public final Function0<HistogramReporter> f33667b;

    /* renamed from: c */
    @NotNull
    public final Function0<Executor> f33668c;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingHistogramReporterImpl(@NotNull Function0<? extends HistogramReporter> function0, @NotNull Function0<? extends Executor> function02) {
        this.f33667b = function0;
        this.f33668c = function02;
    }
}
