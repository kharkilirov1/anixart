package com.swiftsoft.anixartd.presentation.main.bookmarks;

import com.swiftsoft.anixartd.Prefs;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class BookmarksPresenter_Factory implements Factory<BookmarksPresenter> {

    /* renamed from: a */
    public final Provider<Prefs> f26025a;

    public BookmarksPresenter_Factory(Provider<Prefs> provider) {
        this.f26025a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new BookmarksPresenter(this.f26025a.get());
    }
}
