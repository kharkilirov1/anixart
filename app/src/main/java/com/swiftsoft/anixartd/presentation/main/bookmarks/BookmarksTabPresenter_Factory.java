package com.swiftsoft.anixartd.presentation.main.bookmarks;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.repository.BookmarksRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class BookmarksTabPresenter_Factory implements Factory<BookmarksTabPresenter> {

    /* renamed from: a */
    public final Provider<BookmarksRepository> f26057a;

    /* renamed from: b */
    public final Provider<CollectionRepository> f26058b;

    /* renamed from: c */
    public final Provider<Prefs> f26059c;

    public BookmarksTabPresenter_Factory(Provider<BookmarksRepository> provider, Provider<CollectionRepository> provider2, Provider<Prefs> provider3) {
        this.f26057a = provider;
        this.f26058b = provider2;
        this.f26059c = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new BookmarksTabPresenter(this.f26057a.get(), this.f26058b.get(), this.f26059c.get());
    }
}
