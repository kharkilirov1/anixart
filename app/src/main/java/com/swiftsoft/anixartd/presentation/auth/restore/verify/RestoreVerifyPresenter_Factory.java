package com.swiftsoft.anixartd.presentation.auth.restore.verify;

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
public final class RestoreVerifyPresenter_Factory implements Factory<RestoreVerifyPresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f25860a;

    public RestoreVerifyPresenter_Factory(Provider<AuthRepository> provider) {
        this.f25860a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new RestoreVerifyPresenter(this.f25860a.get());
    }
}
