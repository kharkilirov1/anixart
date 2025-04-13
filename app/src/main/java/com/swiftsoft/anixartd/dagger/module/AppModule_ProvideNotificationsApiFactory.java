package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.NotificationApi;
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
public final class AppModule_ProvideNotificationsApiFactory implements Factory<NotificationApi> {

    /* renamed from: a */
    public final AppModule f25576a;

    /* renamed from: b */
    public final Provider<Retrofit> f25577b;

    public AppModule_ProvideNotificationsApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25576a = appModule;
        this.f25577b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (NotificationApi) C3033a.m17740b(this.f25576a, this.f25577b.get(), "retrofit", NotificationApi.class, "retrofit.create(NotificationApi::class.java)");
    }
}
