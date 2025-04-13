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
public final class ProfileChangeLoginHistoryPresenter_Factory implements Factory<ProfileChangeLoginHistoryPresenter> {

    /* renamed from: a */
    public final Provider<ProfileRepository> f26591a;

    /* renamed from: b */
    public final Provider<Prefs> f26592b;

    public ProfileChangeLoginHistoryPresenter_Factory(Provider<ProfileRepository> provider, Provider<Prefs> provider2) {
        this.f26591a = provider;
        this.f26592b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileChangeLoginHistoryPresenter(this.f26591a.get(), this.f26592b.get());
    }
}
