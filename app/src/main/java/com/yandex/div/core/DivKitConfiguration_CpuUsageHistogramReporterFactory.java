package com.yandex.div.core;

import com.yandex.div.histogram.CpuUsageHistogramReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitConfiguration_CpuUsageHistogramReporterFactory implements Factory<CpuUsageHistogramReporter> {

    /* renamed from: a */
    public final DivKitConfiguration f30965a;

    public DivKitConfiguration_CpuUsageHistogramReporterFactory(DivKitConfiguration divKitConfiguration) {
        this.f30965a = divKitConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        CpuUsageHistogramReporter cpuUsageHistogramReporter = this.f30965a.f30964c.get().mo17285b().get();
        Intrinsics.m32178g(cpuUsageHistogramReporter, "histogramConfiguration.g…geHistogramReporter.get()");
        return cpuUsageHistogramReporter;
    }
}
