package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ProfilePreferenceApi;
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
public final class AppModule_ProvideProfilePreferenceApiFactory implements Factory<ProfilePreferenceApi> {

    /* renamed from: a */
    public final AppModule f25588a;

    /* renamed from: b */
    public final Provider<Retrofit> f25589b;

    public AppModule_ProvideProfilePreferenceApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25588a = appModule;
        this.f25589b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ProfilePreferenceApi) C3033a.m17740b(this.f25588a, this.f25589b.get(), "retrofit", ProfilePreferenceApi.class, "retrofit.create(ProfilePreferenceApi::class.java)");
    }
}
