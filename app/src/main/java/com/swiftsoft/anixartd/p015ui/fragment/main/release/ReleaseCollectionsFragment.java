package com.swiftsoft.anixartd.p015ui.fragment.main.release;

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
import com.google.firebase.components.C2060a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCollectionsFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseCollectionsUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter;
import com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.io.Serializable;
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

/* compiled from: ReleaseCollectionsFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseCollectionsFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/release/collections/ReleaseCollectionsView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCollectionsFragment extends BaseFragment implements ReleaseCollectionsView {

    /* renamed from: d */
    public EndlessRecyclerViewScrollListener f28655d;

    /* renamed from: e */
    @Inject
    public Lazy<ReleaseCollectionsPresenter> f28656e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28657f;

    /* renamed from: g */
    public Release f28658g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28659h = new LinkedHashMap();

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f28654j = {C2052a.m12277l(ReleaseCollectionsFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/release/collections/ReleaseCollectionsPresenter;", 0)};

    /* renamed from: i */
    @NotNull
    public static final Companion f28653i = new Companion(null);

    /* compiled from: ReleaseCollectionsFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseCollectionsFragment$Companion;", "", "", "RELEASE_VALUE", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReleaseCollectionsFragment() {
        Function0<ReleaseCollectionsPresenter> function0 = new Function0<ReleaseCollectionsPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCollectionsFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleaseCollectionsPresenter invoke() {
                Lazy<ReleaseCollectionsPresenter> lazy = ReleaseCollectionsFragment.this.f28656e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28657f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleaseCollectionsPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15601A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28659h;
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: a */
    public void mo15079a() {
        ProgressBar progress_bar = (ProgressBar) m15601A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: b */
    public void mo15080b() {
        ProgressBar progress_bar = (ProgressBar) m15601A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: c */
    public void mo15081c() {
        ((SwipeRefreshLayout) m15601A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15601A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15601A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ReleaseCollectionsPresenter m15602c4() {
        return (ReleaseCollectionsPresenter) this.f28657f.getValue(this, f28654j[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: d */
    public void mo15082d() {
        ((SwipeRefreshLayout) m15601A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: e */
    public void mo15083e() {
        ((SwipeRefreshLayout) m15601A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: l */
    public void mo15084l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28655d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseCollectionsPresenter m15602c4 = m15602c4();
        ReleaseCollectionsUiLogic releaseCollectionsUiLogic = m15602c4.f27025c;
        if (releaseCollectionsUiLogic.f28956a) {
            releaseCollectionsUiLogic.f29265e = 0;
            releaseCollectionsUiLogic.f29267g = 0L;
            releaseCollectionsUiLogic.f29266f.clear();
            ReleaseCollectionsPresenter.m15076b(m15602c4, false, false, 2);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28659h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14140o0(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("RELEASE_VALUE");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
            this.f28658g = (Release) serializable;
        }
        ReleaseCollectionsPresenter m15602c4 = m15602c4();
        Release release = this.f28658g;
        if (release == null) {
            Intrinsics.m32189r("release");
            throw null;
        }
        Objects.requireNonNull(m15602c4);
        ReleaseCollectionsUiLogic releaseCollectionsUiLogic = m15602c4.f27025c;
        Objects.requireNonNull(releaseCollectionsUiLogic);
        releaseCollectionsUiLogic.f29262b = release.getId();
        releaseCollectionsUiLogic.f29263c = release;
        releaseCollectionsUiLogic.f28956a = true;
        ReleaseCollectionsPresenter presenter = m15602c4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseCollectionsPresenter.m15076b(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_release_collections, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2726a(this, i2));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCollectionsFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
                ReleaseCollectionsFragment releaseCollectionsFragment = ReleaseCollectionsFragment.this;
                ReleaseCollectionsFragment.Companion companion = ReleaseCollectionsFragment.f28653i;
                ReleaseCollectionsPresenter m15602c4 = releaseCollectionsFragment.m15602c4();
                m15602c4.f27025c.f29265e++;
                ReleaseCollectionsPresenter.m15076b(m15602c4, false, false, 3);
            }
        };
        this.f28655d = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15602c4().f27026d);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2060a(this, i2));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCollectionsFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCollectionsFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ReleaseCollectionsFragment.this.m15601A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ReleaseCollectionsFragment.this.m15601A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ReleaseCollectionsFragment.this.m15603u();
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28659h.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
    }

    /* renamed from: u */
    public final void m15603u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15601A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15601A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28655d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseCollectionsPresenter m15602c4 = m15602c4();
        ReleaseCollectionsUiLogic releaseCollectionsUiLogic = m15602c4.f27025c;
        if (releaseCollectionsUiLogic.f28956a) {
            releaseCollectionsUiLogic.f29265e = 0;
            releaseCollectionsUiLogic.f29267g = 0L;
            releaseCollectionsUiLogic.f29266f.clear();
            m15602c4.m15077a(false, true);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsView
    /* renamed from: v */
    public void mo15085v(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        m15437u3().mo15324d2(CollectionFragment.f27978k.m15479b(collection.getId(), collection), null);
    }
}
