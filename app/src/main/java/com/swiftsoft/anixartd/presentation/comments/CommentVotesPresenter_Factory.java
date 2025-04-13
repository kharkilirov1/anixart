package com.swiftsoft.anixartd.presentation.comments;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.CommentVotesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class CommentVotesPresenter_Factory implements Factory<CommentVotesPresenter> {

    /* renamed from: a */
    public final Provider<CommentVotesRepository> f25942a;

    /* renamed from: b */
    public final Provider<Prefs> f25943b;

    public CommentVotesPresenter_Factory(Provider<CommentVotesRepository> provider, Provider<Prefs> provider2) {
        this.f25942a = provider;
        this.f25943b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CommentVotesPresenter(this.f25942a.get(), this.f25943b.get());
    }
}
