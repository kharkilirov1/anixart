package com.swiftsoft.anixartd.presentation.main.preference;

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
public final class MainPreferencePresenter_Factory implements Factory<MainPreferencePresenter> {

    /* renamed from: a */
    public final Provider<Prefs> f26544a;

    public MainPreferencePresenter_Factory(Provider<Prefs> provider) {
        this.f26544a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new MainPreferencePresenter(this.f26544a.get());
    }
}
