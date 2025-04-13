package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

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
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionListUiController;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.list.CollectionListUiLogic;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
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

/* compiled from: CollectionListFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionListFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionListView;", "Lcom/swiftsoft/anixartd/utils/OnFetchCollection;", "onFetchCollection", "", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionListFragment extends BaseFragment implements CollectionListView {

    /* renamed from: d */
    @Inject
    public Lazy<CollectionListPresenter> f28002d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28003e;

    /* renamed from: f */
    public EndlessRecyclerViewScrollListener f28004f;

    /* renamed from: g */
    @Nullable
    public Integer f28005g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28006h = new LinkedHashMap();

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f28001j = {C2052a.m12277l(CollectionListFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionListPresenter;", 0)};

    /* renamed from: i */
    @NotNull
    public static final Companion f28000i = new Companion(null);

    /* compiled from: CollectionListFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionListFragment$Companion;", "", "", "SELECTED_SORT_VALUE", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CollectionListFragment() {
        Function0<CollectionListPresenter> function0 = new Function0<CollectionListPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionListFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CollectionListPresenter invoke() {
                Lazy<CollectionListPresenter> lazy = CollectionListFragment.this.f28002d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("listPresenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28003e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CollectionListPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15480A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28006h;
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

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: M */
    public void mo14521M() {
        m15437u3().mo15324d2(new CollectionEditorFragment(), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: a */
    public void mo14522a() {
        ProgressBar progress_bar = (ProgressBar) m15480A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: a1 */
    public void mo14523a1() {
        m15437u3().mo15324d2(CollectionProfileListFragment.f28011k.m15486a(m15481c4().f26200b.m14061d(), null, null), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: b */
    public void mo14524b() {
        ProgressBar progress_bar = (ProgressBar) m15480A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: c */
    public void mo14525c() {
        ((SwipeRefreshLayout) m15480A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15480A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15480A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final CollectionListPresenter m15481c4() {
        return (CollectionListPresenter) this.f28003e.getValue(this, f28001j[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: d */
    public void mo14526d() {
        ((SwipeRefreshLayout) m15480A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: e */
    public void mo14527e() {
        ((SwipeRefreshLayout) m15480A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: l */
    public void mo14528l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28004f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionListPresenter m15481c4 = m15481c4();
        CollectionListUiLogic collectionListUiLogic = m15481c4.f26202d;
        if (collectionListUiLogic.f28956a) {
            collectionListUiLogic.m15677a();
            CollectionListPresenter.m14516b(m15481c4, false, false, 2);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: m */
    public void mo14529m() {
        Dialogs.f30143a.m16305b(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28006h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14117d(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("SORT_VALUE")) {
            this.f28005g = Integer.valueOf(arguments.getInt("SORT_VALUE"));
        }
        EventBusKt.m16328b(this);
        CollectionListPresenter m15481c4 = m15481c4();
        Integer num = this.f28005g;
        CollectionListUiLogic collectionListUiLogic = m15481c4.f26202d;
        Objects.requireNonNull(collectionListUiLogic);
        if (num != null) {
            collectionListUiLogic.f29016e = num.intValue();
        }
        if (collectionListUiLogic.f29016e == 6) {
            collectionListUiLogic.f29013b.f28953c = -1;
        }
        collectionListUiLogic.f28956a = true;
        CollectionListPresenter presenter = m15481c4();
        Intrinsics.m32178g(presenter, "presenter");
        CollectionListPresenter.m14516b(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_collections, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.i

            /* renamed from: c */
            public final /* synthetic */ CollectionListFragment f28047c;

            {
                this.f28047c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        CollectionListFragment this$0 = this.f28047c;
                        CollectionListFragment.Companion companion = CollectionListFragment.f28000i;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        CollectionListFragment this$02 = this.f28047c;
                        CollectionListFragment.Companion companion2 = CollectionListFragment.f28000i;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15437u3().mo15324d2(SearchFragment.Companion.m15651a(SearchFragment.f28894p, null, 0, "SECTION_COLLECTIONS", "INNER_TAB_NONE", null, null, null, null, 241), null);
                        break;
                }
            }
        });
        final int i3 = 1;
        ((RelativeLayout) inflate.findViewById(C2507R.id.search)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.i

            /* renamed from: c */
            public final /* synthetic */ CollectionListFragment f28047c;

            {
                this.f28047c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CollectionListFragment this$0 = this.f28047c;
                        CollectionListFragment.Companion companion = CollectionListFragment.f28000i;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        CollectionListFragment this$02 = this.f28047c;
                        CollectionListFragment.Companion companion2 = CollectionListFragment.f28000i;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15437u3().mo15324d2(SearchFragment.Companion.m15651a(SearchFragment.f28894p, null, 0, "SECTION_COLLECTIONS", "INNER_TAB_NONE", null, null, null, null, 241), null);
                        break;
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionListFragment$onCreateView$3$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i4, int i5, @Nullable RecyclerView recyclerView) {
                CollectionListFragment collectionListFragment = CollectionListFragment.this;
                CollectionListFragment.Companion companion = CollectionListFragment.f28000i;
                CollectionListPresenter m15481c4 = collectionListFragment.m15481c4();
                m15481c4.f26202d.f29013b.m15662b();
                CollectionListPresenter.m14516b(m15481c4, false, false, 3);
            }
        };
        this.f28004f = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15481c4().f26203e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 15));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionListFragment$onCreateView$5
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionListFragment$onCreateView$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) CollectionListFragment.this.m15480A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) CollectionListFragment.this.m15480A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                CollectionListFragment.this.m15482u();
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
        this.f28006h.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchCollection(@NotNull OnFetchCollection onFetchCollection) {
        Intrinsics.m32179h(onFetchCollection, "onFetchCollection");
        CollectionListPresenter m15481c4 = m15481c4();
        Collection collection = onFetchCollection.f30187a;
        Objects.requireNonNull(m15481c4);
        Intrinsics.m32179h(collection, "collection");
        if (m15481c4.f26202d.f28956a) {
            if (collection.getDelete() || collection.getIsPrivate()) {
                m15481c4.f26202d.m15678b(collection);
            } else {
                CollectionListUiLogic collectionListUiLogic = m15481c4.f26202d;
                Objects.requireNonNull(collectionListUiLogic);
                Iterator<Collection> it = collectionListUiLogic.f29014c.iterator();
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
                if (i2 >= 0) {
                    collectionListUiLogic.f29014c.set(i2, collection);
                }
            }
            CollectionListUiController collectionListUiController = m15481c4.f26203e;
            CollectionListUiLogic collectionListUiLogic2 = m15481c4.f26202d;
            collectionListUiController.setData(collectionListUiLogic2.f29014c, Integer.valueOf(collectionListUiLogic2.f29016e), Boolean.FALSE, m15481c4.f26201c);
        }
    }

    /* renamed from: u */
    public final void m15482u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15480A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15480A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28004f;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionListPresenter m15481c4 = m15481c4();
        CollectionListUiLogic collectionListUiLogic = m15481c4.f26202d;
        if (collectionListUiLogic.f28956a) {
            collectionListUiLogic.m15677a();
            m15481c4.m14517a(false, true);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListView
    /* renamed from: v */
    public void mo14530v(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        m15437u3().mo15324d2(CollectionFragment.f27978k.m15479b(collection.getId(), collection), null);
    }
}
