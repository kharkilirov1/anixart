package com.swiftsoft.anixartd.presentation.main.release;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.repository.NotificationPreferenceRepository;
import com.swiftsoft.anixartd.repository.ReleaseCommentRepository;
import com.swiftsoft.anixartd.repository.ReleaseRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ReleasePresenter_Factory implements Factory<ReleasePresenter> {

    /* renamed from: a */
    public final Provider<AuthRepository> f26993a;

    /* renamed from: b */
    public final Provider<TypeRepository> f26994b;

    /* renamed from: c */
    public final Provider<ReleaseRepository> f26995c;

    /* renamed from: d */
    public final Provider<ReleaseCommentRepository> f26996d;

    /* renamed from: e */
    public final Provider<CollectionRepository> f26997e;

    /* renamed from: f */
    public final Provider<NotificationPreferenceRepository> f26998f;

    /* renamed from: g */
    public final Provider<Prefs> f26999g;

    public ReleasePresenter_Factory(Provider<AuthRepository> provider, Provider<TypeRepository> provider2, Provider<ReleaseRepository> provider3, Provider<ReleaseCommentRepository> provider4, Provider<CollectionRepository> provider5, Provider<NotificationPreferenceRepository> provider6, Provider<Prefs> provider7) {
        this.f26993a = provider;
        this.f26994b = provider2;
        this.f26995c = provider3;
        this.f26996d = provider4;
        this.f26997e = provider5;
        this.f26998f = provider6;
        this.f26999g = provider7;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ReleasePresenter(this.f26993a.get(), this.f26994b.get(), this.f26995c.get(), this.f26996d.get(), this.f26997e.get(), this.f26998f.get(), this.f26999g.get());
    }
}
