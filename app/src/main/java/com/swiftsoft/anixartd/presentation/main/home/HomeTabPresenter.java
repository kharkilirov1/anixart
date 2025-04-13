package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.filter.FilterRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.home.HomeTabUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.home.HomeTabUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.filtered.C2573a;
import com.swiftsoft.anixartd.repository.HomeRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.yandex.metrica.YandexMetrica;
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

/* compiled from: HomeTabPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/home/HomeTabPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/home/HomeTabView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class HomeTabPresenter extends MvpPresenter<HomeTabView> {

    /* renamed from: a */
    @NotNull
    public HomeRepository f26430a;

    /* renamed from: b */
    @NotNull
    public Prefs f26431b;

    /* renamed from: c */
    @NotNull
    public HomeTabUiLogic f26432c;

    /* renamed from: d */
    @NotNull
    public HomeTabUiController f26433d;

    /* renamed from: e */
    @NotNull
    public Listener f26434e;

    /* compiled from: HomeTabPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/home/HomeTabPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/home/HomeTabUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends HomeTabUiController.Listener {
    }

    @Inject
    public HomeTabPresenter(@NotNull HomeRepository homeRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(homeRepository, "homeRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26430a = homeRepository;
        this.f26431b = prefs;
        this.f26432c = new HomeTabUiLogic();
        this.f26433d = new HomeTabUiController();
        this.f26434e = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.extra.LiteVersionModel.Listener
            /* renamed from: T */
            public void mo14657T() {
                HomeTabPresenter.this.getViewState().mo14681T();
            }

            @Override // com.swiftsoft.anixartd.ui.model.extra.UpdateAvailableModel.Listener
            /* renamed from: V */
            public void mo14658V() {
                HomeTabPresenter.this.getViewState().mo14682V();
            }

            @Override // com.swiftsoft.anixartd.ui.model.extra.ImpMessageModel.Listener
            /* renamed from: a0 */
            public void mo14660a0(@NotNull String impMessageLink) {
                Intrinsics.m32179h(impMessageLink, "impMessageLink");
                HomeTabPresenter.this.getViewState().mo14684a0(impMessageLink);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                HomeTabPresenter homeTabPresenter = HomeTabPresenter.this;
                HomeTabUiController homeTabUiController = homeTabPresenter.f26433d;
                Integer valueOf = Integer.valueOf(homeTabPresenter.f26431b.m14081x());
                Long valueOf2 = Long.valueOf(HomeTabPresenter.this.f26432c.f29103b);
                HomeTabPresenter homeTabPresenter2 = HomeTabPresenter.this;
                homeTabUiController.setData(valueOf, valueOf2, homeTabPresenter2.f26432c.f29107f, Boolean.TRUE, Boolean.FALSE, Integer.valueOf(homeTabPresenter2.f26431b.m14068k()), Boolean.valueOf(HomeTabPresenter.this.f26431b.m14063f()), HomeTabPresenter.this.f26431b.m14065h(), HomeTabPresenter.this.f26431b.m14062e(), HomeTabPresenter.this.f26431b.m14066i(), HomeTabPresenter.this.f26431b.m14064g(), this);
                HomeTabPresenter.this.m14679d();
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = HomeTabPresenter.this.f26432c.f29107f.iterator();
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
                    HomeTabPresenter.this.getViewState().mo14689i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = HomeTabPresenter.this.f26432c.f29107f.iterator();
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
    public final boolean m14676a() {
        return this.f26433d.isEmpty();
    }

    /* renamed from: b */
    public final void m14677b(final boolean z, final boolean z2) {
        HomeRepository homeRepository = this.f26430a;
        HomeTabUiLogic homeTabUiLogic = this.f26432c;
        Objects.requireNonNull(homeTabUiLogic);
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setCategoryId(homeTabUiLogic.f29104c);
        filterRequest.setStatusId(homeTabUiLogic.f29105d);
        HomeRepository.m15296a(homeRepository, 0, filterRequest, false, 5).m31367i(new C2573a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter$onHomeTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14685b();
                }
                if (z2) {
                    this.getViewState().mo14687d();
                }
                return Unit.f63088a;
            }
        }, 5)).m31365g(new C2549a(this, 10)).m31370l(new C2573a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter$onHomeTab$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                HomeTabUiLogic homeTabUiLogic2 = HomeTabPresenter.this.f26432c;
                List<Release> releases = pageableResponse2.getContent();
                Objects.requireNonNull(homeTabUiLogic2);
                Intrinsics.m32179h(releases, "releases");
                if (homeTabUiLogic2.f29108g) {
                    homeTabUiLogic2.f29106e = 0;
                    homeTabUiLogic2.f29107f.clear();
                    homeTabUiLogic2.f29108g = false;
                }
                homeTabUiLogic2.f29107f.addAll(releases);
                homeTabUiLogic2.f29108g = true;
                HomeTabPresenter homeTabPresenter = HomeTabPresenter.this;
                homeTabPresenter.f26433d.setData(Integer.valueOf(homeTabPresenter.f26431b.m14081x()), Long.valueOf(HomeTabPresenter.this.f26432c.f29103b), HomeTabPresenter.this.f26432c.f29107f, Boolean.valueOf(pageableResponse2.getContent().size() >= 25), Boolean.FALSE, Integer.valueOf(HomeTabPresenter.this.f26431b.m14068k()), Boolean.valueOf(HomeTabPresenter.this.f26431b.m14063f()), HomeTabPresenter.this.f26431b.m14065h(), HomeTabPresenter.this.f26431b.m14062e(), HomeTabPresenter.this.f26431b.m14066i(), HomeTabPresenter.this.f26431b.m14064g(), HomeTabPresenter.this.f26434e);
                HomeTabPresenter.this.getViewState().mo14680L1();
                if (pageableResponse2.getContent().isEmpty()) {
                    HomeTabUiLogic homeTabUiLogic3 = HomeTabPresenter.this.f26432c;
                    homeTabUiLogic3.f29106e--;
                }
                return Unit.f63088a;
            }
        }, 6), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter$onHomeTab$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                th2.printStackTrace();
                YandexMetrica.reportError("HomeTabPresenter", th2);
                if (HomeTabPresenter.this.m14676a()) {
                    HomeTabPresenter.this.getViewState().mo14686c1(th2.getLocalizedMessage());
                } else {
                    HomeTabPresenter homeTabPresenter = HomeTabPresenter.this;
                    HomeTabUiController homeTabUiController = homeTabPresenter.f26433d;
                    Integer valueOf = Integer.valueOf(homeTabPresenter.f26431b.m14081x());
                    Long valueOf2 = Long.valueOf(HomeTabPresenter.this.f26432c.f29103b);
                    HomeTabPresenter homeTabPresenter2 = HomeTabPresenter.this;
                    homeTabUiController.setData(valueOf, valueOf2, homeTabPresenter2.f26432c.f29107f, Boolean.FALSE, Boolean.TRUE, Integer.valueOf(homeTabPresenter2.f26431b.m14068k()), Boolean.valueOf(HomeTabPresenter.this.f26431b.m14063f()), HomeTabPresenter.this.f26431b.m14065h(), HomeTabPresenter.this.f26431b.m14062e(), HomeTabPresenter.this.f26431b.m14066i(), HomeTabPresenter.this.f26431b.m14064g(), HomeTabPresenter.this.f26434e);
                }
                return Unit.f63088a;
            }
        }, 7), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14678c() {
        if (this.f26432c.f28956a) {
            if (m14676a()) {
                m14677b(m14676a(), false);
            } else {
                m14677b(false, true);
            }
        }
    }

    /* renamed from: d */
    public final void m14679d() {
        HomeRepository homeRepository = this.f26430a;
        HomeTabUiLogic homeTabUiLogic = this.f26432c;
        int i2 = homeTabUiLogic.f29106e;
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setCategoryId(homeTabUiLogic.f29104c);
        filterRequest.setStatusId(homeTabUiLogic.f29105d);
        HomeRepository.m15296a(homeRepository, i2, filterRequest, false, 4).m31370l(new C2573a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter$onReleases$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                HomeTabUiLogic homeTabUiLogic2 = HomeTabPresenter.this.f26432c;
                List<Release> releases = pageableResponse2.getContent();
                Objects.requireNonNull(homeTabUiLogic2);
                Intrinsics.m32179h(releases, "releases");
                homeTabUiLogic2.f29107f.addAll(releases);
                HomeTabPresenter homeTabPresenter = HomeTabPresenter.this;
                homeTabPresenter.f26433d.setData(Integer.valueOf(homeTabPresenter.f26431b.m14081x()), Long.valueOf(HomeTabPresenter.this.f26432c.f29103b), HomeTabPresenter.this.f26432c.f29107f, Boolean.valueOf(!pageableResponse2.getContent().isEmpty()), Boolean.FALSE, Integer.valueOf(HomeTabPresenter.this.f26431b.m14068k()), Boolean.valueOf(HomeTabPresenter.this.f26431b.m14063f()), HomeTabPresenter.this.f26431b.m14065h(), HomeTabPresenter.this.f26431b.m14062e(), HomeTabPresenter.this.f26431b.m14066i(), HomeTabPresenter.this.f26431b.m14064g(), HomeTabPresenter.this.f26434e);
                if (pageableResponse2.getContent().isEmpty()) {
                    HomeTabUiLogic homeTabUiLogic3 = HomeTabPresenter.this.f26432c;
                    homeTabUiLogic3.f29106e--;
                }
                return Unit.f63088a;
            }
        }, 8), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter$onReleases$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (HomeTabPresenter.this.m14676a()) {
                    HomeTabView viewState = HomeTabPresenter.this.getViewState();
                    Intrinsics.m32178g(viewState, "viewState");
                    viewState.mo14686c1(null);
                } else {
                    HomeTabPresenter homeTabPresenter = HomeTabPresenter.this;
                    HomeTabUiController homeTabUiController = homeTabPresenter.f26433d;
                    Integer valueOf = Integer.valueOf(homeTabPresenter.f26431b.m14081x());
                    Long valueOf2 = Long.valueOf(HomeTabPresenter.this.f26432c.f29103b);
                    HomeTabPresenter homeTabPresenter2 = HomeTabPresenter.this;
                    homeTabUiController.setData(valueOf, valueOf2, homeTabPresenter2.f26432c.f29107f, Boolean.FALSE, Boolean.TRUE, Integer.valueOf(homeTabPresenter2.f26431b.m14068k()), Boolean.valueOf(HomeTabPresenter.this.f26431b.m14063f()), HomeTabPresenter.this.f26431b.m14065h(), HomeTabPresenter.this.f26431b.m14062e(), HomeTabPresenter.this.f26431b.m14066i(), HomeTabPresenter.this.f26431b.m14064g(), HomeTabPresenter.this.f26434e);
                }
                return Unit.f63088a;
            }
        }, 9), Functions.f59621b, Functions.f59622c);
    }
}
