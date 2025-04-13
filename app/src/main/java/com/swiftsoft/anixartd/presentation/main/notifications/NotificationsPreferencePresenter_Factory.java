package com.swiftsoft.anixartd.presentation.main.notifications;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
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
public final class NotificationsPreferencePresenter_Factory implements Factory<NotificationsPreferencePresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f26472a;

    /* renamed from: b */
    public final Provider<TypeRepository> f26473b;

    /* renamed from: c */
    public final Provider<NotificationPreferenceRepository> f26474c;

    /* renamed from: d */
    public final Provider<Prefs> f26475d;

    public NotificationsPreferencePresenter_Factory(Provider<AuthRepository> provider, Provider<TypeRepository> provider2, Provider<NotificationPreferenceRepository> provider3, Provider<Prefs> provider4) {
        this.f26472a = provider;
        this.f26473b = provider2;
        this.f26474c = provider3;
        this.f26475d = provider4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new NotificationsPreferencePresenter(this.f26472a.get(), this.f26473b.get(), this.f26474c.get(), this.f26475d.get());
    }
}
