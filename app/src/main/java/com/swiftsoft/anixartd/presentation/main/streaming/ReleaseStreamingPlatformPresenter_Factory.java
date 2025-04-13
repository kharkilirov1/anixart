package com.swiftsoft.anixartd.presentation.main.streaming;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ReleaseStreamingPlatformRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ReleaseStreamingPlatformPresenter_Factory implements Factory<ReleaseStreamingPlatformPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseStreamingPlatformRepository> f27255a;

    /* renamed from: b */
    public final Provider<Prefs> f27256b;

    public ReleaseStreamingPlatformPresenter_Factory(Provider<ReleaseStreamingPlatformRepository> provider, Provider<Prefs> provider2) {
        this.f27255a = provider;
        this.f27256b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseStreamingPlatformPresenter(this.f27255a.get(), this.f27256b.get());
    }
}
