package com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2635k;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.bookmarks.BookmarksTabFragment;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksPresenter;
import com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnInnerTab;
import com.swiftsoft.anixartd.utils.OnNotificationBarCount;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.p016ui.snowfall.SnowfallView;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: BookmarksFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/bookmarks/BookmarksFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/main/TabsFragment;", "Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksView;", "Lcom/swiftsoft/anixartd/utils/OnNotificationBarCount;", "onNotificationBarCount", "", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarksFragment extends TabsFragment implements BookmarksView {

    /* renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f27896i = {C2052a.m12277l(BookmarksFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksPresenter;", 0)};

    /* renamed from: f */
    @Inject
    public Lazy<BookmarksPresenter> f27897f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f27898g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f27899h = new LinkedHashMap();

    public BookmarksFragment() {
        Function0<BookmarksPresenter> function0 = new Function0<BookmarksPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.bookmarks.BookmarksFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public BookmarksPresenter invoke() {
                Lazy<BookmarksPresenter> lazy = BookmarksFragment.this.f27897f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27898g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(BookmarksPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    @NotNull
    /* renamed from: A3 */
    public String mo15454A3(int i2) {
        switch (i2) {
            case 0:
                return "INNER_TAB_BOOKMARKS_COLLECTIONS";
            case 1:
                return "INNER_TAB_BOOKMARKS_HISTORY";
            case 2:
                return "INNER_TAB_BOOKMARKS_FAVORITES";
            case 3:
                return "INNER_TAB_BOOKMARKS_WATCHING";
            case 4:
                return "INNER_TAB_BOOKMARKS_PLANS";
            case 5:
                return "INNER_TAB_BOOKMARKS_COMPLETED";
            case 6:
                return "INNER_TAB_BOOKMARKS_HOLD_ON";
            case 7:
                return "INNER_TAB_BOOKMARKS_DROPPED";
            default:
                throw new Exception(C0000a.m7d("Invalid position: ", i2));
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    @NotNull
    /* renamed from: c4 */
    public Fragment mo15455c4(int i2) {
        BookmarksTabFragment.Companion companion = BookmarksTabFragment.f27901k;
        long j2 = i2;
        String mo15454A3 = mo15454A3(i2);
        Objects.requireNonNull(companion);
        BookmarksTabFragment bookmarksTabFragment = new BookmarksTabFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ID_VALUE", j2);
        bundle.putString("SELECTED_INNER_TAB_VALUE", mo15454A3);
        bookmarksTabFragment.setArguments(bundle);
        return bookmarksTabFragment;
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
                String string = context.getString(C2507R.string.tab_title_collections);
                Intrinsics.m32178g(string, "context.getString(R.string.tab_title_collections)");
                return string;
            case 1:
                String string2 = context.getString(C2507R.string.tab_title_history);
                Intrinsics.m32178g(string2, "context.getString(R.string.tab_title_history)");
                return string2;
            case 2:
                String string3 = context.getString(C2507R.string.tab_title_favourites);
                Intrinsics.m32178g(string3, "context.getString(R.string.tab_title_favourites)");
                return string3;
            case 3:
                String string4 = context.getString(C2507R.string.tab_title_watching);
                Intrinsics.m32178g(string4, "context.getString(R.string.tab_title_watching)");
                return string4;
            case 4:
                String string5 = context.getString(C2507R.string.tab_title_plans);
                Intrinsics.m32178g(string5, "context.getString(R.string.tab_title_plans)");
                return string5;
            case 5:
                String string6 = context.getString(C2507R.string.tab_title_completed);
                Intrinsics.m32178g(string6, "context.getString(R.string.tab_title_completed)");
                return string6;
            case 6:
                String string7 = context.getString(C2507R.string.tab_title_hold_on);
                Intrinsics.m32178g(string7, "context.getString(R.string.tab_title_hold_on)");
                return string7;
            case 7:
                String string8 = context.getString(C2507R.string.tab_title_dropped);
                Intrinsics.m32178g(string8, "context.getString(R.string.tab_title_dropped)");
                return string8;
            default:
                throw new Exception(C0000a.m7d("Invalid position: ", i2));
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    /* renamed from: m4 */
    public int mo15457m4() {
        return 8;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27899h.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment
    /* renamed from: n4 */
    public void mo15458n4(int i2) {
        EventBusKt.m16327a(new OnInnerTab(mo15454A3(i2)));
        Map<Integer, View> map = this.f27899h;
        View view = map.get(Integer.valueOf(C2507R.id.search));
        if (view == null) {
            View view2 = getView();
            if (view2 == null || (view = view2.findViewById(C2507R.id.search)) == null) {
                view = null;
            } else {
                map.put(Integer.valueOf(C2507R.id.search), view);
            }
        }
        String string = getString(C2507R.string.search_for_something);
        Intrinsics.m32178g(string, "getString(R.string.search_for_something)");
        C2052a.m12290y(new Object[]{mo15456e4(i2)}, 1, string, "format(format, *args)", (TextView) view);
    }

    /* renamed from: o4 */
    public final BookmarksPresenter m15459o4() {
        return (BookmarksPresenter) this.f27898g.getValue(this, f27896i[0]);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14119e(this);
        EventBusKt.m16328b(this);
        super.onCreate(bundle);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.main.TabsFragment, com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27899h.clear();
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
        boolean m14079v = m15459o4().f26024a.m14079v();
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
        String m14074q = m15459o4().f26024a.m14074q();
        boolean m14073p = m15459o4().f26024a.m14073p();
        String m14072o = m15459o4().f26024a.m14072o();
        String m14075r = m15459o4().f26024a.m14075r();
        int i2 = 1;
        if ((m14074q.length() > 0) && (view2 = getView()) != null) {
            ImageView search_btn = (ImageView) view2.findViewById(C2507R.id.search_btn);
            Intrinsics.m32178g(search_btn, "search_btn");
            ViewsKt.m16375h(search_btn, m14074q);
            if (!m14073p) {
                ((ImageView) view2.findViewById(C2507R.id.search_btn)).setImageTintList(null);
            }
            ((ImageView) view2.findViewById(C2507R.id.search_btn)).setOnClickListener(new ViewOnClickListenerC2635k(m14072o, this, m14075r, i2));
        }
        ((ViewPager) view.findViewById(C2507R.id.view_pager)).setCurrentItem(m15459o4().f26024a.f25344a.getInt("BOOKMARKS_DEFAULT_PAGE", 2));
    }
}
