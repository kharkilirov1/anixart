package com.swiftsoft.anixartd.presentation.main.episodes.updates;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.EpisodeUpdate;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.episodes.updates.EpisodesUpdatesUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.episodes.updates.EpisodesUpdatesUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.episodes.C2569c;
import com.swiftsoft.anixartd.repository.EpisodeRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: EpisodesUpdatesPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/episodes/updates/EpisodesUpdatesPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/episodes/updates/EpisodesUpdatesView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EpisodesUpdatesPresenter extends MvpPresenter<EpisodesUpdatesView> {

    /* renamed from: a */
    @NotNull
    public EpisodeRepository f26368a;

    /* renamed from: b */
    @NotNull
    public EpisodesUpdatesUiLogic f26369b;

    /* renamed from: c */
    @NotNull
    public EpisodesUpdatesUiController f26370c;

    @Inject
    public EpisodesUpdatesPresenter(@NotNull EpisodeRepository episodeRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(episodeRepository, "episodeRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26368a = episodeRepository;
        this.f26369b = new EpisodesUpdatesUiLogic();
        this.f26370c = new EpisodesUpdatesUiController();
    }

    /* renamed from: a */
    public final void m14632a(final boolean z, final boolean z2) {
        EpisodeRepository episodeRepository = this.f26368a;
        EpisodesUpdatesUiLogic episodesUpdatesUiLogic = this.f26369b;
        episodeRepository.f27347b.updates(episodesUpdatesUiLogic.f29071b, episodesUpdatesUiLogic.f29072c).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2569c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesPresenter$onEpisodesUpdates$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14634b();
                }
                if (z2) {
                    this.getViewState().mo14636d();
                }
                return Unit.f63088a;
            }
        }, 23)).m31368j(new C2553a(z, this, z2, 7)).m31370l(new C2569c(new Function1<PageableResponse<EpisodeUpdate>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesPresenter$onEpisodesUpdates$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<EpisodeUpdate> pageableResponse) {
                PageableResponse<EpisodeUpdate> pageableResponse2 = pageableResponse;
                EpisodesUpdatesUiLogic episodesUpdatesUiLogic2 = EpisodesUpdatesPresenter.this.f26369b;
                List<EpisodeUpdate> episodesUpdates = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(episodesUpdatesUiLogic2);
                Intrinsics.m32179h(episodesUpdates, "episodesUpdates");
                boolean z3 = episodesUpdatesUiLogic2.f29075f;
                if (z3) {
                    episodesUpdatesUiLogic2.f29073d.addAll(episodesUpdates);
                    episodesUpdatesUiLogic2.f29074e = totalCount;
                } else {
                    if (z3) {
                        episodesUpdatesUiLogic2.f29073d.clear();
                    }
                    episodesUpdatesUiLogic2.f29073d.addAll(episodesUpdates);
                    episodesUpdatesUiLogic2.f29074e = totalCount;
                    episodesUpdatesUiLogic2.f29075f = true;
                }
                EpisodesUpdatesPresenter episodesUpdatesPresenter = EpisodesUpdatesPresenter.this;
                EpisodesUpdatesUiController episodesUpdatesUiController = episodesUpdatesPresenter.f26370c;
                EpisodesUpdatesUiLogic episodesUpdatesUiLogic3 = episodesUpdatesPresenter.f26369b;
                episodesUpdatesUiController.setData(episodesUpdatesUiLogic3.f29073d, Long.valueOf(episodesUpdatesUiLogic3.f29074e), Boolean.valueOf(pageableResponse2.getContent().size() >= 25));
                return Unit.f63088a;
            }
        }, 24), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.updates.EpisodesUpdatesPresenter$onEpisodesUpdates$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                EpisodesUpdatesPresenter.this.getViewState().mo14635c();
                return Unit.f63088a;
            }
        }, 25), Functions.f59621b, Functions.f59622c);
    }
}
