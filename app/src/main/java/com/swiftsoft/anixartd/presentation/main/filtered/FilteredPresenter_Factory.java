package com.swiftsoft.anixartd.presentation.main.filtered;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.FilterRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class FilteredPresenter_Factory implements Factory<FilteredPresenter> {

    /* renamed from: a */
    public final Provider<FilterRepository> f26398a;

    /* renamed from: b */
    public final Provider<Prefs> f26399b;

    public FilteredPresenter_Factory(Provider<FilterRepository> provider, Provider<Prefs> provider2) {
        this.f26398a = provider;
        this.f26399b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new FilteredPresenter(this.f26398a.get(), this.f26399b.get());
    }
}
