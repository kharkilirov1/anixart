package com.swiftsoft.anixartd.p015ui.fragment.main.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.RunnableC0042c;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.room.util.C0576a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.C2052a;
import com.google.firebase.components.C2060a;
import com.skydoves.balloon.FragmentBalloonLazy;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2635k;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.HomeTabFragment;
import com.swiftsoft.anixartd.p015ui.tooltip.CustomFilterTabBalloonFactory;
import com.swiftsoft.anixartd.presentation.main.home.HomePresenter;
import com.swiftsoft.anixartd.presentation.main.home.HomeView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnCustomFilterTabShowHint;
import com.swiftsoft.anixartd.utils.OnNotificationBarCount;
import com.swiftsoft.anixartd.utils.OnOpenPreferences;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.p016ui.snowfall.SnowfallView;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: HomeFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/home/HomeFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabsFragment;", "Lcom/swiftsoft/anixartd/presentation/main/home/HomeView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnCustomFilterTabShowHint;", "onCustomFilterTabShowHint", "", "Lcom/swiftsoft/anixartd/utils/OnNotificationBarCount;", "onNotificationBarCount", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class HomeFragment extends TabsFragment implements HomeView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f28249k = {C2052a.m12277l(HomeFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/home/HomePresenter;", 0)};

    /* renamed from: f */
    @Inject
    public Lazy<HomePresenter> f28250f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28251g;

    /* renamed from: h */
    @NotNull
    public final kotlin.Lazy f28252h;

    /* renamed from: i */
    public LinearLayout f28253i;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f28254j = new LinkedHashMap();

    /* compiled from: HomeFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/home/HomeFragment$Companion;", "", "", "CHANGE_CUSTOM_TAB_NAME_DIALOG_TAG", "Ljava/lang/String;", "", "COUNT_CUSTOM_FILTER_TAB_HINT_COUNT", "I", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public HomeFragment() {
        Function0<HomePresenter> function0 = new Function0<HomePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.HomeFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public HomePresenter invoke() {
                Lazy<HomePresenter> lazy = HomeFragment.this.f28250f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28251g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(HomePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28252h = new FragmentBalloonLazy(this, Reflection.m32193a(CustomFilterTabBalloonFactory.class));
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    @NotNull
    /* renamed from: A3 */
    public String mo15454A3(int i2) {
        return "INNER_TAB_NONE";
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    @NotNull
    /* renamed from: c4 */
    public Fragment mo15455c4(int i2) {
        long j2 = i2;
        switch (i2) {
            case 0:
                return new CustomFilterTabFragment();
            case 1:
                return HomeTabFragment.Companion.m15521a(HomeTabFragment.f28258m, j2, null, null, 6);
            case 2:
                return HomeTabFragment.Companion.m15521a(HomeTabFragment.f28258m, j2, null, 2L, 2);
            case 3:
                return HomeTabFragment.Companion.m15521a(HomeTabFragment.f28258m, j2, null, 3L, 2);
            case 4:
                return HomeTabFragment.Companion.m15521a(HomeTabFragment.f28258m, j2, null, 1L, 2);
            case 5:
                return HomeTabFragment.Companion.m15521a(HomeTabFragment.f28258m, j2, 2L, null, 4);
            case 6:
                return HomeTabFragment.Companion.m15521a(HomeTabFragment.f28258m, j2, 3L, null, 4);
            default:
                throw new Exception(C0000a.m7d("Invalid position: ", i2));
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    @NotNull
    /* renamed from: e4 */
    public String mo15456e4(int i2) {
        Context context = getContext();
        if (context == null) {
            throw new Exception("invalid state");
        }
        switch (i2) {
            case 0:
                if (m15517o4().m14675a().length() > 0) {
                    return m15517o4().m14675a();
                }
                String string = getString(C2507R.string.my_custom_filter_tab);
                Intrinsics.m32178g(string, "getString(R.string.my_custom_filter_tab)");
                return string;
            case 1:
                String string2 = context.getString(C2507R.string.tab_title_actual);
                Intrinsics.m32178g(string2, "context.getString(R.string.tab_title_actual)");
                return string2;
            case 2:
                String string3 = context.getString(C2507R.string.tab_title_ongoing);
                Intrinsics.m32178g(string3, "context.getString(R.string.tab_title_ongoing)");
                return string3;
            case 3:
                String string4 = context.getString(C2507R.string.tab_title_upcoming);
                Intrinsics.m32178g(string4, "context.getString(R.string.tab_title_upcoming)");
                return string4;
            case 4:
                String string5 = context.getString(C2507R.string.tab_title_finished);
                Intrinsics.m32178g(string5, "context.getString(R.string.tab_title_finished)");
                return string5;
            case 5:
                String string6 = context.getString(C2507R.string.tab_title_movies);
                Intrinsics.m32178g(string6, "context.getString(R.string.tab_title_movies)");
                return string6;
            case 6:
                String string7 = context.getString(C2507R.string.tab_title_ova);
                Intrinsics.m32178g(string7, "context.getString(R.string.tab_title_ova)");
                return string7;
            default:
                throw new Exception(C0000a.m7d("Invalid position: ", i2));
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    /* renamed from: m4 */
    public int mo15457m4() {
        return 6;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28254j.clear();
    }

    /* renamed from: o4 */
    public final HomePresenter m15517o4() {
        return (HomePresenter) this.f28251g.getValue(this, f28249k[0]);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14157x(this);
        EventBusKt.m16328b(this);
        super.onCreate(bundle);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onCustomFilterTabShowHint(@NotNull OnCustomFilterTabShowHint onCustomFilterTabShowHint) {
        Intrinsics.m32179h(onCustomFilterTabShowHint, "onCustomFilterTabShowHint");
        m15519q4();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28254j.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNotificationBarCount(@NotNull OnNotificationBarCount onNotificationBarCount) {
        Intrinsics.m32179h(onNotificationBarCount, "onNotificationBarCount");
        View view = getView();
        if (view != null) {
            TextView notification_count = (TextView) view.findViewById(C2507R.id.notification_count);
            Intrinsics.m32178g(notification_count, "notification_count");
            ViewsKt.m16379l(notification_count, onNotificationBarCount.f30214a > 0);
            ((TextView) view.findViewById(C2507R.id.notification_count)).setText(String.valueOf(onNotificationBarCount.f30214a));
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2;
        Intrinsics.m32179h(view, "view");
        ((ViewPager) view.findViewById(C2507R.id.view_pager)).setCurrentItem(m15517o4().f26427b.f25344a.getInt("HOME_DEFAULT_PAGE", 1));
        ImageView imageView = (ImageView) view.findViewById(C2507R.id.settings);
        Intrinsics.m32178g(imageView, "view.settings");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.HomeFragment$onViewCreated$1
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnOpenPreferences());
                return Unit.f63088a;
            }
        });
        View childAt = ((TabLayout) view.findViewById(C2507R.id.tabs)).getChildAt(0);
        Intrinsics.m32177f(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f28253i = (LinearLayout) childAt;
        int childCount = m15518p4().getChildCount();
        for (final int i2 = 0; i2 < childCount; i2++) {
            if (i2 == 0) {
                m15518p4().getChildAt(0).setOnLongClickListener(new View.OnLongClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View it) {
                        final HomeFragment this$0 = HomeFragment.this;
                        final int i3 = i2;
                        KProperty<Object>[] kPropertyArr = HomeFragment.f28249k;
                        Intrinsics.m32179h(this$0, "this$0");
                        Intrinsics.m32178g(it, "it");
                        this$0.m15518p4().getChildAt(i3).startAnimation(AnimationUtils.loadAnimation(this$0.getContext(), C2507R.anim.shaking));
                        PopupMenu popupMenu = new PopupMenu(this$0.requireContext(), it);
                        popupMenu.m882a().inflate(C2507R.menu.custom_filter_tab, popupMenu.f1394b);
                        popupMenu.f1396d = new C2060a(this$0, i3);
                        Context requireContext = this$0.requireContext();
                        MenuBuilder menuBuilder = popupMenu.f1394b;
                        Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(requireContext, menuBuilder, it);
                        menuPopupHelper.m651e(true);
                        menuPopupHelper.f939g = 8388611;
                        menuPopupHelper.f943k = new PopupWindow.OnDismissListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.b
                            @Override // android.widget.PopupWindow.OnDismissListener
                            public final void onDismiss() {
                                HomeFragment this$02 = HomeFragment.this;
                                int i4 = i3;
                                KProperty<Object>[] kPropertyArr2 = HomeFragment.f28249k;
                                Intrinsics.m32179h(this$02, "this$0");
                                this$02.m15518p4().getChildAt(i4).clearAnimation();
                            }
                        };
                        menuPopupHelper.m653g();
                        return true;
                    }
                });
            }
        }
        ((TabLayout) view.findViewById(C2507R.id.tabs)).setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.home.HomeFragment$onViewCreated$3
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            /* renamed from: a */
            public void mo10411a(@Nullable TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            /* renamed from: b */
            public void mo10412b(@NotNull TabLayout.Tab tab) {
                Intrinsics.m32179h(tab, "tab");
                if (tab.f18941d != 0 || HomeFragment.this.m15517o4().f26427b.m14060c() >= 3 || HomeFragment.this.m15517o4().f26426a.m15297b() == null) {
                    return;
                }
                HomeFragment.this.m15519q4();
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            /* renamed from: c */
            public void mo10413c(@Nullable TabLayout.Tab tab) {
            }
        });
        boolean m14079v = m15517o4().f26427b.m14079v();
        Common common = new Common();
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        boolean m16299d = common.m16299d(requireContext);
        View view3 = getView();
        if (view3 != null) {
            if (m14079v) {
                ((SnowfallView) view3.findViewById(C2507R.id.snowfall)).setSnowflakeColor(m16299d ? -1 : -16777216);
            } else {
                ((SnowfallView) view3.findViewById(C2507R.id.snowfall)).m16475a();
                SnowfallView snowfall = (SnowfallView) view3.findViewById(C2507R.id.snowfall);
                Intrinsics.m32178g(snowfall, "snowfall");
                ViewsKt.m16372e(snowfall);
                ViewParent parent = ((SnowfallView) view3.findViewById(C2507R.id.snowfall)).getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView((SnowfallView) view3.findViewById(C2507R.id.snowfall));
                }
            }
        }
        String m14074q = m15517o4().f26427b.m14074q();
        boolean m14073p = m15517o4().f26427b.m14073p();
        String m14072o = m15517o4().f26427b.m14072o();
        String m14075r = m15517o4().f26427b.m14075r();
        if (!(m14074q.length() > 0) || (view2 = getView()) == null) {
            return;
        }
        ImageView search_btn = (ImageView) view2.findViewById(C2507R.id.search_btn);
        Intrinsics.m32178g(search_btn, "search_btn");
        ViewsKt.m16375h(search_btn, m14074q);
        if (!m14073p) {
            ((ImageView) view2.findViewById(C2507R.id.search_btn)).setImageTintList(null);
        }
        ((ImageView) view2.findViewById(C2507R.id.search_btn)).setOnClickListener(new ViewOnClickListenerC2635k(m14072o, this, m14075r, 3));
    }

    @NotNull
    /* renamed from: p4 */
    public final LinearLayout m15518p4() {
        LinearLayout linearLayout = this.f28253i;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m32189r("tabStrip");
        throw null;
    }

    /* renamed from: q4 */
    public final void m15519q4() {
        if (m15517o4().f26427b.m14060c() >= 3 || m15517o4().f26426a.m15297b() == null) {
            return;
        }
        new Handler().postDelayed(new RunnableC0042c(this, 11), 100L);
        Prefs prefs = m15517o4().f26427b;
        C0576a.m4125x(prefs.f25344a, "HOME_CUSTOM_FILTER_TAB_HINT_COUNT", prefs.m14060c() + 1);
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        TabLayout tabLayout;
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (!Intrinsics.m32174c(str, "CHANGE_CUSTOM_TAB_NAME_DIALOG_TAG")) {
            return false;
        }
        String tabName = intent.getStringExtra("NEW_TAB_NAME_VALUE");
        if (!(tabName == null || tabName.length() == 0)) {
            HomePresenter m15517o4 = m15517o4();
            Objects.requireNonNull(m15517o4);
            Intrinsics.m32179h(tabName, "tabName");
            Prefs prefs = m15517o4.f26427b;
            Objects.requireNonNull(prefs);
            prefs.f25344a.edit().putString("HOME_CUSTOM_FILTER_TAB_NAME", tabName).apply();
            View view = getView();
            TabLayout.Tab m10399g = (view == null || (tabLayout = (TabLayout) view.findViewById(C2507R.id.tabs)) == null) ? null : tabLayout.m10399g(0);
            if (m10399g != null) {
                m10399g.m10418a(tabName);
            }
        }
        return true;
    }
}
