package com.swiftsoft.anixartd.presentation.main.top;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.filter.FilterRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.top.TopTabUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.top.TopTabUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.search.C2622b;
import com.swiftsoft.anixartd.repository.FilterRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
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

/* compiled from: TopTabPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/top/TopTabPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/top/TopTabView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TopTabPresenter extends MvpPresenter<TopTabView> {

    /* renamed from: a */
    @NotNull
    public FilterRepository f27258a;

    /* renamed from: b */
    @NotNull
    public TopTabUiLogic f27259b;

    /* renamed from: c */
    @NotNull
    public TopTabUiController f27260c;

    /* renamed from: d */
    @NotNull
    public Listener f27261d;

    /* compiled from: TopTabPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/top/TopTabPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/top/TopTabUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends TopTabUiController.Listener {
    }

    @Inject
    public TopTabPresenter(@NotNull FilterRepository filterRepository) {
        Intrinsics.m32179h(filterRepository, "filterRepository");
        this.f27258a = filterRepository;
        this.f27259b = new TopTabUiLogic();
        this.f27260c = new TopTabUiController();
        this.f27261d = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                TopTabPresenter topTabPresenter = TopTabPresenter.this;
                topTabPresenter.f27260c.setData(topTabPresenter.f27259b.f29368e, this);
                final TopTabPresenter topTabPresenter2 = TopTabPresenter.this;
                FilterRepository filterRepository2 = topTabPresenter2.f27258a;
                TopTabUiLogic topTabUiLogic = topTabPresenter2.f27259b;
                int i2 = topTabUiLogic.f29367d;
                FilterRequest filterRequest = new FilterRequest();
                filterRequest.setCategoryId(topTabUiLogic.f29365b);
                filterRequest.setStatusId(topTabUiLogic.f29366c);
                filterRequest.setSort(0);
                FilterRepository.m15295a(filterRepository2, i2, filterRequest, null, 4).m31370l(new C2622b(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter$onReleases$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(PageableResponse<Release> pageableResponse) {
                        PageableResponse<Release> pageableResponse2 = pageableResponse;
                        TopTabUiLogic topTabUiLogic2 = TopTabPresenter.this.f27259b;
                        List<Release> releases = pageableResponse2.getContent();
                        Objects.requireNonNull(topTabUiLogic2);
                        Intrinsics.m32179h(releases, "releases");
                        topTabUiLogic2.f29368e.addAll(releases);
                        TopTabPresenter topTabPresenter3 = TopTabPresenter.this;
                        topTabPresenter3.f27260c.setData(topTabPresenter3.f27259b.f29368e, topTabPresenter3.f27261d);
                        if (pageableResponse2.getContent().isEmpty()) {
                            TopTabUiLogic topTabUiLogic3 = TopTabPresenter.this.f27259b;
                            topTabUiLogic3.f29367d--;
                        }
                        return Unit.f63088a;
                    }
                }, 5), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter$onReleases$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        TopTabPresenter.this.getViewState().mo15246c();
                        return Unit.f63088a;
                    }
                }, 6), Functions.f59621b, Functions.f59622c);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.TopReleaseModel.Listener
            /* renamed from: g */
            public void mo15241g(long j2) {
                Object obj;
                Iterator<T> it = TopTabPresenter.this.f27259b.f29368e.iterator();
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
                    TopTabPresenter.this.getViewState().mo15249i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.TopReleaseModel.Listener
            /* renamed from: k */
            public void mo15242k(long j2) {
                Object obj;
                Iterator<T> it = TopTabPresenter.this.f27259b.f29368e.iterator();
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
    }

    /* renamed from: a */
    public final void m15240a(final boolean z, final boolean z2) {
        FilterRepository filterRepository = this.f27258a;
        TopTabUiLogic topTabUiLogic = this.f27259b;
        Objects.requireNonNull(topTabUiLogic);
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setCategoryId(topTabUiLogic.f29365b);
        filterRequest.setStatusId(topTabUiLogic.f29366c);
        filterRequest.setSort(1);
        FilterRepository.m15295a(filterRepository, 0, filterRequest, null, 5).m31367i(new C2622b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter$onTopTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo15245b();
                }
                if (z2) {
                    this.getViewState().mo15247d();
                }
                return Unit.f63088a;
            }
        }, 7)).m31365g(new C2549a(this, 19)).m31370l(new C2622b(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter$onTopTab$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                TopTabUiLogic topTabUiLogic2 = TopTabPresenter.this.f27259b;
                List<Release> releases = pageableResponse2.getContent();
                Objects.requireNonNull(topTabUiLogic2);
                Intrinsics.m32179h(releases, "releases");
                if (topTabUiLogic2.f29369f) {
                    topTabUiLogic2.f29367d = 0;
                    topTabUiLogic2.f29368e.clear();
                    topTabUiLogic2.f29369f = false;
                }
                topTabUiLogic2.f29368e.addAll(releases);
                topTabUiLogic2.f29369f = true;
                TopTabPresenter topTabPresenter = TopTabPresenter.this;
                topTabPresenter.f27260c.setData(topTabPresenter.f27259b.f29368e, topTabPresenter.f27261d);
                TopTabPresenter.this.getViewState().mo15243K3();
                if (pageableResponse2.getContent().isEmpty()) {
                    TopTabUiLogic topTabUiLogic3 = TopTabPresenter.this.f27259b;
                    topTabUiLogic3.f29367d--;
                }
                return Unit.f63088a;
            }
        }, 8), new C2622b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter$onTopTab$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                TopTabPresenter.this.getViewState().mo15246c();
                return Unit.f63088a;
            }
        }, 9), Functions.f59621b, Functions.f59622c);
    }
}
