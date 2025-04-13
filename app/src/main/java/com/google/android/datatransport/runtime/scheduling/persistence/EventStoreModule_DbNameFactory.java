package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final EventStoreModule_DbNameFactory f9356a = new EventStoreModule_DbNameFactory();
    }

    /* renamed from: a */
    public static EventStoreModule_DbNameFactory m5589a() {
        return InstanceHolder.f9356a;
    }

    @Override // javax.inject.Provider
    public /* bridge */ /* synthetic */ Object get() {
        return "com.google.android.datatransport.events";
    }
}
