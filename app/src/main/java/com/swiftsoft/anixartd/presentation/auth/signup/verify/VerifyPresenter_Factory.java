package com.swiftsoft.anixartd.presentation.auth.signup.verify;

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
public final class VerifyPresenter_Factory implements Factory<VerifyPresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f25911a;

    public VerifyPresenter_Factory(Provider<AuthRepository> provider) {
        this.f25911a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new VerifyPresenter(this.f25911a.get());
    }
}
