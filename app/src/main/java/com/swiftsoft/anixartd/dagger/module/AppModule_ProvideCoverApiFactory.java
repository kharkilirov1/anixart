package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.DiscoverApi;
import com.yandex.div2.C3033a;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class AppModule_ProvideCoverApiFactory implements Factory<DiscoverApi> {

    /* renamed from: a */
    public final AppModule f25556a;

    /* renamed from: b */
    public final Provider<Retrofit> f25557b;

    public AppModule_ProvideCoverApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25556a = appModule;
        this.f25557b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (DiscoverApi) C3033a.m17740b(this.f25556a, this.f25557b.get(), "retrofit", DiscoverApi.class, "retrofit.create(DiscoverApi::class.java)");
    }
}
