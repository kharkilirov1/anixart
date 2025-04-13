package com.yandex.div.core;

import com.yandex.div.histogram.HistogramRecorder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivKitConfiguration_HistogramRecorderFactory implements Factory<HistogramRecorder> {

    /* renamed from: a */
    public final DivKitConfiguration f30968a;

    public DivKitConfiguration_HistogramRecorderFactory(DivKitConfiguration divKitConfiguration) {
        this.f30968a = divKitConfiguration;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new HistogramRecorder(this.f30968a.f30964c.get().mo17286c().get());
    }
}
