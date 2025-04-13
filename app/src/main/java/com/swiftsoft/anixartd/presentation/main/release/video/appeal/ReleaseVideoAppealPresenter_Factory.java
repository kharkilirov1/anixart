package com.swiftsoft.anixartd.presentation.main.release.video.appeal;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ReleaseVideoAppealRepository;
import com.swiftsoft.anixartd.repository.ReleaseVideoRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ReleaseVideoAppealPresenter_Factory implements Factory<ReleaseVideoAppealPresenter> {

    /* renamed from: a */
    public final Provider<ReleaseVideoRepository> f27161a;

    /* renamed from: b */
    public final Provider<ReleaseVideoAppealRepository> f27162b;

    /* renamed from: c */
    public final Provider<Prefs> f27163c;

    public ReleaseVideoAppealPresenter_Factory(Provider<ReleaseVideoRepository> provider, Provider<ReleaseVideoAppealRepository> provider2, Provider<Prefs> provider3) {
        this.f27161a = provider;
        this.f27162b = provider2;
        this.f27163c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleaseVideoAppealPresenter(this.f27161a.get(), this.f27162b.get(), this.f27163c.get());
    }
}
