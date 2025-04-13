package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ProfileBlockListApi;
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
public final class AppModule_ProvideProfileBlockListApiFactory implements Factory<ProfileBlockListApi> {

    /* renamed from: a */
    public final AppModule f25582a;

    /* renamed from: b */
    public final Provider<Retrofit> f25583b;

    public AppModule_ProvideProfileBlockListApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25582a = appModule;
        this.f25583b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ProfileBlockListApi) C3033a.m17740b(this.f25582a, this.f25583b.get(), "retrofit", ProfileBlockListApi.class, "retrofit.create(ProfileBlockListApi::class.java)");
    }
}
