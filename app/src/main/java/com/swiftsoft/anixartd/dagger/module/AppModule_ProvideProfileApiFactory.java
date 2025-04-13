package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ProfileApi;
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
public final class AppModule_ProvideProfileApiFactory implements Factory<ProfileApi> {

    /* renamed from: a */
    public final AppModule f25580a;

    /* renamed from: b */
    public final Provider<Retrofit> f25581b;

    public AppModule_ProvideProfileApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25580a = appModule;
        this.f25581b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ProfileApi) C3033a.m17740b(this.f25580a, this.f25581b.get(), "retrofit", ProfileApi.class, "retrofit.create(ProfileApi::class.java)");
    }
}
