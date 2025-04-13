package com.swiftsoft.anixartd.presentation.main.filter;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.HomeRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class FilterPresenter_Factory implements Factory<FilterPresenter> {

    /* renamed from: a */
    public final Provider<HomeRepository> f26385a;

    /* renamed from: b */
    public final Provider<TypeRepository> f26386b;

    /* renamed from: c */
    public final Provider<Prefs> f26387c;

    public FilterPresenter_Factory(Provider<HomeRepository> provider, Provider<TypeRepository> provider2, Provider<Prefs> provider3) {
        this.f26385a = provider;
        this.f26386b = provider2;
        this.f26387c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new FilterPresenter(this.f26385a.get(), this.f26386b.get(), this.f26387c.get());
    }
}
