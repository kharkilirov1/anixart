package com.swiftsoft.anixartd.p015ui.fragment.main.notifications;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.inputmethod.C0273a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.RunnableC0915a;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.NotificationsPreferenceFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.notifications.NotificationsUiLogic;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsPresenter;
import com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCommentNotificationsEnabled;
import com.swiftsoft.anixartd.utils.OnFetchEpisodeNotificationsEnabled;
import com.swiftsoft.anixartd.utils.OnFetchMyCollectionCommentNotificationsEnabled;
import com.swiftsoft.anixartd.utils.OnNotification;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
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

/* compiled from: NotificationsFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/notifications/NotificationsFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsView;", "Lcom/swiftsoft/anixartd/utils/OnNotification;", "onNotification", "", "Lcom/swiftsoft/anixartd/utils/OnFetchEpisodeNotificationsEnabled;", "onFetchEpisodeNotificationsEnabled", "Lcom/swiftsoft/anixartd/utils/OnFetchCommentNotificationsEnabled;", "onFetchCommentNotificationsEnabled", "Lcom/swiftsoft/anixartd/utils/OnFetchMyCollectionCommentNotificationsEnabled;", "onFetchMyCollectionCommentNotificationsEnabled", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationsFragment extends BaseFragment implements NotificationsView {

    /* renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f28273i = {C2052a.m12277l(NotificationsFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/notifications/NotificationsPresenter;", 0)};

    /* renamed from: d */
    @Inject
    public Lazy<NotificationsPresenter> f28274d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28275e;

    /* renamed from: f */
    public boolean f28276f;

    /* renamed from: g */
    public EndlessRecyclerViewScrollListener f28277g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f28278h = new LinkedHashMap();

    public NotificationsFragment() {
        Function0<NotificationsPresenter> function0 = new Function0<NotificationsPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.NotificationsFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public NotificationsPresenter invoke() {
                Lazy<NotificationsPresenter> lazy = NotificationsFragment.this.f28274d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28275e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(NotificationsPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15522A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28278h;
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

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: M0 */
    public void mo14719M0() {
        m15437u3().mo15324d2(new NotificationsPreferenceFragment(), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: N */
    public void mo14720N(long j2, long j3, long j4) {
        m15437u3().mo15324d2(ReleaseCommentsRepliesFragment.f28688o.m15615a(j2, j3, j4, true), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: O */
    public void mo14721O() {
        LinearLayout error_layout = (LinearLayout) m15522A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16372e(error_layout);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15522A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        if (m15523c4().f26479d.f29132o) {
            new Handler().postDelayed(RunnableC0915a.f9317e, 1000L);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: S0 */
    public void mo14722S0(long j2, long j3, @Nullable Long l2) {
        m15437u3().mo15324d2(CollectionCommentsRepliesFragment.f27934o.m15469a(j2, j3, l2, true), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: a */
    public void mo14723a() {
        ProgressBar progress_bar = (ProgressBar) m15522A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: b */
    public void mo14724b() {
        ProgressBar progress_bar = (ProgressBar) m15522A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: c */
    public void mo14725c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15522A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15522A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final NotificationsPresenter m15523c4() {
        return (NotificationsPresenter) this.f28275e.getValue(this, f28273i[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: d */
    public void mo14726d() {
        ((SwipeRefreshLayout) m15522A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: e */
    public void mo14727e() {
        ((SwipeRefreshLayout) m15522A3(C2507R.id.refresh)).setRefreshing(false);
    }

    /* renamed from: e4 */
    public final void m15524e4() {
        ((EpoxyRecyclerView) m15522A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28277g;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15523c4().m14711f();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: f */
    public void mo14728f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: g */
    public void mo14729g(long j2) {
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: h2 */
    public void mo14730h2() {
        m15524e4();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.notifications.NotificationsView
    /* renamed from: k */
    public void mo14731k(final long j2) {
        Context context = getContext();
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            ArrayList arrayList = new ArrayList();
            arrayList.add(getString(C2507R.string.delete));
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final String[] strArr = (String[]) array;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    String[] items = strArr;
                    NotificationsFragment this$0 = this;
                    long j3 = j2;
                    KProperty<Object>[] kPropertyArr = NotificationsFragment.f28273i;
                    Intrinsics.m32179h(items, "$items");
                    Intrinsics.m32179h(this$0, "this$0");
                    if (Intrinsics.m32174c(items[i2], this$0.getString(C2507R.string.delete))) {
                        this$0.m15523c4().m14710d(j3);
                        Dialogs dialogs = Dialogs.f30143a;
                        String string = this$0.getString(C2507R.string.notification_deleted);
                        Intrinsics.m32178g(string, "getString(R.string.notification_deleted)");
                        dialogs.m16308g(this$0, string, 0);
                    }
                }
            };
            AlertController.AlertParams alertParams = builder.f413a;
            alertParams.f388q = strArr;
            alertParams.f390s = onClickListener;
            AlertDialog create = builder.create();
            Intrinsics.m32178g(create, "myBuilder.create()");
            create.show();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28278h.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14151u(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Context context = getContext();
        if (context != null) {
            this.f28276f = new NotificationManagerCompat(context).m1627a();
        }
        NotificationsPresenter m15523c4 = m15523c4();
        boolean z = this.f28276f;
        NotificationsUiLogic notificationsUiLogic = m15523c4.f26479d;
        notificationsUiLogic.f29121d = z;
        notificationsUiLogic.f28956a = true;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable final Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_notifications, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 14));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.settings);
        Intrinsics.m32178g(relativeLayout, "view.settings");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.NotificationsFragment$onCreateView$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                NotificationsFragment notificationsFragment = NotificationsFragment.this;
                KProperty<Object>[] kPropertyArr = NotificationsFragment.f28273i;
                notificationsFragment.m15437u3().mo15324d2(new NotificationsPreferenceFragment(), null);
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C2507R.id.delete);
        Intrinsics.m32178g(relativeLayout2, "view.delete");
        ViewsKt.m16377j(relativeLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.NotificationsFragment$onCreateView$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                Context requireContext = NotificationsFragment.this.requireContext();
                Intrinsics.m32178g(requireContext, "requireContext()");
                Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
                builder.f30150b = 3;
                builder.m16319k("Подтверждение");
                builder.m16310b("Вы уверены, что хотите очистить все уведомления?");
                builder.m16315g(C2507R.string.clear);
                builder.m16311c(C2507R.string.cancel);
                final NotificationsFragment notificationsFragment = NotificationsFragment.this;
                builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.NotificationsFragment$onCreateView$3.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                        Dialogs.MaterialDialog it2 = materialDialog;
                        Intrinsics.m32179h(it2, "it");
                        NotificationsFragment notificationsFragment2 = NotificationsFragment.this;
                        KProperty<Object>[] kPropertyArr = NotificationsFragment.f28273i;
                        notificationsFragment2.m15523c4().m14709c();
                        return Unit.f63088a;
                    }
                });
                builder.f30159k = true;
                builder.m16317i();
                return Unit.f63088a;
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(bundle, layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.NotificationsFragment$onCreateView$4$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                NotificationsFragment notificationsFragment = this;
                KProperty<Object>[] kPropertyArr = NotificationsFragment.f28273i;
                NotificationsPresenter m15523c4 = notificationsFragment.m15523c4();
                m15523c4.f26479d.f29119b++;
                NotificationsPresenter.m14706e(m15523c4, false, false, 2);
            }
        };
        this.f28277g = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15523c4().f26480e);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.NotificationsFragment$onCreateView$5
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.notifications.NotificationsFragment$onCreateView$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                LinearLayout error_layout = (LinearLayout) NotificationsFragment.this.m15522A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                NotificationsFragment.this.m15525u();
                return Unit.f63088a;
            }
        });
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 20));
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
        this.f28278h.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchCommentNotificationsEnabled(@NotNull OnFetchCommentNotificationsEnabled onFetchCommentNotificationsEnabled) {
        Intrinsics.m32179h(onFetchCommentNotificationsEnabled, "onFetchCommentNotificationsEnabled");
        NotificationsPresenter m15523c4 = m15523c4();
        m15523c4.f26479d.f29123f = onFetchCommentNotificationsEnabled.f30189a;
        m15523c4.m14707a(false);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchEpisodeNotificationsEnabled(@NotNull OnFetchEpisodeNotificationsEnabled onFetchEpisodeNotificationsEnabled) {
        Intrinsics.m32179h(onFetchEpisodeNotificationsEnabled, "onFetchEpisodeNotificationsEnabled");
        NotificationsPresenter m15523c4 = m15523c4();
        m15523c4.f26479d.f29122e = onFetchEpisodeNotificationsEnabled.f30191a;
        m15523c4.m14707a(false);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchMyCollectionCommentNotificationsEnabled(@NotNull OnFetchMyCollectionCommentNotificationsEnabled onFetchMyCollectionCommentNotificationsEnabled) {
        Intrinsics.m32179h(onFetchMyCollectionCommentNotificationsEnabled, "onFetchMyCollectionCommentNotificationsEnabled");
        NotificationsPresenter m15523c4 = m15523c4();
        m15523c4.f26479d.f29124g = onFetchMyCollectionCommentNotificationsEnabled.f30192a;
        m15523c4.m14707a(false);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNotification(@NotNull OnNotification onNotification) {
        Intrinsics.m32179h(onNotification, "onNotification");
        m15524e4();
        if (isHidden()) {
            return;
        }
        new Handler().postDelayed(RunnableC0915a.f9318f, 2000L);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context context = getContext();
        boolean m1627a = context != null ? new NotificationManagerCompat(context).m1627a() : this.f28276f;
        if (this.f28276f != m1627a) {
            this.f28276f = m1627a;
            NotificationsPresenter m15523c4 = m15523c4();
            m15523c4.f26479d.f29121d = this.f28276f;
            m15523c4.m14707a(false);
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28277g;
        if (endlessRecyclerViewScrollListener != null) {
            endlessRecyclerViewScrollListener.m15319f(outState);
        } else {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        super.onViewCreated(view, bundle);
        if (m15523c4().f26479d.f29133p) {
            return;
        }
        NotificationsPresenter presenter = m15523c4();
        Intrinsics.m32178g(presenter, "presenter");
        NotificationsPresenter.m14706e(presenter, false, false, 3);
    }

    /* renamed from: u */
    public final void m15525u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15522A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15522A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28277g;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        NotificationsPresenter m15523c4 = m15523c4();
        NotificationsUiLogic notificationsUiLogic = m15523c4.f26479d;
        if (notificationsUiLogic.f28956a) {
            notificationsUiLogic.m15685a();
            if (m15523c4.m14708b()) {
                NotificationsPresenter.m14706e(m15523c4, false, false, 3);
            } else {
                NotificationsPresenter.m14706e(m15523c4, false, true, 1);
            }
        }
    }
}
