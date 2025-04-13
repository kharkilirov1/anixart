package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ScheduleApi;
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
public final class AppModule_ProvideScheduleApiFactory implements Factory<ScheduleApi> {

    /* renamed from: a */
    public final AppModule f25610a;

    /* renamed from: b */
    public final Provider<Retrofit> f25611b;

    public AppModule_ProvideScheduleApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25610a = appModule;
        this.f25611b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ScheduleApi) C3033a.m17740b(this.f25610a, this.f25611b.get(), "retrofit", ScheduleApi.class, "retrofit.create(ScheduleApi::class.java)");
    }
}
