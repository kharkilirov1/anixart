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
public final class HomePresenter_Factory implements Factory<HomePresenter> {

    /* renamed from: a */
    public final Provider<HomeRepository> f26428a;

    /* renamed from: b */
    public final Provider<Prefs> f26429b;

    public HomePresenter_Factory(Provider<HomeRepository> provider, Provider<Prefs> provider2) {
        this.f26428a = provider;
        this.f26429b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new HomePresenter(this.f26428a.get(), this.f26429b.get());
    }
}
