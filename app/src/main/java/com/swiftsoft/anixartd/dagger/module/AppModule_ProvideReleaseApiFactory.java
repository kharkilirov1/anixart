package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ReleaseApi;
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
public final class AppModule_ProvideReleaseApiFactory implements Factory<ReleaseApi> {

    /* renamed from: a */
    public final AppModule f25594a;

    /* renamed from: b */
    public final Provider<Retrofit> f25595b;

    public AppModule_ProvideReleaseApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25594a = appModule;
        this.f25595b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ReleaseApi) C3033a.m17740b(this.f25594a, this.f25595b.get(), "retrofit", ReleaseApi.class, "retrofit.create(ReleaseApi::class.java)");
    }
}
