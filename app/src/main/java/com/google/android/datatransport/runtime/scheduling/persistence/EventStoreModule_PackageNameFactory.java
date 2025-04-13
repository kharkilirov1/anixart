package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import java.util.Objects;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* renamed from: a */
    public final Provider<Context> f9357a;

    public EventStoreModule_PackageNameFactory(Provider<Context> provider) {
        this.f9357a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        String packageName = this.f9357a.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
