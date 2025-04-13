package com.swiftsoft.anixartd.p015ui.fragment.main.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.inputmethod.C0273a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.activity.UpdateActivity;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.home.CustomFilterTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter;
import com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnCustomFilterTabRefresh;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
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

/* compiled from: CustomFilterTabFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/home/CustomFilterTabFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/home/CustomFilterTabView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "Lcom/swiftsoft/anixartd/utils/OnCustomFilterTabRefresh;", "onCustomFilterTabRefresh", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomFilterTabFragment extends BaseFragment implements CustomFilterTabView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f28238h = {C2052a.m12277l(CustomFilterTabFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/home/CustomFilterTabPresenter;", 0)};

    /* renamed from: d */
    @Inject
    public Lazy<CustomFilterTabPresenter> f28239d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28240e;

    /* renamed from: f */
    public EndlessRecyclerViewScrollListener f28241f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f28242g = new LinkedHashMap();

    public CustomFilterTabFragment() {
        Function0<CustomFilterTabPresenter> function0 = new Function0<CustomFilterTabPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.CustomFilterTabFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CustomFilterTabPresenter invoke() {
                Lazy<CustomFilterTabPresenter> lazy = CustomFilterTabFragment.this.f28239d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28240e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CustomFilterTabPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15514A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28242g;
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

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: E3 */
    public void mo14662E3() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15514A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        LinearLayout custom_tab_info = (LinearLayout) m15514A3(C2507R.id.custom_tab_info);
        Intrinsics.m32178g(custom_tab_info, "custom_tab_info");
        ViewsKt.m16372e(custom_tab_info);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: H3 */
    public void mo14663H3() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15514A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout custom_tab_info = (LinearLayout) m15514A3(C2507R.id.custom_tab_info);
        Intrinsics.m32178g(custom_tab_info, "custom_tab_info");
        ViewsKt.m16378k(custom_tab_info);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: J0 */
    public void mo14664J0() {
        FragmentNavigation m15437u3 = m15437u3();
        Objects.requireNonNull(FilterFragment.f28149U);
        FilterFragment filterFragment = new FilterFragment();
        Bundle bundle = new Bundle();
        bundle.putString("IS_FROM", "IS_FROM_CUSTOM_FILTER_TAB");
        filterFragment.setArguments(bundle);
        m15437u3.mo15324d2(filterFragment, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: T */
    public void mo14665T() {
        YandexMetrica.reportEvent("Переход к полной версии");
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        common.m16300e(requireContext, new Common().m16297b("https://anixart.tv", m15515c4().f26410c.m14082y()) + "/full-version?code=24111318");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: V */
    public void mo14666V() {
        startActivity(new Intent(getContext(), (Class<?>) UpdateActivity.class));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: a */
    public void mo14667a() {
        ProgressBar progress_bar = (ProgressBar) m15514A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: a0 */
    public void mo14668a0(@NotNull String impMessageLink) {
        Intrinsics.m32179h(impMessageLink, "impMessageLink");
        YandexMetrica.reportEvent("Переход по ссылке важного сообщения");
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        common.m16300e(requireContext, impMessageLink);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: b */
    public void mo14669b() {
        ProgressBar progress_bar = (ProgressBar) m15514A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: c1 */
    public void mo14670c1(@Nullable String str) {
        ((SwipeRefreshLayout) m15514A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15514A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15514A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final CustomFilterTabPresenter m15515c4() {
        return (CustomFilterTabPresenter) this.f28240e.getValue(this, f28238h[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: d */
    public void mo14671d() {
        ((SwipeRefreshLayout) m15514A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: e */
    public void mo14672e() {
        ((SwipeRefreshLayout) m15514A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: i */
    public void mo14673i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: l0 */
    public void mo14674l0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        View inflate = getLayoutInflater().inflate(C2507R.layout.dialog_custom_filter_hint, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog m378l = builder.m378l();
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton, "view.negative_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.CustomFilterTabFragment$onCustomTabHint$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28242g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14124g0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        CustomFilterTabPresenter m15515c4 = m15515c4();
        CustomFilterTabUiLogic customFilterTabUiLogic = m15515c4.f26411d;
        customFilterTabUiLogic.f29100c = m15515c4.f26408a.m15297b();
        customFilterTabUiLogic.f28956a = true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable final Bundle bundle) {
        WindowManager windowManager;
        Display defaultDisplay;
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_custom_filter_tab, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 19));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.CustomFilterTabFragment$onCreateView$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.CustomFilterTabFragment$onCreateView$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) CustomFilterTabFragment.this.m15514A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) CustomFilterTabFragment.this.m15514A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                CustomFilterTabFragment.this.m15516u();
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(C2507R.id.button);
        Intrinsics.m32178g(materialButton3, "view.button");
        ViewsKt.m16377j(materialButton3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.CustomFilterTabFragment$onCreateView$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                CustomFilterTabFragment.this.mo14664J0();
                return Unit.f63088a;
            }
        });
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.m32178g(context, "context");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(context, m15515c4().f26410c.m14081x(), m15515c4().f26412e));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(bundle, layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.CustomFilterTabFragment$onCreateView$5$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                CustomFilterTabFragment customFilterTabFragment = this;
                KProperty<Object>[] kPropertyArr = CustomFilterTabFragment.f28238h;
                CustomFilterTabPresenter m15515c4 = customFilterTabFragment.m15515c4();
                m15515c4.f26411d.f29099b++;
                CustomFilterTabPresenter.m14652d(m15515c4, false, false, 3);
            }
        };
        this.f28241f = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15515c4().f26412e);
        if (!m15515c4().f26411d.f29102e) {
            CustomFilterTabPresenter m15515c4 = m15515c4();
            if (m15515c4.f26411d.f29100c != null) {
                m15515c4.getViewState().mo14662E3();
                CustomFilterTabPresenter.m14652d(m15515c4, false, false, 3);
            } else {
                m15515c4.getViewState().mo14663H3();
            }
        }
        return inflate;
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onCustomFilterTabRefresh(@NotNull OnCustomFilterTabRefresh onCustomFilterTabRefresh) {
        Intrinsics.m32179h(onCustomFilterTabRefresh, "onCustomFilterTabRefresh");
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28241f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CustomFilterTabPresenter m15515c4 = m15515c4();
        m15515c4.f26411d.f29100c = m15515c4.f26408a.m15297b();
        CustomFilterTabPresenter m15515c42 = m15515c4();
        if (m15515c42.f26411d.f29100c == null) {
            m15515c42.getViewState().mo14663H3();
            return;
        }
        m15515c42.getViewState().mo14662E3();
        CustomFilterTabUiLogic customFilterTabUiLogic = m15515c42.f26411d;
        if (customFilterTabUiLogic.f28956a) {
            customFilterTabUiLogic.f29099b = 0;
            customFilterTabUiLogic.f29101d.clear();
            customFilterTabUiLogic.f29102e = false;
            CustomFilterTabPresenter.m14652d(m15515c42, false, false, 2);
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28242g.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        CustomFilterTabPresenter m15515c4 = m15515c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15515c4);
        Intrinsics.m32179h(release, "release");
        CustomFilterTabUiLogic customFilterTabUiLogic = m15515c4.f26411d;
        if (customFilterTabUiLogic.f28956a) {
            Iterator<Release> it = customFilterTabUiLogic.f29101d.iterator();
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
                customFilterTabUiLogic.f29101d.set(i2, release);
            }
            m15515c4.m14653a(false, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ((LottieAnimationView) m15514A3(C2507R.id.animation_view)).m4643j();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15515c4().m14654b();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!isVisible() || !isResumed()) {
            ((LottieAnimationView) m15514A3(C2507R.id.animation_view)).m4643j();
            return;
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m15514A3(C2507R.id.animation_view);
        if (!lottieAnimationView.isShown()) {
            lottieAnimationView.f7120m = true;
        } else {
            lottieAnimationView.f7116i.m4669k();
            lottieAnimationView.m4642i();
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28241f;
        if (endlessRecyclerViewScrollListener != null) {
            endlessRecyclerViewScrollListener.m15319f(outState);
        } else {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
    }

    /* renamed from: u */
    public final void m15516u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15514A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15514A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28241f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15515c4().m14654b();
    }
}
