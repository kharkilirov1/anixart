package com.swiftsoft.anixartd.p015ui.fragment.main.filter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.CustomFilter;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseGenresDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseYearsDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filtered.FilteredFragment;
import com.swiftsoft.anixartd.presentation.main.filter.FilterPresenter;
import com.swiftsoft.anixartd.presentation.main.filter.FilterView;
import com.swiftsoft.anixartd.repository.HomeRepository;
import com.swiftsoft.anixartd.utils.AppCompatAutoCompleteTextView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnCustomFilterTabRefresh;
import com.swiftsoft.anixartd.utils.OnCustomFilterTabShowHint;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FilterFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/filter/FilterFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/filter/FilterView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FilterFragment extends BaseFragment implements FilterView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: A */
    public String[] f28151A;

    /* renamed from: B */
    public String[] f28152B;

    /* renamed from: C */
    public String[] f28153C;

    /* renamed from: D */
    public String[] f28154D;

    /* renamed from: E */
    public String[] f28155E;

    /* renamed from: F */
    public Type[] f28156F;

    /* renamed from: G */
    public String[] f28157G;

    /* renamed from: H */
    public String[] f28158H;

    /* renamed from: I */
    public boolean[] f28159I;

    /* renamed from: J */
    public boolean[] f28160J;

    /* renamed from: K */
    public boolean[] f28161K;

    /* renamed from: L */
    public ArrayAdapter<String> f28162L;

    /* renamed from: M */
    public ArrayAdapter<String> f28163M;

    /* renamed from: N */
    public ArrayAdapter<String> f28164N;

    /* renamed from: O */
    public ArrayAdapter<String> f28165O;

    /* renamed from: P */
    public ArrayAdapter<String> f28166P;

    /* renamed from: Q */
    public ArrayAdapter<String> f28167Q;

    /* renamed from: R */
    public ArrayAdapter<String> f28168R;

    /* renamed from: S */
    public ArrayAdapter<String> f28169S;

    /* renamed from: T */
    @NotNull
    public Map<Integer, View> f28170T = new LinkedHashMap();

    /* renamed from: d */
    @Inject
    public Lazy<FilterPresenter> f28171d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28172e;

    /* renamed from: f */
    @Nullable
    public String f28173f;

    /* renamed from: g */
    @Nullable
    public Long f28174g;

    /* renamed from: h */
    @Nullable
    public Long f28175h;

    /* renamed from: i */
    @Nullable
    public Integer f28176i;

    /* renamed from: j */
    @Nullable
    public Integer f28177j;

    /* renamed from: k */
    @NotNull
    public String f28178k;

    /* renamed from: l */
    @Nullable
    public Integer f28179l;

    /* renamed from: m */
    @Nullable
    public Integer f28180m;

    /* renamed from: n */
    @NotNull
    public String f28181n;

    /* renamed from: o */
    @Nullable
    public Integer f28182o;

    /* renamed from: p */
    @Nullable
    public Integer f28183p;

    /* renamed from: q */
    @NotNull
    public List<String> f28184q;

    /* renamed from: r */
    @NotNull
    public HashMap<Integer, String> f28185r;

    /* renamed from: s */
    @NotNull
    public HashMap<Integer, Type> f28186s;

    /* renamed from: t */
    @NotNull
    public HashMap<Integer, String> f28187t;

    /* renamed from: u */
    public boolean f28188u;

    /* renamed from: v */
    public String[] f28189v;

    /* renamed from: w */
    public String[] f28190w;

    /* renamed from: x */
    public String[] f28191x;

    /* renamed from: y */
    public String[] f28192y;

    /* renamed from: z */
    public String[] f28193z;

    /* renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f28150V = {C2052a.m12277l(FilterFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/filter/FilterPresenter;", 0)};

    /* renamed from: U */
    @NotNull
    public static final Companion f28149U = new Companion(null);

    /* compiled from: FilterFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/filter/FilterFragment$Companion;", "", "", "CHOOSE_GENRES_TAG", "Ljava/lang/String;", "CHOOSE_YEARS_TAG", "IS_FROM", "IS_FROM_CUSTOM_FILTER_TAB", "IS_FROM_FILTER", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public FilterFragment() {
        Function0<FilterPresenter> function0 = new Function0<FilterPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public FilterPresenter invoke() {
                Lazy<FilterPresenter> lazy = FilterFragment.this.f28171d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28172e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(FilterPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28173f = "";
        this.f28178k = "";
        this.f28181n = "";
        this.f28184q = new ArrayList();
        this.f28185r = new HashMap<>();
        this.f28186s = new HashMap<>();
        this.f28187t = new HashMap<>();
    }

    @Nullable
    /* renamed from: A3 */
    public View m15510A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28170T;
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

    @Override // com.swiftsoft.anixartd.presentation.main.filter.FilterView
    /* renamed from: a */
    public void mo14639a() {
        ProgressBar progress_bar = (ProgressBar) m15510A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filter.FilterView
    /* renamed from: b */
    public void mo14640b() {
        ProgressBar progress_bar = (ProgressBar) m15510A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    /* renamed from: c4 */
    public final FilterPresenter m15511c4() {
        return (FilterPresenter) this.f28172e.getValue(this, f28150V[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.filter.FilterView
    /* renamed from: e2 */
    public void mo14641e2() {
        CustomFilter m15297b;
        final View view = getView();
        final int i2 = 0;
        if (view == null) {
            Dialogs dialogs = Dialogs.f30143a;
            String string = getString(C2507R.string.something_went_wrong);
            Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
            dialogs.m16308g(this, string, 0);
            return;
        }
        this.f28189v = C2052a.m12263A(this, C2507R.array.categories, "resources.getStringArray(R.array.categories)");
        this.f28190w = C2052a.m12263A(this, C2507R.array.statuses, "resources.getStringArray(R.array.statuses)");
        this.f28191x = C2052a.m12263A(this, C2507R.array.studios, "resources.getStringArray(R.array.studios)");
        this.f28192y = C2052a.m12263A(this, C2507R.array.episodes, "resources.getStringArray(R.array.episodes)");
        this.f28193z = C2052a.m12263A(this, C2507R.array.sort, "resources.getStringArray(R.array.sort)");
        this.f28151A = C2052a.m12263A(this, C2507R.array.countries, "resources.getStringArray(R.array.countries)");
        this.f28152B = C2052a.m12263A(this, C2507R.array.seasons, "resources.getStringArray(R.array.seasons)");
        this.f28153C = C2052a.m12263A(this, C2507R.array.episodeDurations, "resources.getStringArray(R.array.episodeDurations)");
        this.f28154D = C2052a.m12263A(this, C2507R.array.genres, "resources.getStringArray(R.array.genres)");
        this.f28155E = C2052a.m12263A(this, C2507R.array.profile_lists, "resources.getStringArray(R.array.profile_lists)");
        Object[] array = m15511c4().f26381d.f29078b.toArray(new Type[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f28156F = (Type[]) array;
        List<Type> list = m15511c4().f26381d.f29078b;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Type) it.next()).getName());
        }
        Object[] array2 = arrayList.toArray(new String[0]);
        Intrinsics.m32177f(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f28157G = (String[]) array2;
        String[] m12263A = C2052a.m12263A(this, C2507R.array.ageRatings, "resources.getStringArray(R.array.ageRatings)");
        this.f28158H = m12263A;
        String[] strArr = this.f28155E;
        if (strArr == null) {
            Intrinsics.m32189r("profileLists");
            throw null;
        }
        this.f28159I = new boolean[strArr.length];
        Type[] typeArr = this.f28156F;
        if (typeArr == null) {
            Intrinsics.m32189r("types");
            throw null;
        }
        this.f28160J = new boolean[typeArr.length];
        this.f28161K = new boolean[m12263A.length];
        Context requireContext = requireContext();
        String[] strArr2 = this.f28189v;
        if (strArr2 == null) {
            Intrinsics.m32189r("categories");
            throw null;
        }
        this.f28162L = new ArrayAdapter<>(requireContext, C2507R.layout.dropdown_menu_popup_item, strArr2);
        Context requireContext2 = requireContext();
        String[] strArr3 = this.f28190w;
        if (strArr3 == null) {
            Intrinsics.m32189r("statuses");
            throw null;
        }
        this.f28163M = new ArrayAdapter<>(requireContext2, C2507R.layout.dropdown_menu_popup_item, strArr3);
        Context requireContext3 = requireContext();
        String[] strArr4 = this.f28191x;
        if (strArr4 == null) {
            Intrinsics.m32189r("studios");
            throw null;
        }
        this.f28164N = new ArrayAdapter<>(requireContext3, C2507R.layout.dropdown_menu_popup_item, strArr4);
        Context requireContext4 = requireContext();
        String[] strArr5 = this.f28192y;
        if (strArr5 == null) {
            Intrinsics.m32189r("episodes");
            throw null;
        }
        this.f28165O = new ArrayAdapter<>(requireContext4, C2507R.layout.dropdown_menu_popup_item, strArr5);
        Context requireContext5 = requireContext();
        String[] strArr6 = this.f28193z;
        if (strArr6 == null) {
            Intrinsics.m32189r("sort");
            throw null;
        }
        this.f28166P = new ArrayAdapter<>(requireContext5, C2507R.layout.dropdown_menu_popup_item, strArr6);
        Context requireContext6 = requireContext();
        String[] strArr7 = this.f28151A;
        if (strArr7 == null) {
            Intrinsics.m32189r("countries");
            throw null;
        }
        this.f28167Q = new ArrayAdapter<>(requireContext6, C2507R.layout.dropdown_menu_popup_item, strArr7);
        Context requireContext7 = requireContext();
        String[] strArr8 = this.f28152B;
        if (strArr8 == null) {
            Intrinsics.m32189r("seasons");
            throw null;
        }
        this.f28168R = new ArrayAdapter<>(requireContext7, C2507R.layout.dropdown_menu_popup_item, strArr8);
        Context requireContext8 = requireContext();
        String[] strArr9 = this.f28153C;
        if (strArr9 == null) {
            Intrinsics.m32189r("episodeDurations");
            throw null;
        }
        this.f28169S = new ArrayAdapter<>(requireContext8, C2507R.layout.dropdown_menu_popup_item, strArr9);
        ((AppCompatTextView) view.findViewById(C2507R.id.title)).setText(Intrinsics.m32174c(this.f28173f, "IS_FROM_CUSTOM_FILTER_TAB") ? "Настройки вкладки" : "Фильтр");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.custom_filter_hint);
        Intrinsics.m32178g(linearLayout, "view.custom_filter_hint");
        ViewsKt.m16379l(linearLayout, Intrinsics.m32174c(this.f28173f, "IS_FROM_CUSTOM_FILTER_TAB"));
        ((RelativeLayout) view.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.d

            /* renamed from: c */
            public final /* synthetic */ FilterFragment f28208c;

            {
                this.f28208c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        FilterFragment this$0 = this.f28208c;
                        FilterFragment.Companion companion = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        return;
                    case 1:
                        final FilterFragment this$02 = this.f28208c;
                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (Intrinsics.m32174c(this$02.f28173f, "IS_FROM_CUSTOM_FILTER_TAB")) {
                            Context requireContext9 = this$02.requireContext();
                            Intrinsics.m32178g(requireContext9, "requireContext()");
                            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext9);
                            builder.f30150b = 3;
                            builder.m16318j(C2507R.string.confirm);
                            builder.f30152d = "Вы уверены, что хотите сбросить все фильтры?";
                            builder.m16315g(C2507R.string.yes);
                            builder.m16311c(C2507R.string.cancel);
                            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$onFilterLoaded$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                                    Dialogs.MaterialDialog it2 = materialDialog;
                                    Intrinsics.m32179h(it2, "it");
                                    FilterFragment filterFragment = FilterFragment.this;
                                    FilterFragment.Companion companion3 = FilterFragment.f28149U;
                                    filterFragment.m15511c4().f26378a.f27357b.deleteAll();
                                    EventBusKt.m16327a(new OnCustomFilterTabRefresh());
                                    FilterFragment.this.m15437u3().mo15323a3();
                                    return Unit.f63088a;
                                }
                            });
                            builder.f30159k = true;
                            builder.m16317i();
                            return;
                        }
                        this$02.f28174g = null;
                        this$02.f28175h = null;
                        this$02.f28176i = null;
                        this$02.f28177j = null;
                        this$02.f28178k = "";
                        this$02.f28179l = null;
                        this$02.f28180m = null;
                        this$02.f28181n = "";
                        this$02.f28182o = null;
                        this$02.f28183p = null;
                        this$02.f28184q.clear();
                        this$02.f28185r.clear();
                        this$02.f28186s.clear();
                        this$02.f28187t.clear();
                        this$02.f28188u = false;
                        String[] strArr10 = this$02.f28155E;
                        if (strArr10 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        this$02.f28159I = new boolean[strArr10.length];
                        String[] strArr11 = this$02.f28158H;
                        if (strArr11 == null) {
                            Intrinsics.m32189r("ageRatings");
                            throw null;
                        }
                        this$02.f28161K = new boolean[strArr11.length];
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCategory);
                        String[] strArr12 = this$02.f28189v;
                        if (strArr12 == null) {
                            Intrinsics.m32189r("categories");
                            throw null;
                        }
                        appCompatAutoCompleteTextView.setText((CharSequence) strArr12[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStatus);
                        String[] strArr13 = this$02.f28190w;
                        if (strArr13 == null) {
                            Intrinsics.m32189r("statuses");
                            throw null;
                        }
                        appCompatAutoCompleteTextView2.setText((CharSequence) strArr13[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tYear)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView3 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStudio);
                        String[] strArr14 = this$02.f28191x;
                        if (strArr14 == null) {
                            Intrinsics.m32189r("studios");
                            throw null;
                        }
                        appCompatAutoCompleteTextView3.setText((CharSequence) strArr14[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView4 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodes);
                        String[] strArr15 = this$02.f28192y;
                        if (strArr15 == null) {
                            Intrinsics.m32189r("episodes");
                            throw null;
                        }
                        appCompatAutoCompleteTextView4.setText((CharSequence) strArr15[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView5 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSort);
                        String[] strArr16 = this$02.f28193z;
                        if (strArr16 == null) {
                            Intrinsics.m32189r("sort");
                            throw null;
                        }
                        appCompatAutoCompleteTextView5.setText((CharSequence) strArr16[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView6 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCountry);
                        String[] strArr17 = this$02.f28151A;
                        if (strArr17 == null) {
                            Intrinsics.m32189r("countries");
                            throw null;
                        }
                        appCompatAutoCompleteTextView6.setText((CharSequence) strArr17[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView7 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSeason);
                        String[] strArr18 = this$02.f28152B;
                        if (strArr18 == null) {
                            Intrinsics.m32189r("seasons");
                            throw null;
                        }
                        appCompatAutoCompleteTextView7.setText((CharSequence) strArr18[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView8 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodeDuration);
                        String[] strArr19 = this$02.f28153C;
                        if (strArr19 == null) {
                            Intrinsics.m32189r("episodeDurations");
                            throw null;
                        }
                        appCompatAutoCompleteTextView8.setText((CharSequence) strArr19[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        return;
                    case 2:
                        FilterFragment this$03 = this.f28208c;
                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$03, "this$0");
                        ChooseGenresDialogFragment.Companion companion4 = ChooseGenresDialogFragment.f27668j;
                        String[] strArr20 = this$03.f28154D;
                        if (strArr20 == null) {
                            Intrinsics.m32189r("genres");
                            throw null;
                        }
                        List<String> selectedGenres = this$03.f28184q;
                        boolean z = this$03.f28188u;
                        Objects.requireNonNull(companion4);
                        Intrinsics.m32179h(selectedGenres, "selectedGenres");
                        ChooseGenresDialogFragment chooseGenresDialogFragment = new ChooseGenresDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putStringArray("GENRES_VALUE", strArr20);
                        bundle.putStringArrayList("SELECTED_GENRES_VALUE", new ArrayList<>(selectedGenres));
                        bundle.putBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", z);
                        chooseGenresDialogFragment.setArguments(bundle);
                        chooseGenresDialogFragment.show(this$03.getChildFragmentManager(), "CHOOSE_GENRES_TAG");
                        return;
                    default:
                        FilterFragment this$04 = this.f28208c;
                        FilterFragment.Companion companion5 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$04, "this$0");
                        Integer num = this$04.f28176i;
                        Integer num2 = this$04.f28177j;
                        ChooseYearsDialogFragment chooseYearsDialogFragment = new ChooseYearsDialogFragment();
                        Bundle bundle2 = new Bundle();
                        if (num != null) {
                            bundle2.putInt("SELECTED_START_YEAR_VALUE", num.intValue());
                        }
                        if (num2 != null) {
                            bundle2.putInt("SELECTED_END_YEAR_VALUE", num2.intValue());
                        }
                        chooseYearsDialogFragment.setArguments(bundle2);
                        chooseYearsDialogFragment.show(this$04.getChildFragmentManager(), "CHOOSE_YEARS_TAG");
                        return;
                }
            }
        });
        final int i3 = 1;
        ((Button) view.findViewById(C2507R.id.btnReset)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.d

            /* renamed from: c */
            public final /* synthetic */ FilterFragment f28208c;

            {
                this.f28208c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        FilterFragment this$0 = this.f28208c;
                        FilterFragment.Companion companion = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        return;
                    case 1:
                        final FilterFragment this$02 = this.f28208c;
                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (Intrinsics.m32174c(this$02.f28173f, "IS_FROM_CUSTOM_FILTER_TAB")) {
                            Context requireContext9 = this$02.requireContext();
                            Intrinsics.m32178g(requireContext9, "requireContext()");
                            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext9);
                            builder.f30150b = 3;
                            builder.m16318j(C2507R.string.confirm);
                            builder.f30152d = "Вы уверены, что хотите сбросить все фильтры?";
                            builder.m16315g(C2507R.string.yes);
                            builder.m16311c(C2507R.string.cancel);
                            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$onFilterLoaded$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                                    Dialogs.MaterialDialog it2 = materialDialog;
                                    Intrinsics.m32179h(it2, "it");
                                    FilterFragment filterFragment = FilterFragment.this;
                                    FilterFragment.Companion companion3 = FilterFragment.f28149U;
                                    filterFragment.m15511c4().f26378a.f27357b.deleteAll();
                                    EventBusKt.m16327a(new OnCustomFilterTabRefresh());
                                    FilterFragment.this.m15437u3().mo15323a3();
                                    return Unit.f63088a;
                                }
                            });
                            builder.f30159k = true;
                            builder.m16317i();
                            return;
                        }
                        this$02.f28174g = null;
                        this$02.f28175h = null;
                        this$02.f28176i = null;
                        this$02.f28177j = null;
                        this$02.f28178k = "";
                        this$02.f28179l = null;
                        this$02.f28180m = null;
                        this$02.f28181n = "";
                        this$02.f28182o = null;
                        this$02.f28183p = null;
                        this$02.f28184q.clear();
                        this$02.f28185r.clear();
                        this$02.f28186s.clear();
                        this$02.f28187t.clear();
                        this$02.f28188u = false;
                        String[] strArr10 = this$02.f28155E;
                        if (strArr10 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        this$02.f28159I = new boolean[strArr10.length];
                        String[] strArr11 = this$02.f28158H;
                        if (strArr11 == null) {
                            Intrinsics.m32189r("ageRatings");
                            throw null;
                        }
                        this$02.f28161K = new boolean[strArr11.length];
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCategory);
                        String[] strArr12 = this$02.f28189v;
                        if (strArr12 == null) {
                            Intrinsics.m32189r("categories");
                            throw null;
                        }
                        appCompatAutoCompleteTextView.setText((CharSequence) strArr12[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStatus);
                        String[] strArr13 = this$02.f28190w;
                        if (strArr13 == null) {
                            Intrinsics.m32189r("statuses");
                            throw null;
                        }
                        appCompatAutoCompleteTextView2.setText((CharSequence) strArr13[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tYear)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView3 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStudio);
                        String[] strArr14 = this$02.f28191x;
                        if (strArr14 == null) {
                            Intrinsics.m32189r("studios");
                            throw null;
                        }
                        appCompatAutoCompleteTextView3.setText((CharSequence) strArr14[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView4 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodes);
                        String[] strArr15 = this$02.f28192y;
                        if (strArr15 == null) {
                            Intrinsics.m32189r("episodes");
                            throw null;
                        }
                        appCompatAutoCompleteTextView4.setText((CharSequence) strArr15[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView5 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSort);
                        String[] strArr16 = this$02.f28193z;
                        if (strArr16 == null) {
                            Intrinsics.m32189r("sort");
                            throw null;
                        }
                        appCompatAutoCompleteTextView5.setText((CharSequence) strArr16[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView6 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCountry);
                        String[] strArr17 = this$02.f28151A;
                        if (strArr17 == null) {
                            Intrinsics.m32189r("countries");
                            throw null;
                        }
                        appCompatAutoCompleteTextView6.setText((CharSequence) strArr17[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView7 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSeason);
                        String[] strArr18 = this$02.f28152B;
                        if (strArr18 == null) {
                            Intrinsics.m32189r("seasons");
                            throw null;
                        }
                        appCompatAutoCompleteTextView7.setText((CharSequence) strArr18[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView8 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodeDuration);
                        String[] strArr19 = this$02.f28153C;
                        if (strArr19 == null) {
                            Intrinsics.m32189r("episodeDurations");
                            throw null;
                        }
                        appCompatAutoCompleteTextView8.setText((CharSequence) strArr19[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        return;
                    case 2:
                        FilterFragment this$03 = this.f28208c;
                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$03, "this$0");
                        ChooseGenresDialogFragment.Companion companion4 = ChooseGenresDialogFragment.f27668j;
                        String[] strArr20 = this$03.f28154D;
                        if (strArr20 == null) {
                            Intrinsics.m32189r("genres");
                            throw null;
                        }
                        List<String> selectedGenres = this$03.f28184q;
                        boolean z = this$03.f28188u;
                        Objects.requireNonNull(companion4);
                        Intrinsics.m32179h(selectedGenres, "selectedGenres");
                        ChooseGenresDialogFragment chooseGenresDialogFragment = new ChooseGenresDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putStringArray("GENRES_VALUE", strArr20);
                        bundle.putStringArrayList("SELECTED_GENRES_VALUE", new ArrayList<>(selectedGenres));
                        bundle.putBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", z);
                        chooseGenresDialogFragment.setArguments(bundle);
                        chooseGenresDialogFragment.show(this$03.getChildFragmentManager(), "CHOOSE_GENRES_TAG");
                        return;
                    default:
                        FilterFragment this$04 = this.f28208c;
                        FilterFragment.Companion companion5 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$04, "this$0");
                        Integer num = this$04.f28176i;
                        Integer num2 = this$04.f28177j;
                        ChooseYearsDialogFragment chooseYearsDialogFragment = new ChooseYearsDialogFragment();
                        Bundle bundle2 = new Bundle();
                        if (num != null) {
                            bundle2.putInt("SELECTED_START_YEAR_VALUE", num.intValue());
                        }
                        if (num2 != null) {
                            bundle2.putInt("SELECTED_END_YEAR_VALUE", num2.intValue());
                        }
                        chooseYearsDialogFragment.setArguments(bundle2);
                        chooseYearsDialogFragment.show(this$04.getChildFragmentManager(), "CHOOSE_YEARS_TAG");
                        return;
                }
            }
        });
        final int i4 = 2;
        ((TextInputEditText) view.findViewById(C2507R.id.tGenres)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.d

            /* renamed from: c */
            public final /* synthetic */ FilterFragment f28208c;

            {
                this.f28208c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        FilterFragment this$0 = this.f28208c;
                        FilterFragment.Companion companion = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        return;
                    case 1:
                        final FilterFragment this$02 = this.f28208c;
                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (Intrinsics.m32174c(this$02.f28173f, "IS_FROM_CUSTOM_FILTER_TAB")) {
                            Context requireContext9 = this$02.requireContext();
                            Intrinsics.m32178g(requireContext9, "requireContext()");
                            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext9);
                            builder.f30150b = 3;
                            builder.m16318j(C2507R.string.confirm);
                            builder.f30152d = "Вы уверены, что хотите сбросить все фильтры?";
                            builder.m16315g(C2507R.string.yes);
                            builder.m16311c(C2507R.string.cancel);
                            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$onFilterLoaded$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                                    Dialogs.MaterialDialog it2 = materialDialog;
                                    Intrinsics.m32179h(it2, "it");
                                    FilterFragment filterFragment = FilterFragment.this;
                                    FilterFragment.Companion companion3 = FilterFragment.f28149U;
                                    filterFragment.m15511c4().f26378a.f27357b.deleteAll();
                                    EventBusKt.m16327a(new OnCustomFilterTabRefresh());
                                    FilterFragment.this.m15437u3().mo15323a3();
                                    return Unit.f63088a;
                                }
                            });
                            builder.f30159k = true;
                            builder.m16317i();
                            return;
                        }
                        this$02.f28174g = null;
                        this$02.f28175h = null;
                        this$02.f28176i = null;
                        this$02.f28177j = null;
                        this$02.f28178k = "";
                        this$02.f28179l = null;
                        this$02.f28180m = null;
                        this$02.f28181n = "";
                        this$02.f28182o = null;
                        this$02.f28183p = null;
                        this$02.f28184q.clear();
                        this$02.f28185r.clear();
                        this$02.f28186s.clear();
                        this$02.f28187t.clear();
                        this$02.f28188u = false;
                        String[] strArr10 = this$02.f28155E;
                        if (strArr10 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        this$02.f28159I = new boolean[strArr10.length];
                        String[] strArr11 = this$02.f28158H;
                        if (strArr11 == null) {
                            Intrinsics.m32189r("ageRatings");
                            throw null;
                        }
                        this$02.f28161K = new boolean[strArr11.length];
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCategory);
                        String[] strArr12 = this$02.f28189v;
                        if (strArr12 == null) {
                            Intrinsics.m32189r("categories");
                            throw null;
                        }
                        appCompatAutoCompleteTextView.setText((CharSequence) strArr12[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStatus);
                        String[] strArr13 = this$02.f28190w;
                        if (strArr13 == null) {
                            Intrinsics.m32189r("statuses");
                            throw null;
                        }
                        appCompatAutoCompleteTextView2.setText((CharSequence) strArr13[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tYear)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView3 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStudio);
                        String[] strArr14 = this$02.f28191x;
                        if (strArr14 == null) {
                            Intrinsics.m32189r("studios");
                            throw null;
                        }
                        appCompatAutoCompleteTextView3.setText((CharSequence) strArr14[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView4 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodes);
                        String[] strArr15 = this$02.f28192y;
                        if (strArr15 == null) {
                            Intrinsics.m32189r("episodes");
                            throw null;
                        }
                        appCompatAutoCompleteTextView4.setText((CharSequence) strArr15[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView5 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSort);
                        String[] strArr16 = this$02.f28193z;
                        if (strArr16 == null) {
                            Intrinsics.m32189r("sort");
                            throw null;
                        }
                        appCompatAutoCompleteTextView5.setText((CharSequence) strArr16[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView6 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCountry);
                        String[] strArr17 = this$02.f28151A;
                        if (strArr17 == null) {
                            Intrinsics.m32189r("countries");
                            throw null;
                        }
                        appCompatAutoCompleteTextView6.setText((CharSequence) strArr17[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView7 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSeason);
                        String[] strArr18 = this$02.f28152B;
                        if (strArr18 == null) {
                            Intrinsics.m32189r("seasons");
                            throw null;
                        }
                        appCompatAutoCompleteTextView7.setText((CharSequence) strArr18[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView8 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodeDuration);
                        String[] strArr19 = this$02.f28153C;
                        if (strArr19 == null) {
                            Intrinsics.m32189r("episodeDurations");
                            throw null;
                        }
                        appCompatAutoCompleteTextView8.setText((CharSequence) strArr19[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        return;
                    case 2:
                        FilterFragment this$03 = this.f28208c;
                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$03, "this$0");
                        ChooseGenresDialogFragment.Companion companion4 = ChooseGenresDialogFragment.f27668j;
                        String[] strArr20 = this$03.f28154D;
                        if (strArr20 == null) {
                            Intrinsics.m32189r("genres");
                            throw null;
                        }
                        List<String> selectedGenres = this$03.f28184q;
                        boolean z = this$03.f28188u;
                        Objects.requireNonNull(companion4);
                        Intrinsics.m32179h(selectedGenres, "selectedGenres");
                        ChooseGenresDialogFragment chooseGenresDialogFragment = new ChooseGenresDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putStringArray("GENRES_VALUE", strArr20);
                        bundle.putStringArrayList("SELECTED_GENRES_VALUE", new ArrayList<>(selectedGenres));
                        bundle.putBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", z);
                        chooseGenresDialogFragment.setArguments(bundle);
                        chooseGenresDialogFragment.show(this$03.getChildFragmentManager(), "CHOOSE_GENRES_TAG");
                        return;
                    default:
                        FilterFragment this$04 = this.f28208c;
                        FilterFragment.Companion companion5 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$04, "this$0");
                        Integer num = this$04.f28176i;
                        Integer num2 = this$04.f28177j;
                        ChooseYearsDialogFragment chooseYearsDialogFragment = new ChooseYearsDialogFragment();
                        Bundle bundle2 = new Bundle();
                        if (num != null) {
                            bundle2.putInt("SELECTED_START_YEAR_VALUE", num.intValue());
                        }
                        if (num2 != null) {
                            bundle2.putInt("SELECTED_END_YEAR_VALUE", num2.intValue());
                        }
                        chooseYearsDialogFragment.setArguments(bundle2);
                        chooseYearsDialogFragment.show(this$04.getChildFragmentManager(), "CHOOSE_YEARS_TAG");
                        return;
                }
            }
        });
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C2507R.id.profileListExclusionsLayout);
        Intrinsics.m32178g(textInputLayout, "view.profileListExclusionsLayout");
        ViewsKt.m16373f(textInputLayout, m15511c4().f26380c.m14083z(), false, null, 6);
        TextView textView = (TextView) view.findViewById(C2507R.id.profileListExclusionsHint);
        Intrinsics.m32178g(textView, "view.profileListExclusionsHint");
        ViewsKt.m16373f(textView, m15511c4().f26380c.m14083z(), false, null, 6);
        ((TextInputEditText) view.findViewById(C2507R.id.tProfileListExclusions)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final int i5 = 1;
                final int i6 = 2;
                switch (i2) {
                    case 0:
                        View view3 = view;
                        final FilterFragment this$0 = this;
                        FilterFragment.Companion companion = FilterFragment.f28149U;
                        Intrinsics.m32179h(view3, "$view");
                        Intrinsics.m32179h(this$0, "this$0");
                        AlertDialog.Builder builder = new AlertDialog.Builder(view3.getContext());
                        builder.mo377k(C2507R.string.select_lists);
                        String[] strArr10 = this$0.f28155E;
                        if (strArr10 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        boolean[] zArr = this$0.f28159I;
                        if (zArr == null) {
                            Intrinsics.m32189r("selectionProfileListExclusions");
                            throw null;
                        }
                        final int i7 = 0;
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i7) {
                                    case 0:
                                        FilterFragment this$02 = this$0;
                                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$02, "this$0");
                                        boolean[] zArr2 = this$02.f28159I;
                                        if (zArr2 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr2[i8] = z;
                                        if (!z) {
                                            this$02.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$02.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr11 = this$02.f28155E;
                                        if (strArr11 != null) {
                                            hashMap.put(valueOf, strArr11[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$03 = this$0;
                                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$03, "this$0");
                                        boolean[] zArr3 = this$03.f28161K;
                                        if (zArr3 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr3[i8] = z;
                                        if (!z) {
                                            this$03.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$03.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr12 = this$03.f28158H;
                                        if (strArr12 != null) {
                                            hashMap2.put(valueOf2, strArr12[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$0;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams = builder.f413a;
                        alertParams.f388q = strArr10;
                        alertParams.f396y = onMultiChoiceClickListener;
                        alertParams.f392u = zArr;
                        alertParams.f393v = true;
                        builder.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$0, view3, i7)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view3, this$0, i5)).create().show();
                        return;
                    case 1:
                        View view4 = view;
                        final FilterFragment this$02 = this;
                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                        Intrinsics.m32179h(view4, "$view");
                        Intrinsics.m32179h(this$02, "this$0");
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(view4.getContext());
                        builder2.mo377k(C2507R.string.select_types);
                        String[] strArr11 = this$02.f28157G;
                        if (strArr11 == null) {
                            Intrinsics.m32189r("typeNames");
                            throw null;
                        }
                        boolean[] zArr2 = this$02.f28160J;
                        if (zArr2 == null) {
                            Intrinsics.m32189r("selectionTypes");
                            throw null;
                        }
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener2 = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i6) {
                                    case 0:
                                        FilterFragment this$022 = this$02;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$03 = this$02;
                                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$03, "this$0");
                                        boolean[] zArr3 = this$03.f28161K;
                                        if (zArr3 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr3[i8] = z;
                                        if (!z) {
                                            this$03.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$03.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr12 = this$03.f28158H;
                                        if (strArr12 != null) {
                                            hashMap2.put(valueOf2, strArr12[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$02;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams2 = builder2.f413a;
                        alertParams2.f388q = strArr11;
                        alertParams2.f396y = onMultiChoiceClickListener2;
                        alertParams2.f392u = zArr2;
                        alertParams2.f393v = true;
                        builder2.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$02, view4, 4)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view4, this$02, 5)).create().show();
                        return;
                    default:
                        View view5 = view;
                        final FilterFragment this$03 = this;
                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                        Intrinsics.m32179h(view5, "$view");
                        Intrinsics.m32179h(this$03, "this$0");
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(view5.getContext());
                        builder3.mo377k(C2507R.string.select_age_ratings);
                        String[] strArr12 = this$03.f28158H;
                        if (strArr12 == null) {
                            Intrinsics.m32189r("ageRatings");
                            throw null;
                        }
                        boolean[] zArr3 = this$03.f28161K;
                        if (zArr3 == null) {
                            Intrinsics.m32189r("selectionAgeRating");
                            throw null;
                        }
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener3 = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i5) {
                                    case 0:
                                        FilterFragment this$022 = this$03;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$032 = this$03;
                                        FilterFragment.Companion companion32 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$032, "this$0");
                                        boolean[] zArr32 = this$032.f28161K;
                                        if (zArr32 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr32[i8] = z;
                                        if (!z) {
                                            this$032.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$032.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr122 = this$032.f28158H;
                                        if (strArr122 != null) {
                                            hashMap2.put(valueOf2, strArr122[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$03;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams3 = builder3.f413a;
                        alertParams3.f388q = strArr12;
                        alertParams3.f396y = onMultiChoiceClickListener3;
                        alertParams3.f392u = zArr3;
                        alertParams3.f393v = true;
                        builder3.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$03, view5, i6)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view5, this$03, 3)).create().show();
                        return;
                }
            }
        });
        final int i5 = 1;
        ((TextInputEditText) view.findViewById(C2507R.id.tTypes)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final int i52 = 1;
                final int i6 = 2;
                switch (i5) {
                    case 0:
                        View view3 = view;
                        final FilterFragment this$0 = this;
                        FilterFragment.Companion companion = FilterFragment.f28149U;
                        Intrinsics.m32179h(view3, "$view");
                        Intrinsics.m32179h(this$0, "this$0");
                        AlertDialog.Builder builder = new AlertDialog.Builder(view3.getContext());
                        builder.mo377k(C2507R.string.select_lists);
                        String[] strArr10 = this$0.f28155E;
                        if (strArr10 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        boolean[] zArr = this$0.f28159I;
                        if (zArr == null) {
                            Intrinsics.m32189r("selectionProfileListExclusions");
                            throw null;
                        }
                        final int i7 = 0;
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i7) {
                                    case 0:
                                        FilterFragment this$022 = this$0;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$032 = this$0;
                                        FilterFragment.Companion companion32 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$032, "this$0");
                                        boolean[] zArr32 = this$032.f28161K;
                                        if (zArr32 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr32[i8] = z;
                                        if (!z) {
                                            this$032.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$032.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr122 = this$032.f28158H;
                                        if (strArr122 != null) {
                                            hashMap2.put(valueOf2, strArr122[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$0;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams = builder.f413a;
                        alertParams.f388q = strArr10;
                        alertParams.f396y = onMultiChoiceClickListener;
                        alertParams.f392u = zArr;
                        alertParams.f393v = true;
                        builder.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$0, view3, i7)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view3, this$0, i52)).create().show();
                        return;
                    case 1:
                        View view4 = view;
                        final FilterFragment this$02 = this;
                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                        Intrinsics.m32179h(view4, "$view");
                        Intrinsics.m32179h(this$02, "this$0");
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(view4.getContext());
                        builder2.mo377k(C2507R.string.select_types);
                        String[] strArr11 = this$02.f28157G;
                        if (strArr11 == null) {
                            Intrinsics.m32189r("typeNames");
                            throw null;
                        }
                        boolean[] zArr2 = this$02.f28160J;
                        if (zArr2 == null) {
                            Intrinsics.m32189r("selectionTypes");
                            throw null;
                        }
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener2 = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i6) {
                                    case 0:
                                        FilterFragment this$022 = this$02;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$032 = this$02;
                                        FilterFragment.Companion companion32 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$032, "this$0");
                                        boolean[] zArr32 = this$032.f28161K;
                                        if (zArr32 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr32[i8] = z;
                                        if (!z) {
                                            this$032.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$032.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr122 = this$032.f28158H;
                                        if (strArr122 != null) {
                                            hashMap2.put(valueOf2, strArr122[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$02;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams2 = builder2.f413a;
                        alertParams2.f388q = strArr11;
                        alertParams2.f396y = onMultiChoiceClickListener2;
                        alertParams2.f392u = zArr2;
                        alertParams2.f393v = true;
                        builder2.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$02, view4, 4)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view4, this$02, 5)).create().show();
                        return;
                    default:
                        View view5 = view;
                        final FilterFragment this$03 = this;
                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                        Intrinsics.m32179h(view5, "$view");
                        Intrinsics.m32179h(this$03, "this$0");
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(view5.getContext());
                        builder3.mo377k(C2507R.string.select_age_ratings);
                        String[] strArr12 = this$03.f28158H;
                        if (strArr12 == null) {
                            Intrinsics.m32189r("ageRatings");
                            throw null;
                        }
                        boolean[] zArr3 = this$03.f28161K;
                        if (zArr3 == null) {
                            Intrinsics.m32189r("selectionAgeRating");
                            throw null;
                        }
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener3 = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i52) {
                                    case 0:
                                        FilterFragment this$022 = this$03;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$032 = this$03;
                                        FilterFragment.Companion companion32 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$032, "this$0");
                                        boolean[] zArr32 = this$032.f28161K;
                                        if (zArr32 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr32[i8] = z;
                                        if (!z) {
                                            this$032.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$032.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr122 = this$032.f28158H;
                                        if (strArr122 != null) {
                                            hashMap2.put(valueOf2, strArr122[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$03;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams3 = builder3.f413a;
                        alertParams3.f388q = strArr12;
                        alertParams3.f396y = onMultiChoiceClickListener3;
                        alertParams3.f392u = zArr3;
                        alertParams3.f393v = true;
                        builder3.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$03, view5, i6)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view5, this$03, 3)).create().show();
                        return;
                }
            }
        });
        final int i6 = 2;
        ((TextInputEditText) view.findViewById(C2507R.id.tAgeRating)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final int i52 = 1;
                final int i62 = 2;
                switch (i6) {
                    case 0:
                        View view3 = view;
                        final FilterFragment this$0 = this;
                        FilterFragment.Companion companion = FilterFragment.f28149U;
                        Intrinsics.m32179h(view3, "$view");
                        Intrinsics.m32179h(this$0, "this$0");
                        AlertDialog.Builder builder = new AlertDialog.Builder(view3.getContext());
                        builder.mo377k(C2507R.string.select_lists);
                        String[] strArr10 = this$0.f28155E;
                        if (strArr10 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        boolean[] zArr = this$0.f28159I;
                        if (zArr == null) {
                            Intrinsics.m32189r("selectionProfileListExclusions");
                            throw null;
                        }
                        final int i7 = 0;
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i7) {
                                    case 0:
                                        FilterFragment this$022 = this$0;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$032 = this$0;
                                        FilterFragment.Companion companion32 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$032, "this$0");
                                        boolean[] zArr32 = this$032.f28161K;
                                        if (zArr32 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr32[i8] = z;
                                        if (!z) {
                                            this$032.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$032.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr122 = this$032.f28158H;
                                        if (strArr122 != null) {
                                            hashMap2.put(valueOf2, strArr122[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$0;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams = builder.f413a;
                        alertParams.f388q = strArr10;
                        alertParams.f396y = onMultiChoiceClickListener;
                        alertParams.f392u = zArr;
                        alertParams.f393v = true;
                        builder.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$0, view3, i7)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view3, this$0, i52)).create().show();
                        return;
                    case 1:
                        View view4 = view;
                        final FilterFragment this$02 = this;
                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                        Intrinsics.m32179h(view4, "$view");
                        Intrinsics.m32179h(this$02, "this$0");
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(view4.getContext());
                        builder2.mo377k(C2507R.string.select_types);
                        String[] strArr11 = this$02.f28157G;
                        if (strArr11 == null) {
                            Intrinsics.m32189r("typeNames");
                            throw null;
                        }
                        boolean[] zArr2 = this$02.f28160J;
                        if (zArr2 == null) {
                            Intrinsics.m32189r("selectionTypes");
                            throw null;
                        }
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener2 = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i62) {
                                    case 0:
                                        FilterFragment this$022 = this$02;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$032 = this$02;
                                        FilterFragment.Companion companion32 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$032, "this$0");
                                        boolean[] zArr32 = this$032.f28161K;
                                        if (zArr32 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr32[i8] = z;
                                        if (!z) {
                                            this$032.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$032.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr122 = this$032.f28158H;
                                        if (strArr122 != null) {
                                            hashMap2.put(valueOf2, strArr122[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$02;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams2 = builder2.f413a;
                        alertParams2.f388q = strArr11;
                        alertParams2.f396y = onMultiChoiceClickListener2;
                        alertParams2.f392u = zArr2;
                        alertParams2.f393v = true;
                        builder2.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$02, view4, 4)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view4, this$02, 5)).create().show();
                        return;
                    default:
                        View view5 = view;
                        final FilterFragment this$03 = this;
                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                        Intrinsics.m32179h(view5, "$view");
                        Intrinsics.m32179h(this$03, "this$0");
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(view5.getContext());
                        builder3.mo377k(C2507R.string.select_age_ratings);
                        String[] strArr12 = this$03.f28158H;
                        if (strArr12 == null) {
                            Intrinsics.m32189r("ageRatings");
                            throw null;
                        }
                        boolean[] zArr3 = this$03.f28161K;
                        if (zArr3 == null) {
                            Intrinsics.m32189r("selectionAgeRating");
                            throw null;
                        }
                        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener3 = new DialogInterface.OnMultiChoiceClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.b
                            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                            public final void onClick(DialogInterface dialogInterface, int i8, boolean z) {
                                switch (i52) {
                                    case 0:
                                        FilterFragment this$022 = this$03;
                                        FilterFragment.Companion companion22 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$022, "this$0");
                                        boolean[] zArr22 = this$022.f28159I;
                                        if (zArr22 == null) {
                                            Intrinsics.m32189r("selectionProfileListExclusions");
                                            throw null;
                                        }
                                        zArr22[i8] = z;
                                        if (!z) {
                                            this$022.f28185r.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap = this$022.f28185r;
                                        Integer valueOf = Integer.valueOf(i8);
                                        String[] strArr112 = this$022.f28155E;
                                        if (strArr112 != null) {
                                            hashMap.put(valueOf, strArr112[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("profileLists");
                                            throw null;
                                        }
                                    case 1:
                                        FilterFragment this$032 = this$03;
                                        FilterFragment.Companion companion32 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$032, "this$0");
                                        boolean[] zArr32 = this$032.f28161K;
                                        if (zArr32 == null) {
                                            Intrinsics.m32189r("selectionAgeRating");
                                            throw null;
                                        }
                                        zArr32[i8] = z;
                                        if (!z) {
                                            this$032.f28187t.remove(Integer.valueOf(i8 + 1));
                                            return;
                                        }
                                        HashMap<Integer, String> hashMap2 = this$032.f28187t;
                                        Integer valueOf2 = Integer.valueOf(i8 + 1);
                                        String[] strArr122 = this$032.f28158H;
                                        if (strArr122 != null) {
                                            hashMap2.put(valueOf2, strArr122[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("ageRatings");
                                            throw null;
                                        }
                                    default:
                                        FilterFragment this$04 = this$03;
                                        FilterFragment.Companion companion4 = FilterFragment.f28149U;
                                        Intrinsics.m32179h(this$04, "this$0");
                                        boolean[] zArr4 = this$04.f28160J;
                                        if (zArr4 == null) {
                                            Intrinsics.m32189r("selectionTypes");
                                            throw null;
                                        }
                                        zArr4[i8] = z;
                                        if (!z) {
                                            this$04.f28186s.remove(Integer.valueOf(i8));
                                            return;
                                        }
                                        HashMap<Integer, Type> hashMap3 = this$04.f28186s;
                                        Integer valueOf3 = Integer.valueOf(i8);
                                        Type[] typeArr2 = this$04.f28156F;
                                        if (typeArr2 != null) {
                                            hashMap3.put(valueOf3, typeArr2[i8]);
                                            return;
                                        } else {
                                            Intrinsics.m32189r("types");
                                            throw null;
                                        }
                                }
                            }
                        };
                        AlertController.AlertParams alertParams3 = builder3.f413a;
                        alertParams3.f388q = strArr12;
                        alertParams3.f396y = onMultiChoiceClickListener3;
                        alertParams3.f392u = zArr3;
                        alertParams3.f393v = true;
                        builder3.setPositiveButton(C2507R.string.choose, new DialogInterfaceOnClickListenerC2683a(this$03, view5, i62)).setNegativeButton(C2507R.string.cancel, null).mo372f(C2507R.string.reset, new DialogInterfaceOnClickListenerC2683a(view5, this$03, 3)).create().show();
                        return;
                }
            }
        });
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCategory);
        String[] strArr10 = this.f28189v;
        if (strArr10 == null) {
            Intrinsics.m32189r("categories");
            throw null;
        }
        appCompatAutoCompleteTextView.setText((CharSequence) strArr10[0], false);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStatus);
        String[] strArr11 = this.f28190w;
        if (strArr11 == null) {
            Intrinsics.m32189r("statuses");
            throw null;
        }
        appCompatAutoCompleteTextView2.setText((CharSequence) strArr11[0], false);
        ((TextInputEditText) view.findViewById(C2507R.id.tYear)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView3 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStudio);
        String[] strArr12 = this.f28191x;
        if (strArr12 == null) {
            Intrinsics.m32189r("studios");
            throw null;
        }
        appCompatAutoCompleteTextView3.setText((CharSequence) strArr12[0], false);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView4 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodes);
        String[] strArr13 = this.f28192y;
        if (strArr13 == null) {
            Intrinsics.m32189r("episodes");
            throw null;
        }
        appCompatAutoCompleteTextView4.setText((CharSequence) strArr13[0], false);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView5 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSort);
        String[] strArr14 = this.f28193z;
        if (strArr14 == null) {
            Intrinsics.m32189r("sort");
            throw null;
        }
        appCompatAutoCompleteTextView5.setText((CharSequence) strArr14[0], false);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView6 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCountry);
        String[] strArr15 = this.f28151A;
        if (strArr15 == null) {
            Intrinsics.m32189r("countries");
            throw null;
        }
        appCompatAutoCompleteTextView6.setText((CharSequence) strArr15[0], false);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView7 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSeason);
        String[] strArr16 = this.f28152B;
        if (strArr16 == null) {
            Intrinsics.m32189r("seasons");
            throw null;
        }
        appCompatAutoCompleteTextView7.setText((CharSequence) strArr16[0], false);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView8 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodeDuration);
        String[] strArr17 = this.f28153C;
        if (strArr17 == null) {
            Intrinsics.m32189r("episodeDurations");
            throw null;
        }
        appCompatAutoCompleteTextView8.setText((CharSequence) strArr17[0], false);
        ((TextInputEditText) view.findViewById(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
        ((TextInputEditText) view.findViewById(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
        ((TextInputEditText) view.findViewById(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
        ((TextInputEditText) view.findViewById(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView9 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCategory);
        ArrayAdapter<String> arrayAdapter = this.f28162L;
        if (arrayAdapter == null) {
            Intrinsics.m32189r("categoryAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView9.setAdapter(arrayAdapter);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView10 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStatus);
        ArrayAdapter<String> arrayAdapter2 = this.f28163M;
        if (arrayAdapter2 == null) {
            Intrinsics.m32189r("statusAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView10.setAdapter(arrayAdapter2);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView11 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStudio);
        ArrayAdapter<String> arrayAdapter3 = this.f28164N;
        if (arrayAdapter3 == null) {
            Intrinsics.m32189r("studioAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView11.setAdapter(arrayAdapter3);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView12 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodes);
        ArrayAdapter<String> arrayAdapter4 = this.f28165O;
        if (arrayAdapter4 == null) {
            Intrinsics.m32189r("episodesAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView12.setAdapter(arrayAdapter4);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView13 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSort);
        ArrayAdapter<String> arrayAdapter5 = this.f28166P;
        if (arrayAdapter5 == null) {
            Intrinsics.m32189r("sortAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView13.setAdapter(arrayAdapter5);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView14 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCountry);
        ArrayAdapter<String> arrayAdapter6 = this.f28167Q;
        if (arrayAdapter6 == null) {
            Intrinsics.m32189r("countryAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView14.setAdapter(arrayAdapter6);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView15 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSeason);
        ArrayAdapter<String> arrayAdapter7 = this.f28168R;
        if (arrayAdapter7 == null) {
            Intrinsics.m32189r("seasonAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView15.setAdapter(arrayAdapter7);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView16 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodeDuration);
        ArrayAdapter<String> arrayAdapter8 = this.f28169S;
        if (arrayAdapter8 == null) {
            Intrinsics.m32189r("episodeDurationAdapter");
            throw null;
        }
        appCompatAutoCompleteTextView16.setAdapter(arrayAdapter8);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCategory)).setOnItemClickListener(new C2687e(view, this, 5));
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStatus)).setOnItemClickListener(new C2687e(view, this, 6));
        final int i7 = 3;
        ((TextInputEditText) view.findViewById(C2507R.id.tYear)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.d

            /* renamed from: c */
            public final /* synthetic */ FilterFragment f28208c;

            {
                this.f28208c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        FilterFragment this$0 = this.f28208c;
                        FilterFragment.Companion companion = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        return;
                    case 1:
                        final FilterFragment this$02 = this.f28208c;
                        FilterFragment.Companion companion2 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (Intrinsics.m32174c(this$02.f28173f, "IS_FROM_CUSTOM_FILTER_TAB")) {
                            Context requireContext9 = this$02.requireContext();
                            Intrinsics.m32178g(requireContext9, "requireContext()");
                            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext9);
                            builder.f30150b = 3;
                            builder.m16318j(C2507R.string.confirm);
                            builder.f30152d = "Вы уверены, что хотите сбросить все фильтры?";
                            builder.m16315g(C2507R.string.yes);
                            builder.m16311c(C2507R.string.cancel);
                            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$onFilterLoaded$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                                    Dialogs.MaterialDialog it2 = materialDialog;
                                    Intrinsics.m32179h(it2, "it");
                                    FilterFragment filterFragment = FilterFragment.this;
                                    FilterFragment.Companion companion3 = FilterFragment.f28149U;
                                    filterFragment.m15511c4().f26378a.f27357b.deleteAll();
                                    EventBusKt.m16327a(new OnCustomFilterTabRefresh());
                                    FilterFragment.this.m15437u3().mo15323a3();
                                    return Unit.f63088a;
                                }
                            });
                            builder.f30159k = true;
                            builder.m16317i();
                            return;
                        }
                        this$02.f28174g = null;
                        this$02.f28175h = null;
                        this$02.f28176i = null;
                        this$02.f28177j = null;
                        this$02.f28178k = "";
                        this$02.f28179l = null;
                        this$02.f28180m = null;
                        this$02.f28181n = "";
                        this$02.f28182o = null;
                        this$02.f28183p = null;
                        this$02.f28184q.clear();
                        this$02.f28185r.clear();
                        this$02.f28186s.clear();
                        this$02.f28187t.clear();
                        this$02.f28188u = false;
                        String[] strArr102 = this$02.f28155E;
                        if (strArr102 == null) {
                            Intrinsics.m32189r("profileLists");
                            throw null;
                        }
                        this$02.f28159I = new boolean[strArr102.length];
                        String[] strArr112 = this$02.f28158H;
                        if (strArr112 == null) {
                            Intrinsics.m32189r("ageRatings");
                            throw null;
                        }
                        this$02.f28161K = new boolean[strArr112.length];
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView17 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCategory);
                        String[] strArr122 = this$02.f28189v;
                        if (strArr122 == null) {
                            Intrinsics.m32189r("categories");
                            throw null;
                        }
                        appCompatAutoCompleteTextView17.setText((CharSequence) strArr122[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView22 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStatus);
                        String[] strArr132 = this$02.f28190w;
                        if (strArr132 == null) {
                            Intrinsics.m32189r("statuses");
                            throw null;
                        }
                        appCompatAutoCompleteTextView22.setText((CharSequence) strArr132[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tYear)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView32 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tStudio);
                        String[] strArr142 = this$02.f28191x;
                        if (strArr142 == null) {
                            Intrinsics.m32189r("studios");
                            throw null;
                        }
                        appCompatAutoCompleteTextView32.setText((CharSequence) strArr142[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView42 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodes);
                        String[] strArr152 = this$02.f28192y;
                        if (strArr152 == null) {
                            Intrinsics.m32189r("episodes");
                            throw null;
                        }
                        appCompatAutoCompleteTextView42.setText((CharSequence) strArr152[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView52 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSort);
                        String[] strArr162 = this$02.f28193z;
                        if (strArr162 == null) {
                            Intrinsics.m32189r("sort");
                            throw null;
                        }
                        appCompatAutoCompleteTextView52.setText((CharSequence) strArr162[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView62 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tCountry);
                        String[] strArr172 = this$02.f28151A;
                        if (strArr172 == null) {
                            Intrinsics.m32189r("countries");
                            throw null;
                        }
                        appCompatAutoCompleteTextView62.setText((CharSequence) strArr172[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView72 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tSeason);
                        String[] strArr18 = this$02.f28152B;
                        if (strArr18 == null) {
                            Intrinsics.m32189r("seasons");
                            throw null;
                        }
                        appCompatAutoCompleteTextView72.setText((CharSequence) strArr18[0], false);
                        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView82 = (AppCompatAutoCompleteTextView) this$02.m15510A3(C2507R.id.tEpisodeDuration);
                        String[] strArr19 = this$02.f28153C;
                        if (strArr19 == null) {
                            Intrinsics.m32189r("episodeDurations");
                            throw null;
                        }
                        appCompatAutoCompleteTextView82.setText((CharSequence) strArr19[0], false);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        ((TextInputEditText) this$02.m15510A3(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                        return;
                    case 2:
                        FilterFragment this$03 = this.f28208c;
                        FilterFragment.Companion companion3 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$03, "this$0");
                        ChooseGenresDialogFragment.Companion companion4 = ChooseGenresDialogFragment.f27668j;
                        String[] strArr20 = this$03.f28154D;
                        if (strArr20 == null) {
                            Intrinsics.m32189r("genres");
                            throw null;
                        }
                        List<String> selectedGenres = this$03.f28184q;
                        boolean z = this$03.f28188u;
                        Objects.requireNonNull(companion4);
                        Intrinsics.m32179h(selectedGenres, "selectedGenres");
                        ChooseGenresDialogFragment chooseGenresDialogFragment = new ChooseGenresDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putStringArray("GENRES_VALUE", strArr20);
                        bundle.putStringArrayList("SELECTED_GENRES_VALUE", new ArrayList<>(selectedGenres));
                        bundle.putBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", z);
                        chooseGenresDialogFragment.setArguments(bundle);
                        chooseGenresDialogFragment.show(this$03.getChildFragmentManager(), "CHOOSE_GENRES_TAG");
                        return;
                    default:
                        FilterFragment this$04 = this.f28208c;
                        FilterFragment.Companion companion5 = FilterFragment.f28149U;
                        Intrinsics.m32179h(this$04, "this$0");
                        Integer num = this$04.f28176i;
                        Integer num2 = this$04.f28177j;
                        ChooseYearsDialogFragment chooseYearsDialogFragment = new ChooseYearsDialogFragment();
                        Bundle bundle2 = new Bundle();
                        if (num != null) {
                            bundle2.putInt("SELECTED_START_YEAR_VALUE", num.intValue());
                        }
                        if (num2 != null) {
                            bundle2.putInt("SELECTED_END_YEAR_VALUE", num2.intValue());
                        }
                        chooseYearsDialogFragment.setArguments(bundle2);
                        chooseYearsDialogFragment.show(this$04.getChildFragmentManager(), "CHOOSE_YEARS_TAG");
                        return;
                }
            }
        });
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStudio)).setOnItemClickListener(new C2687e(view, this, 7));
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodes)).setOnItemClickListener(new C2687e(view, this, 0));
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSort)).setOnItemClickListener(new C2687e(view, this, 1));
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCountry)).setOnItemClickListener(new C2687e(view, this, 2));
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSeason)).setOnItemClickListener(new C2687e(view, this, 3));
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodeDuration)).setOnItemClickListener(new C2687e(view, this, 4));
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCountry)).setKeyListener(null);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCategory)).setKeyListener(null);
        ((TextInputEditText) view.findViewById(C2507R.id.tGenres)).setKeyListener(null);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStudio)).setKeyListener(null);
        ((TextInputEditText) view.findViewById(C2507R.id.tYear)).setKeyListener(null);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSeason)).setKeyListener(null);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodes)).setKeyListener(null);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStatus)).setKeyListener(null);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodeDuration)).setKeyListener(null);
        ((TextInputEditText) view.findViewById(C2507R.id.tAgeRating)).setKeyListener(null);
        ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSort)).setKeyListener(null);
        Button button = (Button) view.findViewById(C2507R.id.apply);
        Intrinsics.m32178g(button, "view.apply");
        ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$onFilterLoaded$16
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view2) {
                View it2 = view2;
                Intrinsics.m32179h(it2, "it");
                if (Intrinsics.m32174c(FilterFragment.this.f28173f, "IS_FROM_CUSTOM_FILTER_TAB")) {
                    FilterFragment filterFragment = FilterFragment.this;
                    if (filterFragment.f28174g == null && filterFragment.f28175h == null && (filterFragment.f28176i == null || filterFragment.f28177j == null)) {
                        if (!(filterFragment.f28178k.length() > 0)) {
                            FilterFragment filterFragment2 = FilterFragment.this;
                            if (filterFragment2.f28179l == null && filterFragment2.f28180m == null) {
                                if (!(filterFragment2.f28181n.length() > 0)) {
                                    if (FilterFragment.this.f28182o == null && !(!r1.f28184q.isEmpty()) && !(!FilterFragment.this.f28185r.isEmpty()) && !(!FilterFragment.this.f28186s.isEmpty()) && !(!FilterFragment.this.f28187t.isEmpty())) {
                                        FilterFragment.this.m15511c4().f26378a.f27357b.deleteAll();
                                        EventBusKt.m16327a(new OnCustomFilterTabRefresh());
                                        FilterFragment.this.m15437u3().mo15323a3();
                                    }
                                }
                            }
                        }
                    }
                    FilterPresenter m15511c4 = FilterFragment.this.m15511c4();
                    FilterFragment filterFragment3 = FilterFragment.this;
                    Long l2 = filterFragment3.f28174g;
                    Long l3 = filterFragment3.f28175h;
                    Integer num = filterFragment3.f28176i;
                    Integer num2 = filterFragment3.f28177j;
                    String selectedStudio = filterFragment3.f28178k;
                    Integer num3 = filterFragment3.f28179l;
                    Integer num4 = filterFragment3.f28180m;
                    String selectedCountry = filterFragment3.f28181n;
                    Integer num5 = filterFragment3.f28182o;
                    Integer num6 = filterFragment3.f28183p;
                    List<String> selectedGenres = filterFragment3.f28184q;
                    Set<Integer> keySet = filterFragment3.f28185r.keySet();
                    Intrinsics.m32178g(keySet, "selectedProfileListExclusions.keys");
                    Collection<Type> values = FilterFragment.this.f28186s.values();
                    Intrinsics.m32178g(values, "selectedTypes.values");
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(values, 10));
                    Iterator<T> it3 = values.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Long.valueOf(((Type) it3.next()).getId()));
                    }
                    Set<Integer> keySet2 = FilterFragment.this.f28187t.keySet();
                    Intrinsics.m32178g(keySet2, "selectedAgeRatings.keys");
                    boolean z = FilterFragment.this.f28188u;
                    Objects.requireNonNull(m15511c4);
                    Intrinsics.m32179h(selectedStudio, "selectedStudio");
                    Intrinsics.m32179h(selectedCountry, "selectedCountry");
                    Intrinsics.m32179h(selectedGenres, "selectedGenres");
                    CustomFilter customFilter = new CustomFilter();
                    customFilter.setSelectedCategoryId(l2);
                    customFilter.setSelectedStatusId(l3);
                    customFilter.setSelectedStartYear(num);
                    customFilter.setSelectedEndYear(num2);
                    customFilter.setSelectedStudio(selectedStudio);
                    customFilter.setSelectedEpisodes(num3);
                    customFilter.setSelectedSort(num4);
                    customFilter.setSelectedCountry(selectedCountry);
                    customFilter.setSelectedSeason(num5);
                    customFilter.setSelectedEpisodeDuration(num6);
                    customFilter.setSelectedGenres(selectedGenres);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(keySet, 10));
                    Iterator<T> it4 = keySet.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(String.valueOf(((Number) it4.next()).intValue()));
                    }
                    customFilter.setSelectedProfileListExclusions(arrayList3);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.m32032m(arrayList2, 10));
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(String.valueOf(((Number) it5.next()).longValue()));
                    }
                    customFilter.setSelectedTypes(arrayList4);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.m32032m(keySet2, 10));
                    Iterator<T> it6 = keySet2.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                    customFilter.setSelectedAgeRatings(arrayList5);
                    customFilter.setGenresExcludeModeEnabled(z);
                    m15511c4.f26378a.f27357b.deleteAll();
                    HomeRepository homeRepository = m15511c4.f26378a;
                    Objects.requireNonNull(homeRepository);
                    homeRepository.f27357b.save(customFilter);
                    EventBusKt.m16327a(new OnCustomFilterTabShowHint());
                    EventBusKt.m16327a(new OnCustomFilterTabRefresh());
                    FilterFragment.this.m15437u3().mo15323a3();
                } else {
                    FragmentNavigation m15437u3 = FilterFragment.this.m15437u3();
                    FilteredFragment.Companion companion = FilteredFragment.f28212v;
                    FilterFragment filterFragment4 = FilterFragment.this;
                    Long l4 = filterFragment4.f28174g;
                    Long l5 = filterFragment4.f28175h;
                    Integer num7 = filterFragment4.f28176i;
                    Integer num8 = filterFragment4.f28177j;
                    String selectedStudio2 = filterFragment4.f28178k;
                    Integer num9 = filterFragment4.f28179l;
                    Integer num10 = filterFragment4.f28180m;
                    String selectedCountry2 = filterFragment4.f28181n;
                    Integer num11 = filterFragment4.f28182o;
                    Integer num12 = filterFragment4.f28183p;
                    List<String> selectedGenres2 = filterFragment4.f28184q;
                    Set<Integer> keySet3 = filterFragment4.f28185r.keySet();
                    Intrinsics.m32178g(keySet3, "selectedProfileListExclusions.keys");
                    Collection<Type> values2 = FilterFragment.this.f28186s.values();
                    Intrinsics.m32178g(values2, "selectedTypes.values");
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.m32032m(values2, 10));
                    Iterator<T> it7 = values2.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(Long.valueOf(((Type) it7.next()).getId()));
                    }
                    Set<Integer> keySet4 = FilterFragment.this.f28187t.keySet();
                    Intrinsics.m32178g(keySet4, "selectedAgeRatings.keys");
                    boolean z2 = FilterFragment.this.f28188u;
                    Objects.requireNonNull(companion);
                    Intrinsics.m32179h(selectedStudio2, "selectedStudio");
                    Intrinsics.m32179h(selectedCountry2, "selectedCountry");
                    Intrinsics.m32179h(selectedGenres2, "selectedGenres");
                    FilteredFragment filteredFragment = new FilteredFragment();
                    Bundle bundle = new Bundle();
                    if (l4 != null) {
                        bundle.putLong("SELECTED_CATEGORY_ID_VALUE", l4.longValue());
                    }
                    if (l5 != null) {
                        bundle.putLong("SELECTED_STATUS_ID_VALUE", l5.longValue());
                    }
                    if (num7 != null) {
                        bundle.putInt("SELECTED_START_YEAR_VALUE", num7.intValue());
                    }
                    if (num8 != null) {
                        bundle.putInt("SELECTED_END_YEAR_VALUE", num8.intValue());
                    }
                    bundle.putString("SELECTED_STUDIO_VALUE", selectedStudio2);
                    if (num9 != null) {
                        bundle.putInt("SELECTED_EPISODES_VALUE", num9.intValue());
                    }
                    if (num10 != null) {
                        bundle.putInt("SELECTED_SORT_VALUE", num10.intValue());
                    }
                    bundle.putString("SELECTED_COUNTRY_VALUE", selectedCountry2);
                    if (num11 != null) {
                        bundle.putInt("SELECTED_SEASON_VALUE", num11.intValue());
                    }
                    if (num12 != null) {
                        bundle.putInt("SELECTED_EPISODE_DURATION_VALUE", num12.intValue());
                    }
                    bundle.putStringArrayList("SELECTED_GENRES_VALUE", new ArrayList<>(selectedGenres2));
                    bundle.putIntegerArrayList("SELECTED_PROFILE_LIST_EXCLUSIONS_VALUE", new ArrayList<>(keySet3));
                    bundle.putLongArray("SELECTED_TYPES_VALUE", CollectionsKt.m32029k0(arrayList6));
                    bundle.putIntegerArrayList("SELECTED_AGE_RATINGS_VALUE", new ArrayList<>(keySet4));
                    bundle.putBoolean("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", z2);
                    filteredFragment.setArguments(bundle);
                    m15437u3.mo15324d2(filteredFragment, null);
                }
                return Unit.f63088a;
            }
        });
        if (Intrinsics.m32174c(this.f28173f, "IS_FROM_CUSTOM_FILTER_TAB") && (m15297b = m15511c4().f26378a.m15297b()) != null) {
            this.f28174g = m15297b.getSelectedCategoryId();
            this.f28175h = m15297b.getSelectedStatusId();
            this.f28176i = m15297b.getSelectedStartYear();
            this.f28177j = m15297b.getSelectedEndYear();
            this.f28178k = m15297b.getSelectedStudio();
            this.f28179l = m15297b.getSelectedEpisodes();
            this.f28180m = m15297b.getSelectedSort();
            this.f28181n = m15297b.getSelectedCountry();
            this.f28182o = m15297b.getSelectedSeason();
            this.f28183p = m15297b.getSelectedEpisodeDuration();
            this.f28184q.addAll(m15297b.getSelectedGenres());
            Iterator<T> it2 = m15297b.getSelectedProfileListExclusions().iterator();
            while (it2.hasNext()) {
                int parseInt = Integer.parseInt((String) it2.next());
                HashMap<Integer, String> hashMap = this.f28185r;
                Integer valueOf = Integer.valueOf(parseInt);
                String[] strArr18 = this.f28155E;
                if (strArr18 == null) {
                    Intrinsics.m32189r("profileLists");
                    throw null;
                }
                hashMap.put(valueOf, strArr18[parseInt]);
                boolean[] zArr = this.f28159I;
                if (zArr == null) {
                    Intrinsics.m32189r("selectionProfileListExclusions");
                    throw null;
                }
                zArr[parseInt] = true;
            }
            Iterator<T> it3 = m15297b.getSelectedTypes().iterator();
            while (it3.hasNext()) {
                long parseLong = Long.parseLong((String) it3.next());
                Type[] typeArr2 = this.f28156F;
                if (typeArr2 == null) {
                    Intrinsics.m32189r("types");
                    throw null;
                }
                int length = typeArr2.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    Type[] typeArr3 = this.f28156F;
                    if (typeArr3 == null) {
                        Intrinsics.m32189r("types");
                        throw null;
                    }
                    Type type = typeArr3[i8];
                    if (type.getId() == parseLong) {
                        this.f28186s.put(Integer.valueOf(i8), type);
                        boolean[] zArr2 = this.f28160J;
                        if (zArr2 == null) {
                            Intrinsics.m32189r("selectionTypes");
                            throw null;
                        }
                        zArr2[i8] = true;
                    } else {
                        i8++;
                    }
                }
            }
            Iterator<T> it4 = m15297b.getSelectedAgeRatings().iterator();
            while (it4.hasNext()) {
                int parseInt2 = Integer.parseInt((String) it4.next());
                HashMap<Integer, String> hashMap2 = this.f28187t;
                Integer valueOf2 = Integer.valueOf(parseInt2);
                String[] strArr19 = this.f28158H;
                if (strArr19 == null) {
                    Intrinsics.m32189r("ageRatings");
                    throw null;
                }
                int i9 = parseInt2 - 1;
                hashMap2.put(valueOf2, strArr19[i9]);
                boolean[] zArr3 = this.f28161K;
                if (zArr3 == null) {
                    Intrinsics.m32189r("selectionAgeRating");
                    throw null;
                }
                zArr3[i9] = true;
            }
            Long selectedCategoryId = m15297b.getSelectedCategoryId();
            if (selectedCategoryId != null) {
                long longValue = selectedCategoryId.longValue();
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView17 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCategory);
                String[] strArr20 = this.f28189v;
                if (strArr20 == null) {
                    Intrinsics.m32189r("categories");
                    throw null;
                }
                appCompatAutoCompleteTextView17.setText((CharSequence) strArr20[(int) longValue], false);
            }
            Long selectedStatusId = m15297b.getSelectedStatusId();
            if (selectedStatusId != null) {
                long longValue2 = selectedStatusId.longValue();
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView18 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStatus);
                String[] strArr21 = this.f28190w;
                if (strArr21 == null) {
                    Intrinsics.m32189r("statuses");
                    throw null;
                }
                appCompatAutoCompleteTextView18.setText((CharSequence) strArr21[(int) longValue2], false);
            }
            if (m15297b.getSelectedStartYear() == null || m15297b.getSelectedEndYear() == null) {
                ((TextInputEditText) view.findViewById(C2507R.id.tYear)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
            } else if (Intrinsics.m32174c(m15297b.getSelectedStartYear(), m15297b.getSelectedEndYear())) {
                ((TextInputEditText) view.findViewById(C2507R.id.tYear)).setText(String.valueOf(this.f28176i));
            } else if (m15297b.getSelectedStartYear() != null && m15297b.getSelectedEndYear() != null) {
                String string2 = getString(C2507R.string.from_to, m15297b.getSelectedStartYear(), m15297b.getSelectedEndYear());
                Intrinsics.m32178g(string2, "getString(\n             …EndYear\n                )");
                ((TextInputEditText) view.findViewById(C2507R.id.tYear)).setText(string2, TextView.BufferType.EDITABLE);
            }
            if (m15297b.getSelectedStudio().length() > 0) {
                ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tStudio)).setText((CharSequence) m15297b.getSelectedStudio(), false);
            }
            Integer selectedEpisodes = m15297b.getSelectedEpisodes();
            if (selectedEpisodes != null) {
                int intValue = selectedEpisodes.intValue();
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView19 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodes);
                String[] strArr22 = this.f28192y;
                if (strArr22 == null) {
                    Intrinsics.m32189r("episodes");
                    throw null;
                }
                appCompatAutoCompleteTextView19.setText((CharSequence) strArr22[intValue], false);
            }
            Integer selectedSort = m15297b.getSelectedSort();
            if (selectedSort != null) {
                int intValue2 = selectedSort.intValue();
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView20 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSort);
                String[] strArr23 = this.f28193z;
                if (strArr23 == null) {
                    Intrinsics.m32189r("sort");
                    throw null;
                }
                appCompatAutoCompleteTextView20.setText((CharSequence) strArr23[intValue2], false);
            }
            if (m15297b.getSelectedCountry().length() > 0) {
                ((AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tCountry)).setText((CharSequence) m15297b.getSelectedCountry(), false);
            }
            Integer selectedSeason = m15297b.getSelectedSeason();
            if (selectedSeason != null) {
                int intValue3 = selectedSeason.intValue();
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView21 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tSeason);
                String[] strArr24 = this.f28152B;
                if (strArr24 == null) {
                    Intrinsics.m32189r("seasons");
                    throw null;
                }
                appCompatAutoCompleteTextView21.setText((CharSequence) strArr24[intValue3], false);
            }
            Integer selectedEpisodeDuration = m15297b.getSelectedEpisodeDuration();
            if (selectedEpisodeDuration != null) {
                int intValue4 = selectedEpisodeDuration.intValue();
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextView22 = (AppCompatAutoCompleteTextView) view.findViewById(C2507R.id.tEpisodeDuration);
                String[] strArr25 = this.f28153C;
                if (strArr25 == null) {
                    Intrinsics.m32189r("episodeDurations");
                    throw null;
                }
                appCompatAutoCompleteTextView22.setText((CharSequence) strArr25[intValue4], false);
            }
            ((TextInputEditText) view.findViewById(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
            if (this.f28184q.isEmpty()) {
                ((TextInputEditText) view.findViewById(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
            } else {
                ((TextInputEditText) view.findViewById(C2507R.id.tGenres)).setText(CollectionsKt.m31989B(this.f28184q, ", ", null, null, 0, null, null, 62, null), TextView.BufferType.EDITABLE);
            }
            if (this.f28185r.isEmpty()) {
                ((TextInputEditText) view.findViewById(C2507R.id.tProfileListExclusions)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
            } else {
                TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C2507R.id.tProfileListExclusions);
                Collection<String> values = this.f28185r.values();
                Intrinsics.m32178g(values, "selectedProfileListExclusions.values");
                textInputEditText.setText(CollectionsKt.m31989B(values, ", ", null, null, 0, null, null, 62, null), TextView.BufferType.EDITABLE);
            }
            if (this.f28186s.isEmpty()) {
                ((TextInputEditText) view.findViewById(C2507R.id.tTypes)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
            } else {
                TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(C2507R.id.tTypes);
                Collection<Type> values2 = this.f28186s.values();
                Intrinsics.m32178g(values2, "selectedTypes.values");
                textInputEditText2.setText(CollectionsKt.m31989B(values2, ", ", null, null, 0, null, new Function1<Type, CharSequence>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.filter.FilterFragment$customFilterSetup$10
                    @Override // kotlin.jvm.functions.Function1
                    public CharSequence invoke(Type type2) {
                        Type type3 = type2;
                        Intrinsics.m32179h(type3, "type");
                        return type3.getName();
                    }
                }, 30, null), TextView.BufferType.EDITABLE);
            }
            if (this.f28187t.isEmpty()) {
                ((TextInputEditText) view.findViewById(C2507R.id.tAgeRating)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
            } else {
                TextInputEditText textInputEditText3 = (TextInputEditText) view.findViewById(C2507R.id.tAgeRating);
                Collection<String> values3 = this.f28187t.values();
                Intrinsics.m32178g(values3, "selectedAgeRatings.values");
                textInputEditText3.setText(CollectionsKt.m31989B(values3, ", ", null, null, 0, null, null, 62, null), TextView.BufferType.EDITABLE);
            }
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C2507R.id.filterLayout);
        Intrinsics.m32178g(linearLayout2, "view.filterLayout");
        linearLayout2.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C2507R.id.filterButtonsLayout);
        Intrinsics.m32178g(relativeLayout, "view.filterButtonsLayout");
        relativeLayout.setVisibility(0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28170T.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14111a(this);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28173f = arguments.getString("IS_FROM");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_filter, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.filterLayout);
        Intrinsics.m32178g(linearLayout, "view.filterLayout");
        ViewsKt.m16372e(linearLayout);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.filterButtonsLayout);
        Intrinsics.m32178g(relativeLayout, "view.filterButtonsLayout");
        ViewsKt.m16372e(relativeLayout);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28170T.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        m15511c4().m14638a();
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (Intrinsics.m32174c(str, "CHOOSE_GENRES_TAG")) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_GENRES_VALUE");
            if (stringArrayListExtra == null) {
                return false;
            }
            boolean booleanExtra = intent.getBooleanExtra("IS_GENRES_EXCLUDE_MODE_ENABLED_VALUE", false);
            this.f28184q.clear();
            if (stringArrayListExtra.isEmpty()) {
                this.f28188u = false;
                ((TextInputEditText) m15510A3(C2507R.id.tGenres)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
                return true;
            }
            this.f28184q.addAll(stringArrayListExtra);
            this.f28188u = booleanExtra;
            ((TextInputEditText) m15510A3(C2507R.id.tGenres)).setText(CollectionsKt.m31989B(stringArrayListExtra, ", ", null, null, 0, null, null, 62, null), TextView.BufferType.EDITABLE);
            if (booleanExtra) {
                ((TextView) m15510A3(C2507R.id.filterGenresHint)).setText(C2507R.string.filter_genres_exclude_enabled_hint);
            } else {
                ((TextView) m15510A3(C2507R.id.filterGenresHint)).setText(C2507R.string.filter_genres_hint);
            }
            return true;
        }
        if (!Intrinsics.m32174c(str, "CHOOSE_YEARS_TAG")) {
            return false;
        }
        int intExtra = intent.getIntExtra("SELECTED_START_YEAR_VALUE", -1);
        int intExtra2 = intent.getIntExtra("SELECTED_END_YEAR_VALUE", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            this.f28176i = null;
            this.f28177j = null;
            ((TextInputEditText) m15510A3(C2507R.id.tYear)).setText(C2507R.string.no_matter, TextView.BufferType.EDITABLE);
            return true;
        }
        this.f28176i = Integer.valueOf(intExtra);
        this.f28177j = Integer.valueOf(intExtra2);
        if (intExtra == intExtra2) {
            ((TextInputEditText) m15510A3(C2507R.id.tYear)).setText(String.valueOf(intExtra));
        } else {
            ((TextInputEditText) m15510A3(C2507R.id.tYear)).setText(getString(C2507R.string.from_to, Integer.valueOf(intExtra), Integer.valueOf(intExtra2)));
        }
        return true;
    }
}
