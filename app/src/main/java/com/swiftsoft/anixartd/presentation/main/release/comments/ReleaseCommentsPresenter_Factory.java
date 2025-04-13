package com.swiftsoft.anixartd.presentation.main.release.comments;

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
public final class ReleaseCommentsPresenter_Factory implements Factory<ReleaseCommentsPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseCommentRepository> f27068a;

    /* renamed from: b */
    public final Provider<Prefs> f27069b;

    public ReleaseCommentsPresenter_Factory(Provider<ReleaseCommentRepository> provider, Provider<Prefs> provider2) {
        this.f27068a = provider;
        this.f27069b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseCommentsPresenter(this.f27068a.get(), this.f27069b.get());
    }
}
