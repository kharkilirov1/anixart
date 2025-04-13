package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Objects;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* renamed from: a */
    public final Provider<Clock> f9368a;

    /* renamed from: b */
    public final Provider<Clock> f9369b;

    /* renamed from: c */
    public final Provider<EventStoreConfig> f9370c;

    /* renamed from: d */
    public final Provider<SchemaManager> f9371d;

    /* renamed from: e */
    public final Provider<String> f9372e;

    public SQLiteEventStore_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<EventStoreConfig> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        this.f9368a = provider;
        this.f9369b = provider2;
        this.f9370c = provider3;
        this.f9371d = provider4;
        this.f9372e = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.datatransport.runtime.dagger.Lazy] */
    @Override // javax.inject.Provider
    public Object get() {
        DoubleCheck doubleCheck;
        Clock clock = this.f9368a.get();
        Clock clock2 = this.f9369b.get();
        EventStoreConfig eventStoreConfig = this.f9370c.get();
        SchemaManager schemaManager = this.f9371d.get();
        Provider<String> provider = this.f9372e;
        Object obj = DoubleCheck.f9203c;
        if (provider instanceof Lazy) {
            doubleCheck = (Lazy) provider;
        } else {
            Objects.requireNonNull(provider);
            doubleCheck = new DoubleCheck(provider);
        }
        return new SQLiteEventStore(clock, clock2, eventStoreConfig, schemaManager, doubleCheck);
    }
}
