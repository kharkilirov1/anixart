package com.swiftsoft.anixartd.presentation.auth.restore;

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
public final class RestorePresenter_Factory implements Factory<RestorePresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f25843a;

    public RestorePresenter_Factory(Provider<AuthRepository> provider) {
        this.f25843a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new RestorePresenter(this.f25843a.get());
    }
}
