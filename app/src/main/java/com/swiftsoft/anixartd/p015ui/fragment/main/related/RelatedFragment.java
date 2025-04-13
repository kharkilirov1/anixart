package com.swiftsoft.anixartd.p015ui.fragment.main.related;

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
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.controller.main.related.RelatedUiController;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.C2722a;
import com.swiftsoft.anixartd.p015ui.fragment.main.related.RelatedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.related.RelatedUiLogic;
import com.swiftsoft.anixartd.presentation.main.related.RelatedPresenter;
import com.swiftsoft.anixartd.presentation.main.related.RelatedView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnSearchRelease;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.io.Serializable;
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
import kotlin.text.StringsKt;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RelatedFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/related/RelatedFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/related/RelatedView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RelatedFragment extends BaseFragment implements RelatedView {

    /* renamed from: d */
    public EndlessRecyclerViewScrollListener f28638d;

    /* renamed from: e */
    @Inject
    public Lazy<RelatedPresenter> f28639e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28640f;

    /* renamed from: g */
    public long f28641g;

    /* renamed from: h */
    @NotNull
    public String f28642h;

    /* renamed from: i */
    @Nullable
    public String f28643i;

    /* renamed from: j */
    @NotNull
    public String f28644j;

    /* renamed from: k */
    @Nullable
    public Release f28645k;

    /* renamed from: l */
    @Nullable
    public String f28646l;

    /* renamed from: m */
    public boolean f28647m;

    /* renamed from: n */
    @NotNull
    public Map<Integer, View> f28648n = new LinkedHashMap();

    /* renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f28637p = {C2052a.m12277l(RelatedFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/related/RelatedPresenter;", 0)};

    /* renamed from: o */
    @NotNull
    public static final Companion f28636o = new Companion(null);

    /* compiled from: RelatedFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/related/RelatedFragment$Companion;", "", "", "DESCRIPTION_VALUE", "Ljava/lang/String;", "EVENT_IDENTIFIER", "ID_VALUE", "IMAGE_VALUE", "IS_EVENT_ONLY_REQUIRED", "NAME_RU_VALUE", "RELEASE_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public RelatedFragment() {
        Function0<RelatedPresenter> function0 = new Function0<RelatedPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.related.RelatedFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public RelatedPresenter invoke() {
                Lazy<RelatedPresenter> lazy = RelatedFragment.this.f28639e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28640f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(RelatedPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28642h = "";
        this.f28643i = "";
        this.f28644j = "";
    }

    @Nullable
    /* renamed from: A3 */
    public View m15598A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28648n;
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

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: a */
    public void mo15006a() {
        ProgressBar progress_bar = (ProgressBar) m15598A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: b */
    public void mo15007b() {
        ProgressBar progress_bar = (ProgressBar) m15598A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: c */
    public void mo15008c() {
        ((SwipeRefreshLayout) m15598A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15598A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15598A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final RelatedPresenter m15599c4() {
        return (RelatedPresenter) this.f28640f.getValue(this, f28637p[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: d */
    public void mo15009d() {
        ((SwipeRefreshLayout) m15598A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: e */
    public void mo15010e() {
        ((SwipeRefreshLayout) m15598A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.related.RelatedView
    /* renamed from: i */
    public void mo15011i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        if (!this.f28647m) {
            m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
            return;
        }
        EventBusKt.m16327a(new OnSearchRelease(this.f28646l, release));
        m15437u3().mo15323a3();
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28648n.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14090F(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28641g = arguments.getLong("ID_VALUE");
            if (arguments.containsKey("NAME_RU_VALUE")) {
                String string = arguments.getString("NAME_RU_VALUE", "");
                Intrinsics.m32178g(string, "arguments.getString(NAME_RU_VALUE, \"\")");
                this.f28642h = string;
            }
            if (arguments.containsKey("DESCRIPTION_VALUE")) {
                this.f28643i = arguments.getString("DESCRIPTION_VALUE", "");
            }
            if (arguments.containsKey("IMAGE_VALUE")) {
                String string2 = arguments.getString("IMAGE_VALUE", "");
                Intrinsics.m32178g(string2, "arguments.getString(IMAGE_VALUE, \"\")");
                this.f28644j = string2;
            }
            if (arguments.containsKey("RELEASE_VALUE")) {
                Serializable serializable = arguments.getSerializable("RELEASE_VALUE");
                Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
                this.f28645k = (Release) serializable;
            }
            if (arguments.containsKey("EVENT_IDENTIFIER")) {
                this.f28646l = arguments.getString("EVENT_IDENTIFIER");
            }
            if (arguments.containsKey("IS_EVENT_ONLY_REQUIRED")) {
                this.f28647m = arguments.getBoolean("IS_EVENT_ONLY_REQUIRED");
            }
        }
        RelatedPresenter m15599c4 = m15599c4();
        long j2 = this.f28641g;
        String nameRu = this.f28642h;
        String str = this.f28643i;
        String image = this.f28644j;
        Release release = this.f28645k;
        Objects.requireNonNull(m15599c4);
        Intrinsics.m32179h(nameRu, "nameRu");
        Intrinsics.m32179h(image, "image");
        RelatedUiLogic relatedUiLogic = m15599c4.f26926c;
        Objects.requireNonNull(relatedUiLogic);
        relatedUiLogic.f29253b = j2;
        relatedUiLogic.f29254c = nameRu;
        relatedUiLogic.f29255d = str;
        relatedUiLogic.f29256e = image;
        relatedUiLogic.f29257f = release;
        relatedUiLogic.f28956a = true;
        RelatedPresenter presenter = m15599c4();
        Intrinsics.m32178g(presenter, "presenter");
        presenter.m15003a(presenter.f26927d.isEmpty(), false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_related, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 25));
        int i2 = 1;
        if (!StringsKt.m33879E(this.f28642h)) {
            String str = this.f28643i;
            if (!(str == null || StringsKt.m33879E(str))) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C2507R.id.title);
                Intrinsics.m32178g(appCompatTextView, "view.title");
                ViewsKt.m16372e(appCompatTextView);
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
                final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
                EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.related.RelatedFragment$onCreateView$2$1
                    @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
                    /* renamed from: e */
                    public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
                        RelatedFragment relatedFragment = RelatedFragment.this;
                        RelatedFragment.Companion companion = RelatedFragment.f28636o;
                        RelatedPresenter m15599c4 = relatedFragment.m15599c4();
                        m15599c4.f26926c.f29258g++;
                        m15599c4.m15003a(m15599c4.f26927d.isEmpty(), false);
                    }
                };
                this.f28638d = endlessRecyclerViewScrollListener;
                epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
                epoxyRecyclerView.setController(m15599c4().f26927d);
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
                swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
                swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
                swipeRefreshLayout.setOnRefreshListener(new C2722a(this, i2));
                MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
                Intrinsics.m32178g(materialButton, "view.help");
                ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.related.RelatedFragment$onCreateView$4
                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(View view) {
                        C2052a.m12281p(view, "it");
                        return Unit.f63088a;
                    }
                });
                MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
                Intrinsics.m32178g(materialButton2, "view.repeat");
                ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.related.RelatedFragment$onCreateView$5
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(View view) {
                        View it = view;
                        Intrinsics.m32179h(it, "it");
                        ((SwipeRefreshLayout) RelatedFragment.this.m15598A3(C2507R.id.refresh)).setEnabled(true);
                        LinearLayout error_layout = (LinearLayout) RelatedFragment.this.m15598A3(C2507R.id.error_layout);
                        Intrinsics.m32178g(error_layout, "error_layout");
                        ViewsKt.m16372e(error_layout);
                        RelatedFragment.this.m15600u();
                        return Unit.f63088a;
                    }
                });
                return inflate;
            }
        }
        if (!StringsKt.m33879E(this.f28642h)) {
            ((AppCompatTextView) inflate.findViewById(C2507R.id.title)).setText(this.f28642h);
        }
        EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager2 = epoxyRecyclerView2.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener2 = new EndlessRecyclerViewScrollListener(layoutManager2) { // from class: com.swiftsoft.anixartd.ui.fragment.main.related.RelatedFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
                RelatedFragment relatedFragment = RelatedFragment.this;
                RelatedFragment.Companion companion = RelatedFragment.f28636o;
                RelatedPresenter m15599c4 = relatedFragment.m15599c4();
                m15599c4.f26926c.f29258g++;
                m15599c4.m15003a(m15599c4.f26927d.isEmpty(), false);
            }
        };
        this.f28638d = endlessRecyclerViewScrollListener2;
        epoxyRecyclerView2.m3806m(endlessRecyclerViewScrollListener2);
        epoxyRecyclerView2.setController(m15599c4().f26927d);
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout2.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout2.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout2.setOnRefreshListener(new C2722a(this, i2));
        MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton3, "view.help");
        ViewsKt.m16377j(materialButton3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.related.RelatedFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton22 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton22, "view.repeat");
        ViewsKt.m16377j(materialButton22, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.related.RelatedFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) RelatedFragment.this.m15598A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) RelatedFragment.this.m15598A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                RelatedFragment.this.m15600u();
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28648n.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        RelatedPresenter m15599c4 = m15599c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15599c4);
        Intrinsics.m32179h(release, "release");
        RelatedUiLogic relatedUiLogic = m15599c4.f26926c;
        if (relatedUiLogic.f28956a) {
            Iterator<Release> it = relatedUiLogic.f29259h.iterator();
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
                relatedUiLogic.f29259h.set(i2, release);
            }
            RelatedUiController relatedUiController = m15599c4.f26927d;
            Release release2 = m15599c4.f26926c.f29257f;
            Long valueOf = Long.valueOf(release2 != null ? release2.getId() : -1L);
            RelatedUiLogic relatedUiLogic2 = m15599c4.f26926c;
            relatedUiController.setData(valueOf, relatedUiLogic2.f29254c, relatedUiLogic2.f29255d, relatedUiLogic2.f29256e, relatedUiLogic2.f29259h, Long.valueOf(relatedUiLogic2.f29260i), Boolean.FALSE, m15599c4.f26925b);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
    }

    /* renamed from: u */
    public final void m15600u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15598A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15598A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28638d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        RelatedPresenter m15599c4 = m15599c4();
        RelatedUiLogic relatedUiLogic = m15599c4.f26926c;
        if (relatedUiLogic.f28956a) {
            relatedUiLogic.f29258g = 0;
            relatedUiLogic.f29260i = 0L;
            relatedUiLogic.f29259h.clear();
            m15599c4.m15003a(false, true);
        }
    }
}
