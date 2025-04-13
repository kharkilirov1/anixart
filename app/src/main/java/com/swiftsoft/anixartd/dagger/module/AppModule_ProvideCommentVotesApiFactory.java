package com.swiftsoft.anixartd.dagger.module;

import com.swiftsoft.anixartd.network.api.CommentVotesApi;
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
public final class AppModule_ProvideCommentVotesApiFactory implements Factory<CommentVotesApi> {

    /* renamed from: a */
    public final AppModule f25551a;

    /* renamed from: b */
    public final Provider<Retrofit> f25552b;

    public AppModule_ProvideCommentVotesApiFactory(AppModule appModule, Provider<Retrofit> provider) {
        this.f25551a = appModule;
        this.f25552b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return (CommentVotesApi) C3033a.m17740b(this.f25551a, this.f25552b.get(), "retrofit", CommentVotesApi.class, "retrofit.create(CommentVotesApi::class.java)");
    }
}
