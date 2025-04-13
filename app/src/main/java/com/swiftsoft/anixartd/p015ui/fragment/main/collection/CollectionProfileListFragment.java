package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

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
import androidx.room.util.C0576a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionProfileListUiController;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionProfileListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.list.CollectionProfileListUiLogic;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
import com.swiftsoft.anixartd.utils.OnProfileListCollection;
import com.swiftsoft.anixartd.utils.OnSearchCollection;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
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
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionProfileListFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionProfileListFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionProfileListView;", "Lcom/swiftsoft/anixartd/utils/OnSearchCollection;", "onSearchCollection", "", "Lcom/swiftsoft/anixartd/utils/OnFetchCollection;", "onFetchCollection", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionProfileListFragment extends BaseFragment implements CollectionProfileListView {

    /* renamed from: d */
    @Inject
    public Lazy<CollectionProfileListPresenter> f28013d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28014e;

    /* renamed from: f */
    public EndlessRecyclerViewScrollListener f28015f;

    /* renamed from: g */
    public long f28016g;

    /* renamed from: h */
    @Nullable
    public String f28017h;

    /* renamed from: i */
    public boolean f28018i;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f28019j = new LinkedHashMap();

    /* renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f28012l = {C2052a.m12277l(CollectionProfileListFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionProfileListPresenter;", 0)};

    /* renamed from: k */
    @NotNull
    public static final Companion f28011k = new Companion(null);

    /* compiled from: CollectionProfileListFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionProfileListFragment$Companion;", "", "", "EVENT_IDENTIFIER", "Ljava/lang/String;", "IS_EVENT_ONLY_REQUIRED", "PROFILE_ID", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final CollectionProfileListFragment m15486a(long j2, @Nullable String str, @Nullable Boolean bool) {
            CollectionProfileListFragment collectionProfileListFragment = new CollectionProfileListFragment();
            Bundle m4108g = C0576a.m4108g("PROFILE_ID", j2);
            if (str != null) {
                m4108g.putString("EVENT_IDENTIFIER", str);
            }
            if (bool != null) {
                m4108g.putBoolean("IS_EVENT_ONLY_REQUIRED", bool.booleanValue());
            }
            collectionProfileListFragment.setArguments(m4108g);
            return collectionProfileListFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CollectionProfileListFragment() {
        Function0<CollectionProfileListPresenter> function0 = new Function0<CollectionProfileListPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionProfileListFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CollectionProfileListPresenter invoke() {
                Lazy<CollectionProfileListPresenter> lazy = CollectionProfileListFragment.this.f28013d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("listListPresenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28014e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CollectionProfileListPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15483A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28019j;
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

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: M */
    public void mo14534M() {
        m15437u3().mo15324d2(new CollectionEditorFragment(), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: a */
    public void mo14535a() {
        ProgressBar progress_bar = (ProgressBar) m15483A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: b */
    public void mo14536b() {
        ProgressBar progress_bar = (ProgressBar) m15483A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: c */
    public void mo14537c() {
        ((SwipeRefreshLayout) m15483A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15483A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15483A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final CollectionProfileListPresenter m15484c4() {
        return (CollectionProfileListPresenter) this.f28014e.getValue(this, f28012l[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: d */
    public void mo14538d() {
        ((SwipeRefreshLayout) m15483A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: e */
    public void mo14539e() {
        ((SwipeRefreshLayout) m15483A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: l */
    public void mo14540l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28015f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionProfileListPresenter m15484c4 = m15484c4();
        CollectionProfileListUiLogic collectionProfileListUiLogic = m15484c4.f26216d;
        if (collectionProfileListUiLogic.f28956a) {
            collectionProfileListUiLogic.f29021d = 0;
            collectionProfileListUiLogic.f29023f = 0L;
            collectionProfileListUiLogic.f29022e.clear();
            CollectionProfileListPresenter.m14531b(m15484c4, false, false, 2);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28019j.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14135m(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28016g = arguments.getLong("PROFILE_ID");
            if (arguments.containsKey("EVENT_IDENTIFIER")) {
                this.f28017h = arguments.getString("EVENT_IDENTIFIER");
            }
            if (arguments.containsKey("IS_EVENT_ONLY_REQUIRED")) {
                this.f28018i = arguments.getBoolean("IS_EVENT_ONLY_REQUIRED");
            }
        }
        EventBusKt.m16328b(this);
        CollectionProfileListPresenter m15484c4 = m15484c4();
        long j2 = this.f28016g;
        boolean z = this.f28018i;
        CollectionProfileListUiLogic collectionProfileListUiLogic = m15484c4.f26216d;
        collectionProfileListUiLogic.f29019b = j2;
        collectionProfileListUiLogic.f29020c = z;
        collectionProfileListUiLogic.f28956a = true;
        CollectionProfileListPresenter presenter = m15484c4();
        Intrinsics.m32178g(presenter, "presenter");
        CollectionProfileListPresenter.m14531b(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_collections_profile, viewGroup, false);
        if (this.f28016g != m15484c4().f26214b.m14061d()) {
            ((AppCompatTextView) inflate.findViewById(C2507R.id.tvTitle)).setText(getString(C2507R.string.title_collections));
        }
        if (this.f28018i) {
            ((AppCompatTextView) inflate.findViewById(C2507R.id.tvTitle)).setText(getString(C2507R.string.title_collections_choose));
        }
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.j

            /* renamed from: c */
            public final /* synthetic */ CollectionProfileListFragment f28049c;

            {
                this.f28049c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        CollectionProfileListFragment this$0 = this.f28049c;
                        CollectionProfileListFragment.Companion companion = CollectionProfileListFragment.f28011k;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        CollectionProfileListFragment this$02 = this.f28049c;
                        CollectionProfileListFragment.Companion companion2 = CollectionProfileListFragment.f28011k;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15437u3().mo15324d2(SearchFragment.Companion.m15651a(SearchFragment.f28894p, null, 0, this$02.f28016g == this$02.m15484c4().f26214b.m14061d() ? "SECTION_MY_COLLECTIONS" : "SECTION_COLLECTIONS", "INNER_TAB_NONE", Long.valueOf(this$02.f28016g), null, this$02.f28017h, Boolean.valueOf(this$02.f28018i), 33), null);
                        break;
                }
            }
        });
        final int i3 = 1;
        ((RelativeLayout) inflate.findViewById(C2507R.id.search)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.j

            /* renamed from: c */
            public final /* synthetic */ CollectionProfileListFragment f28049c;

            {
                this.f28049c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CollectionProfileListFragment this$0 = this.f28049c;
                        CollectionProfileListFragment.Companion companion = CollectionProfileListFragment.f28011k;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        CollectionProfileListFragment this$02 = this.f28049c;
                        CollectionProfileListFragment.Companion companion2 = CollectionProfileListFragment.f28011k;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15437u3().mo15324d2(SearchFragment.Companion.m15651a(SearchFragment.f28894p, null, 0, this$02.f28016g == this$02.m15484c4().f26214b.m14061d() ? "SECTION_MY_COLLECTIONS" : "SECTION_COLLECTIONS", "INNER_TAB_NONE", Long.valueOf(this$02.f28016g), null, this$02.f28017h, Boolean.valueOf(this$02.f28018i), 33), null);
                        break;
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionProfileListFragment$onCreateView$3$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i4, int i5, @Nullable RecyclerView recyclerView) {
                CollectionProfileListFragment collectionProfileListFragment = CollectionProfileListFragment.this;
                CollectionProfileListFragment.Companion companion = CollectionProfileListFragment.f28011k;
                CollectionProfileListPresenter m15484c4 = collectionProfileListFragment.m15484c4();
                m15484c4.f26216d.f29021d++;
                CollectionProfileListPresenter.m14531b(m15484c4, false, false, 3);
            }
        };
        this.f28015f = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15484c4().f26217e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 16));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionProfileListFragment$onCreateView$5
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionProfileListFragment$onCreateView$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) CollectionProfileListFragment.this.m15483A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) CollectionProfileListFragment.this.m15483A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                CollectionProfileListFragment.this.m15485u();
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
        this.f28019j.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchCollection(@NotNull OnFetchCollection onFetchCollection) {
        Intrinsics.m32179h(onFetchCollection, "onFetchCollection");
        CollectionProfileListPresenter m15484c4 = m15484c4();
        Collection collection = onFetchCollection.f30187a;
        Objects.requireNonNull(m15484c4);
        Intrinsics.m32179h(collection, "collection");
        if (m15484c4.f26216d.f28956a) {
            if (collection.getDelete()) {
                m15484c4.f26216d.m15679a(collection);
            } else {
                CollectionProfileListUiLogic collectionProfileListUiLogic = m15484c4.f26216d;
                Objects.requireNonNull(collectionProfileListUiLogic);
                Iterator<Collection> it = collectionProfileListUiLogic.f29022e.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it.next().getId() == collection.getId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (i2 < 0) {
                    collectionProfileListUiLogic.f29022e.add(0, collection);
                } else {
                    collectionProfileListUiLogic.f29022e.set(i2, collection);
                }
            }
            CollectionProfileListUiController collectionProfileListUiController = m15484c4.f26217e;
            CollectionProfileListUiLogic collectionProfileListUiLogic2 = m15484c4.f26216d;
            collectionProfileListUiController.setData(collectionProfileListUiLogic2.f29022e, Boolean.FALSE, Boolean.valueOf(collectionProfileListUiLogic2.f29019b == m15484c4.f26214b.m14061d()), Boolean.valueOf(m15484c4.f26216d.f29020c), m15484c4.f26215c);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSearchCollection(@NotNull OnSearchCollection onSearchCollection) {
        Intrinsics.m32179h(onSearchCollection, "onSearchCollection");
        mo14541v(onSearchCollection.f30223b);
    }

    /* renamed from: u */
    public final void m15485u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15483A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15483A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28015f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionProfileListPresenter m15484c4 = m15484c4();
        CollectionProfileListUiLogic collectionProfileListUiLogic = m15484c4.f26216d;
        if (collectionProfileListUiLogic.f28956a) {
            collectionProfileListUiLogic.f29021d = 0;
            collectionProfileListUiLogic.f29023f = 0L;
            collectionProfileListUiLogic.f29022e.clear();
            m15484c4.m14532a(false, true);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListView
    /* renamed from: v */
    public void mo14541v(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        if (!this.f28018i) {
            m15437u3().mo15324d2(CollectionFragment.f27978k.m15479b(collection.getId(), collection), null);
        } else {
            EventBusKt.m16327a(new OnProfileListCollection(this.f28017h, collection));
            m15437u3().mo15323a3();
        }
    }
}
