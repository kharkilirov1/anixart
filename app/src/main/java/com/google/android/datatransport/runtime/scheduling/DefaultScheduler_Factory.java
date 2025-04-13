package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* renamed from: a */
    public final Provider<Executor> f9255a;

    /* renamed from: b */
    public final Provider<BackendRegistry> f9256b;

    /* renamed from: c */
    public final Provider<WorkScheduler> f9257c;

    /* renamed from: d */
    public final Provider<EventStore> f9258d;

    /* renamed from: e */
    public final Provider<SynchronizationGuard> f9259e;

    public DefaultScheduler_Factory(Provider<Executor> provider, Provider<BackendRegistry> provider2, Provider<WorkScheduler> provider3, Provider<EventStore> provider4, Provider<SynchronizationGuard> provider5) {
        this.f9255a = provider;
        this.f9256b = provider2;
        this.f9257c = provider3;
        this.f9258d = provider4;
        this.f9259e = provider5;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DefaultScheduler(this.f9255a.get(), this.f9256b.get(), this.f9257c.get(), this.f9258d.get(), this.f9259e.get());
    }
}
