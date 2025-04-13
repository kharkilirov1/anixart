package com.swiftsoft.anixartd.presentation.main.notifications;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.NotificationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class NotificationsPresenter_Factory implements Factory<NotificationsPresenter> {

    /* renamed from: a */
    public final Provider<NotificationPreferenceRepository> f26491a;

    /* renamed from: b */
    public final Provider<NotificationRepository> f26492b;

    /* renamed from: c */
    public final Provider<Prefs> f26493c;

    public NotificationsPresenter_Factory(Provider<NotificationPreferenceRepository> provider, Provider<NotificationRepository> provider2, Provider<Prefs> provider3) {
        this.f26491a = provider;
        this.f26492b = provider2;
        this.f26493c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new NotificationsPresenter(this.f26491a.get(), this.f26492b.get(), this.f26493c.get());
    }
}
