package com.swiftsoft.anixartd.presentation.main.recommendation;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.DiscoverRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class RecommendationPresenter_Factory implements Factory<RecommendationPresenter> {

    /* renamed from: a */
    public final Provider<DiscoverRepository> f26921a;

    /* renamed from: b */
    public final Provider<Prefs> f26922b;

    public RecommendationPresenter_Factory(Provider<DiscoverRepository> provider, Provider<Prefs> provider2) {
        this.f26921a = provider;
        this.f26922b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new RecommendationPresenter(this.f26921a.get(), this.f26922b.get());
    }
}
