package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.ReleaseCommentApi;
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
public final class AppModule_ProvideReleaseCommentApiFactory implements Factory<ReleaseCommentApi> {

    /* renamed from: a */
    public final AppModule f25596a;

    /* renamed from: b */
    public final Provider<Retrofit> f25597b;

    public AppModule_ProvideReleaseCommentApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25596a = appModule;
        this.f25597b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (ReleaseCommentApi) C3033a.m17740b(this.f25596a, this.f25597b.get(), "retrofit", ReleaseCommentApi.class, "retrofit.create(ReleaseCommentApi::class.java)");
    }
}
