package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {

    /* renamed from: a */
    public final Provider<Clock> f9260a;

    public SchedulingConfigModule_ConfigFactory(Provider<Clock> provider) {
        this.f9260a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return SchedulerConfig.m5561b(this.f9260a.get());
    }
}
