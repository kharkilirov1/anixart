package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ReleaseStreamingPlatformApi;
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
public final class AppModule_ProvideReleaseStreamingPlatformApiFactory implements Factory<ReleaseStreamingPlatformApi> {

    /* renamed from: a */
    public final AppModule f25598a;

    /* renamed from: b */
    public final Provider<Retrofit> f25599b;

    public AppModule_ProvideReleaseStreamingPlatformApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25598a = appModule;
        this.f25599b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ReleaseStreamingPlatformApi) C3033a.m17740b(this.f25598a, this.f25599b.get(), "retrofit", ReleaseStreamingPlatformApi.class, "retrofit.create(ReleaseS…gPlatformApi::class.java)");
    }
}
