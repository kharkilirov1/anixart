package com.swiftsoft.anixartd.presentation.main.update;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ConfigRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class UpdatePresenter_Factory implements Factory<UpdatePresenter> {

    /* renamed from: a */
    public final Provider<ConfigRepository> f27277a;

    /* renamed from: b */
    public final Provider<Prefs> f27278b;

    public UpdatePresenter_Factory(Provider<ConfigRepository> provider, Provider<Prefs> provider2) {
        this.f27277a = provider;
        this.f27278b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new UpdatePresenter(this.f27277a.get(), this.f27278b.get());
    }
}
