package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {

    /* renamed from: a */
    public final Provider<Clock> f9170a;

    /* renamed from: b */
    public final Provider<Clock> f9171b;

    /* renamed from: c */
    public final Provider<Scheduler> f9172c;

    /* renamed from: d */
    public final Provider<Uploader> f9173d;

    /* renamed from: e */
    public final Provider<WorkInitializer> f9174e;

    public TransportRuntime_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<Scheduler> provider3, Provider<Uploader> provider4, Provider<WorkInitializer> provider5) {
        this.f9170a = provider;
        this.f9171b = provider2;
        this.f9172c = provider3;
        this.f9173d = provider4;
        this.f9174e = provider5;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new TransportRuntime(this.f9170a.get(), this.f9171b.get(), this.f9172c.get(), this.f9173d.get(), this.f9174e.get());
    }
}
