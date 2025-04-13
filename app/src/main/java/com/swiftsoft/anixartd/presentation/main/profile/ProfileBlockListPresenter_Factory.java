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
public final class ProfileBlockListPresenter_Factory implements Factory<ProfileBlockListPresenter> {

    /* renamed from: a */
    public final Provider<ProfileRepository> f26580a;

    /* renamed from: b */
    public final Provider<Prefs> f26581b;

    public ProfileBlockListPresenter_Factory(Provider<ProfileRepository> provider, Provider<Prefs> provider2) {
        this.f26580a = provider;
        this.f26581b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileBlockListPresenter(this.f26580a.get(), this.f26581b.get());
    }
}
