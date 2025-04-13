package com.swiftsoft.anixartd.presentation.main.episodes.torlook;

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
public final class TorlookPresenter_Factory implements Factory<TorlookPresenter> {

    /* renamed from: a */
    public final Provider<Prefs> f26362a;

    public TorlookPresenter_Factory(Provider<Prefs> provider) {
        this.f26362a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new TorlookPresenter(this.f26362a.get());
    }
}
