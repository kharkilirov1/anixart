package com.swiftsoft.anixartd.presentation.main.profile.friends;

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
public final class ProfileFriendsPresenter_Factory implements Factory<ProfileFriendsPresenter> {

    /* renamed from: a */
    public final Provider<ProfileRepository> f26769a;

    /* renamed from: b */
    public final Provider<Prefs> f26770b;

    public ProfileFriendsPresenter_Factory(Provider<ProfileRepository> provider, Provider<Prefs> provider2) {
        this.f26769a = provider;
        this.f26770b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileFriendsPresenter(this.f26769a.get(), this.f26770b.get());
    }
}
