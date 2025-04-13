package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.FavoriteApi;
import com.swiftsoft.anixartd.network.api.HistoryApi;
import com.swiftsoft.anixartd.network.api.ProfileListApi;
import com.swiftsoft.anixartd.network.api.ReleaseVideoFavoriteApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MainRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/MainRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MainRepository {

    /* renamed from: a */
    @NotNull
    public HistoryApi f27361a;

    /* renamed from: b */
    @NotNull
    public FavoriteApi f27362b;

    /* renamed from: c */
    @NotNull
    public ReleaseVideoFavoriteApi f27363c;

    /* renamed from: d */
    @NotNull
    public ProfileListApi f27364d;

    /* renamed from: e */
    @NotNull
    public Prefs f27365e;

    public MainRepository(@NotNull HistoryApi historyApi, @NotNull FavoriteApi favoriteApi, @NotNull ReleaseVideoFavoriteApi releaseVideoFavoriteApi, @NotNull ProfileListApi profileListApi, @NotNull Prefs prefs) {
        this.f27361a = historyApi;
        this.f27362b = favoriteApi;
        this.f27363c = releaseVideoFavoriteApi;
        this.f27364d = profileListApi;
        this.f27365e = prefs;
    }
}
