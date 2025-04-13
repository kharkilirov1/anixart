package com.swiftsoft.anixartd.presentation.main.release.video;

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
public final class ReleaseVideosPresenter_Factory implements Factory<ReleaseVideosPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseVideoRepository> f27141a;

    /* renamed from: b */
    public final Provider<Prefs> f27142b;

    public ReleaseVideosPresenter_Factory(Provider<ReleaseVideoRepository> provider, Provider<Prefs> provider2) {
        this.f27141a = provider;
        this.f27142b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseVideosPresenter(this.f27141a.get(), this.f27142b.get());
    }
}
