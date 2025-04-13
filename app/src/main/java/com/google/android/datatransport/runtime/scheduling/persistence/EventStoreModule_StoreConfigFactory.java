package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final EventStoreModule_StoreConfigFactory f9359a = new EventStoreModule_StoreConfigFactory();
    }

    /* renamed from: a */
    public static EventStoreModule_StoreConfigFactory m5591a() {
        return InstanceHolder.f9359a;
    }

    @Override // javax.inject.Provider
    public Object get() {
        EventStoreConfig eventStoreConfig = EventStoreConfig.f9355a;
        Objects.requireNonNull(eventStoreConfig, "Cannot return null from a non-@Nullable @Provides method");
        return eventStoreConfig;
    }
}
