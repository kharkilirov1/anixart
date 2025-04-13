package com.swiftsoft.anixartd.presentation.main.profile.comments;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.CollectionCommentRepository;
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
public final class ProfileCommentsTabPresenter_Factory implements Factory<ProfileCommentsTabPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseCommentRepository> f26714a;

    /* renamed from: b */
    public final Provider<CollectionCommentRepository> f26715b;

    /* renamed from: c */
    public final Provider<Prefs> f26716c;

    public ProfileCommentsTabPresenter_Factory(Provider<ReleaseCommentRepository> provider, Provider<CollectionCommentRepository> provider2, Provider<Prefs> provider3) {
        this.f26714a = provider;
        this.f26715b = provider2;
        this.f26716c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileCommentsTabPresenter(this.f26714a.get(), this.f26715b.get(), this.f26716c.get());
    }
}
