package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.ExportRepository;
import com.swiftsoft.anixartd.repository.ImportRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class DataPreferencePresenter_Factory implements Factory<DataPreferencePresenter> {

    /* renamed from: a */
    public final Provider<ImportRepository> f26536a;

    /* renamed from: b */
    public final Provider<ExportRepository> f26537b;

    /* renamed from: c */
    public final Provider<Prefs> f26538c;

    public DataPreferencePresenter_Factory(Provider<ImportRepository> provider, Provider<ExportRepository> provider2, Provider<Prefs> provider3) {
        this.f26536a = provider;
        this.f26537b = provider2;
        this.f26538c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DataPreferencePresenter(this.f26536a.get(), this.f26537b.get(), this.f26538c.get());
    }
}
