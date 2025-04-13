package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* renamed from: a */
    public final Provider<Context> f9193a;

    /* renamed from: b */
    public final Provider<Clock> f9194b;

    /* renamed from: c */
    public final Provider<Clock> f9195c;

    public CreationContextFactory_Factory(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        this.f9193a = provider;
        this.f9194b = provider2;
        this.f9195c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CreationContextFactory(this.f9193a.get(), this.f9194b.get(), this.f9195c.get());
    }
}
