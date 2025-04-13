package com.swiftsoft.anixartd.presentation.main.release.collections;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ReleaseCollectionsPresenter_Factory implements Factory<ReleaseCollectionsPresenter> {

    /* renamed from: a */
    public final Provider<CollectionRepository> f27033a;

    /* renamed from: b */
    public final Provider<Prefs> f27034b;

    public ReleaseCollectionsPresenter_Factory(Provider<CollectionRepository> provider, Provider<Prefs> provider2) {
        this.f27033a = provider;
        this.f27034b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseCollectionsPresenter(this.f27033a.get(), this.f27034b.get());
    }
}
