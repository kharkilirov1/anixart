package com.swiftsoft.anixartd.presentation.main.episodes;

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
public final class EpisodesPresenter_Factory implements Factory<EpisodesPresenter> {

    /* renamed from: a */
    public final Provider<EpisodeRepository> f26309a;

    /* renamed from: b */
    public final Provider<Prefs> f26310b;

    public EpisodesPresenter_Factory(Provider<EpisodeRepository> provider, Provider<Prefs> provider2) {
        this.f26309a = provider;
        this.f26310b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new EpisodesPresenter(this.f26309a.get(), this.f26310b.get());
    }
}
