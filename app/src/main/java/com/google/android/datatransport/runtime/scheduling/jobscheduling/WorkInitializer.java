package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* loaded from: classes.dex */
public class WorkInitializer {

    /* renamed from: a */
    public final Executor f9307a;

    /* renamed from: b */
    public final EventStore f9308b;

    /* renamed from: c */
    public final WorkScheduler f9309c;

    /* renamed from: d */
    public final SynchronizationGuard f9310d;

    @Inject
    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f9307a = executor;
        this.f9308b = eventStore;
        this.f9309c = workScheduler;
        this.f9310d = synchronizationGuard;
    }
}
