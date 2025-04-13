package com.swiftsoft.anixartd.p015ui.fragment.main.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.skydoves.balloon.FragmentBalloonLazy;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.Refreshable;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2635k;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.ProfilePreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.ProfileUiLogic;
import com.swiftsoft.anixartd.p015ui.model.main.profile.WatchDynamicsModel_;
import com.swiftsoft.anixartd.p015ui.tooltip.ProfileRatingScoreBalloonFactory;
import com.swiftsoft.anixartd.p015ui.tooltip.ProfileVerifiedBalloonFactory;
import com.swiftsoft.anixartd.presentation.main.profile.ProfilePresenter;
import com.swiftsoft.anixartd.presentation.main.profile.ProfileView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Decoration;
import com.swiftsoft.anixartd.utils.Decoration.ComplexBuilder.ItemDecoration;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnFetchProfileAvatar;
import com.swiftsoft.anixartd.utils.OnFetchProfileLogin;
import com.swiftsoft.anixartd.utils.OnFetchProfileSocialPages;
import com.swiftsoft.anixartd.utils.OnFetchProfileStatus;
import com.swiftsoft.anixartd.utils.OnNotificationBarCount;
import com.swiftsoft.anixartd.utils.OnOpenNotifications;
import com.swiftsoft.anixartd.utils.OnOpenPreferences;
import com.swiftsoft.anixartd.utils.OnProfileWatchedTime;
import com.swiftsoft.anixartd.utils.OnSearch;
import com.swiftsoft.anixartd.utils.OnSilentBlockListRefresh;
import com.swiftsoft.anixartd.utils.OnSilentFriendsRefresh;
import com.swiftsoft.anixartd.utils.OnSilentRecalculate;
import com.swiftsoft.anixartd.utils.OnSilentRefresh;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.p016ui.snowfall.SnowfallView;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.text.CharsKt;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ProfileFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¨\u0006\u0019"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/ProfileFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/profile/ProfileView;", "Lcom/swiftsoft/anixartd/ui/Refreshable;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnFetchProfileAvatar;", "onFetchProfileAvatar", "", "Lcom/swiftsoft/anixartd/utils/OnFetchProfileLogin;", "onFetchProfileLogin", "Lcom/swiftsoft/anixartd/utils/OnFetchProfileStatus;", "onFetchProfileStatus", "Lcom/swiftsoft/anixartd/utils/OnFetchProfileSocialPages;", "onFetchProfileSocialPages", "Lcom/swiftsoft/anixartd/utils/OnProfileWatchedTime;", "onProfileWatchedTime", "Lcom/swiftsoft/anixartd/utils/OnSilentRefresh;", "onSilentRefresh", "Lcom/swiftsoft/anixartd/utils/OnSilentRecalculate;", "onSilentRecalculate", "Lcom/swiftsoft/anixartd/utils/OnNotificationBarCount;", "onNotificationBarCount", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileFragment extends BaseFragment implements ProfileView, Refreshable, BaseDialogFragment.BaseDialogListener {

    /* renamed from: d */
    public long f28460d;

    /* renamed from: e */
    public boolean f28461e;

    /* renamed from: f */
    @Inject
    public Lazy<ProfilePresenter> f28462f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28463g;

    /* renamed from: h */
    @NotNull
    public final kotlin.Lazy f28464h;

    /* renamed from: i */
    @NotNull
    public final kotlin.Lazy f28465i;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f28466j = new LinkedHashMap();

    /* renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f28459l = {C2052a.m12277l(ProfileFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/profile/ProfilePresenter;", 0)};

    /* renamed from: k */
    @NotNull
    public static final Companion f28458k = new Companion(null);

    /* compiled from: ProfileFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/profile/ProfileFragment$Companion;", "", "", "FROM_MAIN", "Ljava/lang/String;", "ID_VALUE", "PROFILE_PROCESS_DIALOG_TAG", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public static ProfileFragment m15564a(Companion companion, long j2, boolean z, int i2) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            Objects.requireNonNull(companion);
            ProfileFragment profileFragment = new ProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            bundle.putBoolean("FROM_MAIN", z);
            profileFragment.setArguments(bundle);
            return profileFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ProfileFragment() {
        Function0<ProfilePresenter> function0 = new Function0<ProfilePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfilePresenter invoke() {
                Lazy<ProfilePresenter> lazy = ProfileFragment.this.f28462f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28463g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfilePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28464h = new FragmentBalloonLazy(this, Reflection.m32193a(ProfileVerifiedBalloonFactory.class));
        this.f28465i = new FragmentBalloonLazy(this, Reflection.m32193a(ProfileRatingScoreBalloonFactory.class));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: A0 */
    public void mo14841A0() {
        ((RelativeLayout) m15560A3(C2507R.id.more)).setClickable(true);
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.profile_unblocked);
        Intrinsics.m32178g(string, "getString(R.string.profile_unblocked)");
        dialogs.m16308g(this, string, 0);
        ProfilePresenter presenter = m15561c4();
        Intrinsics.m32178g(presenter, "presenter");
        ProfilePresenter.m14819g(presenter, false, false, 3);
        EventBusKt.m16327a(new OnSilentBlockListRefresh());
    }

    @Nullable
    /* renamed from: A3 */
    public View m15560A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28466j;
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07b5  */
    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14842D1(@org.jetbrains.annotations.NotNull final com.swiftsoft.anixartd.database.entity.Profile r24, final boolean r25) {
        /*
            Method dump skipped, instructions count: 2156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment.mo14842D1(com.swiftsoft.anixartd.database.entity.Profile, boolean):void");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: F2 */
    public void mo14843F2() {
        Button button = (Button) m15560A3(C2507R.id.btnAddFriend);
        button.setText("...");
        button.setEnabled(false);
        Button button2 = (Button) m15560A3(C2507R.id.btnDeleteFriend);
        button2.setText("...");
        button2.setEnabled(false);
        Button button3 = (Button) m15560A3(C2507R.id.btnRequestSent);
        button3.setText("...");
        button3.setEnabled(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: G1 */
    public void mo14844G1(boolean z, boolean z2) {
        if (!z) {
            LinearLayout default_bar = (LinearLayout) m15560A3(C2507R.id.default_bar);
            Intrinsics.m32178g(default_bar, "default_bar");
            ViewsKt.m16378k(default_bar);
            Button btnEdit = (Button) m15560A3(C2507R.id.btnEdit);
            Intrinsics.m32178g(btnEdit, "btnEdit");
            ViewsKt.m16372e(btnEdit);
            return;
        }
        if (z2) {
            View appbar_separator = m15560A3(C2507R.id.appbar_separator);
            Intrinsics.m32178g(appbar_separator, "appbar_separator");
            ViewsKt.m16372e(appbar_separator);
            LinearLayout search_bar = (LinearLayout) m15560A3(C2507R.id.search_bar);
            Intrinsics.m32178g(search_bar, "search_bar");
            ViewsKt.m16378k(search_bar);
            return;
        }
        View appbar_separator2 = m15560A3(C2507R.id.appbar_separator);
        Intrinsics.m32178g(appbar_separator2, "appbar_separator");
        ViewsKt.m16378k(appbar_separator2);
        LinearLayout default_bar2 = (LinearLayout) m15560A3(C2507R.id.default_bar);
        Intrinsics.m32178g(default_bar2, "default_bar");
        ViewsKt.m16378k(default_bar2);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: G2 */
    public void mo14845G2() {
        ((RelativeLayout) m15560A3(C2507R.id.more)).setClickable(true);
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.profile_blocked);
        Intrinsics.m32178g(string, "getString(R.string.profile_blocked)");
        dialogs.m16308g(this, string, 0);
        ProfilePresenter presenter = m15561c4();
        Intrinsics.m32178g(presenter, "presenter");
        ProfilePresenter.m14819g(presenter, false, false, 3);
        EventBusKt.m16327a(new OnSilentBlockListRefresh());
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: H2 */
    public void mo14846H2() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 3;
            builder.m16318j(C2507R.string.confirm);
            String string = getString(C2507R.string.add_to_block_list_confirm);
            Intrinsics.m32178g(string, "getString(R.string.add_to_block_list_confirm)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.yes);
            builder.m16311c(C2507R.string.cancel);
            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onBlockConfirm$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                    Dialogs.MaterialDialog it = materialDialog;
                    Intrinsics.m32179h(it, "it");
                    ((RelativeLayout) ProfileFragment.this.m15560A3(C2507R.id.more)).setClickable(false);
                    ProfileFragment.this.m15561c4().m14822c();
                    return Unit.f63088a;
                }
            });
            builder.f30159k = true;
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: T3 */
    public void mo14847T3() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_friend_limit_reached);
        Intrinsics.m32178g(string, "getString(R.string.error_friend_limit_reached)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: X3 */
    public void mo14848X3() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_target_friend_limit_reached);
        Intrinsics.m32178g(string, "getString(R.string.error…get_friend_limit_reached)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: Y2 */
    public void mo14849Y2() {
        ProfilePresenter presenter = m15561c4();
        Intrinsics.m32178g(presenter, "presenter");
        ProfilePresenter.m14819g(presenter, false, false, 3);
        EventBusKt.m16327a(new OnSilentFriendsRefresh());
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: a */
    public void mo14850a() {
        ProgressBar progress_bar = (ProgressBar) m15560A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: b */
    public void mo14851b() {
        ProgressBar progress_bar = (ProgressBar) m15560A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: c */
    public void mo14852c() {
        ((SwipeRefreshLayout) m15560A3(C2507R.id.refresh)).setEnabled(false);
        LinearLayout error_layout = (LinearLayout) m15560A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfilePresenter m15561c4() {
        return (ProfilePresenter) this.f28463g.getValue(this, f28459l[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: d */
    public void mo14853d() {
        ((SwipeRefreshLayout) m15560A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: e */
    public void mo14854e() {
        ((SwipeRefreshLayout) m15560A3(C2507R.id.refresh)).setRefreshing(false);
    }

    /* renamed from: e4 */
    public final void m15562e4(int i2, int i3, int i4, int i5, int i6) {
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            arrayList.add(new SliceValue(i2, getResources().getColor(C2507R.color.green)));
        }
        if (i3 != 0) {
            arrayList.add(new SliceValue(i3, getResources().getColor(C2507R.color.purple)));
        }
        if (i4 != 0) {
            arrayList.add(new SliceValue(i4, getResources().getColor(C2507R.color.blue)));
        }
        if (i5 != 0) {
            arrayList.add(new SliceValue(i5, getResources().getColor(C2507R.color.yellow)));
        }
        if (i6 != 0) {
            arrayList.add(new SliceValue(i6, getResources().getColor(C2507R.color.red)));
        }
        PieChartData pieChartData = new PieChartData(arrayList);
        pieChartData.f68616i = true;
        pieChartData.f68613f = 0.5f;
        PieChartView pieChartView = (PieChartView) m15560A3(C2507R.id.chart);
        pieChartView.setValueTouchEnabled(false);
        pieChartView.setPieChartData(pieChartData);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: g3 */
    public void mo14855g3() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: i */
    public void mo14856i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: l4 */
    public void mo14857l4() {
        ((RelativeLayout) m15560A3(C2507R.id.more)).setClickable(true);
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        if ((r18.length() > 0) == false) goto L47;
     */
    /* renamed from: m4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15563m4(final java.lang.String r14, final java.lang.String r15, final java.lang.String r16, final java.lang.String r17, final java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment.m15563m4(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28466j.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100 && i3 == -1 && intent != null) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            Intrinsics.m32176e(stringArrayListExtra);
            String str = stringArrayListExtra.get(0);
            Intrinsics.m32178g(str, "result!![0]");
            EventBusKt.m16327a(new OnSearch(str));
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14086B(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28460d = arguments.getLong("ID_VALUE");
            this.f28461e = arguments.getBoolean("FROM_MAIN");
        }
        ProfilePresenter m15561c4 = m15561c4();
        long j2 = this.f28460d;
        boolean z = j2 == m15561c4().f26637b.m14061d();
        boolean z2 = this.f28461e;
        ProfileUiLogic profileUiLogic = m15561c4.f26638c;
        profileUiLogic.f29173b = j2;
        profileUiLogic.f28956a = true;
        profileUiLogic.f29174c = z;
        m15561c4.getViewState().mo14844G1(z, z2);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_profile, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2717a(this, 9));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view_watch_dynamics);
        epoxyRecyclerView.getContext();
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        epoxyRecyclerView.setNestedScrollingEnabled(false);
        epoxyRecyclerView.setItemAnimator(null);
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.m32178g(context, "context");
        Decoration.ComplexBuilder complexBuilder = new Decoration.ComplexBuilder(context);
        KClass<? extends EpoxyModel<? extends Object>> clazz = Reflection.m32193a(WatchDynamicsModel_.class);
        Decoration.ComplexBuilder.InnerBuilder innerBuilder = new Decoration.ComplexBuilder.InnerBuilder();
        innerBuilder.f30141a = 16.0f;
        Intrinsics.m32179h(clazz, "clazz");
        complexBuilder.f30140b.put(clazz, innerBuilder);
        epoxyRecyclerView.mo3802k(complexBuilder.new ItemDecoration());
        epoxyRecyclerView.setController(m15561c4().f26639d);
        EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view_history);
        epoxyRecyclerView2.getContext();
        epoxyRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        epoxyRecyclerView2.setNestedScrollingEnabled(false);
        epoxyRecyclerView2.setItemAnimator(null);
        epoxyRecyclerView2.setController(m15561c4().f26640e);
        EpoxyRecyclerView epoxyRecyclerView3 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view_votes);
        epoxyRecyclerView3.getContext();
        epoxyRecyclerView3.setLayoutManager(new LinearLayoutManager(1, false));
        epoxyRecyclerView3.setNestedScrollingEnabled(false);
        epoxyRecyclerView3.setItemAnimator(null);
        epoxyRecyclerView3.setController(m15561c4().f26641f);
        ImageView imageView = (ImageView) inflate.findViewById(C2507R.id.settings);
        Intrinsics.m32178g(imageView, "view.settings");
        ViewsKt.m16377j(imageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onCreateView$5
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
        ViewsKt.m16377j(imageView2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onCreateView$6
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
        ViewsKt.m16377j(textView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onCreateView$7
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
        ViewsKt.m16377j(imageView3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onCreateView$8
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnOpenNotifications());
                return Unit.f63088a;
            }
        });
        Button button = (Button) inflate.findViewById(C2507R.id.btnEdit);
        Intrinsics.m32178g(button, "view.btnEdit");
        ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onCreateView$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                YandexMetrica.reportEvent("Переход в раздел Редактирование профиля");
                ProfileFragment profileFragment = ProfileFragment.this;
                ProfileFragment.Companion companion = ProfileFragment.f28458k;
                profileFragment.m15437u3().mo15324d2(new ProfilePreferenceFragment(), null);
                return Unit.f63088a;
            }
        });
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2721e(this));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onCreateView$11
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.profile.ProfileFragment$onCreateView$12
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ProfileFragment.this.m15560A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ProfileFragment.this.m15560A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ProfilePresenter presenter = ProfileFragment.this.m15561c4();
                Intrinsics.m32178g(presenter, "presenter");
                ProfilePresenter.m14819g(presenter, false, false, 3);
                return Unit.f63088a;
            }
        });
        EventBusKt.m16327a(new OnBottomNavigation(true));
        EventBusKt.m16327a(new OnAdVisible(true));
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
        this.f28466j.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchProfileAvatar(@NotNull OnFetchProfileAvatar onFetchProfileAvatar) {
        Intrinsics.m32179h(onFetchProfileAvatar, "onFetchProfileAvatar");
        if (onFetchProfileAvatar.f30193a == m15561c4().f26638c.f29173b) {
            String avatar = onFetchProfileAvatar.f30194b;
            ProfilePresenter m15561c4 = m15561c4();
            Objects.requireNonNull(m15561c4);
            Intrinsics.m32179h(avatar, "avatar");
            m15561c4.f26638c.m15686a().setAvatar(avatar);
            AppCompatImageView avatar2 = (AppCompatImageView) m15560A3(C2507R.id.avatar);
            Intrinsics.m32178g(avatar2, "avatar");
            ViewsKt.m16368a(avatar2, avatar);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchProfileLogin(@NotNull OnFetchProfileLogin onFetchProfileLogin) {
        Intrinsics.m32179h(onFetchProfileLogin, "onFetchProfileLogin");
        if (onFetchProfileLogin.f30195a == m15561c4().f26638c.f29173b) {
            String login = onFetchProfileLogin.f30196b;
            ProfilePresenter m15561c4 = m15561c4();
            Objects.requireNonNull(m15561c4);
            Intrinsics.m32179h(login, "login");
            m15561c4.f26638c.m15686a().setLogin(login);
            ((TextView) m15560A3(C2507R.id.nickname)).setText(login);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchProfileSocialPages(@NotNull OnFetchProfileSocialPages onFetchProfileSocialPages) {
        Intrinsics.m32179h(onFetchProfileSocialPages, "onFetchProfileSocialPages");
        if (onFetchProfileSocialPages.f30197a == m15561c4().f26638c.f29173b) {
            m15563m4(onFetchProfileSocialPages.f30198b, onFetchProfileSocialPages.f30199c, onFetchProfileSocialPages.f30200d, onFetchProfileSocialPages.f30201e, onFetchProfileSocialPages.f30202f);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchProfileStatus(@NotNull OnFetchProfileStatus onFetchProfileStatus) {
        Intrinsics.m32179h(onFetchProfileStatus, "onFetchProfileStatus");
        if (onFetchProfileStatus.f30203a == m15561c4().f26638c.f29173b) {
            String status = onFetchProfileStatus.f30204b;
            ProfilePresenter m15561c4 = m15561c4();
            Objects.requireNonNull(m15561c4);
            Intrinsics.m32179h(status, "status");
            m15561c4.f26638c.m15686a().setStatus(status);
            TextView textView = (TextView) m15560A3(C2507R.id.status);
            if (!(status.length() > 0)) {
                status = getString(C2507R.string.profile_status_not_set);
            }
            textView.setText(status);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(true));
        EventBusKt.m16327a(new OnAdVisible(true));
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

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onProfileWatchedTime(@NotNull OnProfileWatchedTime onProfileWatchedTime) {
        String sb;
        Intrinsics.m32179h(onProfileWatchedTime, "onProfileWatchedTime");
        View view = getView();
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C2507R.id.watchedTime);
            if (m15561c4().f26637b.f25344a.getInt("PROFILE_WATCHED_TIME_FORMAT", 0) == 0) {
                StringBuilder m24u = C0000a.m24u("~ ");
                m24u.append(Time.f30247a.m16360f(view.getContext(), m15561c4().f26638c.m15686a().getWatchedTime() * 60));
                sb = m24u.toString();
            } else {
                StringBuilder m24u2 = C0000a.m24u("~ ");
                m24u2.append(Time.f30247a.m16362h(view.getContext(), m15561c4().f26638c.m15686a().getWatchedTime() * 60));
                sb = m24u2.toString();
            }
            textView.setText(sb);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentRecalculate(@NotNull OnSilentRecalculate onSilentRecalculate) {
        Intrinsics.m32179h(onSilentRecalculate, "onSilentRecalculate");
        ProfilePresenter m15561c4 = m15561c4();
        int i2 = onSilentRecalculate.f30226b;
        int i3 = onSilentRecalculate.f30227c;
        ProfileUiLogic profileUiLogic = m15561c4.f26638c;
        if (profileUiLogic.f28956a && profileUiLogic.f29174c) {
            m15561c4.getViewState().mo14858t3(i2, i3);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentRefresh(@NotNull OnSilentRefresh onSilentRefresh) {
        Intrinsics.m32179h(onSilentRefresh, "onSilentRefresh");
        m15561c4().m14826h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2;
        Intrinsics.m32179h(view, "view");
        boolean m14079v = m15561c4().f26637b.m14079v();
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
        String m14074q = m15561c4().f26637b.m14074q();
        boolean m14073p = m15561c4().f26637b.m14073p();
        String m14072o = m15561c4().f26637b.m14072o();
        String m14075r = m15561c4().f26637b.m14075r();
        if ((m14074q.length() > 0) && (view2 = getView()) != null) {
            ImageView search_btn = (ImageView) view2.findViewById(C2507R.id.search_btn);
            Intrinsics.m32178g(search_btn, "search_btn");
            ViewsKt.m16375h(search_btn, m14074q);
            if (!m14073p) {
                ((ImageView) view2.findViewById(C2507R.id.search_btn)).setImageTintList(null);
            }
            ((ImageView) view2.findViewById(C2507R.id.search_btn)).setOnClickListener(new ViewOnClickListenerC2635k(m14072o, this, m14075r, 5));
        }
        if (m15561c4().f26638c.f29184m) {
            return;
        }
        ProfilePresenter presenter = m15561c4();
        Intrinsics.m32178g(presenter, "presenter");
        ProfilePresenter.m14819g(presenter, false, false, 3);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.ProfileView
    /* renamed from: t3 */
    public void mo14858t3(int i2, int i3) {
        String obj = ((TextView) m15560A3(C2507R.id.watchingCount)).getText().toString();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < obj.length(); i4++) {
            char charAt = obj.charAt(i4);
            if (!CharsKt.m33864c(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        int parseInt = Integer.parseInt(sb2);
        String obj2 = ((TextView) m15560A3(C2507R.id.planCount)).getText().toString();
        StringBuilder sb3 = new StringBuilder();
        for (int i5 = 0; i5 < obj2.length(); i5++) {
            char charAt2 = obj2.charAt(i5);
            if (!CharsKt.m33864c(charAt2)) {
                sb3.append(charAt2);
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.m32178g(sb4, "filterNotTo(StringBuilder(), predicate).toString()");
        int parseInt2 = Integer.parseInt(sb4);
        String obj3 = ((TextView) m15560A3(C2507R.id.completedCount)).getText().toString();
        StringBuilder sb5 = new StringBuilder();
        for (int i6 = 0; i6 < obj3.length(); i6++) {
            char charAt3 = obj3.charAt(i6);
            if (!CharsKt.m33864c(charAt3)) {
                sb5.append(charAt3);
            }
        }
        String sb6 = sb5.toString();
        Intrinsics.m32178g(sb6, "filterNotTo(StringBuilder(), predicate).toString()");
        int parseInt3 = Integer.parseInt(sb6);
        String obj4 = ((TextView) m15560A3(C2507R.id.holdOnCount)).getText().toString();
        StringBuilder sb7 = new StringBuilder();
        for (int i7 = 0; i7 < obj4.length(); i7++) {
            char charAt4 = obj4.charAt(i7);
            if (!CharsKt.m33864c(charAt4)) {
                sb7.append(charAt4);
            }
        }
        String sb8 = sb7.toString();
        Intrinsics.m32178g(sb8, "filterNotTo(StringBuilder(), predicate).toString()");
        int parseInt4 = Integer.parseInt(sb8);
        String obj5 = ((TextView) m15560A3(C2507R.id.droppedCount)).getText().toString();
        StringBuilder sb9 = new StringBuilder();
        for (int i8 = 0; i8 < obj5.length(); i8++) {
            char charAt5 = obj5.charAt(i8);
            if (!CharsKt.m33864c(charAt5)) {
                sb9.append(charAt5);
            }
        }
        String sb10 = sb9.toString();
        Intrinsics.m32178g(sb10, "filterNotTo(StringBuilder(), predicate).toString()");
        int parseInt5 = Integer.parseInt(sb10);
        if (i2 == 1) {
            parseInt--;
        } else if (i2 == 2) {
            parseInt2--;
        } else if (i2 == 3) {
            parseInt3--;
        } else if (i2 == 4) {
            parseInt4--;
        } else if (i2 == 5) {
            parseInt5--;
        }
        if (i3 == 1) {
            parseInt++;
        } else if (i3 == 2) {
            parseInt2++;
        } else if (i3 == 3) {
            parseInt3++;
        } else if (i3 == 4) {
            parseInt4++;
        } else if (i3 == 5) {
            parseInt5++;
        }
        int i9 = parseInt;
        int i10 = parseInt5;
        int i11 = parseInt3;
        int i12 = parseInt4;
        ((TextView) m15560A3(C2507R.id.watchingCount)).setText(DigitsKt.m16324e(i9));
        ((TextView) m15560A3(C2507R.id.planCount)).setText(DigitsKt.m16324e(parseInt2));
        ((TextView) m15560A3(C2507R.id.completedCount)).setText(DigitsKt.m16324e(i11));
        ((TextView) m15560A3(C2507R.id.holdOnCount)).setText(DigitsKt.m16324e(i12));
        ((TextView) m15560A3(C2507R.id.droppedCount)).setText(DigitsKt.m16324e(i10));
        m15562e4(i9, parseInt2, i11, i12, i10);
    }

    @Override // com.swiftsoft.anixartd.p015ui.Refreshable
    /* renamed from: u */
    public void mo15322u() {
        m15561c4().m14825f(false, true);
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (!Intrinsics.m32174c(str, "PROFILE_PROCESS_DIALOG_TAG")) {
            return false;
        }
        long longExtra = intent.getLongExtra("PROFILE_ID_VALUE", 0L);
        String stringExtra = intent.getStringExtra("BAN_REASON_VALUE");
        long longExtra2 = intent.getLongExtra("BAN_EXPIRES_VALUE", 0L);
        boolean booleanExtra = intent.getBooleanExtra("IS_BANNED_VALUE", false);
        if (longExtra <= 0) {
            return true;
        }
        m15561c4().m14824e(longExtra, stringExtra, Long.valueOf(longExtra2), booleanExtra);
        return true;
    }
}
