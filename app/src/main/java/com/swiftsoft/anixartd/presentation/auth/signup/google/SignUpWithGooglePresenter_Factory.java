package com.swiftsoft.anixartd.presentation.auth.signup.google;

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
public final class SignUpWithGooglePresenter_Factory implements Factory<SignUpWithGooglePresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f25895a;

    /* renamed from: b */
    public final Provider<Prefs> f25896b;

    public SignUpWithGooglePresenter_Factory(Provider<AuthRepository> provider, Provider<Prefs> provider2) {
        this.f25895a = provider;
        this.f25896b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SignUpWithGooglePresenter(this.f25895a.get(), this.f25896b.get());
    }
}
