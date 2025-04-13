package com.swiftsoft.anixartd.presentation.main.collection.comments;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.CollectionCommentRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class CollectionCommentsPresenter_Factory implements Factory<CollectionCommentsPresenter> {

    /* renamed from: a */
    public final Provider<CollectionCommentRepository> f26123a;

    /* renamed from: b */
    public final Provider<Prefs> f26124b;

    public CollectionCommentsPresenter_Factory(Provider<CollectionCommentRepository> provider, Provider<Prefs> provider2) {
        this.f26123a = provider;
        this.f26124b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CollectionCommentsPresenter(this.f26123a.get(), this.f26124b.get());
    }
}
