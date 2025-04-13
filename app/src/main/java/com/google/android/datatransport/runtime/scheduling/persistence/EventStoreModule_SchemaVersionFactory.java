package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes.dex */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final EventStoreModule_SchemaVersionFactory f9358a = new EventStoreModule_SchemaVersionFactory();
    }

    /* renamed from: a */
    public static EventStoreModule_SchemaVersionFactory m5590a() {
        return InstanceHolder.f9358a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return Integer.valueOf(SchemaManager.f9374e);
    }
}
