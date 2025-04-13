package com.yandex.div.core.dagger;

import com.yandex.div.core.C2832g;
import com.yandex.div.histogram.DefaultDivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporterImpl;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitHistogramsModule_ProvideDivParsingHistogramReporterFactory implements Factory<DivParsingHistogramReporter> {

    /* renamed from: a */
    public final Provider<HistogramConfiguration> f31145a;

    /* renamed from: b */
    public final Provider<HistogramReporterDelegate> f31146b;

    /* renamed from: c */
    public final Provider<ExecutorService> f31147c;

    public DivKitHistogramsModule_ProvideDivParsingHistogramReporterFactory(Provider<HistogramConfiguration> provider, Provider<HistogramReporterDelegate> provider2, Provider<ExecutorService> provider3) {
        this.f31145a = provider;
        this.f31146b = provider2;
        this.f31147c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        DefaultDivParsingHistogramReporter value;
        HistogramConfiguration histogramConfiguration = this.f31145a.get();
        Provider<HistogramReporterDelegate> histogramReporterDelegate = this.f31146b;
        Provider executorService = this.f31147c;
        Intrinsics.m32179h(histogramConfiguration, "histogramConfiguration");
        Intrinsics.m32179h(histogramReporterDelegate, "histogramReporterDelegate");
        Intrinsics.m32179h(executorService, "executorService");
        if (histogramConfiguration.mo17284a()) {
            if (!histogramConfiguration.mo17289e()) {
                executorService = C2832g.f31280c;
                Object obj = DoubleCheck.f58002c;
                if (!(executorService instanceof DoubleCheck)) {
                    executorService = new DoubleCheck(executorService);
                }
            }
            HistogramReporterDelegate histogramReporterDelegate2 = histogramReporterDelegate.get();
            Intrinsics.m32178g(histogramReporterDelegate2, "histogramReporterDelegate.get()");
            final HistogramReporterDelegate histogramReporterDelegate3 = histogramReporterDelegate2;
            Provider provider = new Provider() { // from class: com.yandex.div.core.dagger.a
                @Override // javax.inject.Provider
                public final Object get() {
                    HistogramReporterDelegate histogramReporterDelegate4 = HistogramReporterDelegate.this;
                    Intrinsics.m32179h(histogramReporterDelegate4, "$histogramReporterDelegate");
                    return new HistogramReporter(histogramReporterDelegate4);
                }
            };
            Object obj2 = DoubleCheck.f58002c;
            if (!(provider instanceof DoubleCheck)) {
                provider = new DoubleCheck(provider);
            }
            value = new DivParsingHistogramReporterImpl(new DivKitHistogramsModule$provideDivParsingHistogramReporter$1(provider), new DivKitHistogramsModule$provideDivParsingHistogramReporter$2(executorService));
        } else {
            Objects.requireNonNull(DivParsingHistogramReporter.f33663a);
            value = DivParsingHistogramReporter.Companion.f33665b.getValue();
        }
        Objects.requireNonNull(value, "Cannot return null from a non-@Nullable @Provides method");
        return value;
    }
}
