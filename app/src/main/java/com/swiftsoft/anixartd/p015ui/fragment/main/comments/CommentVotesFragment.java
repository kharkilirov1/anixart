package com.swiftsoft.anixartd.p015ui.fragment.main.comments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.inputmethod.C0273a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.comments.CommentVotesUiLogic;
import com.swiftsoft.anixartd.presentation.comments.CommentVotesPresenter;
import com.swiftsoft.anixartd.presentation.comments.CommentVotesView;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnRefresh;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
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

/* compiled from: CommentVotesFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/comments/CommentVotesFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/comments/CommentVotesView;", "Lcom/swiftsoft/anixartd/utils/OnRefresh;", "onRefresh", "", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CommentVotesFragment extends BaseFragment implements CommentVotesView {

    /* renamed from: d */
    public long f28052d;

    /* renamed from: e */
    public int f28053e;

    /* renamed from: f */
    @Inject
    public Lazy<CommentVotesPresenter> f28054f;

    /* renamed from: g */
    @NotNull
    public final MoxyKtxDelegate f28055g;

    /* renamed from: h */
    public EndlessRecyclerViewScrollListener f28056h;

    /* renamed from: i */
    @NotNull
    public Map<Integer, View> f28057i = new LinkedHashMap();

    /* renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f28051k = {C2052a.m12277l(CommentVotesFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/comments/CommentVotesPresenter;", 0)};

    /* renamed from: j */
    @NotNull
    public static final Companion f28050j = new Companion(null);

    /* compiled from: CommentVotesFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/comments/CommentVotesFragment$Companion;", "", "", "COLLECTION", "I", "", "COMMENT_ID", "Ljava/lang/String;", "CONTENT_TYPE", "RELEASE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final CommentVotesFragment m15490a(long j2, int i2) {
            CommentVotesFragment commentVotesFragment = new CommentVotesFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("COMMENT_ID", j2);
            bundle.putInt("CONTENT_TYPE", i2);
            commentVotesFragment.setArguments(bundle);
            return commentVotesFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CommentVotesFragment() {
        Function0<CommentVotesPresenter> function0 = new Function0<CommentVotesPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.comments.CommentVotesFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CommentVotesPresenter invoke() {
                Lazy<CommentVotesPresenter> lazy = CommentVotesFragment.this.f28054f;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28055g = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CommentVotesPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15487A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28057i;
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

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: a */
    public void mo14305a() {
        ProgressBar progress_bar = (ProgressBar) m15487A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: b */
    public void mo14306b() {
        ProgressBar progress_bar = (ProgressBar) m15487A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: c */
    public void mo14307c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15487A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15487A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final CommentVotesPresenter m15488c4() {
        return (CommentVotesPresenter) this.f28055g.getValue(this, f28051k[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: d */
    public void mo14308d() {
        ((SwipeRefreshLayout) m15487A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: e */
    public void mo14309e() {
        ((SwipeRefreshLayout) m15487A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: f */
    public void mo14310f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.comments.CommentVotesView
    /* renamed from: l */
    public void mo14311l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28056h;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CommentVotesPresenter m15488c4 = m15488c4();
        CommentVotesUiLogic commentVotesUiLogic = m15488c4.f25933b;
        if (commentVotesUiLogic.f28956a) {
            commentVotesUiLogic.f29028d = 0;
            commentVotesUiLogic.f29031g = 0L;
            commentVotesUiLogic.f29030f.clear();
            CommentVotesPresenter.m14300b(m15488c4, false, false, 2);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28057i.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14127i(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28052d = arguments.getLong("COMMENT_ID");
            this.f28053e = arguments.getInt("CONTENT_TYPE");
        }
        CommentVotesPresenter m15488c4 = m15488c4();
        long j2 = this.f28052d;
        int i2 = this.f28053e;
        CommentVotesUiLogic commentVotesUiLogic = m15488c4.f25933b;
        commentVotesUiLogic.f29026b = j2;
        commentVotesUiLogic.f29027c = i2;
        commentVotesUiLogic.f28956a = true;
        CommentVotesPresenter presenter = m15488c4();
        Intrinsics.m32178g(presenter, "presenter");
        CommentVotesPresenter.m14300b(presenter, false, false, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_comment_votes, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 11));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.comments.CommentVotesFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                CommentVotesFragment commentVotesFragment = CommentVotesFragment.this;
                CommentVotesFragment.Companion companion = CommentVotesFragment.f28050j;
                CommentVotesPresenter m15488c4 = commentVotesFragment.m15488c4();
                m15488c4.f25933b.f29028d++;
                CommentVotesPresenter.m14300b(m15488c4, false, false, 3);
            }
        };
        this.f28056h = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15488c4().f25934c);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 17));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.comments.CommentVotesFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.comments.CommentVotesFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) CommentVotesFragment.this.m15487A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) CommentVotesFragment.this.m15487A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                CommentVotesFragment.this.m15489u();
                return Unit.f63088a;
            }
        });
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
        this.f28057i.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRefresh(@NotNull OnRefresh onRefresh) {
        Intrinsics.m32179h(onRefresh, "onRefresh");
        m15488c4().m14302c();
    }

    /* renamed from: u */
    public final void m15489u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15487A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15487A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28056h;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        m15488c4().m14302c();
    }
}
