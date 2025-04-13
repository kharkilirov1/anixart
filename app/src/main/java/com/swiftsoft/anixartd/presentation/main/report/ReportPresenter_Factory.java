package com.swiftsoft.anixartd.presentation.main.report;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ReportRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ReportPresenter_Factory implements Factory<ReportPresenter> {

    /* renamed from: a */
    public final Provider<ReportRepository> f27188a;

    /* renamed from: b */
    public final Provider<Prefs> f27189b;

    public ReportPresenter_Factory(Provider<ReportRepository> provider, Provider<Prefs> provider2) {
        this.f27188a = provider;
        this.f27189b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReportPresenter(this.f27188a.get(), this.f27189b.get());
    }
}
