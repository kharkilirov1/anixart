package com.swiftsoft.anixartd.p015ui.fragment.main.discover;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.BuildConfig;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.SuperMenu;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2635k;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.filter.FilterFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.recommendation.RecommendationFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.schedule.ScheduleFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.top.TopFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.WatchingFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.discover.DiscoverUiLogic;
import com.swiftsoft.anixartd.presentation.main.discover.DiscoverPresenter;
import com.swiftsoft.anixartd.presentation.main.discover.DiscoverView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Decoration;
import com.swiftsoft.anixartd.utils.Decoration.Builder.ItemDecoration;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnNotificationBarCount;
import com.swiftsoft.anixartd.utils.OnOpenNotifications;
import com.swiftsoft.anixartd.utils.OnOpenPreferences;
import com.swiftsoft.anixartd.utils.OnSearch;
import com.swiftsoft.anixartd.utils.Views;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.p016ui.snowfall.SnowfallView;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiscoverFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\r"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/discover/DiscoverFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/discover/DiscoverView;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "Lcom/swiftsoft/anixartd/utils/OnFetchCollection;", "onFetchCollection", "Lcom/swiftsoft/anixartd/utils/OnNotificationBarCount;", "onNotificationBarCount", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DiscoverFragment extends BaseFragment implements DiscoverView {

    /* renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f28062g = {C2052a.m12277l(DiscoverFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/discover/DiscoverPresenter;", 0)};

    /* renamed from: h */
    @NotNull
    public static final Long[] f28063h = {0L, 1L, 2L, 3L, 4L};

    /* renamed from: i */
    @NotNull
    public static final Long[] f28064i = {5L, 6L};

    /* renamed from: d */
    @Inject
    public Lazy<DiscoverPresenter> f28065d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28066e;

    /* renamed from: f */
    @NotNull
    public Map<Integer, View> f28067f = new LinkedHashMap();

    /* compiled from: DiscoverFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/discover/DiscoverFragment$Companion;", "", "", "INTEREST_TYPE_COLLECTION", "I", "INTEREST_TYPE_LINK", "INTEREST_TYPE_RELEASE", "", "SOCIAL_SUPER_MENU_TELEGRAM", "J", "SOCIAL_SUPER_MENU_VK", "SUPER_MENU_COLLECTION", "SUPER_MENU_FILTER", "SUPER_MENU_POPULAR", "SUPER_MENU_RANDOM", "SUPER_MENU_SCHEDULE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public DiscoverFragment() {
        Function0<DiscoverPresenter> function0 = new Function0<DiscoverPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.DiscoverFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public DiscoverPresenter invoke() {
                Lazy<DiscoverPresenter> lazy = DiscoverFragment.this.f28065d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28066e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(DiscoverPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15491A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28067f;
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

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: I1 */
    public void mo14553I1(long j2) {
        m15437u3().mo15324d2(CollectionFragment.f27978k.m15478a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: J2 */
    public void mo14554J2(int i2, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout recommendations_layout = (LinearLayout) m15491A3(C2507R.id.recommendations_layout);
        Intrinsics.m32178g(recommendations_layout, "recommendations_layout");
        ViewsKt.m16373f(recommendations_layout, m15492c4().f26230c.m14083z(), false, null, 6);
        LinearLayout no_recommendations = (LinearLayout) m15491A3(C2507R.id.no_recommendations);
        Intrinsics.m32178g(no_recommendations, "no_recommendations");
        boolean z = true;
        ViewsKt.m16379l(no_recommendations, i2 == 0);
        TextView recommendation_show_all = (TextView) m15491A3(C2507R.id.recommendation_show_all);
        Intrinsics.m32178g(recommendation_show_all, "recommendation_show_all");
        ViewsKt.m16373f(recommendation_show_all, i2 < 25, false, null, 6);
        LinearLayout interesting_layout = (LinearLayout) m15491A3(C2507R.id.interesting_layout);
        Intrinsics.m32178g(interesting_layout, "interesting_layout");
        ViewsKt.m16373f(interesting_layout, i3 == 0, false, null, 6);
        ((EpoxyRecyclerView) m15491A3(C2507R.id.interesting_recycler_view)).m3818s0(0);
        LinearLayout watching_now_layout = (LinearLayout) m15491A3(C2507R.id.watching_now_layout);
        Intrinsics.m32178g(watching_now_layout, "watching_now_layout");
        ViewsKt.m16373f(watching_now_layout, i4 == 0, false, null, 6);
        TextView watching_show_all = (TextView) m15491A3(C2507R.id.watching_show_all);
        Intrinsics.m32178g(watching_show_all, "watching_show_all");
        ViewsKt.m16373f(watching_show_all, i4 < 25, false, null, 6);
        LinearLayout discussing_layout = (LinearLayout) m15491A3(C2507R.id.discussing_layout);
        Intrinsics.m32178g(discussing_layout, "discussing_layout");
        ViewsKt.m16373f(discussing_layout, i5 == 0, false, null, 6);
        LinearLayout collections_week_layout = (LinearLayout) m15491A3(C2507R.id.collections_week_layout);
        Intrinsics.m32178g(collections_week_layout, "collections_week_layout");
        ViewsKt.m16373f(collections_week_layout, i6 == 0, false, null, 6);
        LinearLayout comments_week_layout = (LinearLayout) m15491A3(C2507R.id.comments_week_layout);
        Intrinsics.m32178g(comments_week_layout, "comments_week_layout");
        ViewsKt.m16373f(comments_week_layout, i7 == 0, false, null, 6);
        LinearLayout sponsorship_layout = (LinearLayout) m15491A3(C2507R.id.sponsorship_layout);
        Intrinsics.m32178g(sponsorship_layout, "sponsorship_layout");
        if (m15492c4().f26230c.m14048D()) {
            int i8 = BuildConfig.f25343a;
            if (!m15492c4().f26230c.m14083z() && !m15492c4().f26230c.m14047C()) {
                z = false;
            }
        }
        ViewsKt.m16373f(sponsorship_layout, z, false, null, 6);
        LinearLayout discover_content = (LinearLayout) m15491A3(C2507R.id.discover_content);
        Intrinsics.m32178g(discover_content, "discover_content");
        ViewsKt.m16378k(discover_content);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: M2 */
    public void mo14555M2(long j2) {
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: a */
    public void mo14556a() {
        ProgressBar progress_bar = (ProgressBar) m15491A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: b */
    public void mo14557b() {
        ProgressBar progress_bar = (ProgressBar) m15491A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: c */
    public void mo14558c() {
        LinearLayout discover_content = (LinearLayout) m15491A3(C2507R.id.discover_content);
        Intrinsics.m32178g(discover_content, "discover_content");
        ViewsKt.m16372e(discover_content);
        ProgressBar progress_bar = (ProgressBar) m15491A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
        LinearLayout error_layout = (LinearLayout) m15491A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final DiscoverPresenter m15492c4() {
        return (DiscoverPresenter) this.f28066e.getValue(this, f28062g[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: d */
    public void mo14559d() {
        ((SwipeRefreshLayout) m15491A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: e */
    public void mo14560e() {
        ((SwipeRefreshLayout) m15491A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: f */
    public void mo14561f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: i */
    public void mo14562i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28067f.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14114b0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        m15492c4().f26232e.f28956a = true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_discover, viewGroup, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean z = !m15492c4().f26230c.f25344a.getBoolean("TOOLTIP_DOT_NEW_SECTION_COLLECTION", false);
        linkedHashMap.put(0L, new SuperMenu(0L, "Популярное", C2507R.color.light_md_deep_orange_50, C2507R.color.light_md_deep_orange_500, C2507R.drawable.ic_popular, false));
        linkedHashMap.put(1L, new SuperMenu(1L, "Расписание", C2507R.color.light_md_blue_50, C2507R.color.light_md_blue_500, C2507R.drawable.ic_calendar, false));
        linkedHashMap.put(2L, new SuperMenu(2L, "Коллекции", C2507R.color.light_md_purple_50, C2507R.color.light_md_purple_400, C2507R.drawable.ic_collection, z));
        linkedHashMap.put(3L, new SuperMenu(3L, "Фильтр", C2507R.color.light_md_teal_50, C2507R.color.light_md_teal_500, C2507R.drawable.ic_tune, false));
        linkedHashMap.put(4L, new SuperMenu(4L, "Рандом", C2507R.color.light_md_green_50, C2507R.color.light_md_green_500, C2507R.drawable.ic_shuffle, false));
        linkedHashMap2.put(5L, new SuperMenu(5L, "Мы ВКонтакте", C2507R.color.vk_background_color, C2507R.color.vk_color, C2507R.drawable.ic_vk, false));
        linkedHashMap2.put(6L, new SuperMenu(6L, "Мы в Telegram", C2507R.color.tg_background_color, C2507R.color.tg_color, C2507R.drawable.ic_telegram, false));
        for (Long l2 : f28063h) {
            arrayList.add(MapsKt.m32060e(linkedHashMap, Long.valueOf(l2.longValue())));
        }
        for (Long l3 : f28064i) {
            arrayList2.add(MapsKt.m32060e(linkedHashMap2, Long.valueOf(l3.longValue())));
        }
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.super_menu_recycler_view);
        final int i2 = 2;
        epoxyRecyclerView.setLayoutManager(new GridLayoutManager(epoxyRecyclerView.getContext(), 2));
        epoxyRecyclerView.setNestedScrollingEnabled(false);
        epoxyRecyclerView.setItemAnimator(null);
        epoxyRecyclerView.setController(m15492c4().f26233f);
        EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.social_super_menu_recycler_view);
        epoxyRecyclerView2.setLayoutManager(new GridLayoutManager(epoxyRecyclerView2.getContext(), 2));
        epoxyRecyclerView2.setNestedScrollingEnabled(false);
        epoxyRecyclerView2.setItemAnimator(null);
        epoxyRecyclerView2.setController(m15492c4().f26234g);
        EpoxyRecyclerView epoxyRecyclerView3 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.interesting_recycler_view);
        epoxyRecyclerView3.getContext();
        epoxyRecyclerView3.setLayoutManager(new LinearLayoutManager(0, false));
        epoxyRecyclerView3.setNestedScrollingEnabled(false);
        Context context = epoxyRecyclerView3.getContext();
        Intrinsics.m32178g(context, "context");
        Decoration.Builder builder = new Decoration.Builder(context);
        builder.f30133b = 1;
        Views views = Views.f30250a;
        builder.f30135d = views.m16367a(context, 12.0f);
        builder.f30136e = views.m16367a(context, 12.0f);
        builder.f30137f++;
        epoxyRecyclerView3.mo3802k(builder.new ItemDecoration());
        epoxyRecyclerView3.setItemAnimator(null);
        epoxyRecyclerView3.setController(m15492c4().f26235h);
        EpoxyRecyclerView epoxyRecyclerView4 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recommendations_recycler_view);
        epoxyRecyclerView4.getContext();
        epoxyRecyclerView4.setLayoutManager(new LinearLayoutManager(0, false));
        epoxyRecyclerView4.setNestedScrollingEnabled(false);
        epoxyRecyclerView4.setItemAnimator(null);
        epoxyRecyclerView4.setController(m15492c4().f26236i);
        EpoxyRecyclerView epoxyRecyclerView5 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.watching_now_recycler_view);
        epoxyRecyclerView5.getContext();
        epoxyRecyclerView5.setLayoutManager(new LinearLayoutManager(0, false));
        epoxyRecyclerView5.setNestedScrollingEnabled(false);
        epoxyRecyclerView5.setItemAnimator(null);
        epoxyRecyclerView5.setController(m15492c4().f26237j);
        EpoxyRecyclerView epoxyRecyclerView6 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.discussing_recycler_view);
        epoxyRecyclerView6.getContext();
        epoxyRecyclerView6.setLayoutManager(new LinearLayoutManager(1, false));
        epoxyRecyclerView6.setNestedScrollingEnabled(false);
        epoxyRecyclerView6.setItemAnimator(null);
        epoxyRecyclerView6.setController(m15492c4().f26238k);
        EpoxyRecyclerView epoxyRecyclerView7 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.comments_week_recycler_view);
        epoxyRecyclerView7.getContext();
        epoxyRecyclerView7.setLayoutManager(new LinearLayoutManager(1, false));
        epoxyRecyclerView7.setNestedScrollingEnabled(false);
        epoxyRecyclerView7.setItemAnimator(null);
        epoxyRecyclerView7.setController(m15492c4().f26240m);
        EpoxyRecyclerView epoxyRecyclerView8 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.collections_week_recycler_view);
        epoxyRecyclerView8.getContext();
        epoxyRecyclerView8.setLayoutManager(new LinearLayoutManager(0, false));
        epoxyRecyclerView8.setNestedScrollingEnabled(false);
        Context context2 = epoxyRecyclerView8.getContext();
        Intrinsics.m32178g(context2, "context");
        Decoration.Builder builder2 = new Decoration.Builder(context2);
        builder2.f30133b = 1;
        builder2.f30135d = views.m16367a(context2, 12.0f);
        builder2.f30136e = views.m16367a(context2, 12.0f);
        builder2.f30137f++;
        epoxyRecyclerView8.mo3802k(builder2.new ItemDecoration());
        epoxyRecyclerView8.setItemAnimator(null);
        epoxyRecyclerView8.setController(m15492c4().f26239l);
        final int i3 = 0;
        ((TextView) inflate.findViewById(C2507R.id.collections_week_show_more)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.a

            /* renamed from: c */
            public final /* synthetic */ DiscoverFragment f28076c;

            {
                this.f28076c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        DiscoverFragment this$0 = this.f28076c;
                        KProperty<Object>[] kPropertyArr = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$0, "this$0");
                        FragmentNavigation m15437u3 = this$0.m15437u3();
                        Objects.requireNonNull(CollectionListFragment.f28000i);
                        CollectionListFragment collectionListFragment = new CollectionListFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("SORT_VALUE", 4);
                        collectionListFragment.setArguments(bundle2);
                        m15437u3.mo15324d2(collectionListFragment, null);
                        break;
                    case 1:
                        DiscoverFragment this$02 = this.f28076c;
                        KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$02, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Смотрят сейчас");
                        this$02.m15437u3().mo15324d2(new WatchingFragment(), null);
                        break;
                    case 2:
                        DiscoverFragment this$03 = this.f28076c;
                        KProperty<Object>[] kPropertyArr3 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$03, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Рекомендации");
                        this$03.m15437u3().mo15324d2(new RecommendationFragment(), null);
                        break;
                    default:
                        DiscoverFragment this$04 = this.f28076c;
                        KProperty<Object>[] kPropertyArr4 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$04, "this$0");
                        Context context3 = this$04.getContext();
                        if (context3 != null) {
                            Dialogs.MaterialDialog.Builder builder3 = new Dialogs.MaterialDialog.Builder(context3);
                            builder3.f30150b = 2;
                            builder3.m16318j(C2507R.string.information);
                            builder3.m16309a(C2507R.string.no_recommendation_info);
                            builder3.m16315g(C2507R.string.understand);
                            builder3.m16317i();
                            break;
                        }
                        break;
                }
            }
        });
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0919e(swipeRefreshLayout, this, 12));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.DiscoverFragment$onCreateView$13
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.DiscoverFragment$onCreateView$14
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                LinearLayout error_layout = (LinearLayout) DiscoverFragment.this.m15491A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                DiscoverPresenter m15492c4 = DiscoverFragment.this.m15492c4();
                if (m15492c4.f26232e.f28956a) {
                    DiscoverPresenter.m14542c(m15492c4, false, false, 3);
                }
                return Unit.f63088a;
            }
        });
        ((RelativeLayout) inflate.findViewById(C2507R.id.sponsorship_content)).setOnClickListener(ViewOnClickListenerC2677b.f28077c);
        ((MaterialButton) inflate.findViewById(C2507R.id.sponsorship_button)).setOnClickListener(ViewOnClickListenerC2677b.f28078d);
        final int i4 = 1;
        ((TextView) inflate.findViewById(C2507R.id.watching_show_all)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.a

            /* renamed from: c */
            public final /* synthetic */ DiscoverFragment f28076c;

            {
                this.f28076c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        DiscoverFragment this$0 = this.f28076c;
                        KProperty<Object>[] kPropertyArr = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$0, "this$0");
                        FragmentNavigation m15437u3 = this$0.m15437u3();
                        Objects.requireNonNull(CollectionListFragment.f28000i);
                        CollectionListFragment collectionListFragment = new CollectionListFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("SORT_VALUE", 4);
                        collectionListFragment.setArguments(bundle2);
                        m15437u3.mo15324d2(collectionListFragment, null);
                        break;
                    case 1:
                        DiscoverFragment this$02 = this.f28076c;
                        KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$02, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Смотрят сейчас");
                        this$02.m15437u3().mo15324d2(new WatchingFragment(), null);
                        break;
                    case 2:
                        DiscoverFragment this$03 = this.f28076c;
                        KProperty<Object>[] kPropertyArr3 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$03, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Рекомендации");
                        this$03.m15437u3().mo15324d2(new RecommendationFragment(), null);
                        break;
                    default:
                        DiscoverFragment this$04 = this.f28076c;
                        KProperty<Object>[] kPropertyArr4 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$04, "this$0");
                        Context context3 = this$04.getContext();
                        if (context3 != null) {
                            Dialogs.MaterialDialog.Builder builder3 = new Dialogs.MaterialDialog.Builder(context3);
                            builder3.f30150b = 2;
                            builder3.m16318j(C2507R.string.information);
                            builder3.m16309a(C2507R.string.no_recommendation_info);
                            builder3.m16315g(C2507R.string.understand);
                            builder3.m16317i();
                            break;
                        }
                        break;
                }
            }
        });
        ((TextView) inflate.findViewById(C2507R.id.recommendation_show_all)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.a

            /* renamed from: c */
            public final /* synthetic */ DiscoverFragment f28076c;

            {
                this.f28076c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        DiscoverFragment this$0 = this.f28076c;
                        KProperty<Object>[] kPropertyArr = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$0, "this$0");
                        FragmentNavigation m15437u3 = this$0.m15437u3();
                        Objects.requireNonNull(CollectionListFragment.f28000i);
                        CollectionListFragment collectionListFragment = new CollectionListFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("SORT_VALUE", 4);
                        collectionListFragment.setArguments(bundle2);
                        m15437u3.mo15324d2(collectionListFragment, null);
                        break;
                    case 1:
                        DiscoverFragment this$02 = this.f28076c;
                        KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$02, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Смотрят сейчас");
                        this$02.m15437u3().mo15324d2(new WatchingFragment(), null);
                        break;
                    case 2:
                        DiscoverFragment this$03 = this.f28076c;
                        KProperty<Object>[] kPropertyArr3 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$03, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Рекомендации");
                        this$03.m15437u3().mo15324d2(new RecommendationFragment(), null);
                        break;
                    default:
                        DiscoverFragment this$04 = this.f28076c;
                        KProperty<Object>[] kPropertyArr4 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$04, "this$0");
                        Context context3 = this$04.getContext();
                        if (context3 != null) {
                            Dialogs.MaterialDialog.Builder builder3 = new Dialogs.MaterialDialog.Builder(context3);
                            builder3.f30150b = 2;
                            builder3.m16318j(C2507R.string.information);
                            builder3.m16309a(C2507R.string.no_recommendation_info);
                            builder3.m16315g(C2507R.string.understand);
                            builder3.m16317i();
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 3;
        ((LinearLayout) inflate.findViewById(C2507R.id.no_recommendations)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.a

            /* renamed from: c */
            public final /* synthetic */ DiscoverFragment f28076c;

            {
                this.f28076c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        DiscoverFragment this$0 = this.f28076c;
                        KProperty<Object>[] kPropertyArr = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$0, "this$0");
                        FragmentNavigation m15437u3 = this$0.m15437u3();
                        Objects.requireNonNull(CollectionListFragment.f28000i);
                        CollectionListFragment collectionListFragment = new CollectionListFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("SORT_VALUE", 4);
                        collectionListFragment.setArguments(bundle2);
                        m15437u3.mo15324d2(collectionListFragment, null);
                        break;
                    case 1:
                        DiscoverFragment this$02 = this.f28076c;
                        KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$02, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Смотрят сейчас");
                        this$02.m15437u3().mo15324d2(new WatchingFragment(), null);
                        break;
                    case 2:
                        DiscoverFragment this$03 = this.f28076c;
                        KProperty<Object>[] kPropertyArr3 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$03, "this$0");
                        YandexMetrica.reportEvent("Переход в раздел Рекомендации");
                        this$03.m15437u3().mo15324d2(new RecommendationFragment(), null);
                        break;
                    default:
                        DiscoverFragment this$04 = this.f28076c;
                        KProperty<Object>[] kPropertyArr4 = DiscoverFragment.f28062g;
                        Intrinsics.m32179h(this$04, "this$0");
                        Context context3 = this$04.getContext();
                        if (context3 != null) {
                            Dialogs.MaterialDialog.Builder builder3 = new Dialogs.MaterialDialog.Builder(context3);
                            builder3.f30150b = 2;
                            builder3.m16318j(C2507R.string.information);
                            builder3.m16309a(C2507R.string.no_recommendation_info);
                            builder3.m16315g(C2507R.string.understand);
                            builder3.m16317i();
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView = (ImageView) inflate.findViewById(C2507R.id.settings);
        Intrinsics.m32178g(imageView, "view.settings");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.DiscoverFragment$onCreateView$20
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnOpenPreferences());
                return Unit.f63088a;
            }
        });
        ImageView imageView2 = (ImageView) inflate.findViewById(C2507R.id.search_btn);
        Intrinsics.m32178g(imageView2, "view.search_btn");
        ViewsKt.m16377j(imageView2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.DiscoverFragment$onCreateView$21
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnSearch(null, 1));
                return Unit.f63088a;
            }
        });
        TextView textView = (TextView) inflate.findViewById(C2507R.id.search);
        Intrinsics.m32178g(textView, "view.search");
        ViewsKt.m16377j(textView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.DiscoverFragment$onCreateView$22
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnSearch(null, 1));
                return Unit.f63088a;
            }
        });
        ImageView imageView3 = (ImageView) inflate.findViewById(C2507R.id.notifications);
        Intrinsics.m32178g(imageView3, "view.notifications");
        ViewsKt.m16377j(imageView3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.discover.DiscoverFragment$onCreateView$23
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnOpenNotifications());
                return Unit.f63088a;
            }
        });
        DiscoverPresenter m15492c4 = m15492c4();
        Objects.requireNonNull(m15492c4);
        m15492c4.f26233f.setData(arrayList, m15492c4.f26231d);
        DiscoverPresenter m15492c42 = m15492c4();
        Objects.requireNonNull(m15492c42);
        m15492c42.f26234g.setData(arrayList2, m15492c42.f26231d);
        if (!m15492c4().f26232e.f29041j) {
            DiscoverPresenter presenter = m15492c4();
            Intrinsics.m32178g(presenter, "presenter");
            DiscoverPresenter.m14542c(presenter, false, false, 3);
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
        this.f28067f.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchCollection(@NotNull OnFetchCollection onFetchCollection) {
        Intrinsics.m32179h(onFetchCollection, "onFetchCollection");
        DiscoverPresenter m15492c4 = m15492c4();
        Collection collection = onFetchCollection.f30187a;
        Objects.requireNonNull(m15492c4);
        Intrinsics.m32179h(collection, "collection");
        DiscoverUiLogic discoverUiLogic = m15492c4.f26232e;
        if (discoverUiLogic.f28956a) {
            Iterator<Collection> it = discoverUiLogic.f29039h.iterator();
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
                discoverUiLogic.f29039h.set(i2, collection);
            }
            m15492c4.m14543a();
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        int i2;
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        DiscoverPresenter m15492c4 = m15492c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15492c4);
        Intrinsics.m32179h(release, "release");
        DiscoverUiLogic discoverUiLogic = m15492c4.f26232e;
        if (discoverUiLogic.f28956a) {
            Iterator<Release> it = discoverUiLogic.f29035d.iterator();
            int i3 = 0;
            while (true) {
                i2 = -1;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else {
                    if (it.next().getId() == release.getId()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            Iterator<Release> it2 = discoverUiLogic.f29037f.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                } else {
                    if (it2.next().getId() == release.getId()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            Iterator<Release> it3 = discoverUiLogic.f29038g.iterator();
            int i5 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (it3.next().getId() == release.getId()) {
                    i2 = i5;
                    break;
                }
                i5++;
            }
            if (i3 >= 0) {
                discoverUiLogic.f29035d.set(i3, release);
            }
            if (i4 >= 0) {
                discoverUiLogic.f29037f.set(i4, release);
            }
            if (i2 >= 0) {
                discoverUiLogic.f29038g.set(i2, release);
            }
            m15492c4.m14543a();
        }
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

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2;
        Intrinsics.m32179h(view, "view");
        boolean m14079v = m15492c4().f26230c.m14079v();
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
        String m14074q = m15492c4().f26230c.m14074q();
        boolean m14073p = m15492c4().f26230c.m14073p();
        String m14072o = m15492c4().f26230c.m14072o();
        String m14075r = m15492c4().f26230c.m14075r();
        if (!(m14074q.length() > 0) || (view2 = getView()) == null) {
            return;
        }
        ImageView search_btn = (ImageView) view2.findViewById(C2507R.id.search_btn);
        Intrinsics.m32178g(search_btn, "search_btn");
        ViewsKt.m16375h(search_btn, m14074q);
        if (!m14073p) {
            ((ImageView) view2.findViewById(C2507R.id.search_btn)).setImageTintList(null);
        }
        ((ImageView) view2.findViewById(C2507R.id.search_btn)).setOnClickListener(new ViewOnClickListenerC2635k(m14072o, this, m14075r, 2));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: q0 */
    public void mo14563q0(long j2, int i2, @NotNull String action) {
        Intrinsics.m32179h(action, "action");
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(j2));
        YandexMetrica.reportEvent("Открыто Интересное", hashMap);
        if (i2 == 1) {
            mo14555M2(Long.parseLong(action));
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            mo14553I1(Long.parseLong(action));
        } else {
            Common common = new Common();
            Context requireContext = requireContext();
            Intrinsics.m32178g(requireContext, "requireContext()");
            common.m16300e(requireContext, action);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: r2 */
    public void mo14564r2(long j2) {
        if (j2 == 0) {
            YandexMetrica.reportEvent("Переход в раздел Популярное");
            m15437u3().mo15324d2(new TopFragment(), null);
            return;
        }
        if (j2 == 2) {
            YandexMetrica.reportEvent("Переход в раздел Коллекции");
            m15492c4().f26230c.f25344a.edit().putBoolean("TOOLTIP_DOT_NEW_SECTION_COLLECTION", true).apply();
            m15437u3().mo15324d2(new CollectionListFragment(), null);
            return;
        }
        if (j2 == 1) {
            YandexMetrica.reportEvent("Переход в раздел Расписание");
            m15437u3().mo15324d2(new ScheduleFragment(), null);
            return;
        }
        if (j2 == 3) {
            YandexMetrica.reportEvent("Переход в раздел Фильтр");
            m15437u3().mo15324d2(new FilterFragment(), null);
            return;
        }
        if (j2 == 4) {
            YandexMetrica.reportEvent("Переход в раздел Рандом");
            m15437u3().mo15324d2(ReleaseFragment.Companion.m15624c(ReleaseFragment.f28714t, true, 1, null, null, null, 28), null);
            return;
        }
        if (j2 == 5) {
            YandexMetrica.reportEvent("Переход в группу ВКонтакте");
            Common common = new Common();
            Context requireContext = requireContext();
            Intrinsics.m32178g(requireContext, "requireContext()");
            common.m16300e(requireContext, "https://vk.com/public94475547");
            return;
        }
        if (j2 == 6) {
            YandexMetrica.reportEvent("Переход на канал Telegram");
            Common common2 = new Common();
            Context requireContext2 = requireContext();
            Intrinsics.m32178g(requireContext2, "requireContext()");
            common2.m16300e(requireContext2, new Common().m16297b("https://anixart.tv", m15492c4().f26230c.m14082y()) + "/tg");
        }
    }
}
