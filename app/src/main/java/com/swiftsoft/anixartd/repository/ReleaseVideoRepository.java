package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.ReleaseVideoApi;
import com.swiftsoft.anixartd.network.api.ReleaseVideoFavoriteApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/ReleaseVideoRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideoRepository {

    /* renamed from: a */
    @NotNull
    public ReleaseVideoApi f27387a;

    /* renamed from: b */
    @NotNull
    public ReleaseVideoFavoriteApi f27388b;

    /* renamed from: c */
    @NotNull
    public Prefs f27389c;

    public ReleaseVideoRepository(@NotNull ReleaseVideoApi releaseVideoApi, @NotNull ReleaseVideoFavoriteApi releaseVideoFavoriteApi, @NotNull Prefs prefs) {
        this.f27387a = releaseVideoApi;
        this.f27388b = releaseVideoFavoriteApi;
        this.f27389c = prefs;
    }
}
