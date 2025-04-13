package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.dao.CustomFilterDao;
import com.swiftsoft.anixartd.database.entity.CustomFilter;
import com.swiftsoft.anixartd.network.api.FilterApi;
import com.swiftsoft.anixartd.network.request.filter.FilterRequest;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HomeRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/HomeRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class HomeRepository {

    /* renamed from: a */
    @NotNull
    public FilterApi f27356a;

    /* renamed from: b */
    @NotNull
    public CustomFilterDao f27357b;

    /* renamed from: c */
    @NotNull
    public Prefs f27358c;

    public HomeRepository(@NotNull FilterApi filterApi, @NotNull CustomFilterDao customFilterDao, @NotNull Prefs prefs) {
        this.f27356a = filterApi;
        this.f27357b = customFilterDao;
        this.f27358c = prefs;
    }

    /* renamed from: a */
    public static Observable m15296a(HomeRepository homeRepository, int i2, FilterRequest filterRequest, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            Boolean EXTENDED_MODE = Boolean.TRUE;
            Intrinsics.m32178g(EXTENDED_MODE, "EXTENDED_MODE");
            z = true;
        }
        Objects.requireNonNull(homeRepository);
        return homeRepository.f27356a.filter(i2, filterRequest, Boolean.valueOf(z), homeRepository.f27358c.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @Nullable
    /* renamed from: b */
    public final CustomFilter m15297b() {
        return this.f27357b.findFirst();
    }
}
