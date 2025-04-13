package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes.dex */
final class DaggerTransportRuntimeComponent extends TransportRuntimeComponent {

    /* renamed from: b */
    public Provider<Executor> f9137b;

    /* renamed from: c */
    public Provider<Context> f9138c;

    /* renamed from: d */
    public Provider f9139d;

    /* renamed from: e */
    public Provider f9140e;

    /* renamed from: f */
    public Provider f9141f;

    /* renamed from: g */
    public Provider<String> f9142g;

    /* renamed from: h */
    public Provider<SQLiteEventStore> f9143h;

    /* renamed from: i */
    public Provider<SchedulerConfig> f9144i;

    /* renamed from: j */
    public Provider<WorkScheduler> f9145j;

    /* renamed from: k */
    public Provider<DefaultScheduler> f9146k;

    /* renamed from: l */
    public Provider<Uploader> f9147l;

    /* renamed from: m */
    public Provider<WorkInitializer> f9148m;

    /* renamed from: n */
    public Provider<TransportRuntime> f9149n;

    public static final class Builder implements TransportRuntimeComponent.Builder {

        /* renamed from: a */
        public Context f9150a;

        public Builder() {
        }

        public Builder(C09081 c09081) {
        }
    }

    public DaggerTransportRuntimeComponent(Context context, C09081 c09081) {
        Provider provider = ExecutionModule_ExecutorFactory.InstanceHolder.f9153a;
        Object obj = DoubleCheck.f9203c;
        this.f9137b = provider instanceof DoubleCheck ? provider : new DoubleCheck(provider);
        Objects.requireNonNull(context, "instance cannot be null");
        InstanceFactory instanceFactory = new InstanceFactory(context);
        this.f9138c = instanceFactory;
        CreationContextFactory_Factory creationContextFactory_Factory = new CreationContextFactory_Factory(instanceFactory, TimeModule_EventClockFactory.m5601a(), TimeModule_UptimeClockFactory.m5602a());
        this.f9139d = creationContextFactory_Factory;
        Provider metadataBackendRegistry_Factory = new MetadataBackendRegistry_Factory(this.f9138c, creationContextFactory_Factory);
        this.f9140e = metadataBackendRegistry_Factory instanceof DoubleCheck ? metadataBackendRegistry_Factory : new DoubleCheck(metadataBackendRegistry_Factory);
        this.f9141f = new SchemaManager_Factory(this.f9138c, EventStoreModule_DbNameFactory.m5589a(), EventStoreModule_SchemaVersionFactory.m5590a());
        this.f9142g = new EventStoreModule_PackageNameFactory(this.f9138c);
        Provider sQLiteEventStore_Factory = new SQLiteEventStore_Factory(TimeModule_EventClockFactory.m5601a(), TimeModule_UptimeClockFactory.m5602a(), EventStoreModule_StoreConfigFactory.m5591a(), this.f9141f, this.f9142g);
        this.f9143h = sQLiteEventStore_Factory instanceof DoubleCheck ? sQLiteEventStore_Factory : new DoubleCheck(sQLiteEventStore_Factory);
        SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactory = new SchedulingConfigModule_ConfigFactory(TimeModule_EventClockFactory.m5601a());
        this.f9144i = schedulingConfigModule_ConfigFactory;
        SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory = new SchedulingModule_WorkSchedulerFactory(this.f9138c, this.f9143h, schedulingConfigModule_ConfigFactory, TimeModule_UptimeClockFactory.m5602a());
        this.f9145j = schedulingModule_WorkSchedulerFactory;
        Provider<Executor> provider2 = this.f9137b;
        Provider provider3 = this.f9140e;
        Provider<SQLiteEventStore> provider4 = this.f9143h;
        this.f9146k = new DefaultScheduler_Factory(provider2, provider3, schedulingModule_WorkSchedulerFactory, provider4, provider4);
        Provider<Context> provider5 = this.f9138c;
        TimeModule_EventClockFactory m5601a = TimeModule_EventClockFactory.m5601a();
        TimeModule_UptimeClockFactory m5602a = TimeModule_UptimeClockFactory.m5602a();
        Provider<SQLiteEventStore> provider6 = this.f9143h;
        this.f9147l = new Uploader_Factory(provider5, provider3, provider4, schedulingModule_WorkSchedulerFactory, provider2, provider4, m5601a, m5602a, provider6);
        this.f9148m = new WorkInitializer_Factory(this.f9137b, provider6, this.f9145j, provider6);
        Provider transportRuntime_Factory = new TransportRuntime_Factory(TimeModule_EventClockFactory.m5601a(), TimeModule_UptimeClockFactory.m5602a(), this.f9146k, this.f9147l, this.f9148m);
        this.f9149n = transportRuntime_Factory instanceof DoubleCheck ? transportRuntime_Factory : new DoubleCheck(transportRuntime_Factory);
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    /* renamed from: a */
    public EventStore mo5511a() {
        return this.f9143h.get();
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    /* renamed from: b */
    public TransportRuntime mo5512b() {
        return this.f9149n.get();
    }
}
