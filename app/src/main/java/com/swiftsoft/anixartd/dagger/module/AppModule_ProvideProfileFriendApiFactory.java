package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ProfileFriendApi;
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
public final class AppModule_ProvideProfileFriendApiFactory implements Factory<ProfileFriendApi> {

    /* renamed from: a */
    public final AppModule f25584a;

    /* renamed from: b */
    public final Provider<Retrofit> f25585b;

    public AppModule_ProvideProfileFriendApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25584a = appModule;
        this.f25585b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ProfileFriendApi) C3033a.m17740b(this.f25584a, this.f25585b.get(), "retrofit", ProfileFriendApi.class, "retrofit.create(ProfileFriendApi::class.java)");
    }
}
