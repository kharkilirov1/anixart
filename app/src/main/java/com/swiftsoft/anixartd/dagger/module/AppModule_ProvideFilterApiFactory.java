package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.FilterApi;
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
public final class AppModule_ProvideFilterApiFactory implements Factory<FilterApi> {

    /* renamed from: a */
    public final AppModule f25568a;

    /* renamed from: b */
    public final Provider<Retrofit> f25569b;

    public AppModule_ProvideFilterApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25568a = appModule;
        this.f25569b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (FilterApi) C3033a.m17740b(this.f25568a, this.f25569b.get(), "retrofit", FilterApi.class, "retrofit.create(FilterApi::class.java)");
    }
}
