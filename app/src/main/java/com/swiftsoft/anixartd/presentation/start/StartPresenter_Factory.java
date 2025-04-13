package com.swiftsoft.anixartd.presentation.start;

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
public final class StartPresenter_Factory implements Factory<StartPresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f27324a;

    public StartPresenter_Factory(Provider<AuthRepository> provider) {
        this.f27324a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new StartPresenter(this.f27324a.get());
    }
}
