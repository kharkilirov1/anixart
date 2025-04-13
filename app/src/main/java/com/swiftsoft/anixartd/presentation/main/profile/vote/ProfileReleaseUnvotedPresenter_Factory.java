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
public final class ProfileReleaseUnvotedPresenter_Factory implements Factory<ProfileReleaseUnvotedPresenter> {

    /* renamed from: a */
    public final Provider<ProfileReleaseVoteRepository> f26886a;

    /* renamed from: b */
    public final Provider<Prefs> f26887b;

    public ProfileReleaseUnvotedPresenter_Factory(Provider<ProfileReleaseVoteRepository> provider, Provider<Prefs> provider2) {
        this.f26886a = provider;
        this.f26887b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileReleaseUnvotedPresenter(this.f26886a.get(), this.f26887b.get());
    }
}
