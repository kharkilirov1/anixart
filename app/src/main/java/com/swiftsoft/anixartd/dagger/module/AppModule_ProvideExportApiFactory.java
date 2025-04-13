package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ExportApi;
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
public final class AppModule_ProvideExportApiFactory implements Factory<ExportApi> {

    /* renamed from: a */
    public final AppModule f25562a;

    /* renamed from: b */
    public final Provider<Retrofit> f25563b;

    public AppModule_ProvideExportApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25562a = appModule;
        this.f25563b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ExportApi) C3033a.m17740b(this.f25562a, this.f25563b.get(), "retrofit", ExportApi.class, "retrofit.create(ExportApi::class.java)");
    }
}
