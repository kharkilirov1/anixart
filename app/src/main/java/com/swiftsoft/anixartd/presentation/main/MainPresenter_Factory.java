package com.swiftsoft.anixartd.presentation.main;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.repository.ConfigRepository;
import com.swiftsoft.anixartd.repository.MainRepository;
import com.swiftsoft.anixartd.repository.NotificationRepository;
import com.swiftsoft.anixartd.repository.ProfilePreferenceRepository;
import com.swiftsoft.anixartd.repository.ProfileRepository;
import com.swiftsoft.anixartd.repository.ReleaseRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MainPresenter_Factory implements Factory<MainPresenter> {

    /* renamed from: a */
    public final Provider<ConfigRepository> f26012a;

    /* renamed from: b */
    public final Provider<AuthRepository> f26013b;

    /* renamed from: c */
    public final Provider<MainRepository> f26014c;

    /* renamed from: d */
    public final Provider<ReleaseRepository> f26015d;

    /* renamed from: e */
    public final Provider<ProfileRepository> f26016e;

    /* renamed from: f */
    public final Provider<ProfilePreferenceRepository> f26017f;

    /* renamed from: g */
    public final Provider<CollectionRepository> f26018g;

    /* renamed from: h */
    public final Provider<NotificationRepository> f26019h;

    /* renamed from: i */
    public final Provider<Prefs> f26020i;

    public MainPresenter_Factory(Provider<ConfigRepository> provider, Provider<AuthRepository> provider2, Provider<MainRepository> provider3, Provider<ReleaseRepository> provider4, Provider<ProfileRepository> provider5, Provider<ProfilePreferenceRepository> provider6, Provider<CollectionRepository> provider7, Provider<NotificationRepository> provider8, Provider<Prefs> provider9) {
        this.f26012a = provider;
        this.f26013b = provider2;
        this.f26014c = provider3;
        this.f26015d = provider4;
        this.f26016e = provider5;
        this.f26017f = provider6;
        this.f26018g = provider7;
        this.f26019h = provider8;
        this.f26020i = provider9;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new MainPresenter(this.f26012a.get(), this.f26013b.get(), this.f26014c.get(), this.f26015d.get(), this.f26016e.get(), this.f26017f.get(), this.f26018g.get(), this.f26019h.get(), this.f26020i.get());
    }
}
