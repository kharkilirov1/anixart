package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ReleaseVideoApi;
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
public final class AppModule_ProvideReleaseVideosApiFactory implements Factory<ReleaseVideoApi> {

    /* renamed from: a */
    public final AppModule f25604a;

    /* renamed from: b */
    public final Provider<Retrofit> f25605b;

    public AppModule_ProvideReleaseVideosApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25604a = appModule;
        this.f25605b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ReleaseVideoApi) C3033a.m17740b(this.f25604a, this.f25605b.get(), "retrofit", ReleaseVideoApi.class, "retrofit.create(ReleaseVideoApi::class.java)");
    }
}
