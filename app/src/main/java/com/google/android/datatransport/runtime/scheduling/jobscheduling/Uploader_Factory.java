package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class Uploader_Factory implements Factory<Uploader> {

    /* renamed from: a */
    public final Provider<Context> f9298a;

    /* renamed from: b */
    public final Provider<BackendRegistry> f9299b;

    /* renamed from: c */
    public final Provider<EventStore> f9300c;

    /* renamed from: d */
    public final Provider<WorkScheduler> f9301d;

    /* renamed from: e */
    public final Provider<Executor> f9302e;

    /* renamed from: f */
    public final Provider<SynchronizationGuard> f9303f;

    /* renamed from: g */
    public final Provider<Clock> f9304g;

    /* renamed from: h */
    public final Provider<Clock> f9305h;

    /* renamed from: i */
    public final Provider<ClientHealthMetricsStore> f9306i;

    public Uploader_Factory(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        this.f9298a = provider;
        this.f9299b = provider2;
        this.f9300c = provider3;
        this.f9301d = provider4;
        this.f9302e = provider5;
        this.f9303f = provider6;
        this.f9304g = provider7;
        this.f9305h = provider8;
        this.f9306i = provider9;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new Uploader(this.f9298a.get(), this.f9299b.get(), this.f9300c.get(), this.f9301d.get(), this.f9302e.get(), this.f9303f.get(), this.f9304g.get(), this.f9305h.get(), this.f9306i.get());
    }
}
