package com.swiftsoft.anixartd.presentation.main.profile.videos;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ReleaseVideoAppealRepository;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ProfileReleaseVideosTabPresenter_Factory implements Factory<ProfileReleaseVideosTabPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseVideoRepository> f26856a;

    /* renamed from: b */
    public final Provider<ReleaseVideoAppealRepository> f26857b;

    /* renamed from: c */
    public final Provider<Prefs> f26858c;

    public ProfileReleaseVideosTabPresenter_Factory(Provider<ReleaseVideoRepository> provider, Provider<ReleaseVideoAppealRepository> provider2, Provider<Prefs> provider3) {
        this.f26856a = provider;
        this.f26857b = provider2;
        this.f26858c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileReleaseVideosTabPresenter(this.f26856a.get(), this.f26857b.get(), this.f26858c.get());
    }
}
