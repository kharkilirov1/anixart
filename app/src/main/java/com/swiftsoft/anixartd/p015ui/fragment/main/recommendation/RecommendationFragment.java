package com.swiftsoft.anixartd.p015ui.fragment.main.recommendation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.controller.main.recommendation.RecommendationUiController;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.recommendation.RecommendationUiLogic;
import com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationPresenter;
import com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RecommendationFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/recommendation/RecommendationFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/recommendation/RecommendationView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendationFragment extends BaseFragment implements RecommendationView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f28625h = {C2052a.m12277l(RecommendationFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/recommendation/RecommendationPresenter;", 0)};

    /* renamed from: d */
    public EndlessRecyclerViewScrollListener f28626d;

    /* renamed from: e */
    @Inject
    public Lazy<RecommendationPresenter> f28627e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28628f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f28629g = new LinkedHashMap();

    public RecommendationFragment() {
        Function0<RecommendationPresenter> function0 = new Function0<RecommendationPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.recommendation.RecommendationFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public RecommendationPresenter invoke() {
                Lazy<RecommendationPresenter> lazy = RecommendationFragment.this.f28627e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28628f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(RecommendationPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15591A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28629g;
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

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: a */
    public void mo14997a() {
        ProgressBar progress_bar = (ProgressBar) m15591A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: b */
    public void mo14998b() {
        ProgressBar progress_bar = (ProgressBar) m15591A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: c */
    public void mo14999c() {
        ((SwipeRefreshLayout) m15591A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15591A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15591A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final RecommendationPresenter m15592c4() {
        return (RecommendationPresenter) this.f28628f.getValue(this, f28625h[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: d */
    public void mo15000d() {
        ((SwipeRefreshLayout) m15591A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: e */
    public void mo15001e() {
        ((SwipeRefreshLayout) m15591A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.recommendation.RecommendationView
    /* renamed from: g */
    public void mo15002g(long j2) {
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28629g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14138n0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        RecommendationUiLogic recommendationUiLogic = m15592c4().f26913d;
        recommendationUiLogic.f28956a = true;
        recommendationUiLogic.f29249b.f28953c = -1;
        RecommendationPresenter presenter = m15592c4();
        Intrinsics.m32178g(presenter, "presenter");
        presenter.m14995a(presenter.f26914e.isEmpty(), false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_recommendation, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 24));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.m32178g(context, "context");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(context, m15592c4().f26911b.m14081x(), m15592c4().f26914e));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.recommendation.RecommendationFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                RecommendationFragment recommendationFragment = RecommendationFragment.this;
                KProperty<Object>[] kPropertyArr = RecommendationFragment.f28625h;
                RecommendationPresenter m15592c4 = recommendationFragment.m15592c4();
                m15592c4.f26913d.f29249b.m15662b();
                m15592c4.m14995a(m15592c4.f26914e.isEmpty(), false);
            }
        };
        this.f28626d = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setItemAnimator(null);
        epoxyRecyclerView.setController(m15592c4().f26914e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2722a(this, 0));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.recommendation.RecommendationFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.recommendation.RecommendationFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) RecommendationFragment.this.m15591A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) RecommendationFragment.this.m15591A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                RecommendationFragment.this.m15593u();
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28629g.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        RecommendationPresenter m15592c4 = m15592c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15592c4);
        Intrinsics.m32179h(release, "release");
        RecommendationUiLogic recommendationUiLogic = m15592c4.f26913d;
        if (recommendationUiLogic.f28956a) {
            Iterator<Release> it = recommendationUiLogic.f29250c.iterator();
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
                recommendationUiLogic.f29250c.set(i2, release);
            }
            RecommendationUiController recommendationUiController = m15592c4.f26914e;
            Integer valueOf = Integer.valueOf(m15592c4.f26911b.m14081x());
            RecommendationUiLogic recommendationUiLogic2 = m15592c4.f26913d;
            recommendationUiController.setData(valueOf, recommendationUiLogic2.f29250c, Long.valueOf(recommendationUiLogic2.f29251d), Boolean.FALSE, m15592c4.f26912c);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(false));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15592c4().m14996b();
    }

    /* renamed from: u */
    public final void m15593u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15591A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15591A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28626d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15592c4().m14996b();
    }
}
