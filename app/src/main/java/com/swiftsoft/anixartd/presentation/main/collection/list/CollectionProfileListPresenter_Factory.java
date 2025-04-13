package com.swiftsoft.anixartd.presentation.main.collection.list;

import com.swiftsoft.anixartd.Prefs;
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
public final class CollectionProfileListPresenter_Factory implements Factory<CollectionProfileListPresenter> {

    /* renamed from: a */
    public final Provider<CollectionRepository> f26224a;

    /* renamed from: b */
    public final Provider<Prefs> f26225b;

    public CollectionProfileListPresenter_Factory(Provider<CollectionRepository> provider, Provider<Prefs> provider2) {
        this.f26224a = provider;
        this.f26225b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CollectionProfileListPresenter(this.f26224a.get(), this.f26225b.get());
    }
}
