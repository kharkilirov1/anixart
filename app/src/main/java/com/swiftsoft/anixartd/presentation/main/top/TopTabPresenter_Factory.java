package com.swiftsoft.anixartd.presentation.main.top;

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
public final class TopTabPresenter_Factory implements Factory<TopTabPresenter> {

    /* renamed from: a */
    public final Provider<FilterRepository> f27270a;

    public TopTabPresenter_Factory(Provider<FilterRepository> provider) {
        this.f27270a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new TopTabPresenter(this.f27270a.get());
    }
}
