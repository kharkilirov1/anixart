package com.swiftsoft.anixartd.presentation.main.recommendation;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.recommendation.RecommendationUiController;
import com.swiftsoft.anixartd.p015ui.logic.Pagination;
import com.swiftsoft.anixartd.p015ui.logic.main.recommendation.RecommendationUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.profile.videos.C2609c;
import com.swiftsoft.anixartd.repository.DiscoverRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.OnFailed;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: RecommendationPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/recommendation/RecommendationPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/recommendation/RecommendationView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendationPresenter extends MvpPresenter<RecommendationView> {

    /* renamed from: a */
    @NotNull
    public DiscoverRepository f26910a;

    /* renamed from: b */
    @NotNull
    public Prefs f26911b;

    /* renamed from: c */
    @NotNull
    public Listener f26912c;

    /* renamed from: d */
    @NotNull
    public RecommendationUiLogic f26913d;

    /* renamed from: e */
    @NotNull
    public RecommendationUiController f26914e;

    /* compiled from: RecommendationPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/recommendation/RecommendationPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/recommendation/RecommendationUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends RecommendationUiController.Listener {
    }

    @Inject
    public RecommendationPresenter(@NotNull DiscoverRepository discoverRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(discoverRepository, "discoverRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26910a = discoverRepository;
        this.f26911b = prefs;
        this.f26912c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = RecommendationPresenter.this.f26913d.f29250c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    RecommendationPresenter.this.getViewState().mo15002g(release.getId());
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = RecommendationPresenter.this.f26913d.f29250c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    EventBusKt.m16327a(new OnBottomSheet(release));
                }
            }
        };
        this.f26913d = new RecommendationUiLogic();
        this.f26914e = new RecommendationUiController();
    }

    /* renamed from: a */
    public final void m14995a(final boolean z, final boolean z2) {
        DiscoverRepository discoverRepository = this.f26910a;
        Pagination pagination = this.f26913d.f29249b;
        discoverRepository.m15288a(pagination.f28953c, pagination.f28954d).m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter$onRecommendation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14998b();
                }
                if (z2) {
                    this.getViewState().mo15000d();
                }
                return Unit.f63088a;
            }
        }, 19)).m31368j(new C2553a(z, this, z2, 14)).m31370l(new C2609c(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter$onRecommendation$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                Pagination pagination2 = RecommendationPresenter.this.f26913d.f29249b;
                if (!pagination2.f28955e) {
                    pagination2.m15661a(pageableResponse2.getTotalPageCount(), pageableResponse2.getCurrentPage());
                }
                List m32009V = CollectionsKt.m32009V(pageableResponse2.getContent());
                RecommendationUiLogic recommendationUiLogic = RecommendationPresenter.this.f26913d;
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(recommendationUiLogic);
                boolean z3 = recommendationUiLogic.f29252e;
                if (z3) {
                    recommendationUiLogic.f29250c.addAll(m32009V);
                    recommendationUiLogic.f29251d = totalCount;
                } else {
                    if (z3) {
                        recommendationUiLogic.f29250c.clear();
                    }
                    recommendationUiLogic.f29250c.addAll(m32009V);
                    recommendationUiLogic.f29251d = totalCount;
                    recommendationUiLogic.f29252e = true;
                }
                RecommendationPresenter recommendationPresenter = RecommendationPresenter.this;
                RecommendationUiController recommendationUiController = recommendationPresenter.f26914e;
                Integer valueOf = Integer.valueOf(recommendationPresenter.f26911b.m14081x());
                RecommendationUiLogic recommendationUiLogic2 = RecommendationPresenter.this.f26913d;
                recommendationUiController.setData(valueOf, recommendationUiLogic2.f29250c, Long.valueOf(recommendationUiLogic2.f29251d), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), RecommendationPresenter.this.f26912c);
                return Unit.f63088a;
            }
        }, 20), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter$onRecommendation$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (RecommendationPresenter.this.f26914e.isEmpty()) {
                    RecommendationPresenter.this.getViewState().mo14999c();
                } else {
                    EventBusKt.m16327a(new OnFailed());
                }
                return Unit.f63088a;
            }
        }, 21), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14996b() {
        RecommendationUiLogic recommendationUiLogic = this.f26913d;
        if (recommendationUiLogic.f28956a) {
            Pagination pagination = recommendationUiLogic.f29249b;
            pagination.f28951a = new Boolean[0];
            pagination.f28952b = 0;
            pagination.f28953c = 0;
            pagination.f28955e = false;
            recommendationUiLogic.f29250c.clear();
            recommendationUiLogic.f29251d = 0L;
            recommendationUiLogic.f29249b.f28953c = -1;
            m14995a(false, true);
        }
    }
}
