package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.ReleaseVideoAppealApi;
import com.swiftsoft.anixartd.network.response.release.video.appeal.ReleaseVideoAppealResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoAppealRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/ReleaseVideoAppealRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideoAppealRepository {

    /* renamed from: a */
    @NotNull
    public ReleaseVideoAppealApi f27385a;

    /* renamed from: b */
    @NotNull
    public Prefs f27386b;

    public ReleaseVideoAppealRepository(@NotNull ReleaseVideoAppealApi releaseVideoAppealApi, @NotNull Prefs prefs) {
        this.f27385a = releaseVideoAppealApi;
        this.f27386b = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<ReleaseVideoAppealResponse> m15315a(long j2) {
        return this.f27385a.delete(j2, this.f27386b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
