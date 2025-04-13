package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.api.CollectionApi;
import com.swiftsoft.anixartd.network.api.CollectionFavoriteApi;
import com.swiftsoft.anixartd.network.api.CollectionMyApi;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.CollectionResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/CollectionRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionRepository {

    /* renamed from: a */
    @NotNull
    public CollectionApi f27336a;

    /* renamed from: b */
    @NotNull
    public CollectionMyApi f27337b;

    /* renamed from: c */
    @NotNull
    public CollectionFavoriteApi f27338c;

    /* renamed from: d */
    @NotNull
    public Prefs f27339d;

    public CollectionRepository(@NotNull CollectionApi collectionApi, @NotNull CollectionMyApi collectionMyApi, @NotNull CollectionFavoriteApi collectionFavoriteApi, @NotNull Prefs prefs) {
        this.f27336a = collectionApi;
        this.f27337b = collectionMyApi;
        this.f27338c = collectionFavoriteApi;
        this.f27339d = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<CollectionResponse> m15284a(long j2) {
        return this.f27336a.collection(j2, this.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: b */
    public final Observable<PageableResponse<Collection>> m15285b(int i2, int i3, int i4, int i5) {
        return this.f27336a.collections(i2, i3, i4, i5, this.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: c */
    public final Observable<PageableResponse<Release>> m15286c(long j2, int i2) {
        return this.f27336a.releases(j2, i2, this.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
