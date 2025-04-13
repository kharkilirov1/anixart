package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.RelatedApi;
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
public final class AppModule_ProvideRelatedApiFactory implements Factory<RelatedApi> {

    /* renamed from: a */
    public final AppModule f25592a;

    /* renamed from: b */
    public final Provider<Retrofit> f25593b;

    public AppModule_ProvideRelatedApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25592a = appModule;
        this.f25593b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (RelatedApi) C3033a.m17740b(this.f25592a, this.f25593b.get(), "retrofit", RelatedApi.class, "retrofit.create(RelatedApi::class.java)");
    }
}
