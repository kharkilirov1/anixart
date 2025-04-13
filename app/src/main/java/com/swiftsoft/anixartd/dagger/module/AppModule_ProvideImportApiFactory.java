package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ImportApi;
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
public final class AppModule_ProvideImportApiFactory implements Factory<ImportApi> {

    /* renamed from: a */
    public final AppModule f25572a;

    /* renamed from: b */
    public final Provider<Retrofit> f25573b;

    public AppModule_ProvideImportApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25572a = appModule;
        this.f25573b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ImportApi) C3033a.m17740b(this.f25572a, this.f25573b.get(), "retrofit", ImportApi.class, "retrofit.create(ImportApi::class.java)");
    }
}
