package com.swiftsoft.anixartd.presentation.main.profile.lists;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.BookmarksRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ProfileListsTabPresenter_Factory implements Factory<ProfileListsTabPresenter> {

    /* renamed from: a */
    public final Provider<BookmarksRepository> f26804a;

    /* renamed from: b */
    public final Provider<Prefs> f26805b;

    public ProfileListsTabPresenter_Factory(Provider<BookmarksRepository> provider, Provider<Prefs> provider2) {
        this.f26804a = provider;
        this.f26805b = provider2;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new ProfileListsTabPresenter(this.f26804a.get(), this.f26805b.get());
    }
}
