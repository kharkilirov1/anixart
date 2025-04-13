package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* renamed from: a */
    public final Provider<Context> f9383a;

    /* renamed from: b */
    public final Provider<String> f9384b;

    /* renamed from: c */
    public final Provider<Integer> f9385c;

    public SchemaManager_Factory(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f9383a = provider;
        this.f9384b = provider2;
        this.f9385c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SchemaManager(this.f9383a.get(), this.f9384b.get(), this.f9385c.get().intValue());
    }
}
