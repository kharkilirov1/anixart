package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ProfileReleaseNotificationPreferencesPresenter_Factory implements Factory<ProfileReleaseNotificationPreferencesPresenter> {

    /* renamed from: a */
    public final Provider<TypeRepository> f26561a;

    /* renamed from: b */
    public final Provider<NotificationPreferenceRepository> f26562b;

    /* renamed from: c */
    public final Provider<Prefs> f26563c;

    public ProfileReleaseNotificationPreferencesPresenter_Factory(Provider<TypeRepository> provider, Provider<NotificationPreferenceRepository> provider2, Provider<Prefs> provider3) {
        this.f26561a = provider;
        this.f26562b = provider2;
        this.f26563c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileReleaseNotificationPreferencesPresenter(this.f26561a.get(), this.f26562b.get(), this.f26563c.get());
    }
}
