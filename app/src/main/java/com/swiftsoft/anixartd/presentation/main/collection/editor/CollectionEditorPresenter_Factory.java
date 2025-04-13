package com.swiftsoft.anixartd.presentation.main.collection.editor;

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
public final class CollectionEditorPresenter_Factory implements Factory<CollectionEditorPresenter> {

    /* renamed from: a */
    public final Provider<CollectionRepository> f26194a;

    /* renamed from: b */
    public final Provider<Prefs> f26195b;

    public CollectionEditorPresenter_Factory(Provider<CollectionRepository> provider, Provider<Prefs> provider2) {
        this.f26194a = provider;
        this.f26195b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new CollectionEditorPresenter(this.f26194a.get(), this.f26195b.get());
    }
}
