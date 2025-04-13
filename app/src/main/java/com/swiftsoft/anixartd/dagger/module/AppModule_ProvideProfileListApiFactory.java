package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ProfileListApi;
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
public final class AppModule_ProvideProfileListApiFactory implements Factory<ProfileListApi> {

    /* renamed from: a */
    public final AppModule f25586a;

    /* renamed from: b */
    public final Provider<Retrofit> f25587b;

    public AppModule_ProvideProfileListApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25586a = appModule;
        this.f25587b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ProfileListApi) C3033a.m17740b(this.f25586a, this.f25587b.get(), "retrofit", ProfileListApi.class, "retrofit.create(ProfileListApi::class.java)");
    }
}
