package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.CollectionMyApi;
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
public final class AppModule_ProvideCollectionMyApiFactory implements Factory<CollectionMyApi> {

    /* renamed from: a */
    public final AppModule f25549a;

    /* renamed from: b */
    public final Provider<Retrofit> f25550b;

    public AppModule_ProvideCollectionMyApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25549a = appModule;
        this.f25550b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (CollectionMyApi) C3033a.m17740b(this.f25549a, this.f25550b.get(), "retrofit", CollectionMyApi.class, "retrofit.create(CollectionMyApi::class.java)");
    }
}
