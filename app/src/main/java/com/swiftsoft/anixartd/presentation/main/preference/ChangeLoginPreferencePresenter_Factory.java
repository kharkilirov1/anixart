package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
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
public final class ChangeLoginPreferencePresenter_Factory implements Factory<ChangeLoginPreferencePresenter> {

    /* renamed from: a */
    public final Provider<ProfilePreferenceRepository> f26521a;

    /* renamed from: b */
    public final Provider<AuthRepository> f26522b;

    /* renamed from: c */
    public final Provider<ProfileRepository> f26523c;

    /* renamed from: d */
    public final Provider<Prefs> f26524d;

    public ChangeLoginPreferencePresenter_Factory(Provider<ProfilePreferenceRepository> provider, Provider<AuthRepository> provider2, Provider<ProfileRepository> provider3, Provider<Prefs> provider4) {
        this.f26521a = provider;
        this.f26522b = provider2;
        this.f26523c = provider3;
        this.f26524d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ChangeLoginPreferencePresenter(this.f26521a.get(), this.f26522b.get(), this.f26523c.get(), this.f26524d.get());
    }
}
