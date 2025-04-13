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
public final class ProfileFriendRequestsPresenter_Factory implements Factory<ProfileFriendRequestsPresenter> {

    /* renamed from: a */
    public final Provider<ProfileRepository> f26742a;

    /* renamed from: b */
    public final Provider<Prefs> f26743b;

    public ProfileFriendRequestsPresenter_Factory(Provider<ProfileRepository> provider, Provider<Prefs> provider2) {
        this.f26742a = provider;
        this.f26743b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileFriendRequestsPresenter(this.f26742a.get(), this.f26743b.get());
    }
}
