package com.swiftsoft.anixartd.presentation.main.schedule;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ScheduleRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SchedulePresenter_Factory implements Factory<SchedulePresenter> {

    /* renamed from: a */
    public final Provider<ScheduleRepository> f27202a;

    /* renamed from: b */
    public final Provider<Prefs> f27203b;

    public SchedulePresenter_Factory(Provider<ScheduleRepository> provider, Provider<Prefs> provider2) {
        this.f27202a = provider;
        this.f27203b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SchedulePresenter(this.f27202a.get(), this.f27203b.get());
    }
}
