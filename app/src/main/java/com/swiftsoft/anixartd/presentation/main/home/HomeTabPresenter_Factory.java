package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.HomeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class HomeTabPresenter_Factory implements Factory<HomeTabPresenter> {

    /* renamed from: a */
    public final Provider<HomeRepository> f26443a;

    /* renamed from: b */
    public final Provider<Prefs> f26444b;

    public HomeTabPresenter_Factory(Provider<HomeRepository> provider, Provider<Prefs> provider2) {
        this.f26443a = provider;
        this.f26444b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new HomeTabPresenter(this.f26443a.get(), this.f26444b.get());
    }
}
