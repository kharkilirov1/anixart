package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitHistogramsModule_ProvideHistogramReporterDelegateFactory implements Factory<HistogramReporterDelegate> {

    /* renamed from: a */
    public final Provider<HistogramConfiguration> f31148a;

    /* renamed from: b */
    public final Provider<HistogramRecorder> f31149b;

    /* renamed from: c */
    public final Provider<HistogramColdTypeChecker> f31150c;

    public DivKitHistogramsModule_ProvideHistogramReporterDelegateFactory(Provider<HistogramConfiguration> provider, Provider<HistogramRecorder> provider2, Provider<HistogramColdTypeChecker> provider3) {
        this.f31148a = provider;
        this.f31149b = provider2;
        this.f31150c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        HistogramConfiguration histogramConfiguration = this.f31148a.get();
        Provider<HistogramRecorder> histogramRecorderProvider = this.f31149b;
        Provider<HistogramColdTypeChecker> histogramColdTypeCheckerProvider = this.f31150c;
        Intrinsics.m32179h(histogramConfiguration, "histogramConfiguration");
        Intrinsics.m32179h(histogramRecorderProvider, "histogramRecorderProvider");
        Intrinsics.m32179h(histogramColdTypeCheckerProvider, "histogramColdTypeCheckerProvider");
        return histogramConfiguration.mo17284a() ? !histogramConfiguration.mo17284a() ? HistogramReporterDelegate.NoOp.f33700a : new HistogramReporterDelegateImpl(histogramRecorderProvider, new HistogramCallTypeProvider(new C2819x32dae935(histogramColdTypeCheckerProvider)), histogramConfiguration, histogramConfiguration.mo17287f()) : HistogramReporterDelegate.NoOp.f33700a;
    }
}
