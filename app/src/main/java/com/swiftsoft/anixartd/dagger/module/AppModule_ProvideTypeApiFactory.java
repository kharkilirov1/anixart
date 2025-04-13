package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.TypeApi;
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
public final class AppModule_ProvideTypeApiFactory implements Factory<TypeApi> {

    /* renamed from: a */
    public final AppModule f25614a;

    /* renamed from: b */
    public final Provider<Retrofit> f25615b;

    public AppModule_ProvideTypeApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25614a = appModule;
        this.f25615b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (TypeApi) C3033a.m17740b(this.f25614a, this.f25615b.get(), "retrofit", TypeApi.class, "retrofit.create(TypeApi::class.java)");
    }
}
