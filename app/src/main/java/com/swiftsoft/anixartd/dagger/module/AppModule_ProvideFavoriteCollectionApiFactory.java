package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.CollectionFavoriteApi;
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
public final class AppModule_ProvideFavoriteCollectionApiFactory implements Factory<CollectionFavoriteApi> {

    /* renamed from: a */
    public final AppModule f25566a;

    /* renamed from: b */
    public final Provider<Retrofit> f25567b;

    public AppModule_ProvideFavoriteCollectionApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25566a = appModule;
        this.f25567b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (CollectionFavoriteApi) C3033a.m17740b(this.f25566a, this.f25567b.get(), "retrofit", CollectionFavoriteApi.class, "retrofit.create(CollectionFavoriteApi::class.java)");
    }
}
