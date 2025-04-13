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
public final class CollectionListPresenter_Factory implements Factory<CollectionListPresenter> {

    /* renamed from: a */
    public final Provider<CollectionRepository> f26210a;

    /* renamed from: b */
    public final Provider<Prefs> f26211b;

    public CollectionListPresenter_Factory(Provider<CollectionRepository> provider, Provider<Prefs> provider2) {
        this.f26210a = provider;
        this.f26211b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CollectionListPresenter(this.f26210a.get(), this.f26211b.get());
    }
}
