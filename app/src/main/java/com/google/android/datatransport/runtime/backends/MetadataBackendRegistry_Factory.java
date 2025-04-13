package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* renamed from: a */
    public final Provider<Context> f9201a;

    /* renamed from: b */
    public final Provider<CreationContextFactory> f9202b;

    public MetadataBackendRegistry_Factory(Provider<Context> provider, Provider<CreationContextFactory> provider2) {
        this.f9201a = provider;
        this.f9202b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new MetadataBackendRegistry(this.f9201a.get(), this.f9202b.get());
    }
}
