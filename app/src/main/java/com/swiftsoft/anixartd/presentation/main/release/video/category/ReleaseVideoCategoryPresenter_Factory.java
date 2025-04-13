package com.swiftsoft.anixartd.presentation.main.release.video.category;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ReleaseVideoCategoryPresenter_Factory implements Factory<ReleaseVideoCategoryPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseVideoRepository> f27176a;

    /* renamed from: b */
    public final Provider<Prefs> f27177b;

    public ReleaseVideoCategoryPresenter_Factory(Provider<ReleaseVideoRepository> provider, Provider<Prefs> provider2) {
        this.f27176a = provider;
        this.f27177b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseVideoCategoryPresenter(this.f27176a.get(), this.f27177b.get());
    }
}
