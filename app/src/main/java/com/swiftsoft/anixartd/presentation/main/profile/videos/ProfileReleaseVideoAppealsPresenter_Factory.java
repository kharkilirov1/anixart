package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ReleaseVideoAppealRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ProfileReleaseVideoAppealsPresenter_Factory implements Factory<ProfileReleaseVideoAppealsPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseVideoAppealRepository> f26824a;

    /* renamed from: b */
    public final Provider<Prefs> f26825b;

    public ProfileReleaseVideoAppealsPresenter_Factory(Provider<ReleaseVideoAppealRepository> provider, Provider<Prefs> provider2) {
        this.f26824a = provider;
        this.f26825b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileReleaseVideoAppealsPresenter(this.f26824a.get(), this.f26825b.get());
    }
}
