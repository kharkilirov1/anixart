package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.CollectionApi;
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
public final class AppModule_ProvideCollectionApiFactory implements Factory<CollectionApi> {

    /* renamed from: a */
    public final AppModule f25545a;

    /* renamed from: b */
    public final Provider<Retrofit> f25546b;

    public AppModule_ProvideCollectionApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25545a = appModule;
        this.f25546b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (CollectionApi) C3033a.m17740b(this.f25545a, this.f25546b.get(), "retrofit", CollectionApi.class, "retrofit.create(CollectionApi::class.java)");
    }
}
