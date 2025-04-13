package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* renamed from: a */
    public final Provider<Executor> f9311a;

    /* renamed from: b */
    public final Provider<EventStore> f9312b;

    /* renamed from: c */
    public final Provider<WorkScheduler> f9313c;

    /* renamed from: d */
    public final Provider<SynchronizationGuard> f9314d;

    public WorkInitializer_Factory(Provider<Executor> provider, Provider<EventStore> provider2, Provider<WorkScheduler> provider3, Provider<SynchronizationGuard> provider4) {
        this.f9311a = provider;
        this.f9312b = provider2;
        this.f9313c = provider3;
        this.f9314d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new WorkInitializer(this.f9311a.get(), this.f9312b.get(), this.f9313c.get(), this.f9314d.get());
    }
}
