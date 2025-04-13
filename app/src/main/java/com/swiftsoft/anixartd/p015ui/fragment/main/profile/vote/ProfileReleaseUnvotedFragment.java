package com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.inputmethod.C0273a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.vote.ProfileReleaseUnvotedUiController;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.vote.ProfileReleaseUnvotedUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView;
import com.swiftsoft.anixartd.utils.EventBusKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileReleaseUnvotedFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/vote/ProfileReleaseUnvotedFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseUnvotedView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseUnvotedFragment extends BaseFragment implements ProfileReleaseUnvotedView {

    /* renamed from: d */
    @Inject
    public Lazy<ProfileReleaseUnvotedPresenter> f28606d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28607e;

    /* renamed from: f */
    public EndlessRecyclerViewScrollListener f28608f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f28609g = new LinkedHashMap();

    /* renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f28605i = {C2052a.m12277l(ProfileReleaseUnvotedFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/vote/ProfileReleaseUnvotedPresenter;", 0)};

    /* renamed from: h */
    @NotNull
    public static final Companion f28604h = new Companion(null);

    /* compiled from: ProfileReleaseUnvotedFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/vote/ProfileReleaseUnvotedFragment$Companion;", "", "", "PROFILE_ID", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ProfileReleaseUnvotedFragment() {
        Function0<ProfileReleaseUnvotedPresenter> function0 = new Function0<ProfileReleaseUnvotedPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfileReleaseUnvotedPresenter invoke() {
                Lazy<ProfileReleaseUnvotedPresenter> lazy = ProfileReleaseUnvotedFragment.this.f28606d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28607e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfileReleaseUnvotedPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15585A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28609g;
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

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: a */
    public void mo14976a() {
        ProgressBar progress_bar = (ProgressBar) m15585A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: b */
    public void mo14977b() {
        ProgressBar progress_bar = (ProgressBar) m15585A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: c */
    public void mo14978c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15585A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15585A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfileReleaseUnvotedPresenter m15586c4() {
        return (ProfileReleaseUnvotedPresenter) this.f28607e.getValue(this, f28605i[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: d */
    public void mo14979d() {
        ((SwipeRefreshLayout) m15585A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: e */
    public void mo14980e() {
        ((SwipeRefreshLayout) m15585A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.vote.ProfileReleaseUnvotedView
    /* renamed from: i */
    public void mo14981i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28609g.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14092H(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getLong("PROFILE_ID");
        }
        m15586c4().f26877b.f28956a = true;
        ProfileReleaseUnvotedPresenter presenter = m15586c4();
        Intrinsics.m32178g(presenter, "presenter");
        presenter.m14970a(presenter.f26878c.isEmpty(), false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_profile_vote, viewGroup, false);
        ((AppCompatTextView) inflate.findViewById(C2507R.id.title)).setText("Оцените релизы");
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 22));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ProfileReleaseUnvotedFragment profileReleaseUnvotedFragment = ProfileReleaseUnvotedFragment.this;
                ProfileReleaseUnvotedFragment.Companion companion = ProfileReleaseUnvotedFragment.f28604h;
                ProfileReleaseUnvotedPresenter m15586c4 = profileReleaseUnvotedFragment.m15586c4();
                m15586c4.f26877b.f29237b++;
                m15586c4.m14970a(m15586c4.f26878c.isEmpty(), false);
            }
        };
        this.f28608f = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15586c4().f26878c);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 28));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ProfileReleaseUnvotedFragment.this.m15585A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ProfileReleaseUnvotedFragment.this.m15585A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ProfileReleaseUnvotedFragment.this.m15587u();
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28609g.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        ProfileReleaseUnvotedPresenter m15586c4 = m15586c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15586c4);
        Intrinsics.m32179h(release, "release");
        ProfileReleaseUnvotedUiLogic profileReleaseUnvotedUiLogic = m15586c4.f26877b;
        if (profileReleaseUnvotedUiLogic.f28956a) {
            Iterator<Release> it = profileReleaseUnvotedUiLogic.f29239d.iterator();
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
                profileReleaseUnvotedUiLogic.f29239d.set(i2, release);
            }
            ProfileReleaseUnvotedUiController profileReleaseUnvotedUiController = m15586c4.f26878c;
            ProfileReleaseUnvotedUiLogic profileReleaseUnvotedUiLogic2 = m15586c4.f26877b;
            profileReleaseUnvotedUiController.setData(profileReleaseUnvotedUiLogic2.f29239d, Long.valueOf(profileReleaseUnvotedUiLogic2.f29238c), Boolean.FALSE, m15586c4.f26879d);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15586c4().m14971b();
    }

    /* renamed from: u */
    public final void m15587u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15585A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15585A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28608f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15586c4().m14971b();
    }
}
