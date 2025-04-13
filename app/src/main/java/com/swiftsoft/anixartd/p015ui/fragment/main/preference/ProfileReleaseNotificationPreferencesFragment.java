package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseTypeDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.preference.ProfileReleaseTypeNotificationPreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter;
import com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: ProfileReleaseNotificationPreferencesFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/ProfileReleaseNotificationPreferencesFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/preference/ProfileReleaseNotificationPreferencesView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseNotificationPreferencesFragment extends BaseFragment implements ProfileReleaseNotificationPreferencesView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f28382i = {C2052a.m12277l(ProfileReleaseNotificationPreferencesFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/preference/ProfileReleaseNotificationPreferencesPresenter;", 0)};

    /* renamed from: d */
    public EndlessRecyclerViewScrollListener f28383d;

    /* renamed from: e */
    @Inject
    public Lazy<ProfileReleaseNotificationPreferencesPresenter> f28384e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28385f;

    /* renamed from: g */
    @NotNull
    public final kotlin.Lazy f28386g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28387h = new LinkedHashMap();

    /* compiled from: ProfileReleaseNotificationPreferencesFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/ProfileReleaseNotificationPreferencesFragment$Companion;", "", "", "CHOOSE_TYPE_TAG", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public ProfileReleaseNotificationPreferencesFragment() {
        Function0<ProfileReleaseNotificationPreferencesPresenter> function0 = new Function0<ProfileReleaseNotificationPreferencesPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfileReleaseNotificationPreferencesFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ProfileReleaseNotificationPreferencesPresenter invoke() {
                Lazy<ProfileReleaseNotificationPreferencesPresenter> lazy = ProfileReleaseNotificationPreferencesFragment.this.f28384e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28385f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ProfileReleaseNotificationPreferencesPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28386g = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfileReleaseNotificationPreferencesFragment$dialog$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Dialogs.MaterialDialog invoke() {
                Context context = ProfileReleaseNotificationPreferencesFragment.this.getContext();
                if (context == null) {
                    return null;
                }
                Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
                builder.f30150b = 1;
                return new Dialogs.MaterialDialog(builder);
            }
        });
    }

    @Nullable
    /* renamed from: A3 */
    public View m15550A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28387h;
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

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: a */
    public void mo14761a() {
        ProgressBar progress_bar = (ProgressBar) m15550A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: b */
    public void mo14762b() {
        ProgressBar progress_bar = (ProgressBar) m15550A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: c */
    public void mo14763c() {
        ((SwipeRefreshLayout) m15550A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15550A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15550A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final ProfileReleaseNotificationPreferencesPresenter m15551c4() {
        return (ProfileReleaseNotificationPreferencesPresenter) this.f28385f.getValue(this, f28382i[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: d */
    public void mo14764d() {
        ((SwipeRefreshLayout) m15550A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: e */
    public void mo14765e() {
        ((SwipeRefreshLayout) m15550A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: e1 */
    public void mo14766e1(long j2) {
        Set<Long> set = m15551c4().f26548d.f29146g.get(Long.valueOf(j2));
        if (set == null) {
            return;
        }
        ChooseTypeDialogFragment.f27693j.m15432a(m15551c4().f26548d.f29142c, m15551c4().f26548d.f29143d, new ArrayList<>(set), true).show(getChildFragmentManager(), "CHOOSE_TYPE_TAG");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: h */
    public void mo14767h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28386g.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: i */
    public void mo14768i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesView
    /* renamed from: j */
    public void mo14769j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28386g.getValue();
        if (materialDialog != null) {
            materialDialog.hide();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28387h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14129j(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        m15551c4().f26548d.f28956a = true;
        ProfileReleaseNotificationPreferencesPresenter presenter = m15551c4();
        Intrinsics.m32178g(presenter, "presenter");
        ProfileReleaseNotificationPreferencesPresenter.m14754d(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_release_type_notification_preferences, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 8));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfileReleaseNotificationPreferencesFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                ProfileReleaseNotificationPreferencesFragment profileReleaseNotificationPreferencesFragment = ProfileReleaseNotificationPreferencesFragment.this;
                KProperty<Object>[] kPropertyArr = ProfileReleaseNotificationPreferencesFragment.f28382i;
                ProfileReleaseNotificationPreferencesPresenter m15551c4 = profileReleaseNotificationPreferencesFragment.m15551c4();
                m15551c4.f26548d.f29141b++;
                ProfileReleaseNotificationPreferencesPresenter.m14754d(m15551c4, false, false, 3);
            }
        };
        this.f28383d = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15551c4().f26549e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2696b(this, 2));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfileReleaseNotificationPreferencesFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.ProfileReleaseNotificationPreferencesFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ProfileReleaseNotificationPreferencesFragment.this.m15550A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ProfileReleaseNotificationPreferencesFragment.this.m15550A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ProfileReleaseNotificationPreferencesFragment.this.m15552u();
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28387h.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        ProfileReleaseNotificationPreferencesPresenter m15551c4 = m15551c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15551c4);
        Intrinsics.m32179h(release, "release");
        ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic = m15551c4.f26548d;
        if (profileReleaseTypeNotificationPreferenceUiLogic.f28956a) {
            Iterator<Release> it = profileReleaseTypeNotificationPreferenceUiLogic.f29144e.iterator();
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
                profileReleaseTypeNotificationPreferenceUiLogic.f29144e.set(i2, release);
            }
            ProfileReleaseNotificationPreferencesPresenter.m14753b(m15551c4, false, false, 3);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnBottomNavigation(false));
    }

    /* renamed from: u */
    public final void m15552u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15550A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15550A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28383d;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ProfileReleaseNotificationPreferencesPresenter m15551c4 = m15551c4();
        ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic = m15551c4.f26548d;
        if (profileReleaseTypeNotificationPreferenceUiLogic.f28956a) {
            profileReleaseTypeNotificationPreferenceUiLogic.f29141b = 0;
            profileReleaseTypeNotificationPreferenceUiLogic.f29146g.clear();
            profileReleaseTypeNotificationPreferenceUiLogic.f29144e.clear();
            profileReleaseTypeNotificationPreferenceUiLogic.f29147h = false;
            m15551c4.m14756c(false, true);
        }
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Set<Long> set;
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (Intrinsics.m32174c(str, "CHOOSE_TYPE_TAG")) {
            Serializable serializableExtra = intent.getSerializableExtra("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE");
            ArrayList arrayList = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : null;
            if (arrayList != null) {
                ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic = m15551c4().f26548d;
                Objects.requireNonNull(profileReleaseTypeNotificationPreferenceUiLogic);
                Iterator<Release> it = profileReleaseTypeNotificationPreferenceUiLogic.f29144e.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (it.next().getId() == profileReleaseTypeNotificationPreferenceUiLogic.f29145f) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0 && (set = profileReleaseTypeNotificationPreferenceUiLogic.f29146g.get(Long.valueOf(profileReleaseTypeNotificationPreferenceUiLogic.f29145f))) != null) {
                    set.clear();
                    set.addAll(arrayList);
                    profileReleaseTypeNotificationPreferenceUiLogic.f29144e.get(i2).setProfileReleaseTypeNotificationPreferenceCount(set.size());
                }
                m15551c4().m14757e();
                return true;
            }
        }
        return false;
    }
}
