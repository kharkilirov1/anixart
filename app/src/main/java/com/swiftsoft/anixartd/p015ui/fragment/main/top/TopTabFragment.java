package com.swiftsoft.anixartd.p015ui.fragment.main.top;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.room.util.C0576a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.top.TopTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.top.TopTabPresenter;
import com.swiftsoft.anixartd.presentation.main.top.TopTabView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.Iterator;
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

/* compiled from: TopTabFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/top/TopTabFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabFragment;", "Lcom/swiftsoft/anixartd/presentation/main/top/TopTabView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TopTabFragment extends TabFragment implements TopTabView {

    /* renamed from: f */
    @Inject
    public Lazy<TopTabPresenter> f28934f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28935g;

    /* renamed from: h */
    @Nullable
    public Long f28936h;

    /* renamed from: i */
    @Nullable
    public Long f28937i;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f28938j = new LinkedHashMap();

    /* renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f28933l = {C2052a.m12277l(TopTabFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/top/TopTabPresenter;", 0)};

    /* renamed from: k */
    @NotNull
    public static final Companion f28932k = new Companion(null);

    /* compiled from: TopTabFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/top/TopTabFragment$Companion;", "", "", "BUNDLE_CURRENT_PAGE", "Ljava/lang/String;", "CATEGORY_ID_VALUE", "ID_VALUE", "STATUS_ID_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public static TopTabFragment m15657a(Companion companion, long j2, Long l2, Long l3, int i2) {
            if ((i2 & 2) != 0) {
                l2 = null;
            }
            if ((i2 & 4) != 0) {
                l3 = null;
            }
            Objects.requireNonNull(companion);
            TopTabFragment topTabFragment = new TopTabFragment();
            Bundle m4108g = C0576a.m4108g("ID_VALUE", j2);
            if (l2 != null) {
                m4108g.putLong("CATEGORY_ID_VALUE", l2.longValue());
            }
            if (l3 != null) {
                m4108g.putLong("STATUS_ID_VALUE", l3.longValue());
            }
            topTabFragment.setArguments(m4108g);
            return topTabFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TopTabFragment() {
        Function0<TopTabPresenter> function0 = new Function0<TopTabPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.top.TopTabFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public TopTabPresenter invoke() {
                Lazy<TopTabPresenter> lazy = TopTabFragment.this.f28934f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28935g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(TopTabPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment
    @Nullable
    /* renamed from: A3 */
    public View mo15453A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28938j;
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

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: K3 */
    public void mo15243K3() {
        SwipeRefreshLayout refresh = (SwipeRefreshLayout) mo15453A3(C2507R.id.refresh);
        Intrinsics.m32178g(refresh, "refresh");
        ViewsKt.m16378k(refresh);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: a */
    public void mo15244a() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: b */
    public void mo15245b() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: c */
    public void mo15246c() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) mo15453A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final TopTabPresenter m15656c4() {
        return (TopTabPresenter) this.f28935g.getValue(this, f28933l[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: d */
    public void mo15247d() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: e */
    public void mo15248e() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.top.TopTabView
    /* renamed from: i */
    public void mo15249i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28938j.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14149t(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("CATEGORY_ID_VALUE")) {
                this.f28936h = Long.valueOf(arguments.getLong("CATEGORY_ID_VALUE"));
            }
            if (arguments.containsKey("STATUS_ID_VALUE")) {
                this.f28937i = Long.valueOf(arguments.getLong("STATUS_ID_VALUE"));
            }
        }
        TopTabPresenter m15656c4 = m15656c4();
        Long l2 = this.f28936h;
        Long l3 = this.f28937i;
        TopTabUiLogic topTabUiLogic = m15656c4.f27259b;
        topTabUiLogic.f29365b = l2;
        topTabUiLogic.f29366c = l3;
        topTabUiLogic.f28956a = true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28938j.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        TopTabPresenter m15656c4 = m15656c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15656c4);
        Intrinsics.m32179h(release, "release");
        TopTabUiLogic topTabUiLogic = m15656c4.f27259b;
        if (topTabUiLogic.f28956a) {
            Iterator<Release> it = topTabUiLogic.f29368e.iterator();
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
                topTabUiLogic.f29368e.set(i2, release);
            }
            m15656c4.f27260c.setData(m15656c4.f27259b.f29368e, m15656c4.f27261d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        ((EpoxyRecyclerView) view.findViewById(C2507R.id.recycler_view)).setController(m15656c4().f27260c);
        if (m15656c4().f27259b.f29369f) {
            return;
        }
        TopTabPresenter presenter = m15656c4();
        Intrinsics.m32178g(presenter, "presenter");
        presenter.m15240a(presenter.f27260c.isEmpty(), false);
    }

    @Override // com.swiftsoft.anixartd.p015ui.Refreshable
    /* renamed from: u */
    public void mo15322u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view)).m3826w0(0);
        TopTabPresenter m15656c4 = m15656c4();
        if (m15656c4.f27259b.f28956a) {
            if (m15656c4.f27260c.isEmpty()) {
                m15656c4.m15240a(m15656c4.f27260c.isEmpty(), false);
            } else {
                m15656c4.m15240a(false, true);
            }
        }
    }
}
