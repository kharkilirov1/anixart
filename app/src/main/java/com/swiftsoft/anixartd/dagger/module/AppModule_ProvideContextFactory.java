package com.swiftsoft.anixartd.dagger.module;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Objects;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class AppModule_ProvideContextFactory implements Factory<Context> {

    /* renamed from: a */
    public final AppModule f25555a;

    public AppModule_ProvideContextFactory(AppModule appModule) {
        this.f25555a = appModule;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Context context = this.f25555a.f25540a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
