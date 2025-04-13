package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ConfigApi;
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
public final class AppModule_ProvideConfigApiFactory implements Factory<ConfigApi> {

    /* renamed from: a */
    public final AppModule f25553a;

    /* renamed from: b */
    public final Provider<Retrofit> f25554b;

    public AppModule_ProvideConfigApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25553a = appModule;
        this.f25554b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ConfigApi) C3033a.m17740b(this.f25553a, this.f25554b.get(), "retrofit", ConfigApi.class, "retrofit.create(ConfigApi::class.java)");
    }
}
