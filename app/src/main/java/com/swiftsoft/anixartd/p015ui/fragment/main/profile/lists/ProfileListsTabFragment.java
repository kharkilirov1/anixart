package com.swiftsoft.anixartd.p015ui.fragment.main.profile.lists;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.lists.ProfileListsTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.lists.ProfileListsTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.OnSilentRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
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

/* compiled from: ProfileListsTabFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/lists/ProfileListsTabFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/lists/ProfileListsTabView;", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "", "Lcom/swiftsoft/anixartd/utils/OnSilentRefresh;", "onSilentRefresh", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileListsTabFragment extends TabFragment implements ProfileListsTabView {

    /* renamed from: f */
    @Inject
    public Lazy<ProfileListsTabPresenter> f28560f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28561g;

    /* renamed from: h */
    public long f28562h;

    /* renamed from: i */
    @NotNull
    public String f28563i;

    /* renamed from: j */
    public EndlessRecyclerViewScrollListener f28564j;

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f28565k = new LinkedHashMap();

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f28559m = {C2052a.m12277l(ProfileListsTabFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/lists/ProfileListsTabPresenter;", 0)};

    /* renamed from: l */
    @NotNull
    public static final Companion f28558l = new Companion(null);

    /* compiled from: ProfileListsTabFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/lists/ProfileListsTabFragment$Companion;", "", "", "ID_VALUE", "Ljava/lang/String;", "PROFILE_ID", "SELECTED_INNER_TAB_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ProfileListsTabFragment() {
        Function0<ProfileListsTabPresenter> function0 = new Function0<ProfileListsTabPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.lists.ProfileListsTabFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfileListsTabPresenter invoke() {
                Lazy<ProfileListsTabPresenter> lazy = ProfileListsTabFragment.this.f28560f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28561g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfileListsTabPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28563i = "";
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment
    @Nullable
    /* renamed from: A3 */
    public View mo15453A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28565k;
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

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: a */
    public void mo14923a() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: b */
    public void mo14924b() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: b4 */
    public void mo14925b4(long j2, @NotNull String innerTab) {
        int i2;
        Intrinsics.m32179h(innerTab, "innerTab");
        switch (innerTab.hashCode()) {
            case -202987277:
                if (innerTab.equals("INNER_TAB_PROFILE_LIST_COMPLETED")) {
                    i2 = 3;
                    break;
                }
                i2 = 0;
                break;
            case 275155495:
                if (innerTab.equals("INNER_TAB_PROFILE_LIST_HOLD_ON")) {
                    i2 = 4;
                    break;
                }
                i2 = 0;
                break;
            case 999506155:
                if (innerTab.equals("INNER_TAB_PROFILE_LIST_WATCHING")) {
                    i2 = 1;
                    break;
                }
                i2 = 0;
                break;
            case 1109108840:
                if (innerTab.equals("INNER_TAB_PROFILE_LIST_DROPPED")) {
                    i2 = 5;
                    break;
                }
                i2 = 0;
                break;
            case 1871259922:
                if (innerTab.equals("INNER_TAB_PROFILE_LIST_PLANS")) {
                    i2 = 2;
                    break;
                }
                i2 = 0;
                break;
            default:
                i2 = 0;
                break;
        }
        m15437u3().mo15324d2(ReleaseFragment.Companion.m15624c(ReleaseFragment.f28714t, true, 2, Long.valueOf(j2), Integer.valueOf(i2), null, 16), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: c */
    public void mo14926c() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) mo15453A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfileListsTabPresenter m15578c4() {
        return (ProfileListsTabPresenter) this.f28561g.getValue(this, f28559m[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: d */
    public void mo14927d() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: e */
    public void mo14928e() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: f */
    public void mo14929f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: i */
    public void mo14930i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: l */
    public void mo14931l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28564j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15578c4().m14922e();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28565k.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14091G(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28562h = arguments.getLong("PROFILE_ID");
            String string = arguments.getString("SELECTED_INNER_TAB_VALUE", "");
            Intrinsics.m32178g(string, "it.getString(SELECTED_INNER_TAB_VALUE, \"\")");
            this.f28563i = string;
        }
        ProfileListsTabPresenter m15578c4 = m15578c4();
        long j2 = this.f28562h;
        String selectedInnerTab = this.f28563i;
        Objects.requireNonNull(m15578c4);
        Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
        ProfileListsTabUiLogic profileListsTabUiLogic = m15578c4.f26795c;
        Objects.requireNonNull(profileListsTabUiLogic);
        profileListsTabUiLogic.f29214b = j2;
        profileListsTabUiLogic.f29215c = selectedInnerTab;
        int i2 = 1;
        profileListsTabUiLogic.f28956a = true;
        if (!m15578c4.f26795c.f29220h) {
            ProfileListsTabPresenter.m14918c(m15578c4, false, false, 3);
        }
        ProfileListsTabUiLogic profileListsTabUiLogic2 = m15578c4.f26795c;
        String str = profileListsTabUiLogic2.f29215c;
        switch (str.hashCode()) {
            case -202987277:
                if (str.equals("INNER_TAB_PROFILE_LIST_COMPLETED")) {
                    i2 = m15578c4.f26794b.f25344a.getInt("BOOKMARKS_COMPLETED_SORT", 1);
                    break;
                }
                break;
            case 275155495:
                if (str.equals("INNER_TAB_PROFILE_LIST_HOLD_ON")) {
                    i2 = m15578c4.f26794b.f25344a.getInt("BOOKMARKS_HOLD_ON_SORT", 1);
                    break;
                }
                break;
            case 999506155:
                if (str.equals("INNER_TAB_PROFILE_LIST_WATCHING")) {
                    i2 = m15578c4.f26794b.f25344a.getInt("BOOKMARKS_WATCHING_SORT", 1);
                    break;
                }
                break;
            case 1109108840:
                if (str.equals("INNER_TAB_PROFILE_LIST_DROPPED")) {
                    i2 = m15578c4.f26794b.f25344a.getInt("BOOKMARKS_DROPPED_SORT", 1);
                    break;
                }
                break;
            case 1871259922:
                if (str.equals("INNER_TAB_PROFILE_LIST_PLANS")) {
                    i2 = m15578c4.f26794b.f25344a.getInt("BOOKMARKS_PLANS_SORT", 1);
                    break;
                }
                break;
        }
        profileListsTabUiLogic2.f29218f = i2;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28565k.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15578c4().m14921d();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentRefresh(@NotNull OnSilentRefresh onSilentRefresh) {
        Intrinsics.m32179h(onSilentRefresh, "onSilentRefresh");
        m15578c4().m14922e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(C2507R.id.recycler_view);
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "this@ProfileListsTabFragment.requireContext()");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(requireContext, m15578c4().f26794b.m14081x(), m15578c4().f26796d));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.lists.ProfileListsTabFragment$onViewCreated$1$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ProfileListsTabFragment profileListsTabFragment = ProfileListsTabFragment.this;
                ProfileListsTabFragment.Companion companion = ProfileListsTabFragment.f28558l;
                ProfileListsTabPresenter m15578c4 = profileListsTabFragment.m15578c4();
                m15578c4.f26795c.f29216d++;
                ProfileListsTabPresenter.m14918c(m15578c4, false, false, 2);
            }
        };
        this.f28564j = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15578c4().f26796d);
    }

    @Override // com.swiftsoft.anixartd.p015ui.Refreshable
    /* renamed from: u */
    public void mo15322u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28564j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15578c4().m14921d();
    }
}
