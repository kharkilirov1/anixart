package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.CollectionCommentApi;
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
public final class AppModule_ProvideCollectionCommentApiFactory implements Factory<CollectionCommentApi> {

    /* renamed from: a */
    public final AppModule f25547a;

    /* renamed from: b */
    public final Provider<Retrofit> f25548b;

    public AppModule_ProvideCollectionCommentApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25547a = appModule;
        this.f25548b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (CollectionCommentApi) C3033a.m17740b(this.f25547a, this.f25548b.get(), "retrofit", CollectionCommentApi.class, "retrofit.create(CollectionCommentApi::class.java)");
    }
}
