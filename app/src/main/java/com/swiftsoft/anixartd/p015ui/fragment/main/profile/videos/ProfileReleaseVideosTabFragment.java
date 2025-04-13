package com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos;

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
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.activity.webplayer.WebPlayerActivity;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosTabFragment;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosTabPresenter;
import com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchReleaseVideo;
import com.swiftsoft.anixartd.utils.OnFetchReleaseVideoAppeal;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.OnSilentRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
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

/* compiled from: ProfileReleaseVideosTabFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/videos/ProfileReleaseVideosTabFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideosView;", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "", "Lcom/swiftsoft/anixartd/utils/OnSilentRefresh;", "onSilentRefresh", "Lcom/swiftsoft/anixartd/utils/OnFetchReleaseVideo;", "onFetchReleaseVideo", "Lcom/swiftsoft/anixartd/utils/OnFetchReleaseVideoAppeal;", "onFetchReleaseVideoAppeal", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVideosTabFragment extends TabFragment implements ProfileReleaseVideosView {

    /* renamed from: f */
    @Inject
    public Lazy<ProfileReleaseVideosTabPresenter> f28594f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28595g;

    /* renamed from: h */
    public long f28596h;

    /* renamed from: i */
    @NotNull
    public String f28597i;

    /* renamed from: j */
    public EndlessRecyclerViewScrollListener f28598j;

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f28599k = new LinkedHashMap();

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f28593m = {C2052a.m12277l(ProfileReleaseVideosTabFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/videos/ProfileReleaseVideosTabPresenter;", 0)};

    /* renamed from: l */
    @NotNull
    public static final Companion f28592l = new Companion(null);

    /* compiled from: ProfileReleaseVideosTabFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/videos/ProfileReleaseVideosTabFragment$Companion;", "", "", "ID_VALUE", "Ljava/lang/String;", "PROFILE_ID", "SELECTED_INNER_TAB_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ProfileReleaseVideosTabFragment() {
        Function0<ProfileReleaseVideosTabPresenter> function0 = new Function0<ProfileReleaseVideosTabPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.videos.ProfileReleaseVideosTabFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfileReleaseVideosTabPresenter invoke() {
                Lazy<ProfileReleaseVideosTabPresenter> lazy = ProfileReleaseVideosTabFragment.this.f28594f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28595g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfileReleaseVideosTabPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28597i = "";
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment
    @Nullable
    /* renamed from: A3 */
    public View mo15453A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28599k;
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

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: K */
    public void mo14956K(@NotNull ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        Context context = getContext();
        startActivityForResult(context != null ? WebPlayerActivity.f27600e.m15356a(context, releaseVideo.getPlayerUrl(), false, false) : null, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: U0 */
    public void mo14957U0(@NotNull ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        EventBusKt.m16327a(new OnFetchReleaseVideoAppeal(releaseVideo));
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.release_video_appeal_deleted);
        Intrinsics.m32178g(string, "getString(R.string.release_video_appeal_deleted)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: V2 */
    public void mo14958V2() {
        m15437u3().mo15324d2(new ProfileReleaseVideoAppealsFragment(), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: a */
    public void mo14959a() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: b */
    public void mo14960b() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: c */
    public void mo14961c() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) mo15453A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfileReleaseVideosTabPresenter m15584c4() {
        return (ProfileReleaseVideosTabPresenter) this.f28595g.getValue(this, f28593m[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: d */
    public void mo14962d() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: e */
    public void mo14963e() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: f */
    public void mo14964f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: k3 */
    public void mo14965k3(long j2, long j3) {
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: l */
    public void mo14966l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28598j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15584c4().m14953h();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28599k.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14159y(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28596h = arguments.getLong("PROFILE_ID");
            String string = arguments.getString("SELECTED_INNER_TAB_VALUE", "");
            Intrinsics.m32178g(string, "it.getString(SELECTED_INNER_TAB_VALUE, \"\")");
            this.f28597i = string;
        }
        m15584c4().m14950d(this.f28596h, this.f28597i);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28599k.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchReleaseVideo(@NotNull OnFetchReleaseVideo onFetchReleaseVideo) {
        Intrinsics.m32179h(onFetchReleaseVideo, "onFetchReleaseVideo");
        if (m15584c4().f26832d.f29227b == m15584c4().f26831c.m14061d()) {
            m15584c4().m14949c(onFetchReleaseVideo.f30207a);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchReleaseVideoAppeal(@NotNull OnFetchReleaseVideoAppeal onFetchReleaseVideoAppeal) {
        Intrinsics.m32179h(onFetchReleaseVideoAppeal, "onFetchReleaseVideoAppeal");
        m15584c4().m14953h();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15584c4().m14952g();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentRefresh(@NotNull OnSilentRefresh onSilentRefresh) {
        Intrinsics.m32179h(onSilentRefresh, "onSilentRefresh");
        m15584c4().m14953h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(C2507R.id.recycler_view);
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "this@ProfileReleaseVideo…Fragment.requireContext()");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(requireContext, 0, m15584c4().f26833e));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.videos.ProfileReleaseVideosTabFragment$onViewCreated$1$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ProfileReleaseVideosTabFragment profileReleaseVideosTabFragment = ProfileReleaseVideosTabFragment.this;
                ProfileReleaseVideosTabFragment.Companion companion = ProfileReleaseVideosTabFragment.f28592l;
                ProfileReleaseVideosTabPresenter m15584c4 = profileReleaseVideosTabFragment.m15584c4();
                m15584c4.f26832d.f29229d++;
                ProfileReleaseVideosTabPresenter.m14946f(m15584c4, false, false, 2);
            }
        };
        this.f28598j = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15584c4().f26833e);
    }

    @Override // com.swiftsoft.anixartd.p015ui.Refreshable
    /* renamed from: u */
    public void mo15322u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28598j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15584c4().m14952g();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: u0 */
    public void mo14967u0() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.release_video_appeal_delete_failed);
        Intrinsics.m32178g(string, "getString(R.string.relea…deo_appeal_delete_failed)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: w1 */
    public void mo14968w1(long j2, long j3) {
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.videos.ProfileReleaseVideosView
    /* renamed from: x0 */
    public void mo14969x0(@NotNull final ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
        builder.f30150b = 3;
        builder.m16319k("Удалить заявку?");
        builder.m16310b("Вы уверены, что хотите удалить заявку на добавление видео?");
        builder.m16315g(C2507R.string.delete);
        builder.m16311c(C2507R.string.cancel);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.videos.ProfileReleaseVideosTabFragment$onVideoAppealDelete$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                ProfileReleaseVideosTabFragment profileReleaseVideosTabFragment = ProfileReleaseVideosTabFragment.this;
                ProfileReleaseVideosTabFragment.Companion companion = ProfileReleaseVideosTabFragment.f28592l;
                profileReleaseVideosTabFragment.m15584c4().m14948b(releaseVideo);
                return Unit.f63088a;
            }
        });
        builder.f30159k = true;
        builder.m16317i();
    }
}
