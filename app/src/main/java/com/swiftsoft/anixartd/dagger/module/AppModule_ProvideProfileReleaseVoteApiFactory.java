package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ProfileReleaseVoteApi;
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
public final class AppModule_ProvideProfileReleaseVoteApiFactory implements Factory<ProfileReleaseVoteApi> {

    /* renamed from: a */
    public final AppModule f25590a;

    /* renamed from: b */
    public final Provider<Retrofit> f25591b;

    public AppModule_ProvideProfileReleaseVoteApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25590a = appModule;
        this.f25591b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ProfileReleaseVoteApi) C3033a.m17740b(this.f25590a, this.f25591b.get(), "retrofit", ProfileReleaseVoteApi.class, "retrofit.create(ProfileReleaseVoteApi::class.java)");
    }
}
