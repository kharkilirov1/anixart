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
public final class ProfileSocialPresenter_Factory implements Factory<ProfileSocialPresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f26681a;

    /* renamed from: b */
    public final Provider<ProfilePreferenceRepository> f26682b;

    /* renamed from: c */
    public final Provider<Prefs> f26683c;

    public ProfileSocialPresenter_Factory(Provider<AuthRepository> provider, Provider<ProfilePreferenceRepository> provider2, Provider<Prefs> provider3) {
        this.f26681a = provider;
        this.f26682b = provider2;
        this.f26683c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileSocialPresenter(this.f26681a.get(), this.f26682b.get(), this.f26683c.get());
    }
}
