package com.swiftsoft.anixartd.p015ui.fragment.main.release.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.webplayer.WebPlayerActivity;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.ReleaseVideosFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.appeal.ReleaseVideoAppealFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.release.video.ReleaseVideosUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.util.HashMap;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideosFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/video/ReleaseVideosFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/release/video/ReleaseVideosView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideosFragment extends BaseFragment implements ReleaseVideosView {

    /* renamed from: d */
    public EndlessRecyclerViewScrollListener f28829d;

    /* renamed from: e */
    @Inject
    public Lazy<ReleaseVideosPresenter> f28830e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28831f;

    /* renamed from: g */
    public long f28832g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28833h = new LinkedHashMap();

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f28828j = {C2052a.m12277l(ReleaseVideosFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/release/video/ReleaseVideosPresenter;", 0)};

    /* renamed from: i */
    @NotNull
    public static final Companion f28827i = new Companion(null);

    /* compiled from: ReleaseVideosFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/video/ReleaseVideosFragment$Companion;", "", "", "ID_VALUE", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReleaseVideosFragment() {
        Function0<ReleaseVideosPresenter> function0 = new Function0<ReleaseVideosPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.ReleaseVideosFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleaseVideosPresenter invoke() {
                Lazy<ReleaseVideosPresenter> lazy = ReleaseVideosFragment.this.f28830e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28831f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleaseVideosPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15632A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28833h;
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: K */
    public void mo15160K(@NotNull ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        Context context = getContext();
        startActivityForResult(context != null ? WebPlayerActivity.f27600e.m15356a(context, releaseVideo.getPlayerUrl(), false, false) : null, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: K1 */
    public void mo15161K1(boolean z) {
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: T0 */
    public void mo15162T0(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        String m16296a = new Common().m16296a(url);
        HashMap hashMap = new HashMap();
        hashMap.put(m16296a, Long.valueOf(this.f28832g));
        YandexMetrica.reportEvent("Открытие стриминг платформы", hashMap);
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        common.m16300e(requireContext, url);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: a */
    public void mo15163a() {
        ProgressBar progress_bar = (ProgressBar) m15632A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: b */
    public void mo15164b() {
        ProgressBar progress_bar = (ProgressBar) m15632A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: c */
    public void mo15165c() {
        ((SwipeRefreshLayout) m15632A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15632A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15632A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ReleaseVideosPresenter m15633c4() {
        return (ReleaseVideosPresenter) this.f28831f.getValue(this, f28828j[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: d */
    public void mo15166d() {
        ((SwipeRefreshLayout) m15632A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: e */
    public void mo15167e() {
        ((SwipeRefreshLayout) m15632A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28833h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14106V(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28832g = arguments.getLong("ID_VALUE");
        }
        ReleaseVideosPresenter m15633c4 = m15633c4();
        long j2 = this.f28832g;
        ReleaseVideosUiLogic releaseVideosUiLogic = m15633c4.f27128d;
        releaseVideosUiLogic.f29311b = j2;
        releaseVideosUiLogic.f28956a = true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable final Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_release_videos, viewGroup, false);
        ((FloatingActionButton) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.a

            /* renamed from: c */
            public final /* synthetic */ ReleaseVideosFragment f28839c;

            {
                this.f28839c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ReleaseVideosFragment this$0 = this.f28839c;
                        ReleaseVideosFragment.Companion companion = ReleaseVideosFragment.f28827i;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        ReleaseVideosFragment this$02 = this.f28839c;
                        ReleaseVideosFragment.Companion companion2 = ReleaseVideosFragment.f28827i;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15633c4().f27126b.m14083z()) {
                            FragmentNavigation m15437u3 = this$02.m15437u3();
                            ReleaseVideoAppealFragment.Companion companion3 = ReleaseVideoAppealFragment.f28840l;
                            long j2 = this$02.f28832g;
                            Objects.requireNonNull(companion3);
                            ReleaseVideoAppealFragment releaseVideoAppealFragment = new ReleaseVideoAppealFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("ID_VALUE", j2);
                            releaseVideoAppealFragment.setArguments(bundle2);
                            m15437u3.mo15324d2(releaseVideoAppealFragment, null);
                            break;
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                }
            }
        });
        final int i3 = 1;
        ((FloatingActionButton) inflate.findViewById(C2507R.id.video_appeal)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.a

            /* renamed from: c */
            public final /* synthetic */ ReleaseVideosFragment f28839c;

            {
                this.f28839c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ReleaseVideosFragment this$0 = this.f28839c;
                        ReleaseVideosFragment.Companion companion = ReleaseVideosFragment.f28827i;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        ReleaseVideosFragment this$02 = this.f28839c;
                        ReleaseVideosFragment.Companion companion2 = ReleaseVideosFragment.f28827i;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15633c4().f27126b.m14083z()) {
                            FragmentNavigation m15437u3 = this$02.m15437u3();
                            ReleaseVideoAppealFragment.Companion companion3 = ReleaseVideoAppealFragment.f28840l;
                            long j2 = this$02.f28832g;
                            Objects.requireNonNull(companion3);
                            ReleaseVideoAppealFragment releaseVideoAppealFragment = new ReleaseVideoAppealFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("ID_VALUE", j2);
                            releaseVideoAppealFragment.setArguments(bundle2);
                            m15437u3.mo15324d2(releaseVideoAppealFragment, null);
                            break;
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(bundle, layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.ReleaseVideosFragment$onCreateView$3$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i4, int i5, @Nullable RecyclerView recyclerView) {
                ReleaseVideosFragment releaseVideosFragment = this;
                ReleaseVideosFragment.Companion companion = ReleaseVideosFragment.f28827i;
                ReleaseVideosPresenter m15633c4 = releaseVideosFragment.m15633c4();
                m15633c4.f27128d.f29312c++;
                ReleaseVideosPresenter.m15154c(m15633c4, false, false, 3);
            }
        };
        this.f28829d = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15633c4().f27129e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2722a(this, 2));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.ReleaseVideosFragment$onCreateView$5
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.ReleaseVideosFragment$onCreateView$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ReleaseVideosFragment.this.m15632A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ReleaseVideosFragment.this.m15632A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ReleaseVideosFragment.this.m15634u();
                return Unit.f63088a;
            }
        });
        EventBusKt.m16327a(new OnBottomNavigation(true));
        EventBusKt.m16327a(new OnAdVisible(true));
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28833h.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
        EventBusKt.m16327a(new OnAdVisible(true));
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28829d;
        if (endlessRecyclerViewScrollListener != null) {
            endlessRecyclerViewScrollListener.m15319f(outState);
        } else {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        if (bundle == null) {
            ReleaseVideosPresenter presenter = m15633c4();
            Intrinsics.m32178g(presenter, "presenter");
            presenter.m15156b(presenter.m15155a(), false);
        }
    }

    /* renamed from: u */
    public final void m15634u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15632A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15632A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28829d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseVideosPresenter m15633c4 = m15633c4();
        ReleaseVideosUiLogic releaseVideosUiLogic = m15633c4.f27128d;
        if (releaseVideosUiLogic.f28956a) {
            releaseVideosUiLogic.f29312c = 0;
            releaseVideosUiLogic.f29313d = null;
            releaseVideosUiLogic.f29314e.clear();
            releaseVideosUiLogic.f29315f.clear();
            releaseVideosUiLogic.f29316g.clear();
            releaseVideosUiLogic.f29318i.clear();
            releaseVideosUiLogic.f29319j = false;
            releaseVideosUiLogic.f29320k = false;
            m15633c4.m15156b(false, true);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.ReleaseVideosView
    /* renamed from: x1 */
    public void mo15168x1(@NotNull ReleaseVideoCategory videoCategory) {
        Intrinsics.m32179h(videoCategory, "videoCategory");
        if (m15633c4().f27126b.m14083z()) {
            Dialogs.f30143a.m16305b(this);
        } else {
            m15437u3().mo15324d2(ReleaseVideoCategoryFragment.f28855j.m15640a(this.f28832g, videoCategory), null);
        }
    }
}
