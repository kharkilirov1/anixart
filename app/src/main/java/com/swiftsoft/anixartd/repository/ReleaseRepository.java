package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.ReleaseApi;
import com.swiftsoft.anixartd.network.response.release.DeleteVoteReleaseResponse;
import com.swiftsoft.anixartd.network.response.release.VoteReleaseResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/ReleaseRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseRepository {

    /* renamed from: a */
    @NotNull
    public ReleaseApi f27382a;

    /* renamed from: b */
    @NotNull
    public Prefs f27383b;

    public ReleaseRepository(@NotNull ReleaseApi releaseApi, @NotNull Prefs prefs) {
        this.f27382a = releaseApi;
        this.f27383b = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<DeleteVoteReleaseResponse> m15313a(long j2) {
        return this.f27382a.deleteVote(j2, this.f27383b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: b */
    public final Observable<VoteReleaseResponse> m15314b(long j2, int i2) {
        return this.f27382a.vote(j2, i2, this.f27383b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
