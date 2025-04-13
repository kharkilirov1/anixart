package com.yandex.div.core;

import com.yandex.div.histogram.HistogramConfiguration;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import kotlin.jvm.internal.Intrinsics;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitConfiguration_HistogramConfigurationFactory implements Factory<HistogramConfiguration> {

    /* renamed from: a */
    public final DivKitConfiguration f30967a;

    public DivKitConfiguration_HistogramConfigurationFactory(DivKitConfiguration divKitConfiguration) {
        this.f30967a = divKitConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        HistogramConfiguration histogramConfiguration = this.f30967a.f30964c.get();
        Intrinsics.m32178g(histogramConfiguration, "histogramConfiguration.get()");
        return histogramConfiguration;
    }
}
