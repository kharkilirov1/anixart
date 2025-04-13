package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.DirectLinkApi;
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
public final class AppModule_ProvideDirectLinkApiFactory implements Factory<DirectLinkApi> {

    /* renamed from: a */
    public final AppModule f25558a;

    /* renamed from: b */
    public final Provider<Retrofit> f25559b;

    public AppModule_ProvideDirectLinkApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25558a = appModule;
        this.f25559b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (DirectLinkApi) C3033a.m17740b(this.f25558a, this.f25559b.get(), "retrofit", DirectLinkApi.class, "retrofit.create(DirectLinkApi::class.java)");
    }
}
