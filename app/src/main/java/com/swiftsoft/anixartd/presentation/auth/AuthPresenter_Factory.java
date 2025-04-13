package com.swiftsoft.anixartd.presentation.auth;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.ConfigRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class AuthPresenter_Factory implements Factory<AuthPresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f25824a;

    /* renamed from: b */
    public final Provider<ConfigRepository> f25825b;

    /* renamed from: c */
    public final Provider<Prefs> f25826c;

    public AuthPresenter_Factory(Provider<AuthRepository> provider, Provider<ConfigRepository> provider2, Provider<Prefs> provider3) {
        this.f25824a = provider;
        this.f25825b = provider2;
        this.f25826c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new AuthPresenter(this.f25824a.get(), this.f25825b.get(), this.f25826c.get());
    }
}
