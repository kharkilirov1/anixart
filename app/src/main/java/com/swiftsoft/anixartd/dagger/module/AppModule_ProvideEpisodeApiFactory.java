package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.EpisodeApi;
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
public final class AppModule_ProvideEpisodeApiFactory implements Factory<EpisodeApi> {

    /* renamed from: a */
    public final AppModule f25560a;

    /* renamed from: b */
    public final Provider<Retrofit> f25561b;

    public AppModule_ProvideEpisodeApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25560a = appModule;
        this.f25561b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (EpisodeApi) C3033a.m17740b(this.f25560a, this.f25561b.get(), "retrofit", EpisodeApi.class, "retrofit.create(EpisodeApi::class.java)");
    }
}
