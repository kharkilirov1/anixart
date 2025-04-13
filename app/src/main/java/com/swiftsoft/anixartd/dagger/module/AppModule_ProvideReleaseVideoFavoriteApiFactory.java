package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ReleaseVideoFavoriteApi;
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
public final class AppModule_ProvideReleaseVideoFavoriteApiFactory implements Factory<ReleaseVideoFavoriteApi> {

    /* renamed from: a */
    public final AppModule f25602a;

    /* renamed from: b */
    public final Provider<Retrofit> f25603b;

    public AppModule_ProvideReleaseVideoFavoriteApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25602a = appModule;
        this.f25603b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ReleaseVideoFavoriteApi) C3033a.m17740b(this.f25602a, this.f25603b.get(), "retrofit", ReleaseVideoFavoriteApi.class, "retrofit.create(ReleaseV…oFavoriteApi::class.java)");
    }
}
