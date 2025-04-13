package com.swiftsoft.anixartd.presentation.auth.signup.p014vk;

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
public final class SignUpWithVkPresenter_Factory implements Factory<SignUpWithVkPresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f25925a;

    /* renamed from: b */
    public final Provider<Prefs> f25926b;

    public SignUpWithVkPresenter_Factory(Provider<AuthRepository> provider, Provider<Prefs> provider2) {
        this.f25925a = provider;
        this.f25926b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SignUpWithVkPresenter(this.f25925a.get(), this.f25926b.get());
    }
}
