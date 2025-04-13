package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.FilterApi;
import com.swiftsoft.anixartd.network.request.filter.FilterRequest;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FilterRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/FilterRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FilterRepository {

    /* renamed from: a */
    @NotNull
    public FilterApi f27354a;

    /* renamed from: b */
    @NotNull
    public Prefs f27355b;

    public FilterRepository(@NotNull FilterApi filterApi, @NotNull Prefs prefs) {
        this.f27354a = filterApi;
        this.f27355b = prefs;
    }

    /* renamed from: a */
    public static Observable m15295a(FilterRepository filterRepository, int i2, FilterRequest filterRequest, Boolean bool, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        Boolean bool2 = (i3 & 4) != 0 ? Boolean.TRUE : null;
        Objects.requireNonNull(filterRepository);
        return filterRepository.f27354a.filter(i2, filterRequest, bool2, filterRepository.f27355b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
