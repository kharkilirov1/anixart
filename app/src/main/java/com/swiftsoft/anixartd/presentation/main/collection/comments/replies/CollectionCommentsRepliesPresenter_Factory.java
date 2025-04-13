package com.swiftsoft.anixartd.presentation.main.collection.comments.replies;

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
public final class CollectionCommentsRepliesPresenter_Factory implements Factory<CollectionCommentsRepliesPresenter> {

    /* renamed from: a */
    public final Provider<CollectionCommentRepository> f26166a;

    /* renamed from: b */
    public final Provider<Prefs> f26167b;

    public CollectionCommentsRepliesPresenter_Factory(Provider<CollectionCommentRepository> provider, Provider<Prefs> provider2) {
        this.f26166a = provider;
        this.f26167b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CollectionCommentsRepliesPresenter(this.f26166a.get(), this.f26167b.get());
    }
}
