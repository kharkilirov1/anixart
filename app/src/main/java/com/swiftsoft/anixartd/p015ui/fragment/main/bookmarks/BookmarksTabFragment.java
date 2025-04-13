package com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks;

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
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks.BookmarksTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.bookmarks.BookmarksTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
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

/* compiled from: BookmarksTabFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/bookmarks/BookmarksTabFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabFragment;", "Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksTabView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnFetchCollection;", "onFetchCollection", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "Lcom/swiftsoft/anixartd/utils/OnSilentRefresh;", "onSilentRefresh", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarksTabFragment extends TabFragment implements BookmarksTabView {

    /* renamed from: f */
    @Inject
    public Lazy<BookmarksTabPresenter> f27903f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f27904g;

    /* renamed from: h */
    @NotNull
    public String f27905h;

    /* renamed from: i */
    public EndlessRecyclerViewScrollListener f27906i;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f27907j = new LinkedHashMap();

    /* renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f27902l = {C2052a.m12277l(BookmarksTabFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksTabPresenter;", 0)};

    /* renamed from: k */
    @NotNull
    public static final Companion f27901k = new Companion(null);

    /* compiled from: BookmarksTabFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/bookmarks/BookmarksTabFragment$Companion;", "", "", "ID_VALUE", "Ljava/lang/String;", "SELECTED_INNER_TAB_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BookmarksTabFragment() {
        Function0<BookmarksTabPresenter> function0 = new Function0<BookmarksTabPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.bookmarks.BookmarksTabFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public BookmarksTabPresenter invoke() {
                Lazy<BookmarksTabPresenter> lazy = BookmarksTabFragment.this.f27903f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27904g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(BookmarksTabPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f27905h = "";
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment
    @Nullable
    /* renamed from: A3 */
    public View mo15453A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27907j;
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

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: a */
    public void mo14366a() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: b */
    public void mo14367b() {
        ProgressBar progress_bar = (ProgressBar) mo15453A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: c */
    public void mo14368c() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) mo15453A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final BookmarksTabPresenter m15460c4() {
        return (BookmarksTabPresenter) this.f27904g.getValue(this, f27902l[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: d */
    public void mo14369d() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: e */
    public void mo14370e() {
        ((SwipeRefreshLayout) mo15453A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: i */
    public void mo14371i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: l */
    public void mo14372l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27906i;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15460c4().m14360g();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27907j.clear();
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
        App.f25340b.m14043a().mo14141p(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("SELECTED_INNER_TAB_VALUE", "");
            Intrinsics.m32178g(string, "it.getString(SELECTED_INNER_TAB_VALUE, \"\")");
            this.f27905h = string;
        }
        BookmarksTabPresenter m15460c4 = m15460c4();
        String selectedInnerTab = this.f27905h;
        Objects.requireNonNull(m15460c4);
        Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
        BookmarksTabUiLogic bookmarksTabUiLogic = m15460c4.f26029d;
        Objects.requireNonNull(bookmarksTabUiLogic);
        bookmarksTabUiLogic.f28964b = selectedInnerTab;
        int i2 = 1;
        if (Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_BOOKMARKS_COLLECTIONS") ? true : Intrinsics.m32174c(selectedInnerTab, "INNER_TAB_BOOKMARKS_HISTORY")) {
            bookmarksTabUiLogic.f28972j = false;
        } else {
            bookmarksTabUiLogic.f28972j = true;
        }
        bookmarksTabUiLogic.f28956a = true;
        if (!m15460c4.f26029d.f28970h) {
            BookmarksTabPresenter.m14354c(m15460c4, false, false, 3);
        }
        BookmarksTabUiLogic bookmarksTabUiLogic2 = m15460c4.f26029d;
        String str = bookmarksTabUiLogic2.f28964b;
        switch (str.hashCode()) {
            case -2012826750:
                if (str.equals("INNER_TAB_BOOKMARKS_FAVORITES")) {
                    i2 = m15460c4.f26028c.f25344a.getInt("BOOKMARKS_FAVORITES_SORT", 1);
                    break;
                }
                break;
            case -1817489912:
                if (str.equals("INNER_TAB_BOOKMARKS_WATCHING")) {
                    i2 = m15460c4.f26028c.f25344a.getInt("BOOKMARKS_WATCHING_SORT", 1);
                    break;
                }
                break;
            case -1630519434:
                if (str.equals("INNER_TAB_BOOKMARKS_COMPLETED")) {
                    i2 = m15460c4.f26028c.f25344a.getInt("BOOKMARKS_COMPLETED_SORT", 1);
                    break;
                }
                break;
            case 45737322:
                if (str.equals("INNER_TAB_BOOKMARKS_HOLD_ON")) {
                    i2 = m15460c4.f26028c.f25344a.getInt("BOOKMARKS_HOLD_ON_SORT", 1);
                    break;
                }
                break;
            case 879690667:
                if (str.equals("INNER_TAB_BOOKMARKS_DROPPED")) {
                    i2 = m15460c4.f26028c.f25344a.getInt("BOOKMARKS_DROPPED_SORT", 1);
                    break;
                }
                break;
            case 2121300245:
                if (str.equals("INNER_TAB_BOOKMARKS_PLANS")) {
                    i2 = m15460c4.f26028c.f25344a.getInt("BOOKMARKS_PLANS_SORT", 1);
                    break;
                }
                break;
        }
        bookmarksTabUiLogic2.f28967e = i2;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27907j.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchCollection(@NotNull OnFetchCollection onFetchCollection) {
        Intrinsics.m32179h(onFetchCollection, "onFetchCollection");
        m15460c4().m14357d(onFetchCollection.f30187a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        m15460c4().m14358e(onFetchRelease.f30205a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15460c4().m14359f();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentRefresh(@NotNull OnSilentRefresh onSilentRefresh) {
        Intrinsics.m32179h(onSilentRefresh, "onSilentRefresh");
        m15460c4().m14360g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view.findViewById(C2507R.id.recycler_view);
        int m14081x = m15460c4().f26028c.m14081x();
        if (Intrinsics.m32174c(this.f27905h, "INNER_TAB_BOOKMARKS_COLLECTIONS")) {
            m14081x = 0;
        }
        int i2 = Intrinsics.m32174c(this.f27905h, "INNER_TAB_BOOKMARKS_HISTORY") ? 0 : m14081x;
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "this@BookmarksTabFragment.requireContext()");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(requireContext, i2, m15460c4().f26030e));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.bookmarks.BookmarksTabFragment$onViewCreated$1$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
                BookmarksTabFragment bookmarksTabFragment = BookmarksTabFragment.this;
                BookmarksTabFragment.Companion companion = BookmarksTabFragment.f27901k;
                BookmarksTabPresenter m15460c4 = bookmarksTabFragment.m15460c4();
                m15460c4.f26029d.f28965c++;
                BookmarksTabPresenter.m14354c(m15460c4, false, false, 2);
            }
        };
        this.f27906i = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15460c4().f26030e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r12.equals("INNER_TAB_BOOKMARKS_COMPLETED") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r12.equals("INNER_TAB_BOOKMARKS_FAVORITES") == false) goto L30;
     */
    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: p2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14373p2(@org.jetbrains.annotations.NotNull java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "innerTab"
            kotlin.jvm.internal.Intrinsics.m32179h(r12, r0)
            java.lang.String r0 = "INNER_TAB_BOOKMARKS_FAVORITES"
            boolean r1 = kotlin.jvm.internal.Intrinsics.m32174c(r12, r0)
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L11
            r6 = 3
            goto L12
        L11:
            r6 = 2
        L12:
            int r1 = r12.hashCode()
            switch(r1) {
                case -2012826750: goto L4f;
                case -1817489912: goto L44;
                case -1630519434: goto L3b;
                case 45737322: goto L30;
                case 879690667: goto L25;
                case 2121300245: goto L1a;
                default: goto L19;
            }
        L19:
            goto L55
        L1a:
            java.lang.String r0 = "INNER_TAB_BOOKMARKS_PLANS"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L23
            goto L55
        L23:
            r2 = 2
            goto L56
        L25:
            java.lang.String r0 = "INNER_TAB_BOOKMARKS_DROPPED"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L2e
            goto L55
        L2e:
            r2 = 5
            goto L56
        L30:
            java.lang.String r0 = "INNER_TAB_BOOKMARKS_HOLD_ON"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L39
            goto L55
        L39:
            r2 = 4
            goto L56
        L3b:
            java.lang.String r0 = "INNER_TAB_BOOKMARKS_COMPLETED"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L56
            goto L55
        L44:
            java.lang.String r0 = "INNER_TAB_BOOKMARKS_WATCHING"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L4d
            goto L55
        L4d:
            r2 = 1
            goto L56
        L4f:
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L56
        L55:
            r2 = 0
        L56:
            com.swiftsoft.anixartd.ui.fragment.FragmentNavigation r12 = r11.m15437u3()
            com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$Companion r4 = com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment.f28714t
            r5 = 1
            com.swiftsoft.anixartd.App$Companion r0 = com.swiftsoft.anixartd.App.f25340b
            com.swiftsoft.anixartd.Prefs r0 = r0.m14044b()
            long r0 = r0.m14061d()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 0
            r10 = 16
            com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment r0 = com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment.Companion.m15624c(r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            com.swiftsoft.anixartd.ui.fragment.FragmentNavigation.DefaultImpls.m15439a(r12, r0, r1, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks.BookmarksTabFragment.mo14373p2(java.lang.String):void");
    }

    @Override // com.swiftsoft.anixartd.p015ui.Refreshable
    /* renamed from: u */
    public void mo15322u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) mo15453A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27906i;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15460c4().m14359f();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: v */
    public void mo14374v(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        m15437u3().mo15324d2(CollectionFragment.f27978k.m15479b(collection.getId(), collection), null);
    }
}
