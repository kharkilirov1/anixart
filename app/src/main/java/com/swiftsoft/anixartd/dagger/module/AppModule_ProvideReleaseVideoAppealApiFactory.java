package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ReleaseVideoAppealApi;
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
public final class AppModule_ProvideReleaseVideoAppealApiFactory implements Factory<ReleaseVideoAppealApi> {

    /* renamed from: a */
    public final AppModule f25600a;

    /* renamed from: b */
    public final Provider<Retrofit> f25601b;

    public AppModule_ProvideReleaseVideoAppealApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25600a = appModule;
        this.f25601b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ReleaseVideoAppealApi) C3033a.m17740b(this.f25600a, this.f25601b.get(), "retrofit", ReleaseVideoAppealApi.class, "retrofit.create(ReleaseVideoAppealApi::class.java)");
    }
}
