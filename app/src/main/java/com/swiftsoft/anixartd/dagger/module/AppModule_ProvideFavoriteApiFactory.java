package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.FavoriteApi;
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
public final class AppModule_ProvideFavoriteApiFactory implements Factory<FavoriteApi> {

    /* renamed from: a */
    public final AppModule f25564a;

    /* renamed from: b */
    public final Provider<Retrofit> f25565b;

    public AppModule_ProvideFavoriteApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25564a = appModule;
        this.f25565b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (FavoriteApi) C3033a.m17740b(this.f25564a, this.f25565b.get(), "retrofit", FavoriteApi.class, "retrofit.create(FavoriteApi::class.java)");
    }
}
