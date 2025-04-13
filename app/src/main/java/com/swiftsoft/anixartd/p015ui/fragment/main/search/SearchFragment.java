package com.swiftsoft.anixartd.p015ui.fragment.main.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.related.RelatedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.search.SearchUiLogic;
import com.swiftsoft.anixartd.presentation.main.search.SearchPresenter;
import com.swiftsoft.anixartd.presentation.main.search.SearchView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.Keyboard;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
import com.swiftsoft.anixartd.utils.OnFetchProfile;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.OnSearchCollection;
import com.swiftsoft.anixartd.utils.OnSearchProfile;
import com.swiftsoft.anixartd.utils.OnSearchRelease;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.ArrayList;
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

/* compiled from: SearchFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/search/SearchFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BackPressedListener;", "Lcom/swiftsoft/anixartd/presentation/main/search/SearchView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnFetchCollection;", "onFetchCollection", "Lcom/swiftsoft/anixartd/utils/OnFetchProfile;", "onFetchProfile", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SearchFragment extends BaseFragment implements BackPressedListener, SearchView {

    /* renamed from: d */
    @Inject
    public Lazy<SearchPresenter> f28896d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28897e;

    /* renamed from: f */
    public String f28898f;

    /* renamed from: g */
    public int f28899g;

    /* renamed from: h */
    public String f28900h;

    /* renamed from: i */
    public String f28901i;

    /* renamed from: j */
    @Nullable
    public String f28902j;

    /* renamed from: k */
    public boolean f28903k;

    /* renamed from: l */
    @Nullable
    public Long f28904l;

    /* renamed from: m */
    @Nullable
    public Long f28905m;

    /* renamed from: n */
    public EndlessRecyclerViewScrollListener f28906n;

    /* renamed from: o */
    @NotNull
    public Map<Integer, View> f28907o = new LinkedHashMap();

    /* renamed from: q */
    public static final /* synthetic */ KProperty<Object>[] f28895q = {C2052a.m12277l(SearchFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/search/SearchPresenter;", 0)};

    /* renamed from: p */
    @NotNull
    public static final Companion f28894p = new Companion(null);

    /* compiled from: SearchFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/search/SearchFragment$Companion;", "", "", "EVENT_IDENTIFIER", "Ljava/lang/String;", "IS_EVENT_ONLY_REQUIRED", "SEARCH_BY", "SEARCH_QUERY", "SELECTED_INNER_TAB_VALUE", "SELECTED_PROFILE_ID", "SELECTED_RELEASE_ID", "SELECTED_TAB_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public static SearchFragment m15651a(Companion companion, String searchQuery, int i2, String selectedTab, String selectedInnerTab, Long l2, Long l3, String str, Boolean bool, int i3) {
            if ((i3 & 1) != 0) {
                searchQuery = "";
            }
            if ((i3 & 16) != 0) {
                l2 = null;
            }
            if ((i3 & 64) != 0) {
                str = null;
            }
            if ((i3 & 128) != 0) {
                bool = null;
            }
            Objects.requireNonNull(companion);
            Intrinsics.m32179h(searchQuery, "searchQuery");
            Intrinsics.m32179h(selectedTab, "selectedTab");
            Intrinsics.m32179h(selectedInnerTab, "selectedInnerTab");
            SearchFragment searchFragment = new SearchFragment();
            Bundle bundle = new Bundle();
            bundle.putString("SEARCH_QUERY", searchQuery);
            bundle.putInt("SEARCH_BY", i2);
            bundle.putString("SELECTED_TAB_VALUE", selectedTab);
            bundle.putString("SELECTED_INNER_TAB_VALUE", selectedInnerTab);
            if (l2 != null) {
                bundle.putLong("SELECTED_PROFILE_ID", l2.longValue());
            }
            if (str != null) {
                bundle.putString("EVENT_IDENTIFIER", str);
            }
            if (bool != null) {
                bundle.putBoolean("IS_EVENT_ONLY_REQUIRED", bool.booleanValue());
            }
            searchFragment.setArguments(bundle);
            return searchFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SearchFragment() {
        Function0<SearchPresenter> function0 = new Function0<SearchPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.search.SearchFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SearchPresenter invoke() {
                Lazy<SearchPresenter> lazy = SearchFragment.this.f28896d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28897e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(SearchPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener
    /* renamed from: A2 */
    public boolean mo15435A2() {
        Objects.requireNonNull(m15647c4());
        return true;
    }

    @Nullable
    /* renamed from: A3 */
    public View m15646A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28907o;
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

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: C2 */
    public void mo15221C2(@NotNull String query) {
        Intrinsics.m32179h(query, "query");
        ((AppCompatEditText) m15646A3(C2507R.id.etSearch)).setText(query);
        ((RelativeLayout) m15646A3(C2507R.id.root)).requestFocus();
        Keyboard.f30166a.m16340a(this);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28906n;
        if (endlessRecyclerViewScrollListener != null) {
            endlessRecyclerViewScrollListener.m15320g();
        } else {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: O */
    public void mo15222O() {
        LinearLayout error_layout = (LinearLayout) m15646A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16372e(error_layout);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15646A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: Q2 */
    public void mo15223Q2(long j2, @NotNull String nameRu, @Nullable String str, @NotNull String image) {
        Intrinsics.m32179h(nameRu, "nameRu");
        Intrinsics.m32179h(image, "image");
        Keyboard.f30166a.m16340a(this);
        FragmentNavigation m15437u3 = m15437u3();
        RelatedFragment.Companion companion = RelatedFragment.f28636o;
        String str2 = this.f28902j;
        Boolean valueOf = Boolean.valueOf(this.f28903k);
        Objects.requireNonNull(companion);
        RelatedFragment relatedFragment = new RelatedFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ID_VALUE", j2);
        bundle.putString("NAME_RU_VALUE", nameRu);
        bundle.putString("DESCRIPTION_VALUE", str);
        bundle.putString("IMAGE_VALUE", image);
        if (str2 != null) {
            bundle.putString("EVENT_IDENTIFIER", str2);
        }
        if (valueOf != null) {
            bundle.putBoolean("IS_EVENT_ONLY_REQUIRED", valueOf.booleanValue());
        }
        relatedFragment.setArguments(bundle);
        m15437u3.mo15324d2(relatedFragment, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: a */
    public void mo15224a() {
        ProgressBar progress_bar = (ProgressBar) m15646A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: b */
    public void mo15225b() {
        ProgressBar progress_bar = (ProgressBar) m15646A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: c */
    public void mo15226c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15646A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15646A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final SearchPresenter m15647c4() {
        return (SearchPresenter) this.f28897e.getValue(this, f28895q[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: d */
    public void mo15227d() {
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: e */
    public void mo15228e() {
    }

    @NotNull
    /* renamed from: e4 */
    public final String m15648e4() {
        String str = this.f28898f;
        if (str != null) {
            return str;
        }
        Intrinsics.m32189r("searchQuery");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: i */
    public void mo15229i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        Keyboard.f30166a.m16340a(this);
        if (!this.f28903k) {
            m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
        } else {
            EventBusKt.m16327a(new OnSearchRelease(this.f28902j, release));
            m15437u3().mo15323a3();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: j3 */
    public void mo15230j3(@NotNull Profile profile) {
        Intrinsics.m32179h(profile, "profile");
        Keyboard.f30166a.m16340a(this);
        if (!this.f28903k) {
            m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, profile.getId(), false, 2), null);
        } else {
            EventBusKt.m16327a(new OnSearchProfile(this.f28902j, profile));
            m15437u3().mo15323a3();
        }
    }

    @NotNull
    /* renamed from: m4 */
    public final String m15649m4() {
        String str = this.f28901i;
        if (str != null) {
            return str;
        }
        Intrinsics.m32189r("selectedInnerTab");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28907o.clear();
    }

    @NotNull
    /* renamed from: n4 */
    public final String m15650n4() {
        String str = this.f28900h;
        if (str != null) {
            return str;
        }
        Intrinsics.m32189r("selectedTab");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100 && i3 == -1 && intent != null) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            SearchUiLogic searchUiLogic = m15647c4().f27207c;
            Intrinsics.m32176e(stringArrayListExtra);
            String str = stringArrayListExtra.get(0);
            Intrinsics.m32178g(str, "result!![0]");
            searchUiLogic.m15710f(str);
            ((AppCompatEditText) m15646A3(C2507R.id.etSearch)).setText(m15647c4().f27207c.f29346g);
            ((AppCompatEditText) m15646A3(C2507R.id.etSearch)).setSelection(m15647c4().f27207c.f29346g.length());
            SearchPresenter presenter = m15647c4();
            Intrinsics.m32178g(presenter, "presenter");
            SearchPresenter.m15210g(presenter, false, false, 3);
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14132k0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("SEARCH_QUERY", "");
            Intrinsics.m32178g(string, "arguments.getString(SEARCH_QUERY, \"\")");
            this.f28898f = string;
            this.f28899g = arguments.getInt("SEARCH_BY", 0);
            String string2 = arguments.getString("SELECTED_TAB_VALUE", "");
            Intrinsics.m32178g(string2, "arguments.getString(SELECTED_TAB_VALUE, \"\")");
            this.f28900h = string2;
            String string3 = arguments.getString("SELECTED_INNER_TAB_VALUE", "");
            Intrinsics.m32178g(string3, "arguments.getString(SELECTED_INNER_TAB_VALUE, \"\")");
            this.f28901i = string3;
            if (arguments.containsKey("SELECTED_PROFILE_ID")) {
                this.f28904l = Long.valueOf(arguments.getLong("SELECTED_PROFILE_ID"));
            }
            if (arguments.containsKey("SELECTED_RELEASE_ID")) {
                this.f28905m = Long.valueOf(arguments.getLong("SELECTED_RELEASE_ID"));
            }
            if (arguments.containsKey("EVENT_IDENTIFIER")) {
                this.f28902j = arguments.getString("EVENT_IDENTIFIER");
            }
            if (arguments.containsKey("IS_EVENT_ONLY_REQUIRED")) {
                this.f28903k = arguments.getBoolean("IS_EVENT_ONLY_REQUIRED");
            }
        }
        m15647c4().f27207c.m15710f(m15648e4());
        m15647c4().f27207c.m15709e(m15648e4());
        m15647c4().m15215e(this.f28899g, m15650n4(), m15649m4(), this.f28904l, this.f28905m, this.f28903k);
        SearchPresenter presenter = m15647c4();
        Intrinsics.m32178g(presenter, "presenter");
        SearchPresenter.m15210g(presenter, false, false, 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a6, code lost:
    
        if (r9.equals("TAB_HOME") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01cf, code lost:
    
        r9 = getString(com.swiftsoft.anixartd.C2507R.string.search_for_anime);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cd, code lost:
    
        if (r9.equals("TAB_DISCOVER") != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0291  */
    @Override // androidx.fragment.app.Fragment
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r7, @org.jetbrains.annotations.Nullable android.view.ViewGroup r8, @org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28907o.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchCollection(@NotNull OnFetchCollection onFetchCollection) {
        Intrinsics.m32179h(onFetchCollection, "onFetchCollection");
        m15647c4().m15214d(onFetchCollection.f30187a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchProfile(@NotNull OnFetchProfile onFetchProfile) {
        Intrinsics.m32179h(onFetchProfile, "onFetchProfile");
        m15647c4().m15217h();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        SearchPresenter m15647c4 = m15647c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15647c4);
        Intrinsics.m32179h(release, "release");
        SearchUiLogic searchUiLogic = m15647c4.f27207c;
        if (searchUiLogic.f28956a) {
            Iterator<Release> it = searchUiLogic.f29351l.iterator();
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
                searchUiLogic.f29351l.set(i2, release);
            }
            m15647c4.m15212b();
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15647c4().m15217h();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: v */
    public void mo15231v(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        Keyboard.f30166a.m16340a(this);
        if (!this.f28903k) {
            m15437u3().mo15324d2(CollectionFragment.f27978k.m15479b(collection.getId(), collection), null);
        } else {
            EventBusKt.m16327a(new OnSearchCollection(this.f28902j, collection));
            m15437u3().mo15323a3();
        }
    }
}
