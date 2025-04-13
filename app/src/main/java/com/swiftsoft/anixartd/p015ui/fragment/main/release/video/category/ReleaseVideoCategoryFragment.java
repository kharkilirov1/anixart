package com.swiftsoft.anixartd.p015ui.fragment.main.release.video.category;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.activity.webplayer.WebPlayerActivity;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.release.video.category.ReleaseVideoCategoryUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryPresenter;
import com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideoCategoryFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/video/category/ReleaseVideoCategoryFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/release/video/category/ReleaseVideoCategoryView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideoCategoryFragment extends BaseFragment implements ReleaseVideoCategoryView {

    /* renamed from: d */
    public EndlessRecyclerViewScrollListener f28857d;

    /* renamed from: e */
    @Inject
    public Lazy<ReleaseVideoCategoryPresenter> f28858e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28859f;

    /* renamed from: g */
    public long f28860g;

    /* renamed from: h */
    public ReleaseVideoCategory f28861h;

    /* renamed from: i */
    @NotNull
    public Map<Integer, View> f28862i = new LinkedHashMap();

    /* renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f28856k = {C2052a.m12277l(ReleaseVideoCategoryFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/release/video/category/ReleaseVideoCategoryPresenter;", 0)};

    /* renamed from: j */
    @NotNull
    public static final Companion f28855j = new Companion(null);

    /* compiled from: ReleaseVideoCategoryFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/video/category/ReleaseVideoCategoryFragment$Companion;", "", "", "RELEASE_ID_VALUE", "Ljava/lang/String;", "VIDEO_CATEGORY_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ReleaseVideoCategoryFragment m15640a(long j2, @NotNull ReleaseVideoCategory releaseVideoCategory) {
            ReleaseVideoCategoryFragment releaseVideoCategoryFragment = new ReleaseVideoCategoryFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("RELEASE_ID_VALUE", j2);
            bundle.putSerializable("VIDEO_CATEGORY_VALUE", releaseVideoCategory);
            releaseVideoCategoryFragment.setArguments(bundle);
            return releaseVideoCategoryFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReleaseVideoCategoryFragment() {
        Function0<ReleaseVideoCategoryPresenter> function0 = new Function0<ReleaseVideoCategoryPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleaseVideoCategoryPresenter invoke() {
                Lazy<ReleaseVideoCategoryPresenter> lazy = ReleaseVideoCategoryFragment.this.f28858e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28859f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleaseVideoCategoryPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15637A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28862i;
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: K */
    public void mo15184K(@NotNull ReleaseVideo releaseVideo) {
        Intrinsics.m32179h(releaseVideo, "releaseVideo");
        Context context = getContext();
        startActivityForResult(context != null ? WebPlayerActivity.f27600e.m15356a(context, releaseVideo.getPlayerUrl(), false, false) : null, 1);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: a */
    public void mo15185a() {
        ProgressBar progress_bar = (ProgressBar) m15637A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: b */
    public void mo15186b() {
        ProgressBar progress_bar = (ProgressBar) m15637A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: c */
    public void mo15187c() {
        ((SwipeRefreshLayout) m15637A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15637A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15637A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ReleaseVideoCategoryPresenter m15638c4() {
        return (ReleaseVideoCategoryPresenter) this.f28859f.getValue(this, f28856k[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: d */
    public void mo15188d() {
        ((SwipeRefreshLayout) m15637A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.video.category.ReleaseVideoCategoryView
    /* renamed from: e */
    public void mo15189e() {
        ((SwipeRefreshLayout) m15637A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28862i.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14156w0(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28860g = arguments.getLong("RELEASE_ID_VALUE");
            if (arguments.containsKey("VIDEO_CATEGORY_VALUE")) {
                Serializable serializable = arguments.getSerializable("VIDEO_CATEGORY_VALUE");
                Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory");
                this.f28861h = (ReleaseVideoCategory) serializable;
            }
        }
        ReleaseVideoCategoryPresenter m15638c4 = m15638c4();
        long j2 = this.f28860g;
        ReleaseVideoCategory releaseVideoCategory = this.f28861h;
        if (releaseVideoCategory == null) {
            Intrinsics.m32189r("releaseVideoCategory");
            throw null;
        }
        long id2 = releaseVideoCategory.getId();
        ReleaseVideoCategoryUiLogic releaseVideoCategoryUiLogic = m15638c4.f27168c;
        releaseVideoCategoryUiLogic.f29324b = j2;
        releaseVideoCategoryUiLogic.f29325c = id2;
        releaseVideoCategoryUiLogic.f28956a = true;
        ReleaseVideoCategoryPresenter presenter = m15638c4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseVideoCategoryPresenter.m15182b(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_release_video_category, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 27));
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C2507R.id.title);
        ReleaseVideoCategory releaseVideoCategory = this.f28861h;
        if (releaseVideoCategory == null) {
            Intrinsics.m32189r("releaseVideoCategory");
            throw null;
        }
        appCompatTextView.setText(releaseVideoCategory.getName());
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ReleaseVideoCategoryFragment releaseVideoCategoryFragment = ReleaseVideoCategoryFragment.this;
                ReleaseVideoCategoryFragment.Companion companion = ReleaseVideoCategoryFragment.f28855j;
                ReleaseVideoCategoryPresenter m15638c4 = releaseVideoCategoryFragment.m15638c4();
                m15638c4.f27168c.f29326d++;
                ReleaseVideoCategoryPresenter.m15182b(m15638c4, false, false, 3);
            }
        };
        this.f28857d = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15638c4().f27169d);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2722a(this, 3));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ReleaseVideoCategoryFragment.this.m15637A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ReleaseVideoCategoryFragment.this.m15637A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ReleaseVideoCategoryFragment.this.m15639u();
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
        this.f28862i.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
        EventBusKt.m16327a(new OnAdVisible(true));
    }

    /* renamed from: u */
    public final void m15639u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15637A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15637A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28857d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseVideoCategoryPresenter m15638c4 = m15638c4();
        ReleaseVideoCategoryUiLogic releaseVideoCategoryUiLogic = m15638c4.f27168c;
        if (releaseVideoCategoryUiLogic.f28956a) {
            releaseVideoCategoryUiLogic.f29326d = 0;
            releaseVideoCategoryUiLogic.f29327e.clear();
            m15638c4.m15183a(false, true);
        }
    }
}
