package com.swiftsoft.anixartd.presentation.auth.signin;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SignInPresenter_Factory implements Factory<SignInPresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f25870a;

    /* renamed from: b */
    public final Provider<Prefs> f25871b;

    public SignInPresenter_Factory(Provider<AuthRepository> provider, Provider<Prefs> provider2) {
        this.f25870a = provider;
        this.f25871b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SignInPresenter(this.f25870a.get(), this.f25871b.get());
    }
}
