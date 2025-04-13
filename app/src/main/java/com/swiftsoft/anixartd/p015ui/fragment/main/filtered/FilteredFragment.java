package com.swiftsoft.anixartd.p015ui.fragment.main.filtered;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.FlexibleLayoutManager;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filtered.FilteredFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.filtered.FilteredUiLogic;
import com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter;
import com.swiftsoft.anixartd.presentation.main.filtered.FilteredView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
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

/* compiled from: FilteredFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/filtered/FilteredFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/filtered/FilteredView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FilteredFragment extends BaseFragment implements FilteredView {

    /* renamed from: d */
    @Inject
    public Lazy<FilteredPresenter> f28214d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28215e;

    /* renamed from: f */
    @Nullable
    public Long f28216f;

    /* renamed from: g */
    @Nullable
    public Long f28217g;

    /* renamed from: h */
    @Nullable
    public Integer f28218h;

    /* renamed from: i */
    @Nullable
    public Integer f28219i;

    /* renamed from: j */
    @NotNull
    public String f28220j;

    /* renamed from: k */
    @Nullable
    public Integer f28221k;

    /* renamed from: l */
    @Nullable
    public Integer f28222l;

    /* renamed from: m */
    @NotNull
    public String f28223m;

    /* renamed from: n */
    @Nullable
    public Integer f28224n;

    /* renamed from: o */
    @Nullable
    public Integer f28225o;

    /* renamed from: p */
    @NotNull
    public List<String> f28226p;

    /* renamed from: q */
    @NotNull
    public List<Integer> f28227q;

    /* renamed from: r */
    @NotNull
    public List<Long> f28228r;

    /* renamed from: s */
    @NotNull
    public List<Integer> f28229s;

    /* renamed from: t */
    public boolean f28230t;

    /* renamed from: u */
    @NotNull
    public Map<Integer, View> f28231u = new LinkedHashMap();

    /* renamed from: w */
    public static final /* synthetic */ KProperty<Object>[] f28213w = {C2052a.m12277l(FilteredFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/filtered/FilteredPresenter;", 0)};

    /* renamed from: v */
    @NotNull
    public static final Companion f28212v = new Companion(null);

    /* compiled from: FilteredFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0013"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/filtered/FilteredFragment$Companion;", "", "", "IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", "Ljava/lang/String;", "SELECTED_AGE_RATINGS_VALUE", "SELECTED_CATEGORY_ID_VALUE", "SELECTED_COUNTRY_VALUE", "SELECTED_END_YEAR_VALUE", "SELECTED_EPISODES_VALUE", "SELECTED_EPISODE_DURATION_VALUE", "SELECTED_GENRES_VALUE", "SELECTED_PROFILE_LIST_EXCLUSIONS_VALUE", "SELECTED_SEASON_VALUE", "SELECTED_SORT_VALUE", "SELECTED_START_YEAR_VALUE", "SELECTED_STATUS_ID_VALUE", "SELECTED_STUDIO_VALUE", "SELECTED_TYPES_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public FilteredFragment() {
        Function0<FilteredPresenter> function0 = new Function0<FilteredPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filtered.FilteredFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public FilteredPresenter invoke() {
                Lazy<FilteredPresenter> lazy = FilteredFragment.this.f28214d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28215e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(FilteredPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28220j = "";
        this.f28223m = "";
        EmptyList emptyList = EmptyList.f63144b;
        this.f28226p = emptyList;
        this.f28227q = emptyList;
        this.f28228r = emptyList;
        this.f28229s = emptyList;
    }

    @Nullable
    /* renamed from: A3 */
    public View m15512A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28231u;
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

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: a */
    public void mo14644a() {
        ProgressBar progress_bar = (ProgressBar) m15512A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: b */
    public void mo14645b() {
        ProgressBar progress_bar = (ProgressBar) m15512A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: c */
    public void mo14646c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15512A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15512A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final FilteredPresenter m15513c4() {
        return (FilteredPresenter) this.f28215e.getValue(this, f28213w[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filtered.FilteredView
    /* renamed from: i */
    public void mo14647i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28231u.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14126h0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("SELECTED_CATEGORY_ID_VALUE")) {
                this.f28216f = Long.valueOf(arguments.getLong("SELECTED_CATEGORY_ID_VALUE"));
            }
            if (arguments.containsKey("SELECTED_STATUS_ID_VALUE")) {
                this.f28217g = Long.valueOf(arguments.getLong("SELECTED_STATUS_ID_VALUE"));
            }
            if (arguments.containsKey("SELECTED_START_YEAR_VALUE")) {
                this.f28218h = Integer.valueOf(arguments.getInt("SELECTED_START_YEAR_VALUE"));
            }
            if (arguments.containsKey("SELECTED_END_YEAR_VALUE")) {
                this.f28219i = Integer.valueOf(arguments.getInt("SELECTED_END_YEAR_VALUE"));
            }
            String string = arguments.getString("SELECTED_STUDIO_VALUE", "");
            Intrinsics.m32178g(string, "arguments.getString(SELECTED_STUDIO_VALUE, \"\")");
            this.f28220j = string;
            if (arguments.containsKey("SELECTED_EPISODES_VALUE")) {
                this.f28221k = Integer.valueOf(arguments.getInt("SELECTED_EPISODES_VALUE"));
            }
            if (arguments.containsKey("SELECTED_SORT_VALUE")) {
                this.f28222l = Integer.valueOf(arguments.getInt("SELECTED_SORT_VALUE"));
            }
            String string2 = arguments.getString("SELECTED_COUNTRY_VALUE", "");
            Intrinsics.m32178g(string2, "arguments.getString(SELECTED_COUNTRY_VALUE, \"\")");
            this.f28223m = string2;
            if (arguments.containsKey("SELECTED_SEASON_VALUE")) {
                this.f28224n = Integer.valueOf(arguments.getInt("SELECTED_SEASON_VALUE"));
            }
            if (arguments.containsKey("SELECTED_EPISODE_DURATION_VALUE")) {
                this.f28225o = Integer.valueOf(arguments.getInt("SELECTED_EPISODE_DURATION_VALUE"));
            }
            ArrayList<String> stringArrayList = arguments.getStringArrayList("SELECTED_GENRES_VALUE");
            if (stringArrayList != null) {
                this.f28226p = stringArrayList;
            }
            ArrayList<Integer> integerArrayList = arguments.getIntegerArrayList("SELECTED_PROFILE_LIST_EXCLUSIONS_VALUE");
            if (integerArrayList != null) {
                this.f28227q = integerArrayList;
            }
            long[] longArray = arguments.getLongArray("SELECTED_TYPES_VALUE");
            if (longArray != null) {
                this.f28228r = ArraysKt.m31951a0(longArray);
            }
            ArrayList<Integer> integerArrayList2 = arguments.getIntegerArrayList("SELECTED_AGE_RATINGS_VALUE");
            if (integerArrayList2 != null) {
                this.f28229s = integerArrayList2;
            }
            this.f28230t = arguments.getBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE");
        }
        FilteredPresenter m15513c4 = m15513c4();
        Long l2 = this.f28216f;
        Long l3 = this.f28217g;
        Integer num = this.f28218h;
        Integer num2 = this.f28219i;
        String selectedStudio = this.f28220j;
        Integer num3 = this.f28221k;
        Integer num4 = this.f28222l;
        String selectedCountry = this.f28223m;
        Integer num5 = this.f28224n;
        Integer num6 = this.f28225o;
        List<String> selectedGenres = this.f28226p;
        List<Integer> selectedProfileListExclusions = this.f28227q;
        List<Long> selectedTypes = this.f28228r;
        List<Integer> selectedAgeRatings = this.f28229s;
        boolean z = this.f28230t;
        Objects.requireNonNull(m15513c4);
        Intrinsics.m32179h(selectedStudio, "selectedStudio");
        Intrinsics.m32179h(selectedCountry, "selectedCountry");
        Intrinsics.m32179h(selectedGenres, "selectedGenres");
        Intrinsics.m32179h(selectedProfileListExclusions, "selectedProfileListExclusions");
        Intrinsics.m32179h(selectedTypes, "selectedTypes");
        Intrinsics.m32179h(selectedAgeRatings, "selectedAgeRatings");
        FilteredUiLogic filteredUiLogic = m15513c4.f26390c;
        Objects.requireNonNull(filteredUiLogic);
        filteredUiLogic.f29079b = l2;
        filteredUiLogic.f29080c = l3;
        filteredUiLogic.f29081d = num;
        filteredUiLogic.f29082e = num2;
        filteredUiLogic.f29083f = selectedStudio;
        filteredUiLogic.f29084g = num3;
        filteredUiLogic.f29085h = num4;
        filteredUiLogic.f29086i = selectedCountry;
        filteredUiLogic.f29087j = num5;
        filteredUiLogic.f29088k = num6;
        filteredUiLogic.f29089l = selectedGenres;
        filteredUiLogic.f29090m = selectedProfileListExclusions;
        filteredUiLogic.f29091n = selectedTypes;
        filteredUiLogic.f29092o = selectedAgeRatings;
        filteredUiLogic.f29093p = z;
        filteredUiLogic.f28956a = true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_filtered, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.filtered.a

            /* renamed from: c */
            public final /* synthetic */ FilteredFragment f28237c;

            {
                this.f28237c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        FilteredFragment this$0 = this.f28237c;
                        FilteredFragment.Companion companion = FilteredFragment.f28212v;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        FilteredFragment this$02 = this.f28237c;
                        FilteredFragment.Companion companion2 = FilteredFragment.f28212v;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15437u3().mo15323a3();
                        break;
                }
            }
        });
        final int i3 = 1;
        ((Button) inflate.findViewById(C2507R.id.edit)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.filtered.a

            /* renamed from: c */
            public final /* synthetic */ FilteredFragment f28237c;

            {
                this.f28237c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        FilteredFragment this$0 = this.f28237c;
                        FilteredFragment.Companion companion = FilteredFragment.f28212v;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    default:
                        FilteredFragment this$02 = this.f28237c;
                        FilteredFragment.Companion companion2 = FilteredFragment.f28212v;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m15437u3().mo15323a3();
                        break;
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        FlexibleLayoutManager flexibleLayoutManager = FlexibleLayoutManager.f27405a;
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.m32178g(context, "context");
        epoxyRecyclerView.setLayoutManager(flexibleLayoutManager.m15321a(context, m15513c4().f26389b.m14081x(), m15513c4().f26391d));
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        epoxyRecyclerView.m3806m(new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.filtered.FilteredFragment$onCreateView$3$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i4, int i5, @Nullable RecyclerView recyclerView) {
                FilteredFragment filteredFragment = FilteredFragment.this;
                FilteredFragment.Companion companion = FilteredFragment.f28212v;
                FilteredPresenter m15513c4 = filteredFragment.m15513c4();
                m15513c4.f26390c.f29094q++;
                m15513c4.m14642a(false);
            }
        });
        epoxyRecyclerView.setController(m15513c4().f26391d);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filtered.FilteredFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filtered.FilteredFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                LinearLayout error_layout = (LinearLayout) FilteredFragment.this.m15512A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                FilteredPresenter presenter = FilteredFragment.this.m15513c4();
                Intrinsics.m32178g(presenter, "presenter");
                presenter.m14642a(presenter.f26391d.isEmpty());
                return Unit.f63088a;
            }
        });
        if (!m15513c4().f26390c.f29096s) {
            FilteredPresenter presenter = m15513c4();
            Intrinsics.m32178g(presenter, "presenter");
            presenter.m14642a(presenter.f26391d.isEmpty());
        }
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
        this.f28231u.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        FilteredPresenter m15513c4 = m15513c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15513c4);
        Intrinsics.m32179h(release, "release");
        FilteredUiLogic filteredUiLogic = m15513c4.f26390c;
        if (filteredUiLogic.f28956a) {
            Iterator<Release> it = filteredUiLogic.f29095r.iterator();
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
                filteredUiLogic.f29095r.set(i2, release);
            }
            m15513c4.f26391d.setData(Integer.valueOf(m15513c4.f26389b.m14081x()), Boolean.valueOf(m15513c4.f26389b.m14047C()), m15513c4.f26390c.f29095r, Boolean.FALSE, m15513c4.f26392e);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        FilteredPresenter m15513c4 = m15513c4();
        FilteredUiLogic filteredUiLogic = m15513c4.f26390c;
        filteredUiLogic.f29094q = 0;
        filteredUiLogic.f29095r.clear();
        filteredUiLogic.f29096s = false;
        m15513c4.m14642a(m15513c4.f26391d.isEmpty());
    }
}
