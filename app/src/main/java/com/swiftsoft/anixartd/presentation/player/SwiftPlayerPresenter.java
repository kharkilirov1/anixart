package com.swiftsoft.anixartd.presentation.player;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.network.response.HistoryResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeTargetResponse;
import com.swiftsoft.anixartd.network.response.release.episode.EpisodeWatchResponse;
import com.swiftsoft.anixartd.p015ui.logic.player.PlayerUiLogic;
import com.swiftsoft.anixartd.parser.Parser;
import com.swiftsoft.anixartd.presentation.main.episodes.CallableC2570d;
import com.swiftsoft.anixartd.presentation.main.search.C2622b;
import com.swiftsoft.anixartd.repository.EpisodeRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchEpisode;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableDefer;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwiftPlayerPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/player/SwiftPlayerPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/player/SwiftPlayerView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SwiftPlayerPresenter extends MvpPresenter<SwiftPlayerView> {

    /* renamed from: a */
    @NotNull
    public EpisodeRepository f27298a;

    /* renamed from: b */
    @NotNull
    public Prefs f27299b;

    /* renamed from: c */
    @NotNull
    public PlayerUiLogic f27300c;

    @Inject
    public SwiftPlayerPresenter(@NotNull EpisodeRepository episodeRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(episodeRepository, "episodeRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27298a = episodeRepository;
        this.f27299b = prefs;
        this.f27300c = new PlayerUiLogic();
    }

    /* renamed from: a */
    public final void m15263a(final Episode episode) {
        final Release release = episode.getRelease();
        Source source = episode.getSource();
        long id2 = source != null ? source.getId() : episode.getSourceId();
        if (release != null) {
            if (!this.f27299b.m14083z()) {
                Observable<HistoryResponse> m15290a = this.f27298a.m15290a(release.getId(), id2, episode.getPosition());
                C2622b c2622b = new C2622b(new Function1<HistoryResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onEpisode$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(HistoryResponse historyResponse) {
                        if (historyResponse.isSuccess()) {
                            Release.this.setViewed(true);
                            Release.this.setLastViewEpisode(episode);
                            Release.this.setLastViewTimestamp(System.currentTimeMillis() / 1000);
                            EventBusKt.m16327a(new OnFetchRelease(this.f27300c.m15711a()));
                        }
                        return Unit.f63088a;
                    }
                }, 16);
                C2622b c2622b2 = new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onEpisode$2
                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        return Unit.f63088a;
                    }
                }, 17);
                Action action = Functions.f59621b;
                Consumer<? super Disposable> consumer = Functions.f59622c;
                m15290a.m31370l(c2622b, c2622b2, action, consumer);
                this.f27298a.m15294e(release.getId(), id2, episode.getPosition()).m31370l(new C2622b(new Function1<EpisodeWatchResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onEpisode$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(EpisodeWatchResponse episodeWatchResponse) {
                        return Unit.f63088a;
                    }
                }, 18), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onEpisode$4
                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        return Unit.f63088a;
                    }
                }, 19), action, consumer);
            }
            long j2 = id2;
            final Episode m15293d = this.f27298a.m15293d(this.f27300c.m15711a().getId(), j2, episode, true);
            EventBusKt.m16327a(new OnFetchEpisode(m15293d));
            this.f27298a.m15291b(this.f27300c.m15711a().getId(), j2, episode.getPosition()).m31370l(new C2622b(new Function1<EpisodeTargetResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onEpisode$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(EpisodeTargetResponse episodeTargetResponse) {
                    final SwiftPlayerPresenter swiftPlayerPresenter = SwiftPlayerPresenter.this;
                    final Episode episode2 = episodeTargetResponse.getEpisode();
                    if (episode2 == null) {
                        episode2 = m15293d;
                    }
                    Objects.requireNonNull(swiftPlayerPresenter);
                    new ObservableDefer(new CallableC2570d(episode2, 2)).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2622b(new Function1<Parser, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onParsing$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public kotlin.Unit invoke(com.swiftsoft.anixartd.parser.Parser r20) {
                            /*
                                Method dump skipped, instructions count: 232
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onParsing$2.invoke(java.lang.Object):java.lang.Object");
                        }
                    }, 22), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onParsing$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            SwiftPlayerPresenter.this.getViewState().mo15271h4();
                            return Unit.f63088a;
                        }
                    }, 23), Functions.f59621b, Functions.f59622c);
                    return Unit.f63088a;
                }
            }, 20), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.player.SwiftPlayerPresenter$onEpisode$6
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    return Unit.f63088a;
                }
            }, 21), Functions.f59621b, Functions.f59622c);
        }
    }

    /* renamed from: b */
    public final void m15264b() {
        getViewState().mo15270b();
        PlayerUiLogic playerUiLogic = this.f27300c;
        int i2 = playerUiLogic.f29377e;
        if (i2 == 1) {
            playerUiLogic.f29376d++;
        } else if (i2 == 2) {
            playerUiLogic.f29376d--;
        }
        if (playerUiLogic.f29376d < 0) {
            playerUiLogic.f29376d = 0;
        }
        int size = playerUiLogic.f29376d % playerUiLogic.f29375c.size();
        playerUiLogic.f29376d = size;
        Episode episode = playerUiLogic.f29375c.get(size);
        if (episode != null) {
            m15263a(episode);
        }
    }

    /* renamed from: c */
    public final void m15265c() {
        getViewState().mo15270b();
        PlayerUiLogic playerUiLogic = this.f27300c;
        int i2 = playerUiLogic.f29377e;
        if (i2 == 1) {
            playerUiLogic.f29376d--;
        } else if (i2 == 2) {
            playerUiLogic.f29376d++;
        }
        if (playerUiLogic.f29376d < 0) {
            playerUiLogic.f29376d = 0;
        }
        int size = playerUiLogic.f29376d % playerUiLogic.f29375c.size();
        playerUiLogic.f29376d = size;
        Episode episode = playerUiLogic.f29375c.get(size);
        if (episode != null) {
            m15263a(episode);
        }
    }

    /* renamed from: d */
    public final void m15266d(long j2, long j3) {
        PlayerUiLogic playerUiLogic = this.f27300c;
        Episode episode = playerUiLogic.f29375c.get(playerUiLogic.f29376d);
        Source source = episode.getSource();
        long id2 = source != null ? source.getId() : episode.getSourceId();
        if (5000 + j3 >= j2) {
            j3 = -1;
        }
        EpisodeRepository episodeRepository = this.f27298a;
        long id3 = this.f27300c.m15711a().getId();
        Objects.requireNonNull(episodeRepository);
        Episode findByReleaseIdAndSourceIdAndPosition = episodeRepository.f27350e.findByReleaseIdAndSourceIdAndPosition(id3, id2, episode.getPosition());
        if (findByReleaseIdAndSourceIdAndPosition != null) {
            findByReleaseIdAndSourceIdAndPosition.setPlaybackPosition(j3);
            episodeRepository.f27350e.update(findByReleaseIdAndSourceIdAndPosition);
            episode = findByReleaseIdAndSourceIdAndPosition;
        } else {
            episode.setPlaybackPosition(j3);
            episodeRepository.f27350e.save(episode);
        }
        EventBusKt.m16327a(new OnFetchEpisode(episode));
    }
}
