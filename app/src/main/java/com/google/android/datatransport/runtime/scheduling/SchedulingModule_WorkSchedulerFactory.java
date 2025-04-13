package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* renamed from: a */
    public final Provider<Context> f9261a;

    /* renamed from: b */
    public final Provider<EventStore> f9262b;

    /* renamed from: c */
    public final Provider<SchedulerConfig> f9263c;

    /* renamed from: d */
    public final Provider<Clock> f9264d;

    public SchedulingModule_WorkSchedulerFactory(Provider<Context> provider, Provider<EventStore> provider2, Provider<SchedulerConfig> provider3, Provider<Clock> provider4) {
        this.f9261a = provider;
        this.f9262b = provider2;
        this.f9263c = provider3;
        this.f9264d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Context context = this.f9261a.get();
        EventStore eventStore = this.f9262b.get();
        SchedulerConfig schedulerConfig = this.f9263c.get();
        this.f9264d.get();
        return new JobInfoScheduler(context, eventStore, schedulerConfig);
    }
}
