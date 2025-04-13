package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.api.DiscoverApi;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DiscoverRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/DiscoverRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DiscoverRepository {

    /* renamed from: a */
    @NotNull
    public DiscoverApi f27344a;

    /* renamed from: b */
    @NotNull
    public Prefs f27345b;

    public DiscoverRepository(@NotNull DiscoverApi discoverApi, @NotNull Prefs prefs) {
        this.f27344a = discoverApi;
        this.f27345b = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<PageableResponse<Release>> m15288a(int i2, int i3) {
        return this.f27344a.recommendations(i2, i3, this.f27345b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: b */
    public final Observable<PageableResponse<Release>> m15289b(int i2) {
        return this.f27344a.watching(i2, this.f27345b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
