package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.HistoryApi;
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
public final class AppModule_ProvideHistoryApiFactory implements Factory<HistoryApi> {

    /* renamed from: a */
    public final AppModule f25570a;

    /* renamed from: b */
    public final Provider<Retrofit> f25571b;

    public AppModule_ProvideHistoryApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25570a = appModule;
        this.f25571b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (HistoryApi) C3033a.m17740b(this.f25570a, this.f25571b.get(), "retrofit", HistoryApi.class, "retrofit.create(HistoryApi::class.java)");
    }
}
