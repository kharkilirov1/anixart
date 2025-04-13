package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.FilterRepository;
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
public final class CustomFilterTabPresenter_Factory implements Factory<CustomFilterTabPresenter> {

    /* renamed from: a */
    public final Provider<HomeRepository> f26420a;

    /* renamed from: b */
    public final Provider<FilterRepository> f26421b;

    /* renamed from: c */
    public final Provider<Prefs> f26422c;

    public CustomFilterTabPresenter_Factory(Provider<HomeRepository> provider, Provider<FilterRepository> provider2, Provider<Prefs> provider3) {
        this.f26420a = provider;
        this.f26421b = provider2;
        this.f26422c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CustomFilterTabPresenter(this.f26420a.get(), this.f26421b.get(), this.f26422c.get());
    }
}
