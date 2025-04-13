package com.swiftsoft.anixartd.presentation.main.release.comments.replies;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ReleaseCommentRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ReleaseCommentsRepliesPresenter_Factory implements Factory<ReleaseCommentsRepliesPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseCommentRepository> f27113a;

    /* renamed from: b */
    public final Provider<Prefs> f27114b;

    public ReleaseCommentsRepliesPresenter_Factory(Provider<ReleaseCommentRepository> provider, Provider<Prefs> provider2) {
        this.f27113a = provider;
        this.f27114b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseCommentsRepliesPresenter(this.f27113a.get(), this.f27114b.get());
    }
}
