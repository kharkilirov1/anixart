package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivHistogramsModule_ProvideHistogramReporterFactory implements Factory<HistogramReporter> {

    /* renamed from: a */
    public final Provider<HistogramReporterDelegate> f31144a;

    public DivHistogramsModule_ProvideHistogramReporterFactory(Provider<HistogramReporterDelegate> provider) {
        this.f31144a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        HistogramReporterDelegate histogramReporterDelegate = this.f31144a.get();
        Intrinsics.m32179h(histogramReporterDelegate, "histogramReporterDelegate");
        return new HistogramReporter(histogramReporterDelegate);
    }
}
