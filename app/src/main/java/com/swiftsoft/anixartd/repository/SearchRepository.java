package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.dao.SearchDao;
import com.swiftsoft.anixartd.network.api.SearchApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SearchRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/SearchRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SearchRepository {

    /* renamed from: a */
    @NotNull
    public SearchApi f27393a;

    /* renamed from: b */
    @NotNull
    public Prefs f27394b;

    /* renamed from: c */
    @NotNull
    public SearchDao f27395c;

    public SearchRepository(@NotNull SearchApi searchApi, @NotNull Prefs prefs, @NotNull SearchDao searchDao) {
        this.f27393a = searchApi;
        this.f27394b = prefs;
        this.f27395c = searchDao;
    }
}
