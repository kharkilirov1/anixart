package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.SearchApi;
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
public final class AppModule_ProvideSearchApiFactory implements Factory<SearchApi> {

    /* renamed from: a */
    public final AppModule f25612a;

    /* renamed from: b */
    public final Provider<Retrofit> f25613b;

    public AppModule_ProvideSearchApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25612a = appModule;
        this.f25613b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (SearchApi) C3033a.m17740b(this.f25612a, this.f25613b.get(), "retrofit", SearchApi.class, "retrofit.create(SearchApi::class.java)");
    }
}
