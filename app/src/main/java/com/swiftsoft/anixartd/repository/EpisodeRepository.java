package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.dao.EpisodeDao;
import com.swiftsoft.anixartd.database.dao.LastWatchedEpisodeDao;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.network.api.DirectLinkApi;
import com.swiftsoft.anixartd.network.api.EpisodeApi;
import com.swiftsoft.anixartd.network.api.HistoryApi;
import com.swiftsoft.anixartd.network.response.HistoryResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeTargetResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeWatchResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpisodeRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/EpisodeRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EpisodeRepository {

    /* renamed from: a */
    @NotNull
    public HistoryApi f27346a;

    /* renamed from: b */
    @NotNull
    public EpisodeApi f27347b;

    /* renamed from: c */
    @NotNull
    public DirectLinkApi f27348c;

    /* renamed from: d */
    @NotNull
    public Prefs f27349d;

    /* renamed from: e */
    @NotNull
    public EpisodeDao f27350e;

    /* renamed from: f */
    @NotNull
    public LastWatchedEpisodeDao f27351f;

    public EpisodeRepository(@NotNull HistoryApi historyApi, @NotNull EpisodeApi episodeApi, @NotNull DirectLinkApi directLinkApi, @NotNull Prefs prefs, @NotNull EpisodeDao episodeDao, @NotNull LastWatchedEpisodeDao lastWatchedEpisodeDao) {
        this.f27346a = historyApi;
        this.f27347b = episodeApi;
        this.f27348c = directLinkApi;
        this.f27349d = prefs;
        this.f27350e = episodeDao;
        this.f27351f = lastWatchedEpisodeDao;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<HistoryResponse> m15290a(long j2, long j3, int i2) {
        return this.f27346a.add(j2, j3, i2, this.f27349d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: b */
    public final Observable<EpisodeTargetResponse> m15291b(long j2, long j3, int i2) {
        return this.f27347b.episodeTarget(j2, j3, i2).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @Nullable
    /* renamed from: c */
    public final Long m15292c(long j2, long j3, @NotNull Episode episode) {
        Intrinsics.m32179h(episode, "episode");
        Episode findByReleaseIdAndSourceIdAndPosition = this.f27350e.findByReleaseIdAndSourceIdAndPosition(j2, j3, episode.getPosition());
        if (findByReleaseIdAndSourceIdAndPosition != null) {
            return Long.valueOf(findByReleaseIdAndSourceIdAndPosition.getPlaybackPosition());
        }
        return null;
    }

    @NotNull
    /* renamed from: d */
    public final Episode m15293d(long j2, long j3, @NotNull Episode episode, boolean z) {
        Episode findByReleaseIdAndSourceIdAndPosition = this.f27350e.findByReleaseIdAndSourceIdAndPosition(j2, j3, episode.getPosition());
        if (findByReleaseIdAndSourceIdAndPosition != null) {
            findByReleaseIdAndSourceIdAndPosition.setWatched(z);
            if (!z) {
                findByReleaseIdAndSourceIdAndPosition.setPlaybackPosition(0L);
            }
            this.f27350e.update(findByReleaseIdAndSourceIdAndPosition);
            return findByReleaseIdAndSourceIdAndPosition;
        }
        Release release = episode.getRelease();
        episode.setReleaseId(release != null ? release.getId() : 0L);
        Source source = episode.getSource();
        episode.setSourceId(source != null ? source.getId() : 0L);
        episode.setWatched(z);
        this.f27350e.save(episode);
        return episode;
    }

    @NotNull
    /* renamed from: e */
    public final Observable<EpisodeWatchResponse> m15294e(long j2, long j3, int i2) {
        return this.f27347b.watch(j2, j3, i2, this.f27349d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
