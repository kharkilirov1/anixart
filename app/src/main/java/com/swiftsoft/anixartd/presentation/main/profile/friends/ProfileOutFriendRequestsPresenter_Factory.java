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
public final class ProfileOutFriendRequestsPresenter_Factory implements Factory<ProfileOutFriendRequestsPresenter> {

    /* renamed from: a */
    public final Provider<ProfileRepository> f26784a;

    /* renamed from: b */
    public final Provider<Prefs> f26785b;

    public ProfileOutFriendRequestsPresenter_Factory(Provider<ProfileRepository> provider, Provider<Prefs> provider2) {
        this.f26784a = provider;
        this.f26785b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileOutFriendRequestsPresenter(this.f26784a.get(), this.f26785b.get());
    }
}
