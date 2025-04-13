package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.AuthApi;
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
public final class AppModule_ProvideAuthApiFactory implements Factory<AuthApi> {

    /* renamed from: a */
    public final AppModule f25543a;

    /* renamed from: b */
    public final Provider<Retrofit> f25544b;

    public AppModule_ProvideAuthApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25543a = appModule;
        this.f25544b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (AuthApi) C3033a.m17740b(this.f25543a, this.f25544b.get(), "retrofit", AuthApi.class, "retrofit.create(AuthApi::class.java)");
    }
}
