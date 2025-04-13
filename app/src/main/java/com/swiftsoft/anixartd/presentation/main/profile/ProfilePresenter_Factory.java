package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ProfilePresenter_Factory implements Factory<ProfilePresenter> {

    /* renamed from: a */
    public final Provider<ProfileRepository> f26665a;

    /* renamed from: b */
    public final Provider<Prefs> f26666b;

    public ProfilePresenter_Factory(Provider<ProfileRepository> provider, Provider<Prefs> provider2) {
        this.f26665a = provider;
        this.f26666b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfilePresenter(this.f26665a.get(), this.f26666b.get());
    }
}
