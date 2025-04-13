package com.swiftsoft.anixartd.presentation.player;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.EpisodeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SwiftPlayerPresenter_Factory implements Factory<SwiftPlayerPresenter> {

    /* renamed from: a */
    public final Provider<EpisodeRepository> f27313a;

    /* renamed from: b */
    public final Provider<Prefs> f27314b;

    public SwiftPlayerPresenter_Factory(Provider<EpisodeRepository> provider, Provider<Prefs> provider2) {
        this.f27313a = provider;
        this.f27314b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SwiftPlayerPresenter(this.f27313a.get(), this.f27314b.get());
    }
}
