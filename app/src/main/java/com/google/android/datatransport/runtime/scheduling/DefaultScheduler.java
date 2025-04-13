package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import p005c.RunnableC0695b;

/* loaded from: classes.dex */
public class DefaultScheduler implements Scheduler {

    /* renamed from: f */
    public static final Logger f9249f = Logger.getLogger(TransportRuntime.class.getName());

    /* renamed from: a */
    public final WorkScheduler f9250a;

    /* renamed from: b */
    public final Executor f9251b;

    /* renamed from: c */
    public final BackendRegistry f9252c;

    /* renamed from: d */
    public final EventStore f9253d;

    /* renamed from: e */
    public final SynchronizationGuard f9254e;

    @Inject
    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f9251b = executor;
        this.f9252c = backendRegistry;
        this.f9250a = workScheduler;
        this.f9253d = eventStore;
        this.f9254e = synchronizationGuard;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    /* renamed from: a */
    public void mo5549a(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.f9251b.execute(new RunnableC0695b(this, transportContext, transportScheduleCallback, eventInternal, 0));
    }
}
