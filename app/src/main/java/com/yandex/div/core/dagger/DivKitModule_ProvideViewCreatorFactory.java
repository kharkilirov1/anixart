package com.yandex.div.core.dagger;

import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.viewpool.ViewCreator;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitModule_ProvideViewCreatorFactory implements Factory<ViewCreator> {

    /* renamed from: a */
    public final Provider<CpuUsageHistogramReporter> f31153a;

    public DivKitModule_ProvideViewCreatorFactory(Provider<CpuUsageHistogramReporter> provider) {
        this.f31153a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        CpuUsageHistogramReporter cpuUsageHistogramReporter = this.f31153a.get();
        Intrinsics.m32179h(cpuUsageHistogramReporter, "cpuUsageHistogramReporter");
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
