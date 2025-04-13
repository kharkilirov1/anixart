package com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.inputmethod.C0273a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.friends.ProfileFriendRequestsUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnSilentFriendsRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
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

/* compiled from: ProfileFriendRequestsFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/friends/ProfileFriendRequestsFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendRequestsView;", "Lcom/swiftsoft/anixartd/utils/OnSilentFriendsRefresh;", "onSilentFriendsRefresh", "", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileFriendRequestsFragment extends BaseFragment implements ProfileFriendRequestsView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f28527h = {C2052a.m12277l(ProfileFriendRequestsFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/friends/ProfileFriendRequestsPresenter;", 0)};

    /* renamed from: d */
    @Inject
    public Lazy<ProfileFriendRequestsPresenter> f28528d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28529e;

    /* renamed from: f */
    public EndlessRecyclerViewScrollListener f28530f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f28531g = new LinkedHashMap();

    public ProfileFriendRequestsFragment() {
        Function0<ProfileFriendRequestsPresenter> function0 = new Function0<ProfileFriendRequestsPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.friends.ProfileFriendRequestsFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfileFriendRequestsPresenter invoke() {
                Lazy<ProfileFriendRequestsPresenter> lazy = ProfileFriendRequestsFragment.this.f28528d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28529e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfileFriendRequestsPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15569A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28531g;
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

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: C0 */
    public void mo14880C0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: H0 */
    public void mo14881H0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: a */
    public void mo14882a() {
        ProgressBar progress_bar = (ProgressBar) m15569A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: a2 */
    public void mo14883a2() {
        m15570c4().m14879c();
        EventBusKt.m16327a(new OnSilentFriendsRefresh());
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: b */
    public void mo14884b() {
        ProgressBar progress_bar = (ProgressBar) m15569A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: c */
    public void mo14885c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15569A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15569A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfileFriendRequestsPresenter m15570c4() {
        return (ProfileFriendRequestsPresenter) this.f28529e.getValue(this, f28527h[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: d */
    public void mo14886d() {
        ((SwipeRefreshLayout) m15569A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: e */
    public void mo14887e() {
        ((SwipeRefreshLayout) m15569A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: f */
    public void mo14888f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.friends.ProfileFriendRequestsView
    /* renamed from: g2 */
    public void mo14889g2() {
        m15570c4().m14879c();
        EventBusKt.m16327a(new OnSilentFriendsRefresh());
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28531g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14121f(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        m15570c4().f26730c.f28956a = true;
        ProfileFriendRequestsPresenter presenter = m15570c4();
        Intrinsics.m32178g(presenter, "presenter");
        ProfileFriendRequestsPresenter.m14877b(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_profile_friends, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 17));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.friends.ProfileFriendRequestsFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ProfileFriendRequestsFragment profileFriendRequestsFragment = ProfileFriendRequestsFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileFriendRequestsFragment.f28527h;
                ProfileFriendRequestsPresenter m15570c4 = profileFriendRequestsFragment.m15570c4();
                m15570c4.f26730c.f29195b++;
                ProfileFriendRequestsPresenter.m14877b(m15570c4, false, false, 3);
            }
        };
        this.f28530f = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15570c4().f26731d);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 23));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.friends.ProfileFriendRequestsFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.friends.ProfileFriendRequestsFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ProfileFriendRequestsFragment.this.m15569A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ProfileFriendRequestsFragment.this.m15569A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ProfileFriendRequestsFragment.this.m15571u();
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28531g.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentFriendsRefresh(@NotNull OnSilentFriendsRefresh onSilentFriendsRefresh) {
        Intrinsics.m32179h(onSilentFriendsRefresh, "onSilentFriendsRefresh");
        m15570c4().m14879c();
    }

    /* renamed from: u */
    public final void m15571u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15569A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15569A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28530f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ProfileFriendRequestsPresenter m15570c4 = m15570c4();
        ProfileFriendRequestsUiLogic profileFriendRequestsUiLogic = m15570c4.f26730c;
        if (profileFriendRequestsUiLogic.f28956a) {
            profileFriendRequestsUiLogic.f29195b = 0;
            profileFriendRequestsUiLogic.f29197d = 0L;
            profileFriendRequestsUiLogic.f29196c.clear();
            profileFriendRequestsUiLogic.f29198e = false;
            m15570c4.m14878a(false, true);
        }
    }
}
