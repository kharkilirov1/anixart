package com.swiftsoft.anixartd.presentation.main.watching;

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
public final class WatchingPresenter_Factory implements Factory<WatchingPresenter> {

    /* renamed from: a */
    public final Provider<DiscoverRepository> f27295a;

    /* renamed from: b */
    public final Provider<Prefs> f27296b;

    public WatchingPresenter_Factory(Provider<DiscoverRepository> provider, Provider<Prefs> provider2) {
        this.f27295a = provider;
        this.f27296b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new WatchingPresenter(this.f27295a.get(), this.f27296b.get());
    }
}
