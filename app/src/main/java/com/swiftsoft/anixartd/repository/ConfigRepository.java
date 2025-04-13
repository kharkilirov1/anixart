package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.BuildConfig;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.ConfigApi;
import com.swiftsoft.anixartd.network.response.TogglesResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConfigRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/ConfigRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ConfigRepository {

    /* renamed from: a */
    @NotNull
    public ConfigApi f27342a;

    /* renamed from: b */
    @NotNull
    public Prefs f27343b;

    public ConfigRepository(@NotNull ConfigApi configApi, @NotNull Prefs prefs) {
        this.f27342a = configApi;
        this.f27343b = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<TogglesResponse> m15287a() {
        ConfigApi configApi = this.f27342a;
        int i2 = BuildConfig.f25343a;
        Boolean IS_BETA = Boolean.FALSE;
        Intrinsics.m32178g(IS_BETA, "IS_BETA");
        return configApi.toggles(24111318, false, App.f25340b.m14044b().m14082y(), this.f27343b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
