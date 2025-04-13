package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.FavoriteApi;
import com.swiftsoft.anixartd.network.api.HistoryApi;
import com.swiftsoft.anixartd.network.api.ProfileListApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BookmarksRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/BookmarksRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarksRepository {

    /* renamed from: a */
    @NotNull
    public HistoryApi f27330a;

    /* renamed from: b */
    @NotNull
    public FavoriteApi f27331b;

    /* renamed from: c */
    @NotNull
    public ProfileListApi f27332c;

    /* renamed from: d */
    @NotNull
    public Prefs f27333d;

    public BookmarksRepository(@NotNull HistoryApi historyApi, @NotNull FavoriteApi favoriteApi, @NotNull ProfileListApi profileListApi, @NotNull Prefs prefs) {
        this.f27330a = historyApi;
        this.f27331b = favoriteApi;
        this.f27332c = profileListApi;
        this.f27333d = prefs;
    }
}
