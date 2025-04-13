package com.swiftsoft.anixartd.presentation.main.genres;

import com.swiftsoft.anixartd.Prefs;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ChooseGenresPresenter_Factory implements Factory<ChooseGenresPresenter> {

    /* renamed from: a */
    public final Provider<Prefs> f26407a;

    public ChooseGenresPresenter_Factory(Provider<Prefs> provider) {
        this.f26407a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ChooseGenresPresenter(this.f26407a.get());
    }
}
