package com.swiftsoft.anixartd.presentation.main.collection;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
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
public final class CollectionPresenter_Factory implements Factory<CollectionPresenter> {

    /* renamed from: a */
    public final Provider<CollectionRepository> f26086a;

    /* renamed from: b */
    public final Provider<AuthRepository> f26087b;

    /* renamed from: c */
    public final Provider<Prefs> f26088c;

    public CollectionPresenter_Factory(Provider<CollectionRepository> provider, Provider<AuthRepository> provider2, Provider<Prefs> provider3) {
        this.f26086a = provider;
        this.f26087b = provider2;
        this.f26088c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CollectionPresenter(this.f26086a.get(), this.f26087b.get(), this.f26088c.get());
    }
}
