package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ReportApi;
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
public final class AppModule_ProvideReportApiFactory implements Factory<ReportApi> {

    /* renamed from: a */
    public final AppModule f25606a;

    /* renamed from: b */
    public final Provider<Retrofit> f25607b;

    public AppModule_ProvideReportApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25606a = appModule;
        this.f25607b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ReportApi) C3033a.m17740b(this.f25606a, this.f25607b.get(), "retrofit", ReportApi.class, "retrofit.create(ReportApi::class.java)");
    }
}
