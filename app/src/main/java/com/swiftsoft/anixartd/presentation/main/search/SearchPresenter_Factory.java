package com.swiftsoft.anixartd.presentation.main.search;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.SearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SearchPresenter_Factory implements Factory<SearchPresenter> {

    /* renamed from: a */
    public final Provider<SearchRepository> f27231a;

    /* renamed from: b */
    public final Provider<Prefs> f27232b;

    public SearchPresenter_Factory(Provider<SearchRepository> provider, Provider<Prefs> provider2) {
        this.f27231a = provider;
        this.f27232b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SearchPresenter(this.f27231a.get(), this.f27232b.get());
    }
}
