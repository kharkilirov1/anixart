package com.swiftsoft.anixartd.p015ui.fragment.main.schedule;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.ViewOnClickListenerC1394a;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.presentation.main.schedule.SchedulePresenter;
import com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView;
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

/* compiled from: ScheduleFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/schedule/ScheduleFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/schedule/ScheduleView;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ScheduleFragment extends BaseFragment implements ScheduleView {

    /* renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f28889g = {C2052a.m12277l(ScheduleFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/schedule/SchedulePresenter;", 0)};

    /* renamed from: d */
    @Inject
    public Lazy<SchedulePresenter> f28890d;

    /* renamed from: e */
    @NotNull
    public final MoxyKtxDelegate f28891e;

    /* renamed from: f */
    @NotNull
    public Map<Integer, View> f28892f = new LinkedHashMap();

    public ScheduleFragment() {
        Function0<SchedulePresenter> function0 = new Function0<SchedulePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.schedule.ScheduleFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SchedulePresenter invoke() {
                Lazy<SchedulePresenter> lazy = ScheduleFragment.this.f28890d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28891e = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(SchedulePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15644A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28892f;
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

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: a */
    public void mo15206a() {
        ProgressBar progress_bar = (ProgressBar) m15644A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: b */
    public void mo15207b() {
        ProgressBar progress_bar = (ProgressBar) m15644A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: c */
    public void mo15208c() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15644A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15644A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final SchedulePresenter m15645c4() {
        return (SchedulePresenter) this.f28891e.getValue(this, f28889g[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.schedule.ScheduleView
    /* renamed from: g */
    public void mo15209g(long j2) {
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28892f.clear();
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14143q(this);
        super.onCreate(bundle);
        m15645c4().m15203a();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_schedule, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2625a(this, 28));
        ((MaterialButton) inflate.findViewById(C2507R.id.repeat)).setOnClickListener(new ViewOnClickListenerC1394a(inflate, this, 5));
        ((EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view)).setController(m15645c4().f27197e);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28892f.clear();
    }
}
