package com.swiftsoft.anixartd.presentation.main.profile.vote;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ProfileReleaseVoteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ProfileReleaseVotePresenter_Factory implements Factory<ProfileReleaseVotePresenter> {

    /* renamed from: a */
    public final Provider<ProfileReleaseVoteRepository> f26905a;

    /* renamed from: b */
    public final Provider<Prefs> f26906b;

    public ProfileReleaseVotePresenter_Factory(Provider<ProfileReleaseVoteRepository> provider, Provider<Prefs> provider2) {
        this.f26905a = provider;
        this.f26906b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileReleaseVotePresenter(this.f26905a.get(), this.f26906b.get());
    }
}
