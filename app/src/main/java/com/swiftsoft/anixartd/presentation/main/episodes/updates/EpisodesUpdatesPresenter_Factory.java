package com.swiftsoft.anixartd.presentation.main.episodes.updates;

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
public final class EpisodesUpdatesPresenter_Factory implements Factory<EpisodesUpdatesPresenter> {

    /* renamed from: a */
    public final Provider<EpisodeRepository> f26376a;

    /* renamed from: b */
    public final Provider<Prefs> f26377b;

    public EpisodesUpdatesPresenter_Factory(Provider<EpisodeRepository> provider, Provider<Prefs> provider2) {
        this.f26376a = provider;
        this.f26377b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new EpisodesUpdatesPresenter(this.f26376a.get(), this.f26377b.get());
    }
}
