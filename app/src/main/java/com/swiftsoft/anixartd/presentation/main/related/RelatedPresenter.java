package com.swiftsoft.anixartd.presentation.main.related;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.api.RelatedApi;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.related.RelatedUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.related.RelatedUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.profile.videos.C2609c;
import com.swiftsoft.anixartd.repository.RelatedRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
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

/* compiled from: RelatedPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/related/RelatedPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/related/RelatedView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RelatedPresenter extends MvpPresenter<RelatedView> {

    /* renamed from: a */
    @NotNull
    public RelatedRepository f26924a;

    /* renamed from: b */
    @NotNull
    public Listener f26925b;

    /* renamed from: c */
    @NotNull
    public RelatedUiLogic f26926c;

    /* renamed from: d */
    @NotNull
    public RelatedUiController f26927d;

    /* compiled from: RelatedPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/related/RelatedPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/related/RelatedUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends RelatedUiController.Listener {
    }

    @Inject
    public RelatedPresenter(@NotNull RelatedRepository relatedRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(relatedRepository, "relatedRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26924a = relatedRepository;
        this.f26925b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.release.RelatedModel.Listener
            /* renamed from: g */
            public void mo15004g(long j2) {
                Object obj;
                Iterator<T> it = RelatedPresenter.this.f26926c.f29259h.iterator();
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
                    RelatedPresenter.this.getViewState().mo15011i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.release.RelatedModel.Listener
            /* renamed from: k */
            public void mo15005k(long j2) {
                Object obj;
                Iterator<T> it = RelatedPresenter.this.f26926c.f29259h.iterator();
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
        this.f26926c = new RelatedUiLogic();
        this.f26927d = new RelatedUiController();
    }

    /* renamed from: a */
    public final void m15003a(final boolean z, final boolean z2) {
        RelatedRepository relatedRepository = this.f26924a;
        RelatedUiLogic relatedUiLogic = this.f26926c;
        RelatedApi.DefaultImpls.related$default(relatedRepository.f27378a, relatedUiLogic.f29253b, relatedUiLogic.f29258g, relatedRepository.f27379b.m14080w(), null, 8, null).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2609c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter$onRelated$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo15007b();
                }
                if (z2) {
                    this.getViewState().mo15009d();
                }
                return Unit.f63088a;
            }
        }, 22)).m31368j(new C2553a(z, this, z2, 15)).m31370l(new C2609c(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter$onRelated$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                RelatedUiLogic relatedUiLogic2 = RelatedPresenter.this.f26926c;
                List<Release> relatedReleases = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(relatedUiLogic2);
                Intrinsics.m32179h(relatedReleases, "relatedReleases");
                boolean z3 = relatedUiLogic2.f29261j;
                if (z3) {
                    relatedUiLogic2.f29259h.addAll(relatedReleases);
                    relatedUiLogic2.f29260i = totalCount;
                } else {
                    if (z3) {
                        relatedUiLogic2.f29259h.clear();
                    }
                    relatedUiLogic2.f29259h.addAll(relatedReleases);
                    relatedUiLogic2.f29260i = totalCount;
                    relatedUiLogic2.f29261j = true;
                }
                RelatedPresenter relatedPresenter = RelatedPresenter.this;
                RelatedUiController relatedUiController = relatedPresenter.f26927d;
                Release release = relatedPresenter.f26926c.f29257f;
                Long valueOf = Long.valueOf(release != null ? release.getId() : -1L);
                RelatedUiLogic relatedUiLogic3 = RelatedPresenter.this.f26926c;
                relatedUiController.setData(valueOf, relatedUiLogic3.f29254c, relatedUiLogic3.f29255d, relatedUiLogic3.f29256e, relatedUiLogic3.f29259h, Long.valueOf(relatedUiLogic3.f29260i), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), RelatedPresenter.this.f26925b);
                return Unit.f63088a;
            }
        }, 23), new C2609c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter$onRelated$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                RelatedPresenter.this.getViewState().mo15008c();
                return Unit.f63088a;
            }
        }, 24), Functions.f59621b, Functions.f59622c);
    }
}
