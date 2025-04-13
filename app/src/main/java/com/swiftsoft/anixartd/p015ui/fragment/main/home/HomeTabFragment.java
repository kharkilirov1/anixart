package com.swiftsoft.anixartd.p015ui.fragment.main.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.activity.UpdateActivity;
import com.swiftsoft.anixartd.p015ui.controller.main.home.HomeTabUiController;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.home.HomeTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.home.HomeTabPresenter;
import com.swiftsoft.anixartd.presentation.main.home.HomeTabView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HomeTabFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/home/HomeTabFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabFragment;", "Lcom/swiftsoft/anixartd/presentation/main/home/HomeTabView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class HomeTabFragment extends TabFragment implements HomeTabView {

    /* renamed from: f */
    @Inject
    public Lazy<HomeTabPresenter> f28260f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28261g;

    /* renamed from: h */
    public long f28262h;

    /* renamed from: i */
    @Nullable
    public Long f28263i;

    /* renamed from: j */
    @Nullable
    public Long f28264j;

    /* renamed from: k */
    public EndlessRecyclerViewScrollListener f28265k;

    /* renamed from: l */
    @NotNull
    public Map<Integer, View> f28266l = new LinkedHashMap();

    /* renamed from: n */
    public static final /* synthetic */ KProperty<Object>[] f28259n = {C2052a.m12277l(HomeTabFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/home/HomeTabPresenter;", 0)};

    /* renamed from: m */
    @NotNull
    public static final Companion f28258m = new Companion(null);

    /* compiled from: HomeTabFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/home/HomeTabFragment$Companion;", "", "", "BUNDLE_CURRENT_PAGE", "Ljava/lang/String;", "CATEGORY_ID_VALUE", "ID_VALUE", "STATUS_ID_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public static HomeTabFragment m15521a(Companion companion, long j2, Long l2, Long l3, int i2) {
            if ((i2 & 2) != 0) {
                l2 = null;
            }
            if ((i2 & 4) != 0) {
                l3 = null;
            }
            Objects.requireNonNull(companion);
            HomeTabFragment homeTabFragment = new HomeTabFragment();
            Bundle m4108g = C0576a.m4108g("ID_VALUE", j2);
            if (l2 != null) {
                m4108g.putLong("CATEGORY_ID_VALUE", l2.longValue());
            }
            if (l3 != null) {
                m4108g.putLong("STATUS_VALUE", l3.longValue());
            }
            homeTabFragment.setArguments(m4108g);
            return homeTabFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public HomeTabFragment() {
        Function0<HomeTabPresenter> function0 = new Function0<HomeTabPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.HomeTabFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public HomeTabPresenter invoke() {
                Lazy<HomeTabPresenter> lazy = HomeTabFragment.this.f28260f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28261g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(HomeTabPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment
    @Nullable
    /* renamed from: A3 */
    public View mo15453A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28266l;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: L1 */
    public void mo14680L1() {
        SwipeRefreshLayout refresh = (SwipeRefreshLayout) mo15453A3(C2507R.id.refresh);
        Intrinsics.m32178g(refresh, "refresh");
        ViewsKt.m16378k(refresh);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: T */
    public void mo14681T() {
        YandexMetrica.reportEvent("Переход к полной версии");
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        common.m16300e(requireContext, "/full-version?code=24111318");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: V */
    public void mo14682V() {
        startActivity(new Intent(getContext(), (Class<?>) UpdateActivity.class));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: a */
    public void mo14683a() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: a0 */
    public void mo14684a0(@NotNull String impMessageLink) {
        Intrinsics.m32179h(impMessageLink, "impMessageLink");
        YandexMetrica.reportEvent("Переход по ссылке важного сообщения");
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        common.m16300e(requireContext, impMessageLink);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: b */
    public void mo14685b() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: c1 */
    public void mo14686c1(@Nullable String str) {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) mo15453A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final HomeTabPresenter m15520c4() {
        return (HomeTabPresenter) this.f28261g.getValue(this, f28259n[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: d */
    public void mo14687d() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: e */
    public void mo14688e() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.HomeTabView
    /* renamed from: i */
    public void mo14689i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28266l.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14155w(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28262h = arguments.getLong("ID_VALUE");
            if (arguments.containsKey("CATEGORY_ID_VALUE")) {
                this.f28263i = Long.valueOf(arguments.getLong("CATEGORY_ID_VALUE"));
            }
            if (arguments.containsKey("STATUS_VALUE")) {
                this.f28264j = Long.valueOf(arguments.getLong("STATUS_VALUE"));
            }
        }
        HomeTabPresenter m15520c4 = m15520c4();
        long j2 = this.f28262h;
        Long l2 = this.f28263i;
        Long l3 = this.f28264j;
        HomeTabUiLogic homeTabUiLogic = m15520c4.f26432c;
        homeTabUiLogic.f29103b = j2;
        homeTabUiLogic.f29104c = l2;
        homeTabUiLogic.f29105d = l3;
        homeTabUiLogic.f28956a = true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28266l.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        HomeTabPresenter m15520c4 = m15520c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15520c4);
        Intrinsics.m32179h(release, "release");
        HomeTabUiLogic homeTabUiLogic = m15520c4.f26432c;
        if (homeTabUiLogic.f28956a) {
            Iterator<Release> it = homeTabUiLogic.f29107f.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (it.next().getId() == release.getId()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (i2 >= 0) {
                homeTabUiLogic.f29107f.set(i2, release);
            }
            HomeTabUiController homeTabUiController = m15520c4.f26433d;
            Integer valueOf = Integer.valueOf(m15520c4.f26431b.m14081x());
            Long valueOf2 = Long.valueOf(m15520c4.f26432c.f29103b);
            List<Release> list = m15520c4.f26432c.f29107f;
            Boolean bool = Boolean.FALSE;
            homeTabUiController.setData(valueOf, valueOf2, list, bool, bool, Integer.valueOf(m15520c4.f26431b.m14068k()), Boolean.valueOf(m15520c4.f26431b.m14063f()), m15520c4.f26431b.m14065h(), m15520c4.f26431b.m14062e(), m15520c4.f26431b.m14066i(), m15520c4.f26431b.m14064g(), m15520c4.f26434e);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15520c4().m14678c();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28265k;
        if (endlessRecyclerViewScrollListener != null) {
            endlessRecyclerViewScrollListener.m15319f(outState);
        } else {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable final Bundle bundle) {
        WindowManager windowManager;
        Display defaultDisplay;
        Intrinsics.m32179h(view, "view");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(C2507R.id.recycler_view);
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.m32178g(context, "context");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(context, m15520c4().f26431b.m14081x(), m15520c4().f26433d));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(bundle, layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.HomeTabFragment$onViewCreated$1$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                HomeTabFragment homeTabFragment = this;
                HomeTabFragment.Companion companion = HomeTabFragment.f28258m;
                HomeTabPresenter m15520c4 = homeTabFragment.m15520c4();
                m15520c4.f26432c.f29106e++;
                m15520c4.m14679d();
            }
        };
        this.f28265k = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15520c4().f26433d);
        if (m15520c4().f26432c.f29108g) {
            return;
        }
        HomeTabPresenter presenter = m15520c4();
        Intrinsics.m32178g(presenter, "presenter");
        presenter.m14677b(presenter.m14676a(), false);
    }

    @Override // com.swiftsoft.anixartd.p015ui.Refreshable
    /* renamed from: u */
    public void mo15322u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28265k;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15520c4().m14678c();
    }
}
