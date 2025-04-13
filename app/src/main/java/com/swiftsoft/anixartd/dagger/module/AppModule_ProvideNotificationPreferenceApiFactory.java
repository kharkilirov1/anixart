package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.NotificationPreferenceApi;
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
public final class AppModule_ProvideNotificationPreferenceApiFactory implements Factory<NotificationPreferenceApi> {

    /* renamed from: a */
    public final AppModule f25574a;

    /* renamed from: b */
    public final Provider<Retrofit> f25575b;

    public AppModule_ProvideNotificationPreferenceApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25574a = appModule;
        this.f25575b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (NotificationPreferenceApi) C3033a.m17740b(this.f25574a, this.f25575b.get(), "retrofit", NotificationPreferenceApi.class, "retrofit.create(Notifica…referenceApi::class.java)");
    }
}
