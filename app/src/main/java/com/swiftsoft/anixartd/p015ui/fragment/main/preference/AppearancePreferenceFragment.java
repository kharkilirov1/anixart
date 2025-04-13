package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.layout.ViewTypePreferenceLayout;
import com.swiftsoft.anixartd.presentation.main.preference.AppearancePreferenceView;
import com.swiftsoft.anixartd.presentation.main.preference.MainPreferencePresenter;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigationCompact;
import com.swiftsoft.anixartd.utils.OnProfileWatchedTime;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppearancePreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/AppearancePreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/presentation/main/preference/AppearancePreferenceView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AppearancePreferenceFragment extends BasePreferenceFragment implements AppearancePreferenceView {

    /* renamed from: r */
    public static final /* synthetic */ KProperty<Object>[] f28297r = {C2052a.m12277l(AppearancePreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/preference/MainPreferencePresenter;", 0)};

    /* renamed from: o */
    @Inject
    public Lazy<MainPreferencePresenter> f28298o;

    /* renamed from: p */
    @NotNull
    public final MoxyKtxDelegate f28299p;

    /* renamed from: q */
    @NotNull
    public Map<Integer, View> f28300q = new LinkedHashMap();

    public AppearancePreferenceFragment() {
        Function0<MainPreferencePresenter> function0 = new Function0<MainPreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.AppearancePreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public MainPreferencePresenter invoke() {
                Lazy<MainPreferencePresenter> lazy = AppearancePreferenceFragment.this.f28298o;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28299p = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(MainPreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f28300q.clear();
    }

    /* renamed from: e4 */
    public final MainPreferencePresenter m15526e4() {
        return (MainPreferencePresenter) this.f28299p.getValue(this, f28297r[0]);
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        String string;
        App.f25340b.m14043a().mo14107W(this);
        getMvpDelegate().onCreate(bundle);
        m3418u3(C2507R.xml.preference_appearance, str);
        Preference mo3340t0 = mo3340t0("view_type_preferences");
        Intrinsics.m32176e(mo3340t0);
        ViewTypePreferenceLayout viewTypePreferenceLayout = (ViewTypePreferenceLayout) mo3340t0;
        Preference mo3340t02 = mo3340t0("bookmarks_default_page");
        Intrinsics.m32176e(mo3340t02);
        final ListPreference listPreference = (ListPreference) mo3340t02;
        Preference mo3340t03 = mo3340t0("home_default_page");
        Intrinsics.m32176e(mo3340t03);
        final ListPreference listPreference2 = (ListPreference) mo3340t03;
        Preference mo3340t04 = mo3340t0("profile_watched_time_format");
        Intrinsics.m32176e(mo3340t04);
        final ListPreference listPreference3 = (ListPreference) mo3340t04;
        Preference mo3340t05 = mo3340t0("bottom_navigation_compact");
        Intrinsics.m32176e(mo3340t05);
        SwitchPreference switchPreference = (SwitchPreference) mo3340t05;
        final int i2 = 2;
        listPreference.mo3342V(m15526e4().f26543a.f25344a.getInt("BOOKMARKS_DEFAULT_PAGE", 2));
        final int i3 = 1;
        listPreference2.mo3342V(m15526e4().f26543a.f25344a.getInt("HOME_DEFAULT_PAGE", 1));
        final int i4 = 0;
        switchPreference.m3461R(m15526e4().f26543a.f25344a.getBoolean("BOTTOM_NAVIGATION_COMPACT", false));
        viewTypePreferenceLayout.f4968f = new Preference.OnPreferenceChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.e

            /* renamed from: c */
            public final /* synthetic */ AppearancePreferenceFragment f28402c;

            {
                this.f28402c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i4) {
                    case 0:
                        AppearancePreferenceFragment this$0 = this.f28402c;
                        KProperty<Object>[] kPropertyArr = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        if (!(obj instanceof Integer)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        Prefs prefs = this$0.m15526e4().f26543a;
                        prefs.f25344a.edit().putInt("VIEW_TYPE", ((Number) obj).intValue()).apply();
                        FragmentActivity activity = this$0.getActivity();
                        if (activity != null) {
                            activity.recreate();
                        }
                        EventBusKt.m16327a(new OnRefresh());
                        return false;
                    default:
                        AppearancePreferenceFragment this$02 = this.f28402c;
                        KProperty<Object>[] kPropertyArr2 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        Prefs prefs2 = this$02.m15526e4().f26543a;
                        Boolean bool = (Boolean) obj;
                        prefs2.f25344a.edit().putBoolean("BOTTOM_NAVIGATION_COMPACT", bool.booleanValue()).apply();
                        EventBusKt.m16327a(new OnBottomNavigationCompact(bool.booleanValue()));
                        return true;
                }
            }
        };
        viewTypePreferenceLayout.f28425R = m15526e4().f26543a.m14081x();
        viewTypePreferenceLayout.mo3387p(viewTypePreferenceLayout.mo3349O());
        viewTypePreferenceLayout.mo3344o();
        listPreference.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.d
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i4) {
                    case 0:
                        ListPreference bookmarksDefaultPage = listPreference;
                        AppearancePreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(bookmarksDefaultPage, "$bookmarksDefaultPage");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = bookmarksDefaultPage.m3363R(obj.toString());
                        bookmarksDefaultPage.mo3342V(m3363R);
                        this$0.m15526e4().f26543a.f25344a.edit().putInt("BOOKMARKS_DEFAULT_PAGE", m3363R).apply();
                        break;
                    case 1:
                        ListPreference homeDefaultPage = listPreference;
                        AppearancePreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage, "$homeDefaultPage");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = homeDefaultPage.m3363R(obj.toString());
                        homeDefaultPage.mo3342V(m3363R2);
                        this$02.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference homeDefaultPage2 = listPreference;
                        AppearancePreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage2, "$homeDefaultPage");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = homeDefaultPage2.m3363R(obj.toString());
                        homeDefaultPage2.mo3342V(m3363R3);
                        this$03.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R3).apply();
                        break;
                    default:
                        ListPreference profileWatchedTimeFormat = listPreference;
                        AppearancePreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(profileWatchedTimeFormat, "$profileWatchedTimeFormat");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = profileWatchedTimeFormat.m3363R(obj.toString());
                        profileWatchedTimeFormat.mo3342V(m3363R4);
                        this$04.m15526e4().f26543a.f25344a.edit().putInt("PROFILE_WATCHED_TIME_FORMAT", m3363R4).apply();
                        EventBusKt.m16327a(new OnProfileWatchedTime());
                        break;
                }
                return false;
            }
        };
        if (m15526e4().f26543a.m14059b().length() > 0) {
            string = m15526e4().f26543a.m14059b();
        } else {
            string = getString(C2507R.string.my_custom_filter_tab);
            Intrinsics.m32178g(string, "getString(R.string.my_custom_filter_tab)");
        }
        final int i5 = 3;
        listPreference2.mo3341T(new CharSequence[]{string, "Последнее", "Онгоинги", "Анонсы", "Завершенные", "Фильмы"});
        listPreference2.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.d
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i3) {
                    case 0:
                        ListPreference bookmarksDefaultPage = listPreference2;
                        AppearancePreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(bookmarksDefaultPage, "$bookmarksDefaultPage");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = bookmarksDefaultPage.m3363R(obj.toString());
                        bookmarksDefaultPage.mo3342V(m3363R);
                        this$0.m15526e4().f26543a.f25344a.edit().putInt("BOOKMARKS_DEFAULT_PAGE", m3363R).apply();
                        break;
                    case 1:
                        ListPreference homeDefaultPage = listPreference2;
                        AppearancePreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage, "$homeDefaultPage");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = homeDefaultPage.m3363R(obj.toString());
                        homeDefaultPage.mo3342V(m3363R2);
                        this$02.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference homeDefaultPage2 = listPreference2;
                        AppearancePreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage2, "$homeDefaultPage");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = homeDefaultPage2.m3363R(obj.toString());
                        homeDefaultPage2.mo3342V(m3363R3);
                        this$03.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R3).apply();
                        break;
                    default:
                        ListPreference profileWatchedTimeFormat = listPreference2;
                        AppearancePreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(profileWatchedTimeFormat, "$profileWatchedTimeFormat");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = profileWatchedTimeFormat.m3363R(obj.toString());
                        profileWatchedTimeFormat.mo3342V(m3363R4);
                        this$04.m15526e4().f26543a.f25344a.edit().putInt("PROFILE_WATCHED_TIME_FORMAT", m3363R4).apply();
                        EventBusKt.m16327a(new OnProfileWatchedTime());
                        break;
                }
                return false;
            }
        };
        listPreference2.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.d
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i2) {
                    case 0:
                        ListPreference bookmarksDefaultPage = listPreference2;
                        AppearancePreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(bookmarksDefaultPage, "$bookmarksDefaultPage");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = bookmarksDefaultPage.m3363R(obj.toString());
                        bookmarksDefaultPage.mo3342V(m3363R);
                        this$0.m15526e4().f26543a.f25344a.edit().putInt("BOOKMARKS_DEFAULT_PAGE", m3363R).apply();
                        break;
                    case 1:
                        ListPreference homeDefaultPage = listPreference2;
                        AppearancePreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage, "$homeDefaultPage");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = homeDefaultPage.m3363R(obj.toString());
                        homeDefaultPage.mo3342V(m3363R2);
                        this$02.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference homeDefaultPage2 = listPreference2;
                        AppearancePreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage2, "$homeDefaultPage");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = homeDefaultPage2.m3363R(obj.toString());
                        homeDefaultPage2.mo3342V(m3363R3);
                        this$03.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R3).apply();
                        break;
                    default:
                        ListPreference profileWatchedTimeFormat = listPreference2;
                        AppearancePreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(profileWatchedTimeFormat, "$profileWatchedTimeFormat");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = profileWatchedTimeFormat.m3363R(obj.toString());
                        profileWatchedTimeFormat.mo3342V(m3363R4);
                        this$04.m15526e4().f26543a.f25344a.edit().putInt("PROFILE_WATCHED_TIME_FORMAT", m3363R4).apply();
                        EventBusKt.m16327a(new OnProfileWatchedTime());
                        break;
                }
                return false;
            }
        };
        listPreference3.f4968f = new Preference.OnPreferenceChangeListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.d
            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i5) {
                    case 0:
                        ListPreference bookmarksDefaultPage = listPreference3;
                        AppearancePreferenceFragment this$0 = this;
                        KProperty<Object>[] kPropertyArr = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(bookmarksDefaultPage, "$bookmarksDefaultPage");
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R = bookmarksDefaultPage.m3363R(obj.toString());
                        bookmarksDefaultPage.mo3342V(m3363R);
                        this$0.m15526e4().f26543a.f25344a.edit().putInt("BOOKMARKS_DEFAULT_PAGE", m3363R).apply();
                        break;
                    case 1:
                        ListPreference homeDefaultPage = listPreference3;
                        AppearancePreferenceFragment this$02 = this;
                        KProperty<Object>[] kPropertyArr2 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage, "$homeDefaultPage");
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R2 = homeDefaultPage.m3363R(obj.toString());
                        homeDefaultPage.mo3342V(m3363R2);
                        this$02.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R2).apply();
                        break;
                    case 2:
                        ListPreference homeDefaultPage2 = listPreference3;
                        AppearancePreferenceFragment this$03 = this;
                        KProperty<Object>[] kPropertyArr3 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(homeDefaultPage2, "$homeDefaultPage");
                        Intrinsics.m32179h(this$03, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R3 = homeDefaultPage2.m3363R(obj.toString());
                        homeDefaultPage2.mo3342V(m3363R3);
                        this$03.m15526e4().f26543a.f25344a.edit().putInt("HOME_DEFAULT_PAGE", m3363R3).apply();
                        break;
                    default:
                        ListPreference profileWatchedTimeFormat = listPreference3;
                        AppearancePreferenceFragment this$04 = this;
                        KProperty<Object>[] kPropertyArr4 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(profileWatchedTimeFormat, "$profileWatchedTimeFormat");
                        Intrinsics.m32179h(this$04, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        int m3363R4 = profileWatchedTimeFormat.m3363R(obj.toString());
                        profileWatchedTimeFormat.mo3342V(m3363R4);
                        this$04.m15526e4().f26543a.f25344a.edit().putInt("PROFILE_WATCHED_TIME_FORMAT", m3363R4).apply();
                        EventBusKt.m16327a(new OnProfileWatchedTime());
                        break;
                }
                return false;
            }
        };
        switchPreference.f4968f = new Preference.OnPreferenceChangeListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.e

            /* renamed from: c */
            public final /* synthetic */ AppearancePreferenceFragment f28402c;

            {
                this.f28402c = this;
            }

            @Override // androidx.preference.Preference.OnPreferenceChangeListener
            /* renamed from: a */
            public final boolean mo3394a(Preference preference, Object obj) {
                switch (i3) {
                    case 0:
                        AppearancePreferenceFragment this$0 = this.f28402c;
                        KProperty<Object>[] kPropertyArr = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        if (!(obj instanceof Integer)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        Prefs prefs = this$0.m15526e4().f26543a;
                        prefs.f25344a.edit().putInt("VIEW_TYPE", ((Number) obj).intValue()).apply();
                        FragmentActivity activity = this$0.getActivity();
                        if (activity != null) {
                            activity.recreate();
                        }
                        EventBusKt.m16327a(new OnRefresh());
                        return false;
                    default:
                        AppearancePreferenceFragment this$02 = this.f28402c;
                        KProperty<Object>[] kPropertyArr2 = AppearancePreferenceFragment.f28297r;
                        Intrinsics.m32179h(this$02, "this$0");
                        Intrinsics.m32179h(preference, "preference");
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        Prefs prefs2 = this$02.m15526e4().f26543a;
                        Boolean bool = (Boolean) obj;
                        prefs2.f25344a.edit().putBoolean("BOTTOM_NAVIGATION_COMPACT", bool.booleanValue()).apply();
                        EventBusKt.m16327a(new OnBottomNavigationCompact(bool.booleanValue()));
                        return true;
                }
            }
        };
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_preference, viewGroup, false);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((AppCompatTextView) inflate.findViewById(C2507R.id.title)).setText(getResources().getString(C2507R.string.settings_appearance));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.resultLayout);
        Intrinsics.m32178g(relativeLayout, "rootView.resultLayout");
        ViewsKt.m16378k(relativeLayout);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 1));
        ((FrameLayout) inflate.findViewById(C2507R.id.fragment_container)).addView(onCreateView);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28300q.clear();
    }
}
