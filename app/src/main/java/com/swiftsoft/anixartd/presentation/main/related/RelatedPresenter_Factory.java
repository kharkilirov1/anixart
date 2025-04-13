package com.swiftsoft.anixartd.presentation.main.related;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.RelatedRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class RelatedPresenter_Factory implements Factory<RelatedPresenter> {

    /* renamed from: a */
    public final Provider<RelatedRepository> f26934a;

    /* renamed from: b */
    public final Provider<Prefs> f26935b;

    public RelatedPresenter_Factory(Provider<RelatedRepository> provider, Provider<Prefs> provider2) {
        this.f26934a = provider;
        this.f26935b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new RelatedPresenter(this.f26934a.get(), this.f26935b.get());
    }
}
