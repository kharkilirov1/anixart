package com.swiftsoft.anixartd.presentation.main.profile;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ProfilePreferencePresenter_Factory implements Factory<ProfilePreferencePresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f26623a;

    /* renamed from: b */
    public final Provider<ProfilePreferenceRepository> f26624b;

    /* renamed from: c */
    public final Provider<Prefs> f26625c;

    public ProfilePreferencePresenter_Factory(Provider<AuthRepository> provider, Provider<ProfilePreferenceRepository> provider2, Provider<Prefs> provider3) {
        this.f26623a = provider;
        this.f26624b = provider2;
        this.f26625c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfilePreferencePresenter(this.f26623a.get(), this.f26624b.get(), this.f26625c.get());
    }
}
