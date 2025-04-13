package com.swiftsoft.anixartd.presentation.main.discover;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.CollectionRepository;
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
public final class DiscoverPresenter_Factory implements Factory<DiscoverPresenter> {

    /* renamed from: a */
    public final Provider<DiscoverRepository> f26247a;

    /* renamed from: b */
    public final Provider<CollectionRepository> f26248b;

    /* renamed from: c */
    public final Provider<Prefs> f26249c;

    public DiscoverPresenter_Factory(Provider<DiscoverRepository> provider, Provider<CollectionRepository> provider2, Provider<Prefs> provider3) {
        this.f26247a = provider;
        this.f26248b = provider2;
        this.f26249c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DiscoverPresenter(this.f26247a.get(), this.f26248b.get(), this.f26249c.get());
    }
}
