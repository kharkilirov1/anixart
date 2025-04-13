package com.swiftsoft.anixartd.p015ui.fragment.main.profile.comments;

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
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.comments.ProfileCommentsTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.comments.ProfileCommentsTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView;
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

/* compiled from: ProfileCommentsTabFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/comments/ProfileCommentsTabFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/comments/ProfileCommentsTabView;", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "", "Lcom/swiftsoft/anixartd/utils/OnSilentRefresh;", "onSilentRefresh", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileCommentsTabFragment extends TabFragment implements ProfileCommentsTabView {

    /* renamed from: f */
    @Inject
    public Lazy<ProfileCommentsTabPresenter> f28516f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28517g;

    /* renamed from: h */
    public long f28518h;

    /* renamed from: i */
    @NotNull
    public String f28519i;

    /* renamed from: j */
    public EndlessRecyclerViewScrollListener f28520j;

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f28521k = new LinkedHashMap();

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f28515m = {C2052a.m12277l(ProfileCommentsTabFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/comments/ProfileCommentsTabPresenter;", 0)};

    /* renamed from: l */
    @NotNull
    public static final Companion f28514l = new Companion(null);

    /* compiled from: ProfileCommentsTabFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/comments/ProfileCommentsTabFragment$Companion;", "", "", "ID_VALUE", "Ljava/lang/String;", "PROFILE_ID", "SELECTED_INNER_TAB_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ProfileCommentsTabFragment() {
        Function0<ProfileCommentsTabPresenter> function0 = new Function0<ProfileCommentsTabPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.comments.ProfileCommentsTabFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfileCommentsTabPresenter invoke() {
                Lazy<ProfileCommentsTabPresenter> lazy = ProfileCommentsTabFragment.this.f28516f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28517g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfileCommentsTabPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28519i = "";
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment
    @Nullable
    /* renamed from: A3 */
    public View mo15453A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28521k;
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

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: N */
    public void mo14868N(long j2, long j3, long j4) {
        m15437u3().mo15324d2(ReleaseCommentsRepliesFragment.f28688o.m15615a(j2, j3, j4, true), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: a */
    public void mo14869a() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: b */
    public void mo14870b() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: c */
    public void mo14871c() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) mo15453A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfileCommentsTabPresenter m15568c4() {
        return (ProfileCommentsTabPresenter) this.f28517g.getValue(this, f28515m[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: d */
    public void mo14872d() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: e */
    public void mo14873e() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: f */
    public void mo14874f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: l */
    public void mo14875l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28520j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15568c4().m14863e();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28521k.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14089E(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28518h = arguments.getLong("PROFILE_ID");
            String string = arguments.getString("SELECTED_INNER_TAB_VALUE", "");
            Intrinsics.m32178g(string, "it.getString(SELECTED_INNER_TAB_VALUE, \"\")");
            this.f28519i = string;
        }
        ProfileCommentsTabPresenter m15568c4 = m15568c4();
        long j2 = this.f28518h;
        String selectedInnerTab = this.f28519i;
        Objects.requireNonNull(m15568c4);
        Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
        ProfileCommentsTabUiLogic profileCommentsTabUiLogic = m15568c4.f26700d;
        Objects.requireNonNull(profileCommentsTabUiLogic);
        profileCommentsTabUiLogic.f29185b = j2;
        profileCommentsTabUiLogic.f29186c = selectedInnerTab;
        int i2 = 1;
        profileCommentsTabUiLogic.f28956a = true;
        if (!m15568c4.f26700d.f29192i) {
            ProfileCommentsTabPresenter.m14859c(m15568c4, false, false, 3);
        }
        ProfileCommentsTabUiLogic profileCommentsTabUiLogic2 = m15568c4.f26700d;
        String str = profileCommentsTabUiLogic2.f29186c;
        if (Intrinsics.m32174c(str, "INNER_TAB_PROFILE_COMMENTS_RELEASE")) {
            i2 = m15568c4.f26699c.f25344a.getInt("PROFILE_RELEASE_COMMENTS_SORT", 1);
        } else if (Intrinsics.m32174c(str, "INNER_TAB_PROFILE_COMMENTS_COLLECTIONS")) {
            i2 = m15568c4.f26699c.f25344a.getInt("PROFILE_COMMENTS_COLLECTION_SORT", 1);
        }
        profileCommentsTabUiLogic2.f29189f = i2;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28521k.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15568c4().m14862d();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentRefresh(@NotNull OnSilentRefresh onSilentRefresh) {
        Intrinsics.m32179h(onSilentRefresh, "onSilentRefresh");
        m15568c4().m14863e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(C2507R.id.recycler_view);
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "this@ProfileCommentsTabFragment.requireContext()");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(requireContext, 0, m15568c4().f26701e));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.comments.ProfileCommentsTabFragment$onViewCreated$1$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ProfileCommentsTabFragment profileCommentsTabFragment = ProfileCommentsTabFragment.this;
                ProfileCommentsTabFragment.Companion companion = ProfileCommentsTabFragment.f28514l;
                ProfileCommentsTabPresenter m15568c4 = profileCommentsTabFragment.m15568c4();
                m15568c4.f26700d.f29187d++;
                ProfileCommentsTabPresenter.m14859c(m15568c4, false, false, 2);
            }
        };
        this.f28520j = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15568c4().f26701e);
    }

    @Override // com.swiftsoft.anixartd.p015ui.Refreshable
    /* renamed from: u */
    public void mo15322u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28520j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15568c4().m14862d();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: y0 */
    public void mo14876y0(long j2, long j3, long j4) {
        m15437u3().mo15324d2(CollectionCommentsRepliesFragment.f27934o.m15469a(j2, j3, Long.valueOf(j4), true), null);
    }
}
